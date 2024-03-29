package tools;

 
/**
 * Calculator.java - useful collection of methods for doing calculations.
 *
 * @author Chylsy Marable
 * @since Sep 26, 2023, 11:49:30 a.m.
 */
public class Calculator {

    /**
     * Calculates the factorial (!) on a number using a recursive method.
     * Recursive methods need at minimum ONE BASE CASE (to stop the recursion),
     * but can have more than one. They also need to have at minimum ONE
     * RECURSIVE CASE (but they can have multiple recursive cases). Recursive
     * cases means the method calls itself.
     *
     * @param number the number to calculate the factorial of
     * @return the factorial of the parameter (number)
     */
    public static long factorial(int number) {

        // BASE CASE - stops the recursion (stops the looping effect)
        if (number <= 1) {

            return 1;
        }
        // RECURSIVE CASE - the method calls itself (like a loop)
            return number * factorial(number - 1);
    }
    
    /**
     * Calculates the power of a base to it's exponent (recursively)
     * 
     * @param base - the base of the power
     * @param exponent - the exponent of the power
     * @return - the base^exponent
     */
    public static double power(int base, int exponent){

        if (exponent == 0) return 1;
        else if (exponent == 1) return base;
        
        return base * power(base, exponent - 1);
    }
}
