SELECT * FROM student;
SELECT * FROM teacher;
SELECT * FROM all_users;
SELECT * FROM notice_board;
SELECT * FROM newsfeed;
SELECT * FROM newsfeed_comment;
SELECT * FROM message;
SELECT * FROM result;

SELECT --show some student information from table student and all_users
    user_id,
    user_name,
    student_father_name,
    student_mother_name,
    user_type
FROM all_users,student
    WHERE 
    (user_type = 'STUDENT')
    AND
    (user_id = student_id);
    
SELECT --show newsfeed information with comment and commenter information
    newsfeed.user_id,
    newsfeed.feed_creator,
    newsfeed.feed_subject,
    newsfeed.feed_post,
    all_users.USER_NAME as commenter,
    newsfeed_comment.comment_main as comments
FROM newsfeed,newsfeed_comment,all_users
    WHERE
    (newsfeed.feed_id = newsfeed_comment.feed_id)
    AND
    (newsfeed_comment.user_id = all_users.user_id)
    ORDER BY newsfeed.user_id DESC;

SELECT --counting total students
    COUNT(student.student_id) AS TOTAL_STUDENT
FROM student;
SELECT --counting DISTINCT total students
    COUNT(DISTINCT student.student_id) AS TOTAL_STUDENT
FROM student;
SELECT
    SUM(newsfeed.comments) AS TOTAL_COMMENTS
FROM newsfeed
    WHERE newsfeed.comments>=1;
SELECT --all student average
    result.student_id,
    AVG(result.main_result) AS AVERAGE_RESULT
FROM result
    GROUP BY
    result.student_id
    ORDER BY
    result.student_id;
SELECT --highest result with student id and subject WITH MAX
    result.student_id,
    result.result_subject,
    result.main_result AS HIGHEST_RESULT
FROM result
    WHERE
    result.main_result 
    IN
    (
    SELECT 
        MAX(result.main_result)
    FROM result 
        GROUP BY 
        result.RESULT_SUBJECT
    );

SELECT --commented posts in the newsfeed project
    newsfeed.feed_creator,
    newsfeed.feed_subject,
    newsfeed.feed_post,
    newsfeed.comments
FROM newsfeed
    WHERE newsfeed.comments>=1;

SELECT
    student_id,
    student_name,
    student_roll
FROM student
    -- WHERE student.student_roll in (30,100);
    WHERE student.student_roll BETWEEN 30 AND 100
    ORDER BY student.student_id ASC;

SELECT 
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
        result.main_result BETWEEN 40 AND 60
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
    
DELETE FROM student WHERE student_id = 10;

SELECT * FROM all_users;

INSERT INTO newsfeed_comment
    VALUES(newsfeed_comment_seq.NEXTVAL,2,2,'WELCOME HERE TOO!',SYSDATE,'ACTIVE');
SELECT * FROM newsfeed;
SELECT * FROM newsfeed_comment;
SELECT * FROM all_users;



