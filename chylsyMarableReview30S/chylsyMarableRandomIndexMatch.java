
package chylsymarablerandomindexmatch;

import javax.swing.JOptionPane;

/**
 *
 * @author c.marable
 */
public class ChylsyMarableRandomIndexMatch {

    public static final String TITLE = "Random Index Match";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        welcome();
        program();
    }
    
    public static void welcome(){
        
        String welcomeMessage = "Welcome to " + TITLE + "!";
        output(welcomeMessage);
    }
    
    public static void program(){
        
        int input = userInput();
        int[] randomArray = new int[input];
        
    }
    
    public static int userInput(){
        
        String inputMessage = "Please enter the size of the array to generate";
        String input = "";
        
        boolean isInteger = false;
        
        do{
            
            input = JOptionPane.showInputDialog(
                null,
                inputMessage,
                TITLE,
                JOptionPane.PLAIN_MESSAGE
            );
            isInteger = checkInteger(input);

        } while (input == null || isInteger == false);
        
        int inputSize = Integer.parseInt(input);
        return inputSize;
    }
   
    /**
     * Determines wether or not the user's base input is an integer
     * @param base - User's base size
     * @return - Returns true or false
     */
    public static boolean checkInteger(String base){
        
        boolean isInteger = true;
        
        for(int i = 0; i < base.length(); i++){
            
            if( !Character.isDigit(base.charAt(i)))
            isInteger = false;          	   
        }
        
        return isInteger;
    }
    
    public static void output(String message){
        
        JOptionPane.showMessageDialog(
                null, 
                message, 
                TITLE,
                JOptionPane.PLAIN_MESSAGE);
    }
    
}
