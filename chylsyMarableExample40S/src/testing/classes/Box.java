/** Required package class namespace */
package testing.classes;

 
/**
 * Box.java - represents a box that can hold anything. This
 * class uses a 'generic' object as a property of the class.
 * When a generic data type is used anywhere in the class, the
 * angle brackets "< >" are used with a single letter in the
 * class signature line. Then that letter can be used throughout
 * the class and the data type is substituted in later when the
 * class is instantiated.
 *
 * @author Chylsy Marable
 * @since Dec 4, 2023, 11:42:43 a.m.
 */
public class Box <T>
//I will tell you about it later :3
{

    private T present;
    
    /**
     * Default constructor, set class properties
     */
    public Box(T present) {
        
        this.present = present;
    }
    
    /**
     * Accessor method (giving access to a private/ encapsulated property) opens
     * the box and returns the contents
     * 
     * @return  the generic "thing" in the box
     */    
    public T open(){
        
        return present;
    }
    
    /**
     * Does a "peek" in the box and outputs the contents
     */    
    public void peek(){
        
        System.out.println("Present: " + present.toString());
    }
    
}
