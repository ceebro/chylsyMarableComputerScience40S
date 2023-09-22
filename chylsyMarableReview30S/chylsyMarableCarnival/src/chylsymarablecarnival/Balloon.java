
package chylsymarablecarnival;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Balloon - Creates the user's balloon. This class sets its properties and outputs
    them if requested.
 * @author Chylsy Marable
 * @since 6-Sep-2023
*/
public class Balloon {
    
    public static final String TITLE = "The Carnival";
    static ImageIcon balloons = new ImageIcon("balloons.gif");
    
    public static String[] directions;
    
    /*
        Balloon's properties (converted to String below)
    */
    public static Object name;
    public static Object color;
    public static Object direction;
    
    /**
     * Constructor method remains empty
     */
    public static void balloon(){
   
    }
    
    /**
     * Sets the balloon's name
     * @return - Returns the balloon's name
     */
    public static String setName(){
        
        String inputName = "Enter name for your balloon";
        
        name = JOptionPane.showInputDialog(
                null, 
                inputName, 
                TITLE, 
                JOptionPane.PLAIN_MESSAGE,
                balloons,
                null,
                null
        );
        
        return name.toString();
    }
    
    /**
     * Sets the balloon's color
     * @return - Returns the balloon's color
     */
    public static String setColor(){
        
        String inputColor = "Select a balloon color";
        
        String[] balloonColor = new String[3];
        balloonColor[0] = "Blue";
        balloonColor[1] = "Red";
        balloonColor[2] = "Green";
        
        color = returnValue(inputColor, balloonColor);
        
        return color.toString();
    }
    
    /**
     * Outputs the balloon's properties
     * @param direction - The direction of the balloon
     */
    public static void outputProperties(String direction){
        
        String userBalloon = "Name: " + name + "\n"
                + "Color: " + color + "\n"
                + "Floating: " + direction;
        
        output(userBalloon);
    }
    
    /**
     * Pops the user's balloon
     */
    public static void popBalloon(){
        
        String poppedBalloon = "Your balloon " + name + " has popped!";
        output(poppedBalloon);
        
    }
    
    /**
     * Sets the values of the directions array above. When outputting the 
     * direction of the balloon, it automatically floats up. The user will have the 
     * option to change its direction.
     * @return - Returns the values of the directions array above
     */
    public static String[] setDirections(){
        
        directions = new String[4];
        
        directions[0] = "Up";
        directions[1] = "Down";
        directions[2] = "Left";
        directions[3] = "Right";
        
        return directions;
    }
    
    /**
     * Moves the user's balloon
     * @return - Returns the direction of the user's balloon
     */
    public static String moveBalloon(){
        
        String moveBalloon = "What direction would you like to move your balloon?";
        
        direction = returnValue(moveBalloon, directions);
        
        return direction.toString();
    }
    
    /**
     * Outputs a JOptionPane input dialog 
     * @param message - The message of the dialog box
     * @param options - Array of options for the user to select from
     * @return - Returns the user's selection as an Object
     */
    public static Object returnValue(String message, String[] options){
        
        Object value = JOptionPane.showInputDialog(
                null, 
                message, 
                TITLE, 
                JOptionPane.PLAIN_MESSAGE,
                balloons, 
                options,
                options[0]
        );
        
        return value;
    }
    
    /**
     * Outputs a JoptionPane message dialog box
     * @param message - The message of the dialog box
     */
    public static void output(String message){
        
        JOptionPane.showMessageDialog(
                null, 
                message, 
                TITLE, 
                JOptionPane.PLAIN_MESSAGE,
                balloons
        );
    }
}
