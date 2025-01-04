DECLARE
    result_change NUMBER(3);
BEGIN
    UPDATE result rs 
    SET rs.main_result = 46, rs.exam_type = 'FINAL'
    WHERE
        rs.teacher_id = 13
        AND
        rs.student_id BETWEEN 1 AND 4;
        -- CURSOR
        IF SQL%NOTFOUND THEN
            DBMS_OUTPUT.PUT_LINE('NO STUDENT FOUND!');
        ELSIF SQL%FOUND THEN
            result_change:= SQL%ROWCOUNT;
            DBMS_OUTPUT.PUT_LINE(result_change || ' ROWS UPDATED!');
        END IF;
END;
--
--CURSOR DECLARATION
DECLARE
    -- TABLE TYPE  VARIABLES FOR IMPORT FROM CURSOR
    std_id result.student_id%TYPE;
    t_id result.teacher_id%TYPE;
    sub result.result_subject%TYPE;
    marks result.main_result%TYPE;
    exam result.exam_type%TYPE;
    
    --DECLARING VARIABLES CONFIRM IF TABLE EXISTS
    is_custom_result INT;
    create_table LONG;

    CURSOR result_cursor IS
        SELECT
            rs.student_id,
            rs.teacher_id,
            rs.result_subject,
            rs.main_result,
            rs.exam_type
        FROM result rs
            WHERE 
            rs.teacher_id != 18;
BEGIN
    SELECT COUNT(*) INTO is_custom_result 
        FROM tab
        WHERE
        tname = 'CUSTOM_RESULT'; --COUNTS IF THE TABLE EXISTS
    IF(is_custom_result <= 0) THEN --CONFIRMING THE TABLE EXISTANCE
        create_table :='
            CREATE TABLE custom_result
            (
            student_id INT,
            teacher_id INT,
            result_subject VARCHAR2(20),
            main_result INT,
            exam_type VARCHAR(10)
            )';
        EXECUTE IMMEDIATE create_table;
    ELSIF (is_custom_result > 0) THEN
        create_table :='DELETE FROM custom_result';
        EXECUTE IMMEDIATE create_table; -- delete the table first if the table exists -- now create the table
    END IF;
    
    OPEN result_cursor; -- OPENING THE CURSOR
    --DBMS_OUTPUT.PUT_LINE('RESLULT OF CURSOR IS:');
    LOOP
        FETCH result_cursor INTO std_id,t_id,sub,marks,exam;
        EXIT WHEN result_cursor%NOTFOUND;
            DBMS_OUTPUT.PUT_LINE(std_id || ' ' || t_id || ' ' || sub|| ' ' || marks || ' ' || exam);
            create_table:= 'INSERT INTO custom_result VALUES('||std_id||','||t_id||','''||sub||''','||marks||','''||exam||''')';
            EXECUTE IMMEDIATE create_table;
            DBMS_OUTPUT.PUT_LINE(create_table);
    END LOOP;
    CLOSE result_cursor;
END;