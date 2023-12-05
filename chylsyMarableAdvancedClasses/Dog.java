/** Required package class namespace */
package chylsymarableadvancedclassesprogram;

 
/**
 * Dog.java - description
 *
 * @author Chylsy Marable
 * @since Dec 5, 2023, 11:09:40 a.m.
 */
public class Dog implements Pet
{

    private String name;
    private Sale sale;
    
    /**
     * Default constructor, set class properties
     */
    public Dog() {
        
        
    }

    @Override
    public void setName(String name) {
        
        this.name = name;
    }

    @Override
    public String getName() {
        
        return name;
    }

    @Override
    public void sold() {
        
        
    }
     
   
}
