package chylsymarablegpstext;

import javax.swing.JOptionPane;

/**
 *
 * @author chyls
 */
public class ChylsyMarableGPSText {

    public static final String TITLE = "GPS Text Entry";
    
    public static int currentX = 0;
    public static int currentY = 0;
    public static int movements = 0;

    public static final String[][] KEYBOARD
            = {{"A", "B", "C", "D", "E", "F"},
            {"G", "H", "I", "J", "K", "L"},
            {"M", "N", "O", "P", "Q", "R"},
            {"S", "T", "U", "V", "W", "X"},
            {"Y", "Z", "SPACE", "-", ".", "ENTER"}
            };
    //ignoreCase;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        welcome();
        program();
    }

    public static void welcome() {

        String welcomeMessage = "Welcome to the " + TITLE;
        output(welcomeMessage);
    }

    public static void program() {

        displayKeyboard();

        String waypoint = userInput();

        int wordLength = waypoint.length();

        String[] phrase = new String[wordLength];

        for (int i = 0; i < phrase.length; i++) {

            phrase[i] = Character.toString(waypoint.charAt(i));
            //System.out.println(phrase[i]);
        }

        findCoordinates(phrase, wordLength);
        System.out.println(movements);
        
    }

    public static void displayKeyboard() {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 6; j++) {

                System.out.print(KEYBOARD[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static String userInput() {

        String inputMessage = "Enter the phrase for the GPS";

        return JOptionPane.showInputDialog(
                null,
                inputMessage,
                TITLE,
                JOptionPane.PLAIN_MESSAGE
        );
    }

    public static void output(String message) {

        JOptionPane.showMessageDialog(
                null,
                message,
                TITLE,
                JOptionPane.PLAIN_MESSAGE
        );
    }

    public static void findCoordinates(String[] word, int arraySize) {

        //KEYBOARD
        //must find location of the string/element within the keyboard[][]
        //arraySize is the final value of the word index (loop to change the value
        //somewhere)
        boolean found = false;
        
        String coordinates = "";
        // i represents columns
        // j represents rows
        int charToCheck = 0;
        do {
            
            found = false;
            for (int i = 0; i < KEYBOARD.length; i++) {
                
                if (found) {
                    break;
                }
                for (int j = 0; j < KEYBOARD[0].length; j++) {
                    
               
                    //System.out.println(charToCheck);
                    if (KEYBOARD[i][j].equalsIgnoreCase(word[charToCheck])) {
                        
                        found = true;
                        coordinates += "X = " + j + " Y = " + i + "\n";
                        calculateDistance(j, j);
                        charToCheck++;
                        break;
                    }

                }
            }
            
        } while (charToCheck < arraySize);
         System.out.println(coordinates);

    }
    public static void calculateDistance(int row, int column){
        movements += row-currentX;
        movements += column-currentY;
        currentX = row;
       currentY = column;
                
    }

}
