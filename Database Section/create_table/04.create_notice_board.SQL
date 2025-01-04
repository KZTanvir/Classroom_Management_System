CREATE TABLE notice_board
(
    notice_id INT NOT NULL,
    teacher_id INT NOT NULL,
    notice_type VARCHAR(10) DEFAULT 'EXAM',
    notice_subject VARCHAR(40) DEFAULT 'ALL',
    notice_main VARCHAR(100) NOT NULL,
    notice_date DATE,
    PRIMARY KEY(notice_id),
    FOREIGN KEY(teacher_id) REFERENCES teacher(teacher_id)
);