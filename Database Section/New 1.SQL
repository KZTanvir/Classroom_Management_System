DECLARE
is_custom_result INT;
create_table LONG;
BEGIN
SELECT COUNT(*) INTO is_custom_result 
    FROM tab
    WHERE
    tname = 'CUSTOM_RESULT';
    IF(is_custom_result <= 0) THEN
        create_table :='
        CREATE TABLE custom_result (
            c1 number(6,0),
            c2 varchar2(10)
        )';
        EXECUTE IMMEDIATE create_table;
    ELSE
    DBMS_OUTPUT.PUT_LINE('TABLE EXISTS');
    END IF;
END;