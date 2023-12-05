
package chylsymarableadvancedclassesprogram;

/**
 * Pet.java - Pet interface that acts as a set of rules for Pet 
 * objects (Dog, Poodle)
 *
 * @author Chylsy Marable
 * @since Dec 5, 2023, 11:09:02 a.m.
 */
public interface Pet {
    
    /**
     * Sets the pet's name
     * @param name - Pet's name
     */
    public void setName(String name);
    
    /**
     * Gets the pet's name
     * @return - Returns the pet's name (String)
     */
    public String getName();
    
    /**
     * When the pet is sold
     */
    public void sold();
}
