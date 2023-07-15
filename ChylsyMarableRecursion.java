
package chylsymarablerecursion;

/*
 * ChylsyMarableRecursion - Solution to the McCarthy91 Programming Problem
 * 
 * @author Chylsy Marable
 * @since 15-Jul-2023
*/
public class ChylsyMarableRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n = -20;
        // is this unorthodox????
        for (int i = 0; i < 16; i++) {

            n = n + 20;
            System.out.println("Number = " + n);

            int mcCarthy = mcCarthy91(n);
            System.out.println("McCarthy value = " + mcCarthy + "\n");
        }
    }
    
    /**
     * The recursive function
     * @param n - The integer used to calculate its McCarthy value
     * @return - Returns the McCarthy value of the 'n' integer
     */
    public static int mcCarthy91(int n) {

        if (n <= 0) {
            
            // base case
            return 0;
        } else if (n > 100) {
            
            // base case
            return n - 10;
        } else {
            
            //recursive case
            return mcCarthy91(mcCarthy91(n + 11));
        }
    }
}
