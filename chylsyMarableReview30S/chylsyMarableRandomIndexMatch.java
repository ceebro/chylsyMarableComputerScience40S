
package chylsymarablerandomindexmatch;

import javax.swing.JOptionPane;

/*
 * chylsyMarableRandomIndexMatch - A program that creates a random array
    where the element of the index has a 1/10 chance of being equal to the
    index itself.
 * @author Chylsy Marable
 * @since 6-Sep-2023
*/
public class ChylsyMarableRandomIndexMatch {

    public static final String TITLE = "Random Index Match";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        welcome();
        
        do{
        program();
        } while (playAgain() == true);
        
        thanks();
    }
    
    /**
     * Outputs the user welcome message
     */
    public static void welcome(){
        
        String welcomeMessage = "Welcome to " + TITLE + "!";
        output(welcomeMessage);
    }
    
    /**
     * Executes the program (this is where the random array is created and
     * checked)
     */
    public static void program(){
        
        int input = userInput();
        int[] randomArray = new int[input];
        
        int low = 0;
        int high = 0;
        
        int indexMatches = 0;
        
        String outputArray = "";
        
        for (int i = 0; i < randomArray.length; i++) {
            
            low = i - 5;
            high = i + 5;
            
            randomArray[i] = random(low, high);
            
            if (randomArray[i] == i) {
                
                indexMatches++;
            }
            
            outputArray += "Index " + i + ":    " + randomArray[i] + "\n";
        }
        
        String outputMessage = "The array of size " + input + ": \n\n"  
                + "Index matches: " + indexMatches + "\n\n"
                + outputArray;
        
        output(outputMessage);
    }
    
    /**
     * Asks the user if they want to play again
     * @return - Returns true or false
     */
    public static boolean playAgain(){
        
        String playAgain = "Do you want to play again?";
        
        int confirm = JOptionPane.showConfirmDialog(null, 
                playAgain, 
                TITLE, 
                JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );
        
        if(confirm == 0){
            
            return true;
        } else {
            
            return false;
        }
    }
    
    /**
     * Outputs user thank you message
     */
    public static void thanks(){
        
        String thanksMessage = "Thank you for playing " + TITLE + "!";
        output(thanksMessage);
    }
    
    /**
     * Generates random numbers
     * @param low - lowest possible number
     * @param high - highest possible number
     * @return - random integer
     */
    private static int random(int low, int high) {
        double seed = Math.random();
        double L = (double) low;
        double H = (double) high;
        double number = (H - L + 1) * seed + L;
        return (int) number;
    }
    
    /**
     * Prompts the user for the index size
     * @return - Returns the index size
     */
    public static int userInput(){
        
        String inputMessage = "Please enter the size of the array to generate:";
        String input = "";
                
        do{
            
            input = JOptionPane.showInputDialog(
                null,
                inputMessage,
                TITLE,
                JOptionPane.PLAIN_MESSAGE
            );


        } while (input == null || checkInteger(input) == false);
        
        int inputSize = Integer.parseInt(input);
        return inputSize;
    }
   
    /**
     * Determines wether or not the user's base input is an integer
     * @param input - User's base size
     * @return - Returns true or false
     */
    public static boolean checkInteger(String input){
        
        boolean isInteger = true;
        
        for(int i = 0; i < input.length(); i++){
            
            if( !Character.isDigit(input.charAt(i)))
            isInteger = false;          	   
        }
        
        return isInteger;
    }
    
    /**
     * Outputs a JOptionPane message dialog box
     * @param message - The message of the dialog box
     */
    public static void output(String message){
        
        JOptionPane.showMessageDialog(
                null, 
                message, 
                TITLE,
                JOptionPane.PLAIN_MESSAGE);
    }
    
}
