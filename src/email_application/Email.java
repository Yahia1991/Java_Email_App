package email_application;

import java.util.Scanner;

/**
 *
 * @author yahia
 */

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLength;
    private int mailboxCapacity;
    private String alternateEmail;
    private String companySuffix;
    
    //Constructer to receive first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mailboxCapacity = 500;
        System.out.println("Email created successfully for: " + this.firstName + " " + this.lastName );
        
        //Call a method asking for the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
        
        //Call a method that returns a random password
        this.defaultPasswordLength = 10;
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("The password is: " + this.password);
        
        //Here we generate an email
        this.companySuffix = "company.com";
        this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + "."+ this.companySuffix;
        System.out.println("The email is: " + email);
        
    } 
    //Ask for department
    private String setDepartment(){
        System.out.print("Department codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if(departmentChoice == 1){
            return "sales"; 
        }else if(departmentChoice == 2){
            return "development";
        }else if(departmentChoice == 3){
            return "accounting";
        }else {
            return "";
        }
    }
    //Generate a random password for the email
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRST0123456789!@#%";
        char[] password = new char[length];
        for(int i = 0; i < length; i++ ){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    
    //Set the mail box capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    
    //Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    
    //Change the password
    public void changePassword(String newPassword){
        this.password = newPassword;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        System.out.print("Alternate email is: ");
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }
    //This method to show info about the email
    public String showInfo(){
        return "Employee name: " + firstName + " " + lastName +
                "Company email: " + email +
                "Mailbox capacity: " + mailboxCapacity + "mb"; 
    }

    
}
