
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
    
    public static Object name;
    public static Object color;
    public static Object direction;
    
    public static void balloon(){
        
        
    }
    
    public static Object setName(){
        
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
        
        return name;
    }
    
    public static Object setColor(){
        
        String inputColor = "Select a balloon color";
        
        String[] balloonColor = new String[3];
        balloonColor[0] = "Blue";
        balloonColor[1] = "Red";
        balloonColor[2] = "Green";
        
        color =  JOptionPane.showInputDialog(
                null, 
                inputColor, 
                TITLE, 
                JOptionPane.PLAIN_MESSAGE,
                balloons, 
                balloonColor,
                balloonColor[0]
        );
        
        return color;
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
        
        direction = JOptionPane.showInputDialog(
                null, 
                moveBalloon, 
                TITLE, 
                JOptionPane.PLAIN_MESSAGE, 
                balloons, 
                directions, 
                directions[0]
        );
        
        return direction;
    }
    
}
