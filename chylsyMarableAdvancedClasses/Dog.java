/** Required package class namespace */
package chylsymarableadvancedclassesprogram;

 
/**
 * Dog.java - This class implements Pet and inherits its methods. Dog is a pet
 *
 * @author Chylsy Marable
 * @since Dec 5, 2023, 11:09:40 a.m.
 */
public class Dog implements Pet
{

    private String name;
    private Sale sale;

    /**
     * Overridden inherited method that sets the dog's name (mutator)
     * @param name - The dog's name
     */
    @Override
    public void setName(String name) {
        
        this.name = name;
    }

    /**
     * Accesses the dog's name
     * @return - Returns the pet's name
     */
    @Override
    public String getName() {
        
        return name;
    }
    
    /**
     * Sells a dog (the Sale)
     * @param price - The price of the sold item
     * @param orderNumber - The Sale's order number
     */
    public void sell(double price, int orderNumber){
        
        sale = new Sale(this, orderNumber);
        sale.setPrice(price);
    }

    /**
     * Outputs the order details on the console
     */
    @Override
    public void sold() {
        
        System.out.print(
                "Order " 
                + sale.getOrderNumber() + " "
                + name
                + " is worth " 
                + sale.getPrice() + "$"
        );
    }
}
