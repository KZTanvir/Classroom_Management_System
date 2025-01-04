/* 
EASTERN UNIVERSITY
TEACHER: TANZIM TAMANNA SHITU
STUDENT: NAME:MD.KAMRUZZAMAN
STUDENT_ID: 201400059
*/

-- DROP AND CREATE TABLES --
@create_table\drop_all.sql --DROP ALL THE TABLES IF EXISTS
@create_table\01.create_student.sql
@create_table\02.create_teacher.sql        
@create_table\03.create_users.sql
@create_table\04.create_notice_board.sql
@create_table\05.create_newsfeed.sql
@create_table\06.create_newsfeed_comment.sql
@create_table\07.create_message.sql
@create_table\08.create_result.sql
@create_table\sequences_triggers.sql  -- ADDS SEQUENCES AND TRIGGERS

----------------------------------------
-- IMPORTING DATA ON TABLES --
@import_table\01.imp_student.SQL
@import_table\02.imp_teacher.SQL
@import_table\04.imp_notice_board.SQL
@import_table\05.imp_newsfeed.SQL
@import_table\06.imp_newsfeed_comment.SQL
@import_table\07.imp_message.SQL
@import_table\08.imp_result.SQL
COMMIT;
-- viewing the information from the database --
@query_main.SQL
@view_and_join.sql
EXIT;  --the script exits here--
