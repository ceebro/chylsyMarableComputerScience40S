//not finished must error check still
package chylsymarablehouse;

import javax.swing.JOptionPane;

/**
 *
 * @author chyls
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
    
    public static void welcome(){
        
        String welcomeMessage = "Welcome to " + TITLE + "!";
        
        JOptionPane.showMessageDialog(
                null, 
                welcomeMessage,
                TITLE,
                JOptionPane.PLAIN_MESSAGE
                );
    }
    
    public static void program(){
                
        int userBase = inputBase();

        while(isEven(userBase) == false){
               
            error(userBase);
            userBase = inputBase();
            //error check strings and undefined later
        }
        
        System.out.println(OUTPUT_MESSAGE + userBase);
        roof(userBase);
        house(userBase);
        walk(userBase);
        
    }
    
    public static int inputBase(){
        
        String inputMessage = "Enter the house base";
        String base = "";
        
        base = JOptionPane.showInputDialog(
            null, 
            inputMessage,
            TITLE,
            JOptionPane.PLAIN_MESSAGE
        );
        int userBase = Integer.parseInt(base);

        return userBase;
    }
    
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
    
    // <editor-fold>
    public static String drawSpace(int amount){
        
        String space = "";
        
        for (int i = 0; i < amount; i++) {
      
            space += " ";
        }
        
        return space;
    }
    
    public static String drawUnderscore(int amount){
        
        String underscore = "";
        
        for (int i = 0; i < amount; i++) {
            
            underscore += "_";
        }
        
        return underscore;
    }
    
    public static String drawStar(int amount){
        
        String star = "";
        
        for (int i = 0; i < amount; i++) {
            
            star += "*";
        }
        
        return star;
    }
    
    //</editor-fold>
    
    public static boolean isEven(int base){
        
        if(base % 2 == 0){
            
            return true;
        }else{
            
            return false;
        }
    }
    
    public static void error(int base){
        
        String errorMessage = "Cannot draw a house with a base of " + base;
        System.out.println(errorMessage);
    }
    
}
