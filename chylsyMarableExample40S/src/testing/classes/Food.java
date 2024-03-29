/** Required package class namespace */
package testing.classes;

 
/**
 * Food.java - abstract class representing the 'concept' of food, an abstract
 * class cannot ever be instantiated (no objects of this class can be created),
 * but can act as a parent class to children classes. Once a class has been 
 * made abstract then you can add abstract methods to the class (regular 
 * methods and regular properties can be added as well). Abstract methods 
 * CANNOT be added to regular classes (once a method is abstract, the entire
 * class must be an abstract class).
 *
 * @author Chylsy Marable
 * @since Nov 28, 2023, 11:45:53 a.m.
 */
public abstract class Food 
{
    public boolean eatable;
    private int group;
    public static final String[] GROUPS = {
        
        "Dairy",
        "Protein",
        "Grain",
        "Vegetables",
        "Fruits",
        "Other"
    };
    protected String flavor;
    
    /**
     * Constructor, set class properties
     * 
     * @param group which food group this food item belongs to
     */
    public Food(int group){
        
        this.group = group;
    }
    
    /**
     * How to eat this food object - note: abstract classes can ALSO have
     * "regular" methods and regular properties (not just abstract methods)
     * 
     * @return The output of how eating this "food" item went
     */
    public String eat(){
        
        if(hasSpoiled()) return "DO NOT EAT";
        
        else prepare();
        
        return GROUPS[group] + " it  was" + flavor;
    }
    
    /**
     * Prepares food to be eaten. By adding the modifier "abstract" to a method,
     * it makes an abstract method - means the method has no code for the 
     * body (no curly brackets) and ends in a semi-colon (it can have
     * parameters and it can return a value)
     */
    public abstract void prepare();
    
    /**
     * Determines if this 'food' item has spoiled
     * 
     * @return the food has spoiled (true) or not (false)
     */
    public abstract boolean hasSpoiled();
    
    /**
     * Smells the 'food' item
     * 
     * @param seconds how many seconds to smell it
     */
    public abstract void smell(int seconds);
}    
