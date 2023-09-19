
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
        
        String[] activities = new String[4];
        activities[0] = "Make a balloon";
        activities[1] = "Move your balloon";
        activities[2] = "Pop your balloon";
        activities[3] = "Quit";
        
        String activityMessage = "Welcome to the " + TITLE + ", what would you like to do?";
        
        Object userActivity = userInput(activityMessage, activities);
        
        if(userActivity == activities[0]){
            
            
        }
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
        
        JOptionPane.showMessageDialog(null, 
                message, 
                TITLE, 
                JOptionPane.PLAIN_MESSAGE,
                balloons);
    }
}