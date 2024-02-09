package testing;

import tools.Calculator;

 
/**
 * RecursionTest.java - tests the concepts learned in this unit. Recursion is 
 * the process of something recurring, and is defined as a method that calls 
 * itself. Recursive methods may have 1 or more than 1 base cases, and 1 or 
 * more than 1 recursive cases, but the method must have a minimum of 1 base 
 * case and 1 recursive case. Recursion is a programming tool that can often 
 * be used as an alternative to looping, or as a simpler way to solve 
 * specific problems. Recursion is not always the most efficient solution as 
 * it often consumes more memory than an iterative solution. Often recursion 
 * is ‘hidden’ by using a public method call that then calls a private 
 * recursive method to implement the recursion that eventually returns to the 
 * original method that then returns the result (this is known as a “wrapper” 
 * method).
 *
 * @author Chylsy Marable
 * @since Sep 26, 2023, 11:57:25 a.m.
 */
public class RecursionTest 
{

    /**
     * Default constructor, set class properties
     */
    public RecursionTest() {
        
        System.out.println("\n Recursion test started... \n");
        
        // When testing, think of three scenarios:
        // (1) Typical case ("user"): do what they are told to do
        // (2) Edge cases (more than one): they "push" the edge
        // (3) Beyond the edges: "bad" users, trying to break things
            
        final int MIN_FACTORIAL = -1;
        final int MAX_FACTORIAL = 20;
        
        for (int i = MIN_FACTORIAL; i <= MAX_FACTORIAL; i++) {
            
            long answer = Calculator.factorial(i);
            System.out.println(i + " factorial = " + answer);
        }
        
        //my own code!!!!
        
        //int answer = Calculator.factorial(5);
        //System.out.println("5 factorial = " + answer);
        
        //int number = 5;
        //int exponent = 2;
        //int power = Calculator.power(number, exponent);
        //System.out.println(number + " to the power of " + exponent + " = "+ power);

        final int MIN = 0;
        final int MAX = 10;
        
        for (int exponent = MIN; exponent <= MAX; exponent++) {
            
            for (int base = MIN; base <= MAX; base++) {
                
                double answer = Calculator.power(base, exponent);
                System.out.println(base + " to the exponent " + exponent + " = " + answer);
            }
        }
        
        System.out.println("\n Recursion test complete! \n");
    }
}