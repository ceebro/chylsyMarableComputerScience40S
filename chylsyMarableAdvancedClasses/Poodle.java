/** Required package class namespace */
package chylsymarableadvancedclassesprogram;

 
/**
 * Poodle.java - description
 *
 * @author Chylsy Marable
 * @since Dec 5, 2023, 11:10:15 a.m.
 */
public class Poodle 
{

    /**
     * Default constructor, set class properties
     */
    public Poodle() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Poodle: " + super.toString();
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Poodle clone() {
        return this;
    }
    
}
