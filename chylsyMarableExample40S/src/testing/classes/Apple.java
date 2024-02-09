
package testing.classes;

 
/**
 * Apple.java - Apple inherits from the abstract class called Food
 * to simulate a food
 *
 * @author Chylsy Marable
 * @since Nov 29, 2023, 11:59:47 a.m.
 */
public class Apple extends Food
{

    /**
     * Default constructor, set class properties
     */
    public Apple() {
        
        super(4);                   
        super.flavor = "Sweet";    
    }
    

    /**
     * Prepares food to be eaten
     */
    @Override
    public void prepare() {
        
        System.out.println("Wash it first");

    }
    
    /**
     * Checks if Apple is spoiled
     * @return - true or false
     */
    @Override
    public boolean hasSpoiled() {
        
        return super.eatable;
    }

    /**
     * Sniff the food :3 to see if it's rotten or not
     * @param seconds - How many seconds to smell
     */
    @Override
    public void smell(int seconds) {
        
        if (seconds > 3) super.eatable = false;
    }
}
