CREATE OR REPLACE VIEW ALL_FEED
    AS
    SELECT --show newsfeed information with comment and commenter information WITHOUT AUTO REGISTRATION FEED
        newsfeed.user_id,
        newsfeed.feed_creator,
        newsfeed.feed_subject,
        newsfeed.feed_post,
        all_users.USER_NAME as commenter,
        newsfeed_comment.comment_main as comments
    FROM newsfeed,newsfeed_comment,all_users
        WHERE
        newsfeed.feed_id = newsfeed_comment.feed_id
        AND
        newsfeed_comment.user_id = all_users.user_id
        AND
        newsfeed.feed_subject NOT LIKE '%REGISTRATION%'
        ORDER BY
        newsfeed.user_id DESC;
CREATE OR REPLACE VIEW PASSED_STUDENT_CONTRIBUTIONS
    AS
    SELECT --AS THE NAME SUGGEST IT GIVES PASSES STUDENTS AND THEIR RELATED FEEDS
        newsfeed.user_id,
        all_users.user_name,
        newsfeed.feed_subject,
        newsfeed.feed_post,
        newsfeed.feed_creation_date
    FROM newsfeed,all_users
        WHERE 
        all_users.user_type = 'STUDENT'
        AND
        all_users.user_id 
            IN 
            (
            SELECT result.student_id
            FROM result
            WHERE
            result.main_result BETWEEN 40 AND 100
            )
        AND
        newsfeed.user_id = all_users.user_id
        AND
        (
        newsfeed.feed_subject != 'STUDENT REGISTRATION!' 
        AND 
        newsfeed.feed_subject != 'TEACHER REGISTRATION!'
        )
        ORDER BY newsfeed.user_id;

--INNER AND OUTER JOIN WITH VIEW CREATIONS
CREATE OR REPLACE VIEW RESULT_PUBLISH
    AS
    SELECT 
        all_users.user_name AS STUDENT_NAMES,
        student.student_roll AS STUDENT_ROLL,
        result.student_id AS STUDENT_ID,
        result.teacher_id,
        result.result_subject AS SUBJECT,
        result.main_result AS STUDENT_RESULT,
        result.exam_type AS RESULT_TYPE,
        result.result_date AS PUBLISING_DATE,
        result.exam_date AS EXAM_DATE
    FROM all_users 
    INNER JOIN result ON
        all_users.user_id = result.student_id
    INNER JOIN student ON
        all_users.user_id = student.student_id;

CREATE OR REPLACE VIEW ONLY_STUDENTS
    AS
    SELECT *
    FROM all_users
    LEFT OUTER JOIN student ON
        all_users.user_id = student.student_id
        WHERE 
        all_users.user_type = 'STUDENT';

SELECT * FROM PASSED_STUDENT_CONTRIBUTIONS;
SELECT * FROM ALL_FEED;
--inner and outer join views
SELECT * FROM RESULT_PUBLISH;
SELECT * FROM ONLY_STUDENTS;