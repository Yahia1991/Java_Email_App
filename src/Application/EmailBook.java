package Application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author yahia
 */
public class EmailBook {
    private Employee employee;
    private List<Email> emails;
  
    private Scanner reader;

    public EmailBook() {
        this.reader = reader;
        this.employee = employee;
        this.emails = new ArrayList<Email>();
    }
    
    //Rigestering email for the new workers
    public void add(Employee worker){
        this.emails.add(new Email(worker));
    }
    
    //Getting information about specific worker
    public String info(String workerFistName, String workerLastName){
        for(Email email : emails){
            if(email.emailFirstName().equals(workerFistName) && email.emailLastName().equals(workerLastName)){
                return email.toString();
            }
        }
        return "Not found";
     }
    
    //Printing all information about workers that have been added
    public void printAll(){
        for(Email email : emails){
            System.out.println(email.toString());
            System.out.println("");
        }
    }
   
    //Deleting an employee using his first and last name
    public void deleting(String workerFistName, String workerLastName){
        for(Email email : emails){
             if(email.emailFirstName().equals(workerFistName) && email.emailLastName().equals(workerLastName)){
                this.emails.remove(email);
            }
             return;
        }
    }
}
