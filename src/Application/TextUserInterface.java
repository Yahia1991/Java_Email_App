package Application;

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author yahia
 */
public class TextUserInterface {
    private Scanner reader;
    private Map<String, String> commands;
    private Email email;
    private EmailBook emails;
    private Employee worker;
    
        //The constructor
        public TextUserInterface(Scanner reader) {
        this.reader = reader;
        
        emails = new EmailBook();
        commands = new TreeMap<String, String>();
        commands.put("1", "press 1 to create an email for a new employee.");
        commands.put("2", "press 2 to search info about specific employee.");
        commands.put("3", "press 3 to delete an employee.");
        commands.put("4", "press 4 to print all info for all adedd employees.");
        commands.put("x", "press x to exit.");       
    }
      
        //Printing instructions    
        private void printInstructions(){
          for(String command : commands.values()){
              System.out.println(" " + command);
          }
        }
      
        //Creating an email
        private void createEmail(){
          System.out.print("Employee's first name: ");
          String firstName = reader.nextLine();
          System.out.print("Employee's Last name: ");
          String lastName = reader.nextLine();
          
          Employee newWorker = new Employee(firstName, lastName); 
       
          this.emails.add(newWorker);
          System.out.println("---------------------------------");

    }
        //Searching for an employee's info
        private void searchInfo(){
            System.out.print("Employee's first name: ");
            String firstName = reader.nextLine();
            System.out.print("Employee's last name: ");
            String lastName = reader.nextLine();

            System.out.println( emails.info(firstName, lastName));
            System.out.println("---------------------------------");
    }
        
        ////Deleting an employee's info
        private void delete(){
            System.out.print("Employee's first name: ");
            String firstName = reader.nextLine();
            System.out.print("Employee's last name: ");
            String lastName = reader.nextLine();

            this.emails.deleting(firstName, lastName);
            System.out.println("---------------------------------");
    }
        //Printing all info that have been added
        private void printAll(){
            this.emails.printAll();
        }
        
        //Starting our text based user interface
        public void start(){
            System.out.println("Welcome to our email application.");
            System.out.println();
            
            while(true){
                System.out.println("Choose an operation.");
                printInstructions();
                System.out.println("");
                System.out.print("command: ");
                String command = reader.nextLine();

                if(!commands.keySet().contains(command)){
                    System.out.println("invalid command.");
                    printInstructions();
                }
                if(command.equals("x")){
                    System.out.println("The following employees have been added:");
                    System.out.println("");
                    printAll();
                    System.out.println("Thank you for using our application.");
                    break;
                }
                if(command.equals("1")){
                    createEmail();
                }
                 if(command.equals("2")){
                    searchInfo();
                }
                if(command.equals("3")){
                    delete();
                }if(command.equals("4")){
                    printAll();
                }
        }
    }
}
