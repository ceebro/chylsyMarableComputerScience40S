package chylsymarablerecursion;

import javax.swing.JOptionPane;


/*
 * ChylsyMarableRecursion - Solution to the McCarthy91 Programming Problem
 * 
 * @author Chylsy Marable
 * @since Sep 26, 2023
*/
public class ChylsyMarableRecursion
{
    
    public static final String TITLE = "The McCarthy91 Function";
    
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
     * Outputs user welcome message
     */
    public static void welcome(){
        
        String welcomeMessage = "Welcome to " + TITLE + "!";
        output(welcomeMessage);
    }
    
    /**
     * Outputs all McCarthy values by creating a string and printing it out on
     * the terminal
     */
    public static void program(){
        
        String numberMessage = "Number: ";
        String mcCarthyMessage = "McCarthy Value: ";
        String mcCarthyOutput = "";
                
        for (int i = 0; i <= 300; i += 20){
            
            int mcCarthy = mcCarthy91(i);

            if (i == 0){
                
                mcCarthyOutput += numberMessage
                        + i 
                        + "       "
                        + mcCarthyMessage 
                        + mcCarthy 
                        + "\n";
            }
            else if (i < 100){
                
                mcCarthyOutput += numberMessage
                        + i 
                        + "      " 
                        + mcCarthyMessage
                        + mcCarthy
                        + "\n";
            } else {
                
                mcCarthyOutput += numberMessage 
                        + i 
                        + "     " 
                        + mcCarthyMessage
                        + mcCarthy
                        + "\n";
            }
        }
        
        System.out.println(mcCarthyOutput);
        
    }
    
    /**
     * Asks the user if they want to play again
     *
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
    public static void thanks (){
        
        String thanksMessage = "Thank you for using " + TITLE + "!";
        output(thanksMessage);
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
                JOptionPane.PLAIN_MESSAGE
        );
        
    }
    /**
     * Recursive method that calculates the McCarthy values
     * @param n - The integer who's McCarthy value is being calculated
     * @return - Returns the McCarthy value of 'n' integer
     */
    public static int mcCarthy91(int n) {

        if (n <= 0) return 0;
        //base case 
        else if (n > 100) return n - 10;
        //base case
        
        return mcCarthy91(mcCarthy91(n + 11));
        //recursive case
    }
}
