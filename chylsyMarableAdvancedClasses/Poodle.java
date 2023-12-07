/** Required package class namespace */
package chylsymarableadvancedclassesprogram;

 
/**
 * Poodle.java - This class inherits from Dog (Poodle is a Dog), simulating 
 * a poodle being sold at a digital pet store
 *
 * @author Chylsy Marable
 * @since Dec 5, 2023, 11:10:15 a.m.
 */
public class Poodle extends Dog
{
    
    private static int poodlesSold;

    /**
     * Default constructor, set class properties 
     */
    public Poodle(String name, int orderNumber) {
        
        super.setName(name);
        super.sell(99.99, orderNumber);
        poodlesSold++;
        sold();
    }
    
    /**
     * Outputs the order details using its parent class's sold method, as well
     * as the number of poodles sold
     */
    @Override
    public void sold(){
        
        super.sold();
        System.out.print(
                " and we have sold "
                + poodlesSold 
                + " poodles"
                + "\n"
        );
    }
}
