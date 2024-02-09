
package testing.classes;

 
/**
 * Steak.java - represents a steak Food
 *
 * @author Chylsy Marable
 * @since Nov 30, 2023, 11:33:28 a.m.
 */
public class Steak extends Food
{
    
    /**
     * Default constructor, set class properties
     */
    public Steak() {
        
        super(1);                   
        super.flavor = " Umami";    
    }
    

    /**
     * Prepares a food to be eaten
     */
    @Override
    public void prepare() {
        
        System.out.println("Grill the steak :3 and eat it with rice");
    }
    
    /**
     * Determines if the food (Steak) has spoiled or not
     * @return - true or false
     */
    @Override
    public boolean hasSpoiled() {
        
        return super.eatable;
    }

    /**
     * Sniffs the food 
     * @param seconds - How many seconds you sniff the food
     */
    @Override
    public void smell(int seconds) {
        
        if (seconds > 5) super.eatable = false;
        else super.eatable = true;        
    }

}
