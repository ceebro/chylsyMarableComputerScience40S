
package chylsymarablecarnival;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author c.marable
 */
public class ChylsyMarableCarnival {

    public static final String TITLE = "The Carnival";
    static ImageIcon balloons = new ImageIcon("balloons.gif");
    
    public static String[] activities = new String[4];

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
    
    public static void thanks(){
        
        String thanksMessage = "Thank you for using " + TITLE + "!";
        output(thanksMessage);
    }
    
    public static void program(){
        
        activities[0] = "Make a balloon";
        activities[1] = "Move your balloon";
        activities[2] = "Pop your balloon";
        activities[3] = "Quit";        

        Object userChoice = userActivity();
        
        Balloon balloon = new Balloon();
        balloon.name = balloon.setName().toString();
        balloon.color = balloon.setColor().toString();

        String[] directions = balloon.setDirections();

        String userBalloon = "Name: " + balloon.name + "\n"
                + "Color: " + balloon.color + "\n"
                + "Floating: " + directions[0];
        output(userBalloon);
        userChoice = userActivity();
        
        if (userChoice == activities[1]){
            
            balloon.direction = balloon.moveBalloon().toString();
            
            userBalloon = "Name: " + balloon.name + "\n"
                + "Color: " + balloon.color + "\n"
                + "Floating: " + balloon.direction;
            output(userBalloon);
            userChoice = userActivity();
        } else if(userChoice == activities[2]){
            
            String poppedBalloon = "Your balloon " + balloon.name + " has popped!";
            output(poppedBalloon);
            userChoice = userActivity();
        } else if(userChoice == activities[3]){
            
            thanks();
        }
    }
    
    public static Object userActivity(){
        
        String activityMessage = "Welcome to the " + TITLE + ", what would you like to do?";
        
        Object userActivity = userInput(activityMessage, activities);
        return userActivity;
    }
    
    public static Object userInput(String message, String[] options){
        
        return JOptionPane.showInputDialog(
                null, 
                message, 
                TITLE, 
                0, 
                balloons, 
                options, 
                options[0]);
    }
    
    public static void output(String message){
        
        JOptionPane.showMessageDialog(
                null, 
                message, 
                TITLE, 
                JOptionPane.PLAIN_MESSAGE,
                balloons);
    }
}
