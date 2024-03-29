
/** Required package class namespace */
package testing.classes;

 
/**
 * Athlete.java - represents a Athlete Husky HighSchool Student Person. Using 
 * the keyword 'implements' in the class signature line, means this class 
 * "follows the rules" of that interface. This will force the programmer to
 * 'implement' (write) the abstract methods the were 'suggested' in that
 * interface. This can be done in NetBeans with the light bulb. You can 
 * implement ("follow the rules of") MULTIPLE interfaces (this cannot be done
 * with classes - one class can only inherit/extends from one other class). To
 * do multiple implementation, use a comma between interfaces.
 *
 * @author Chylsy Marable
 * @since Nov 21, 2023, 11:57:49 a.m.
 */
public class Athlete extends Husky implements PermissionForm, Hockey, 
        OstrichRacing // we are not implementing Sports coz Hockey 
                      // inherits from Sports already
{

    private boolean haveForm;       // Encapsulated properties (variables)
    private String  opponentName;
    private int     homeScore;
    private int     opponentScore;
    private boolean champion;
    
    private final boolean WE_WON  = true;    // Encapsulated constants
    private final boolean WE_LOST = false;
    
    
    /**
     * Default constructor, set class properties
     */
    public Athlete() {
        // To have one constructor method call another class constructor method,
        // you use the keyword "this" with round brackets
        this("Havoc",15,"Sporty");
    }
    
    /**
     * Constructor, set class properties
     * 
     * @param name the name for this athlete
     * @param age the age for this athlete
     * @param gender the gender for this athlete
     */
    public Athlete(String name, int age, String gender) {
        super();                    // Call super-constructor
        super.name = name;          // Modifying (mutating or changing) property
        super.gender = gender;      
        // Because age is encapsulated we could:
        // (1) Make the age property "public"
        // (2) Make the age property "protected"
        // (3) Write a mutator method like: super.setAge(age);
        // (4) Update and change all the constructors through the "chain" of
        //     inheritance
        opponentName  = "";
        homeScore     = 0;
        opponentScore = 0;
        haveForm      = PermissionForm.NOT_SIGNED;  // Using interface property
        champion      = WE_LOST;
    }
    
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Athlete: " + super.toString();
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Athlete clone() {
        return this;
    }

    /**
     * Signing the permission form
     */
    @Override
    public void sign() {
        System.out.println(super.name + " has signed the form!");
        haveForm = PermissionForm.SIGNED;
    }

    /**
     * Determines if the form has been signed or not
     * 
     * @return has been signed (true), or not (false)
     */
    @Override
    public boolean haveYouGotItSigned() {
        return haveForm;
    }

    /**
     * A team scoring a point
     * 
     * @param name the name of the team who scored
     */
    @Override
    public void score(String name) {
        System.out.println(name + " has scored");
        if (name.equals(opponentName)) opponentScore++;
        if (name.equals(super.name))   homeScore++;
    }

    /**
     * The passed period of hockey is over
	 *
     * @param period the period number
     */
    @Override
    public void endOfPeriod(int period) {
        String output = "End of period " + period;
        output += " and the score is "   + homeScore;
        output += " for the "            + super.name;
        output += " and "                + opponentScore;
        output += " for the "            + opponentName;
        System.out.println(output);
    }

    /**
     * Mutator method, setting the name of the player
     * 
     * @param name setting the name of the player
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }

    /**
     * Mutator setting the name of the opponent
     * 
     * @param name the name of this opponent
     */
    @Override
    public void setOpponent(String name) {
        opponentName = name;
    }

    /**
     * Determines if the sports game is over (with a winner)
     * 
     * @return there was a winner (true) or not (false)
     */
    @Override
    public boolean didIWin() {
        if (champion) {
            System.out.println(super.name + " is champion!");
            return WE_WON;
        }
        else if (homeScore > opponentScore) {
            System.out.println(super.name + " we win!");
            return WE_WON;
        }
        else if (didRiderStayMounted()) {
            System.out.println("We stayed on!");
            return WE_WON;
        }
        else {
            System.out.println(opponentName + " wins!");
            return WE_LOST;
        }
    }

    /**
     * Determines if the rider stayed on the ostrich or not
     * 
     * @return they stayed on (true) or fell off (false)
     */
    @Override
    public boolean didRiderStayMounted() {
        int chanceOfFalling = (int)((100 - 1 + 1) * Math.random() + 1);
        if (chanceOfFalling <= 10) return false;
        else                       return true;
    } 

    /**
     * Sets the length for the race
     * 
     * @param meters the length of the racing track in meters
     */
    @Override
    public void lengthOfTrack(int meters) {
        System.out.println("The track is " + meters + " meters!");
    }
    
}