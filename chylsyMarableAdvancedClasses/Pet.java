
package chylsymarableadvancedclassesprogram;

/**
 * Pet.java - A Pet interface that acts as a set of rules for Pet 
 * objects (Dog, Poodle (classes that implement Pet))
 *
 * @author Chylsy Marable
 * @since Dec 5, 2023, 11:09:02 a.m.
 */
public interface Pet {
    
    /**
     * Sets the pet's name (mutator)
     * @param name - Pet's name
     */
    public void setName(String name);
    
    /**
     * Gets the pet's name (accessor method)
     * @return - Returns the pet's name (String)
     */
    public String getName();
    
    /**
     * When the pet is sold
     */
    public void sold();
}
