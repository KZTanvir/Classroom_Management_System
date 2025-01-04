CREATE TABLE all_users
(
    user_id INT NOT NULL,                     --primary key--
    user_name VARCHAR(30) NOT NULL UNIQUE,    --user name triggered from student and teachers table
    user_type VARCHAR(10) CHECK(user_type='STUDENT' OR user_type='TEACHER'), 
                                              --triggered from teacher or student(teacher,student)
    user_status VARCHAR(10) DEFAULT 'PENDING',
    user_password VARCHAR(40) DEFAULT 'USER',
    PRIMARY KEY(user_id)
);