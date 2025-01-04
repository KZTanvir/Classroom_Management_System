CREATE TABLE teacher
(   teacher_id INT NOT NULL,
    teacher_name VARCHAR(30) NOT NULL UNIQUE,
    teacher_first_name VARCHAR(30),
    teacher_last_name VARCHAR(30),
    teacher_address VARCHAR(100),
    teacher_role VARCHAR(30) DEFAULT 'NEW',
    teacher_sub VARCHAR(30) DEFAULT 'ALL',
    teacher_code NUMBER(6) DEFAULT 000000,
    PRIMARY KEY (teacher_id)
);