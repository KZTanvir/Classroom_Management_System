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
public class student {
    public int id;
    public String name;
    public String first_name;
    public String last_name;
    public String father_name;
    public String mother_name;
    public String address;
    public int roll;
    public int Class;
    public int year;
    //user credentials not assigned to the code yet
    private int logout = -1;
    public String login_status = "Student login error!";
    public String registration_status = "No Student Registered Yet!";
    
    private database db = new database("oracle");
    private PreparedStatement statement;
    private ResultSet result;
    public int login(String username,String password) {
        if(this.logout==1){
            login_status = " Student already logged in!\n"+this.name;
            return -1;
        }
        try {
            statement = db.connect.prepareStatement("""
                                                    SELECT COUNT(user_id) as COUNT_STUDENT
                                                                    FROM all_users 
                                                                        WHERE 
                                                                        user_type = 'STUDENT'
                                                                        AND
                                                                        user_name = ?
                                                                        AND
                                                                        user_password = ?""");
            statement.setString(1, username);
            statement.setString(2, password);
            result = statement.executeQuery();
            result.next();
            if(result.getInt("COUNT_STUDENT")==1){
                statement = db.connect.prepareStatement("""
                                                       SELECT user_id AS STUDENT_ID
                                                       FROM all_users 
                                                            WHERE 
                                                            user_type = 'STUDENT'
                                                            AND
                                                            user_name = ?
                                                            AND
                                                            user_password = ?""");
                statement.setString(1, username);
                statement.setString(2, password);
                result = statement.executeQuery();
                result.next();
                
                id = result.getInt("STUDENT_ID");
                information(this.id);
                
                login_status ="STUDENT LOGGED IN:"+ this.id;
                this.logout = 1;
                return 1;
            }else {
                login_status = "UNABLE TO LOGIN: " + username +"\nNo student found in the database!";
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
        } else login_status = "PLEASE LOGIN TO CONTINUE AS STUDENT!";
        return 1;
    }
    public int registration(String name, String first_name, String last_name, String father_name, String mother_name, String address, int roll, int Class, int year, String password, String confirm_password){
        id=0;
        if(name.isBlank() || first_name.isBlank() || last_name.isBlank() || father_name.isBlank() || mother_name.isBlank() || address.isBlank() || roll==0 || Class==0 || year==0 || password.isBlank()){
            registration_status = "Please Complete the Form with information!\nNO USER REGISTERED!";
            return -2;
        }
        if (!password.equals(confirm_password)){
            registration_status = "PLEASE CONFIRM STUDENT PASSWORD!";
            return -1;
        }
        try {
            int student_id = insert(name, first_name, last_name, father_name, mother_name, address,roll, Class, year);
            statement = db.connect.prepareStatement("""
                                                    UPDATE all_users SET user_password = ? WHERE user_id = ? 
                                                    """);
            statement.setString(1, password);
            statement.setInt(2, student_id);
            statement.executeUpdate();
            statement = db.connect.prepareStatement("""
                                                    SELECT user_name 
                                                    FROM all_users 
                                                        WHERE 
                                                        user_id = ?
                                                    """);
            statement.setInt(1, student_id);
            result = statement.executeQuery();
            result.next();
            this.name = result.getString("user_name");
            this.id = student_id;
            information(this.id);
            registration_status = "STUDENT REGISTERED!\nUserName:" + this.name;
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
                                                            FROM student
                                                                WHERE
                                                                student_id = ?""");
            info_statement.setInt(1, id);
            result = info_statement.executeQuery();
            result.next();
            this.id = result.getInt("student_id");
            this.name = result.getString("student_name");
            this.first_name = result.getString("student_first_name");
            this.last_name = result.getString("student_last_name");
            this.father_name = result.getString("student_father_name");
            this.mother_name = result.getString("student_mother_name");
            this.address = result.getString("student_address");
            this.roll = result.getInt("student_roll");
            this.Class = result.getInt("student_class");
            this.year = result.getInt("student_year");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    public int insert(String name, String first_name, String last_name, String father_name, String mother_name, String address, int roll,int Class, int year){
        try {
            int student_id;
            statement = db.connect.prepareStatement("""
                                                    SELECT all_users_seq.NEXTVAL FROM dual
                                                    """);
            result = statement.executeQuery();
            result.next();
            student_id = result.getInt(1);
            statement = db.connect.prepareStatement("""
                                                    INSERT INTO student
                                                        VALUES (?,?,?,?,?,?,?,?,?,?)
                                                    """);
            statement.setInt(1, student_id);
            statement.setString(2, name);
            statement.setString(3, first_name);
            statement.setString(4, last_name);
            statement.setString(5, father_name);
            statement.setString(6, mother_name);
            statement.setString(7, address);
            statement.setInt(8, roll);
            statement.setInt(9, Class);
            statement.setInt(10, year);
            statement.executeUpdate();
            return student_id;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "student{" + "id=" + id + ", name=" + name + ", first_name=" + first_name + ", last_name=" + last_name + ", father_name=" + father_name + ", mother_name=" + mother_name + ", address=" + address + ", roll=" + roll + ", Class=" + Class + ", year=" + year + ", logout=" + logout + ", login_status=" + login_status + ", registration_status=" + registration_status + ", db=" + db + ", statement=" + statement + ", result=" + result + '}';
    }
    
    public static void main(String[] args) {
        student student = new student();
        student.registration("tanvir", "mdkamruzzaman", "tanvir", "habib", "putul", "ash", 57, 5, 2023, "1234", "1234");
        //student.login("tanvir_59", "1234");
        //System.out.println(student.registration_status);
        System.out.println(student.toString());
    }
    
}
