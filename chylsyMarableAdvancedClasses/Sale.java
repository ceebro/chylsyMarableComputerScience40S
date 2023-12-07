/** Required package class namespace */
package chylsymarableadvancedclassesprogram;

 
/**
 * Sale.java - A generic class that creates sold items as well as an order
 * number (the price of the item can be set) 
 * This class is also a child of Order, so it must inherit all of Order's methods
 *
 * @author Chylsy Marable
 * @since Dec 5, 2023, 11:09:23 a.m.
 */
public class Sale <T> extends Order
{

    private T saleItem;
    private double price;
    
    /**
     * Default constructor, set class properties
     */
    public Sale(T saleItem, int orderNumber) {
        
        super.orderNumber = orderNumber;
        this.saleItem = saleItem;
    }

    /**
     * Sets the price of the saleItem (mutator)
     * @param price - The price as a double
     */
    @Override
    public void setPrice(double price) {
        
        this.price = price;
    }

    /**
     * Gets the price of the saleItem (accessor)
     * @return - Returns the price as a double
     */
    @Override
    public double getPrice() {
        
        return price;
    }
    
    /**
     * Gets the order number of the saleItem (accessor)
     * @return - Returns the order number
     */
    public int getOrderNumber(){
        
        return orderNumber;
    }
}
