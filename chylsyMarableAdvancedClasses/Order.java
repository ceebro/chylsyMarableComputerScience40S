/** Required package class namespace */
package chylsymarableadvancedclassesprogram;

 
/**
 * Order.java - An abstract class that simulates an ordered item
 *
 * @author Chylsy Marable
 * @since Dec 5, 2023, 11:09:02 a.m.
 */
public abstract class Order 
{

    protected int orderNumber;
    
    /**
     * Sets the price of the ordered item (mutator method)
     * @param price - The price of the item (double)
     */
    public abstract void setPrice(double price);
    
    /**
     * Gets the price of the item (accessor method)
     * @return - Returns the price of the item
     */
    public abstract double getPrice();

     
}
