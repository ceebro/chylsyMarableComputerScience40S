/** Required package class namespace */
package testing.classes;

 
/**
 * DiskJockey.java - represents a Disk Jockey person
 *
 * @author Chylsy Marable
 * @since Nov 21, 2023, 11:58:02 a.m.
 */
public class DiskJockey extends Person
{

    /**
     * Default constructor, set class properties
     */
    public DiskJockey() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "DiskJockey: " + super.toString();
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
    public DiskJockey clone() {
        return this;
    }
    
}
