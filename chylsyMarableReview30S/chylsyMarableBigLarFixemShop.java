package chylsymarablebiglarfixemshop;

import javax.swing.JOptionPane;

/*
 * chylsyMarableBigLarFixemShop - A program that diagnoses a computer's 
    technical issues based on two conditions.
 * @author Chylsy Marable
 * @since 6-Sep-2023
*/
public class ChylsyMarableBigLarFixemShop {

    public static final String TITLE = "Big Lar's Computer Fixem-up Shop";
    public static final String Y = "Y";
    public static final String N = "N";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
            two conditions for computer
            1 is it beeping upon startup
            2 does the hard drive spin
            
            1,2 yes 'Hold for one of our technicians'
            1 yes 2 no 'Check drive contacts'
            1,2 no 'Bring computer in for repair
            1 no 2 yes 'Check speaker contacts'
         */
        
        welcome();
        program();
        thanks();
    }

    /**
     * Outputs the user welcome message
     */
    public static void welcome() {

        String welcomeMessage = "Welcome to " + TITLE + "!";
        output(welcomeMessage);
    }

    /**
     * Runs program by checking the user's inputs with conditions (below)
     */
    public static void program() {

        String beepCondition = "Does your computer beep upon startup?";
        String beep = userInput(beepCondition);

        String spinCondition = "Does your hard drive spin?";
        String spin = userInput(spinCondition);

        if (beep.equalsIgnoreCase(Y) && spin.equalsIgnoreCase(Y)) {

            String holdInstructions = "Please hold for one of our technicians.";
            output(holdInstructions);
        } else if (beep.equalsIgnoreCase(Y) && spin.equalsIgnoreCase(N)) {

            String driveInstructions = "Please check drive contacts.";
            output(driveInstructions);
        } else if (beep.equalsIgnoreCase(N) && spin.equalsIgnoreCase(N)) {

            String repairInstructions = "Please bring your computer in for repairs.";
            output(repairInstructions);
        } else if (beep.equals(N) && spin.equals(Y)) {

            String speakerInstructions = "Please check speaker contacts.";
            output(speakerInstructions);
        }
    }

    /**
     * Outputs user thank you message
     */
    public static void thanks() {

        String thankUser = "Thank you for using " + TITLE + "!";
        output(thankUser);
    }

    /**
     * Outputs a JOptionPane message dialog
     *
     * @param message - The message that the dialog box will display
     */
    public static void output(String message) {

        JOptionPane.showMessageDialog(
                null,
                message,
                TITLE,
                JOptionPane.PLAIN_MESSAGE
        );
    }

    /**
     * Outputs a JOptionpane input dialog
     *
     * @param message - The message that the dialog box will display
     * @return - Returns the user's input as a String
     */
    public static String userInput(String message) {

        return JOptionPane.showInputDialog(
                null,
                message,
                TITLE,
                JOptionPane.PLAIN_MESSAGE
        );
    }
}
