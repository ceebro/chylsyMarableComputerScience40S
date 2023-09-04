
package chylsymarablegpstext;

import javax.swing.JOptionPane;

/**
 *
 * @author chyls
 */
public class ChylsyMarableGPSText {
    
    public static final String TITLE = "GPS Text Entry";
    
    public static final String[][] KEYBOARD = 
            {{"A","B","C","D","E","F"},
            {"G","H","I","J","K","L"},
            {"M","N","O","P","Q","R"},
            {"S","T","U","V","W","X"},
            {"Y","Z","SPACE","-",".","ENTER"}
        };
    //ignoreCase command thing
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        welcome();
        program();
    }
    
    public static void welcome(){
        
        String welcomeMessage = "Welcome to the " + TITLE;
        output(welcomeMessage);
    }
    
    public static void program(){
        
        displayKeyboard();
        
        String waypoint = userInput();
        
        int wordLength = waypoint.length();
        char[] phrase = new char[wordLength];
        
        for (int i = 0; i < phrase.length; i++) {

            phrase[i] = waypoint.charAt(i);
        }
        
        int distance = calculateDistance(phrase, wordLength);
        

    }
    
    public static void displayKeyboard(){
        
        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < 6; j++) {
                
                System.out.print(KEYBOARD[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
    
    public static String userInput(){
        
        String inputMessage = "Enter the phrase for the GPS";
        
        return JOptionPane.showInputDialog(
                null, 
                inputMessage, 
                TITLE,
                JOptionPane.PLAIN_MESSAGE
        );
    }
    
    public static void output(String message){
        
        JOptionPane.showMessageDialog(
                null, 
                message, 
                TITLE,
                JOptionPane.PLAIN_MESSAGE
        );
    }
    
    public static int calculateDistance(char[] word, int arraySize){
        
        //KEYBOARD
        
        //must find location of the string/element within the keyboard[][]
        
        //convert char[] to string[]
                
        String[] characters = new String[arraySize];
        for (int i = 0; i < characters.length; i++) {
            
            characters[i] = word[i];
        }
        
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 6; j++) {
                
                if (KEYBOARD[i][j].equalsIgnoreCase(word[i])) {
                    
                }
            }
        }
        
        return 0;
    }
}
