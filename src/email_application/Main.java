package email_application;

import java.util.Scanner;

/**
 *
 * @author yahia
 */
public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //Enter employee name
        System.out.print("Employee first name: ");
        String firstName = reader.nextLine();
        
        System.out.print("Employee last name: ");
        String lastName = reader.nextLine();
        
        Email newEmployee = new Email(firstName, lastName);
        
       
    }
    
}
