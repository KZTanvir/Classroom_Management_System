DECLARE
    EXAM_DATE DATE;
    RESULT_DATE DATE;
BEGIN
    EXAM_DATE := '12-FEB-2022';
    RESULT_DATE := '2-JUNE-2022';
INSERT INTO result
    VALUES(
    result_seq.NEXTVAL,
    13,
    3,
    'GEOMETRY',
    89,
    'QUIZ',
    RESULT_DATE,
    EXAM_DATE
    );
INSERT INTO result
    VALUES(
    result_seq.NEXTVAL,
    13,
    4,
    'GEOMETRY',
    45,
    'QUIZ',
    RESULT_DATE,
    EXAM_DATE
    );
INSERT INTO result
    VALUES(
    result_seq.NEXTVAL,
    13,
    5,
    'GEOMETRY',
    43,
    'QUIZ',
    RESULT_DATE,
    EXAM_DATE
    );
INSERT INTO result
    VALUES(
    result_seq.NEXTVAL,
    13,
    6,
    'GEOMETRY',
    77,
    'QUIZ',
    RESULT_DATE,
    EXAM_DATE
    );
INSERT INTO result
    VALUES(
    result_seq.NEXTVAL,
    13,
    7,
    'GEOMETRY',
    50,
    'QUIZ',
    RESULT_DATE,
    EXAM_DATE
    );
INSERT INTO result
    VALUES(
    result_seq.NEXTVAL,
    13,
    8,
    'GEOMETRY',
    80,
    'QUIZ',
    RESULT_DATE,
    EXAM_DATE
    );
INSERT INTO result
    VALUES(
    result_seq.NEXTVAL,
    13,
    9,
    'GEOMETRY',
    45,
    'QUIZ',
    RESULT_DATE,
    EXAM_DATE
    );
INSERT INTO result
    VALUES(
    result_seq.NEXTVAL,
    13,
    10,
    'INFORMAITON AND COMMUNICATION TEHCNOLOGY',
    33,
    'QUIZ',
    RESULT_DATE,
    EXAM_DATE
    );
INSERT INTO result
    VALUES(
    result_seq.NEXTVAL,
    15,
    4,
    'ENGLISH',
    40,
    'QUIZ',
    RESULT_DATE,
    EXAM_DATE
    );
INSERT INTO result
    VALUES(
    result_seq.NEXTVAL,
    15,
    2,
    'BANGLA',
    50,
    'FINAL',
    RESULT_DATE,
    EXAM_DATE
    );
INSERT INTO result
    VALUES(
    result_seq.NEXTVAL,
    18,
    6,
    'BANGLA',
    89,
    'FINAL',
    RESULT_DATE,
    EXAM_DATE
    );

END;