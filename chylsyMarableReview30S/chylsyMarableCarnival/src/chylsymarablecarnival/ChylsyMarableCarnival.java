package chylsymarablecarnival;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * chylsyMarableCarnival - A program that simulates a carnival by creating
    balloons for the user. They also have the option to move and pop their 
    balloon.
 * @author Chylsy Marable
 * @since 6-Sep-2023
*/
public class ChylsyMarableCarnival {

    public static final String TITLE = "The Carnival";
    static ImageIcon balloons = new ImageIcon("balloons.gif");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        welcome();
        program();
    }
    
    /**
     * Outputs user welcome message
     */
    public static void welcome() {

        String welcomeMessage = "Welcome to " + TITLE + "!";
        output(welcomeMessage);
    }

    /**
     * Outputs user thank you message
     */
    public static void thanks() {

        String thanksMessage = "Thank you for using " + TITLE + "!";
        output(thanksMessage);
    }

    /**
     * Executes the program by creating a balloon and asking the user for their
     * activity choice
     */
    public static void program() {

        String[] activities = new String[4];
        activities[0] = "Make a balloon";
        activities[1] = "Move your balloon";
        activities[2] = "Pop your balloon";
        activities[3] = "Quit";

        String activityMessage = "Welcome to the " + TITLE + ", what would you like to do?";

        Object userActivity = userInput(activityMessage, activities);

        Balloon balloon = new Balloon();
        balloon.name = Balloon.setName();
        balloon.color = Balloon.setColor();
        String[] directions = balloon.setDirections();

        balloon.outputProperties(directions[0]);

        userActivity = userInput(activityMessage, activities);
        
        do {
            if(userActivity == activities[1]) {

                String direction = balloon.moveBalloon();
                balloon.outputProperties(direction);

                userActivity = userInput(activityMessage, activities);
            } else if (userActivity == activities[2]) {

                balloon.popBalloon();
                userActivity = userInput(activityMessage, activities);
            }
        } while (userActivity != activities[3]);
        
        thanks();
    }

    /**
     * Outputs a JOptionPane drop down dialog box and the user selects their choice
     * @param message - The message of the dialog box
     * @param options - The user's options
     * @return - Returns the user's selected option
     */
    public static Object userInput(String message, String[] options) {

        return JOptionPane.showInputDialog(
                null,
                message,
                TITLE,
                0,
                balloons,
                options,
                options[0]);
    }

    /**
     * Outputs a JOptionPane message dialog box
     * @param message - The message of the dialog box
     */
    public static void output(String message) {

        JOptionPane.showMessageDialog(
                null,
                message,
                TITLE,
                JOptionPane.PLAIN_MESSAGE,
                balloons);
    }
}
