CREATE TABLE student
(   student_id INT NOT NULL,--primary key
    student_name VARCHAR(30) NOT NULL UNIQUE,
    student_first_name VARCHAR(30),
    student_last_name VARCHAR(30),
    student_father_name VARCHAR(30),
    student_mother_name VARCHAR(30),
    student_address VARCHAR(100),
    student_roll INT CHECK(student_roll>0 AND student_roll<=100),
    student_class NUMBER(3) CHECK(student_class>0 AND student_class<=10),
    student_year NUMBER(4) DEFAULT 0000,
    PRIMARY KEY(student_id) --primary key declaration--
);



    