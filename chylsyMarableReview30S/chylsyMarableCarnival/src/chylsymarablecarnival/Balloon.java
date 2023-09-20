
package chylsymarablecarnival;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author c.marable
 */
public class Balloon {
    
    public static final String TITLE = "The Carnival";
    static ImageIcon balloons = new ImageIcon("balloons.gif");
    
    public static String[] directions;
    
    public static void balloon(){
        
        
    }
    
    public static Object setName(){
        
        String inputName = "Enter name for your balloon";

        return JOptionPane.showInputDialog(
                null, 
                inputName, 
                TITLE, 
                JOptionPane.PLAIN_MESSAGE, 
                balloons, 
                null, 
                null);
    }
    
    public static Object setColor(){
        
        String inputColor = "Select a balloon color";
        
        String[] balloonColor = new String[3];
        balloonColor[0] = "Blue";
        balloonColor[1] = "Red";
        balloonColor[2] = "Green";
        
        return JOptionPane.showInputDialog(
                null, 
                inputColor, 
                TITLE, 
                JOptionPane.PLAIN_MESSAGE,
                balloons, 
                balloonColor,
                balloonColor[0]
        );
    }
    
    public static String[] setDirections(){
        
        directions = new String[4];
        
        directions[0] = "Up";
        directions[1] = "Down";
        directions[2] = "Left";
        directions[3] = "Right";
        
        return directions;
    }
    
    public static Object moveBalloon(){
        
        String moveBalloon = "What direction would you like to move your balloon?";
        
        return JOptionPane.showInputDialog(
                null, 
                moveBalloon, 
                TITLE, 
                JOptionPane.PLAIN_MESSAGE, 
                balloons, 
                directions, 
                directions[0]
        );
    }
    
}
