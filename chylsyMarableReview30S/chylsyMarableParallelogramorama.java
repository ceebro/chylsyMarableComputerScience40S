package chylsymarableparallelogramorama;

import javax.swing.JOptionPane;


/*
 * ChylsyMarableParallelogramorama - description
 * 
 * @author Chylsy Marable
 * @since Sep 25, 2023
*/
public class ChylsyMarableParallelogramorama
{

    public static final String TITLE = "Parallelogram-orama";
    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        welcome();
    }
    
    public static void welcome(){
        
        String welcomeMessage = "Welcome to " + TITLE + "!";
        output(welcomeMessage);
    }
    
    public static void program(){
        
        int width = inputWidth();
        int height = inputHeight();
    } 
    
    public static int inputWidth(){
        
        String widthMessage = "Enter the width of the parallelogram";
        String inputWidth = "";
        
        do{
            
            inputWidth = JOptionPane.showInputDialog(
                    null,
                    widthMessage,
                    TITLE,
                    JOptionPane.PLAIN_MESSAGE
            );
        } while (checkInteger(inputWidth) == false);
        
        int width = Integer.parseInt(inputWidth);
        return width;
    }
    
    public static int inputHeight(){
        
        String heightMessage = "Enter the height of the parallelogram";
        String inputHeight = "";
        
        do{
            
            inputHeight = JOptionPane.showInputDialog(
                    null,
                    heightMessage,
                    TITLE,
                    JOptionPane.PLAIN_MESSAGE
            );
        } while (checkInteger(inputHeight) == false);
        
        int height = Integer.parseInt(inputHeight);
        return height;
    }
    
    public static char inputChar(){
        
        
    }
    
    public static boolean checkInteger(String base){
        
        boolean isInteger = true;
        
        for(int i = 0; i < base.length(); i++){
            
            if( !Character.isDigit(base.charAt(i)))
            isInteger = false;          	   
        }
        
        return isInteger;
    }
    
    public static void output(String message){
        
        JOptionPane.showMessageDialog(
                null, 
                message,
                TITLE,
                JOptionPane.PLAIN_MESSAGE
        );
    }
    
}

