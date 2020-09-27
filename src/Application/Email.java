package Application;

import java.util.Random;
/**
 *
 * @author yahia
 */
public class Email {
    private Employee worker;
    private String password;
    private int defaultPasswordLength;
    private String companySuffix;

    //Constructer to receive the new employee
    public Email(Employee worker) {
        this.worker = worker;
        this.defaultPasswordLength = 10;
        this.password = randomPassword(defaultPasswordLength);
        this.companySuffix = "company.com";
    }
    
    //Creating email for new worker
    private String createEmail(){
        return worker.getFirstName().toLowerCase() + "." + worker.getLastName().toLowerCase() + "@" + 
                worker.getDepartment().toLowerCase() + "." + this.companySuffix;
    }
  
    //Generate a random password for the email
    private String randomPassword(int length){
        String characters = "aBcDeFGHijKlmNpqrSTuVwXyZ£$%^&*123456789";
        int charactersLength = characters.length();
        Random random = new Random();
        String randomPassword = "";
        char[] passwordText = new char[length];
        
        for(int i = 0; i < length; i++){
             passwordText[i] = characters.charAt(random.nextInt(charactersLength));
             randomPassword += passwordText[i];
        }
    return randomPassword;
    }
    
    //Change password
    public void changePassword(String newPassword){
        this.password = newPassword;
    }

    public String getPassword() {
        return password;
    }
    
    //This method to be used later in other class
    public String emailFirstName(){
        return worker.getFirstName();
    }
    
     //This method to be used later in other class
    public String emailLastName(){
        return worker.getLastName();
    }
    
    
    //Employee and email info
    @Override
    public String toString() {
        return worker.toString() + "\n"+
                "The email is: " + createEmail() + "\n" +
                "The password is: " + password;
    }
    
}
