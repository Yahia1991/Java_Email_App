/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;
import java.util.Scanner;

/**
 *
 * @author yahia
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String department;
    private String alternateEmail;

    //Constructer to receive first name and last name
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.alternateEmail = setAlternateEmail();
        this.department = setDepartment();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }
    
    //Ask for department
    private String setDepartment(){
        System.out.print("Department codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter department code: ");
     
        Scanner reader = new Scanner(System.in);
        String departmentChoice = reader.nextLine();
        if(departmentChoice.equals("1")){
            return "sales"; 
        }else if(departmentChoice.equals("2")){
            return "development";
        }else if(departmentChoice.equals("3")){
            return "accounting";
        }else {
            return "";
        }
    }
    
     //Set the alternate email
     private String setAlternateEmail(){
         System.out.print("Enter an alternate email: ");
         Scanner reader = new Scanner(System.in);
         String altEmail = reader.nextLine();
         return altEmail;
    }
     
    //Employee info
    @Override
    public String toString() {
        return "Employee's name: " + firstName + " " + lastName + "\n"+
                "Alternate email: " + this.getAlternateEmail() + "\n" +
                "Department: " + this.getDepartment();
    }
    
    
}