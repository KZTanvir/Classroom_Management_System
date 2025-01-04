CREATE TABLE result
(
    result_id INT NOT NULL,
    teacher_id INT NOT NULL,
    student_id INT NOT NULL,
    result_subject VARCHAR2(40) NOT NULL,
    main_result INT ,-- HAVE TO ADD CHEK FOR CONDITION BETWEEN 0 TO 100
    exam_type VARCHAR(10) NOT NULL,
    result_date DATE NOT NULL,
    exam_date DATE NOT NULL,
    PRIMARY KEY(result_id),
    FOREIGN KEY(student_id) REFERENCES student(student_id) ON DELETE CASCADE,
    FOREIGN KEY(teacher_id) REFERENCES teacher(teacher_id) ON DELETE CASCADE
)