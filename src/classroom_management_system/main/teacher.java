/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classroom_management_system.main;

import classroom_management_system.database.database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class teacher {
    public int id;
    public String name;
    public String first_name;
    public String last_name;
    public String address;
    public String role;
    public String subject;
    public String code;
    //all the teacher variables in the value below
    private int logout = -1;
    public String login_status = "Something went wrong!";
    public String registration_status = "No Teacher Registered Yet!";
    
    private database db = new database("oracle");
    private PreparedStatement statement;
    private ResultSet result;
    
    public int login(String username,String password) {
        if(this.logout==1){
            login_status = "Teacher already logged in!\n"+this.name;
            return -1;
        }
        try {
            statement = db.connect.prepareStatement("""
                                                    SELECT COUNT(user_id) as COUNT_TEACHER
                                                                    FROM all_users 
                                                                        WHERE 
                                                                        user_type = 'TEACHER'
                                                                        AND
                                                                        user_name = ?
                                                                        AND
                                                                        user_password = ?""");
            statement.setString(1, username);
            statement.setString(2, password);
            result = statement.executeQuery();
            result.next();
            if(result.getInt("COUNT_TEACHER")==1){
                statement = db.connect.prepareStatement("""
                                                       SELECT user_id as TEACHER_ID
                                                            FROM all_users 
                                                                WHERE 
                                                                user_type = 'TEACHER'
                                                                AND
                                                                user_name = ?
                                                                AND
                                                                user_password = ?""");
                statement.setString(1, username);
                statement.setString(2, password);
                result = statement.executeQuery();
                result.next();
                
                id = result.getInt("TEACHER_ID");
                information(this.id);
                login_status ="Teacher LOGGED IN:"+ this.name;
                this.logout = 1;
                return 1;
            }else {
                login_status = "UNABLE TO LOGIN: " + username +"\nNo TEACHER found in the database.";
                return -3;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }
    public int logout(){
        if(this.logout==1){
            this.logout = -1;
            login_status = "Logged Out:"+ this.name;
            return 1;
        } else login_status = "PLEASE LOGIN TO CONTINUE AS TEACHER:";
        return 1;
    }
    public int registration(String t_name,String t_first_name,String t_last_name,String t_address,String t_role,String t_subject,int t_code,String t_password,String t_confirm_password){
        id=0;
        if(t_name.isBlank() || t_first_name.isBlank() || t_last_name.isBlank() || t_address.isBlank() || t_role.isBlank() || t_subject.isBlank()|| t_password.isBlank() || (0== t_code)){
            registration_status = "Please Complete the Form with information!\nNO USER REGISTERED!";
            return -2;
        }
        if (!t_password.equals(t_confirm_password)){
            registration_status = "PLEASE CONFIRM TEACHER PASSWORD!";
            return -1;
        }
        try {
            int teacher_id = insert(t_name,t_first_name,t_last_name,t_address,t_role,t_subject,t_code);
            statement = db.connect.prepareStatement("""
                                                    UPDATE all_users SET user_password = ? WHERE user_id = ? 
                                                    """);
            statement.setString(1, t_password);
            statement.setInt(2, teacher_id);
            statement.executeUpdate();
            statement = db.connect.prepareStatement("""
                                                    SELECT user_name 
                                                    FROM all_users 
                                                        WHERE 
                                                        user_id = ?
                                                    """);
            statement.setInt(1, teacher_id);
            result = statement.executeQuery(); //getting name from the database from the statement variable
            result.next();
            this.name = result.getString("user_name");
            this.id = teacher_id;
            information(this.id);//insertion of student information by calling this method
            registration_status = "USER REGISTERED!\nUserName:" + this.name;
            this.logout = 1;
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } 
    }
    private void information(int id){
        PreparedStatement info_statement;
        try {
            info_statement = db.connect.prepareStatement("""
                                                            SELECT *
                                                            FROM teacher
                                                                WHERE
                                                                teacher_id = ?""");
            info_statement.setInt(1, id);
            result = info_statement.executeQuery();
            result.next();
            this.id = result.getInt("teacher_id");
            this.name = result.getString("teacher_name");
            this.first_name = result.getString("teacher_first_name");
            this.last_name = result.getString("teacher_last_name");
            this.address = result.getString("teacher_address");
            this.role = result.getString("teacher_role");
            this.subject = result.getString("teacher_sub");
            this.code = result.getString("teacher_code");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    private void create(){
        
    }
    public int insert(String t_name, String t_first_name, String t_last_name, String t_address, String t_role,String t_subject, int t_code){
        try {
            statement = db.connect.prepareStatement("""
                                                    SELECT all_users_seq.NEXTVAL FROM dual
                                                    """);
            result = statement.executeQuery();
            result.next();
            int teacher_id;
            teacher_id = result.getInt(1);
            
            statement = db.connect.prepareStatement("""
                                                    INSERT INTO teacher
                                                        VALUES (?,?,?,?,?,?,?,?)
                                                    """);
            statement.setInt(1, teacher_id);
            statement.setString(2, t_name);
            statement.setString(3, t_first_name);
            statement.setString(4, t_last_name);
            statement.setString(5, t_address);
            statement.setString(6, t_role);
            statement.setString(7, t_subject);
            statement.setInt(8, t_code);
            statement.executeUpdate();
            return teacher_id;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "teacher{" + "id=" + id + ", name=" + name + ", first_name=" + first_name + ", last_name=" + last_name + ", address=" + address + ", role=" + role + ", subject=" + subject + ", code=" + code + ", logout=" + logout + ", login_status=" + login_status + ", registration_status=" + registration_status + ", db=" + db + ", statement=" + statement + ", result=" + result + '}';
    }
    
    public static void main(String[] args) {
        teacher teacher = new teacher();
        teacher.login("SHETU#11", "1234");
        teacher.information(teacher.id);
        System.out.println(teacher.login_status);
        //System.out.println(teacher.toString());
        //teacher.registration("tanvir", "lo", "dsdf", "none", "none", "all", 4, "1234", "1234");
        //System.out.println(teacher.registration_status);
        teacher.information(teacher.id);
        System.out.println(teacher.toString());
        
    }
}
