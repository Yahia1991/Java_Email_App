package Application;

import java.util.Scanner;
/**
 *
 * @author yahia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        TextUserInterface ui = new TextUserInterface(reader);
        ui.start();
    
    }
    
}
