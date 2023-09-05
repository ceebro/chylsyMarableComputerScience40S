
package chylsymarablehouse;

import javax.swing.JOptionPane;

/*
 * chylsyMarableHouse - A program that draws a house on the terminal using various
 characters. The size of the house is based on the user's base input.
 * 
 * @author Chylsy Marable
 * @since 6-Sep-2023
*/
public class ChylsyMarableHouse {

    public static final String TITLE = "House Builder";
    public static final String OUTPUT_MESSAGE = "Here is a house with a base of ";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        welcome();
        program();
    }
    
    /**
     * Outputs the user welcome message using a JOptionPane message dialog
     */
    public static void welcome(){
        
        String welcomeMessage = "Welcome to " + TITLE + "!";
        
        JOptionPane.showMessageDialog(
                null, 
                welcomeMessage,
                TITLE,
                JOptionPane.PLAIN_MESSAGE
                );
    }
    
    /**
     * Executes the program by collecting the user's input and drawing a house
     * on the terminal based on those dimensions
     */
    public static void program(){
                
        int userBase = inputBase();

        while(isEven(userBase) == false){
               
            error(userBase);
            userBase = inputBase();            
        }
        
        System.out.println(OUTPUT_MESSAGE + userBase);
        roof(userBase);
        house(userBase);
        walk(userBase);
        
    }
    
    /**
     *  Displays a JOptionPane input dialog box to collect the user's input and
     *  checks if it is an an appropriate value (an integer)
     * @return - Returns the user's input (base for house)
     */
    public static int inputBase(){
                
        String inputMessage = "Enter the house base";
        String base = "";
        
        boolean isInteger;
        
        do{
            
            base = JOptionPane.showInputDialog(
            null, 
            inputMessage,
            TITLE,
            JOptionPane.PLAIN_MESSAGE
            );
            
            isInteger = checkInteger(base);
            
        } while (base == null || base == "" || isInteger == false);
        
        int userBase = Integer.parseInt(base);

        return userBase;
    }
    
    /**
     * Determines wether or not the user's base input is an integer
     * @param base - User's base size
     * @return - Returns true or false
     */
    public static boolean checkInteger(String base){
        
        boolean isInteger = true;
        
        for(int i = 0; i < base.length(); i++){
            
            if( !Character.isDigit(base.charAt(i)))
            isInteger = false;          	   
        }
        
        return isInteger;
    }
    
    /**
     * Draws the roof of the house
     * @param base - The base of the house
     */
    public static void roof (int base){
        
        //width = base
        //height = half of base
        
        int height = base/2;
                
        String leftPanel = "/";
        String rightPanel = "\\";
        
        String roof = "";
        int middle = 0;
        
        
        for (int i = 0; i < height; i++) {
            
            if (i == height-1){
                
                roof += drawSpace(base)
                        + leftPanel
                        + drawUnderscore(middle)
                        + rightPanel
                ;
                
                base--;
                middle +=2;
            } else {
                
                roof += drawSpace(base)
                        + leftPanel
                        + drawSpace(middle)
                        + rightPanel
                        + "\n"
                ;
                
                base--;
                middle +=2;
            }
        }
        
        System.out.println(roof);
    }
    
    /**
     * Draws the walls of the house
     * @param base - The base of the house
     */
    public static void house (int base){
        
        //height = half of base
        
        int height = base/2;
        
        String wall = "|";
        
        String house = "";
        
        for (int i = 0; i < height; i++) {
            
            if(i == height - 1){
                
                house += drawSpace(height + 1)
                        + wall
                        + drawUnderscore(base - 2)
                        + wall
                ;
            } else {
                
                house += drawSpace(height + 1)
                    + wall
                    + drawSpace(base - 2)
                    + wall
                    + "\n"
                ;
            }
        }
        
        System.out.println(house);   
    }
    
    /**
     * Draws the floor and walkway of the house
     * @param base - The base of the house
     */
    public static void walk (int base){
        
        //length = base
        // + 2 before (line above)
        
        String steps = drawSpace(base)
                + "**"
        ;
        
        String walkway = "";
                    
        walkway += drawSpace(base)
                + drawStar(base)
        ;

        System.out.println(steps);
        System.out.println(walkway);
    }
    
    /**
     * Creates a String of space characters
     * @param amount - The amount of spaces in the String(stored using a for 
     * loop)
     * @return - Returns a String of space characters
     */
    public static String drawSpace(int amount){
        
        String space = "";
        
        for (int i = 0; i < amount; i++) {
      
            space += " ";
        }
        
        return space;
    }
    
    /**
     * Creates a String of underscore characters
     * @param amount - The amount of underscores in the String (stored using a
     * for loop)
     * @return - Returns a String of underscore characters
     */
    public static String drawUnderscore(int amount){
        
        String underscore = "";
        
        for (int i = 0; i < amount; i++) {
            
            underscore += "_";
        }
        
        return underscore;
    }
    
    /**
     * Creates a String of star characters
     * @param amount - The amount of stars in the String (stored using a for 
     * loop)
     * @return - Returns a String of star characters
     */
    public static String drawStar(int amount){
        
        String star = "";
        
        for (int i = 0; i < amount; i++) {
            
            star += "*";
        }
        
        return star;
    }
        
    /**
     * Determines wether or not the user's base input is an even number
     * @param base - The user's base input
     * @return - Returns true or false
     */
    public static boolean isEven(int base){
        
        if(base % 2 == 0){
            
            return true;
        }else{
            
            return false;
        }
    }
    
    /**
     * Displays an error message on the terminal (user's base is not an even 
     * number)
     * @param base - The user's base input
     */
    public static void error(int base){
        
        String errorMessage = "Cannot draw a house with a base of " + base;
        System.out.println(errorMessage);
    }
}
