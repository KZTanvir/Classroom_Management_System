/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classroom_management_system;
import classroom_management_system.main.teacher;
import java.util.Scanner;

/**
 *
 * @author Tanvir Zaman
 */
public class cms_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        //login system
        Scanner input = new Scanner(System.in);
        teacher teacher = new teacher();
        String login_user,login_pass;
        System.out.println("Enter Username:");
        login_user = input.nextLine();
        System.out.println("Enter Password:");
        login_pass = input.nextLine();
        teacher.login(login_user, login_pass);
        teacher.logout();
        teacher.logout();
    }
    
}
