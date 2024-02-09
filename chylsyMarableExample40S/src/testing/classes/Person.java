package testing.classes;

/**
 * Person.java - represents ("models") a person. This is a class with (some 
 * "things" or "properties" about the class - also known as adjectives, or 
 * descriptors) and methods (things it can "do" or "verbs" or "actions"). 
 * Classes can be created (instantiated) into objects (which are instances of 
 * that class).
 *
 * @author Chylsy Marable
 * @since Oct 11, 2023, 11:54:54 a.m.
 */
public class Person {

    public String name;
    private int age;
    public String gender;

    /**
     * Using the modifier word "protected" for a property or method means that
     * property (or the method can be called) can be accessed by the class
     * itself (like private) and can be accessed by other class IF those classes
     * are "related" to this class through inheritance (subclasses)
     */
    protected boolean alive;

    public Person() {

        alive = true;
        age = 0;
        name = "Unidentified";
        gender = "Unidentified";
    }

    /**
     * Overloaded (methods with the same name, different parameters) constructor
     * method, sets the class properties by assigning the passed parameter value
     * into the object's (class) property (global variable) of the same name
     * using the keyword "this"
     *
     * @param name the name of this person
     * @param age the age of this person
     * @param gender the identified gender of this person
     */
    public Person(String name, int age, String gender) {

        alive = true;
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    /**
     * The person dies (changing/modifying) the protected property (alive) 
     * through this method
     */
    public void die() {

        alive = false;
    }

    /**
     * A person has a birthday (the age goes up by one)
     */
    public void birthday() {

        age++;
    }

    /**
     * Outputs information about the person to the screen
     */    
    public void talk() {

        if (alive) {

            System.out.println(name + " is " + age + " and identifies as " + gender);
        } else {

            System.out.println("Boooooo!!!!");
        }
    }

    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {

        return "Person";
    }

    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {

        Person that = (Person) object;

        if (this.alive != that.alive) {
            return false;
        }
        if (this.age != that.age) {
            return false;
        }
        if (!this.name.equals(that.name));
        if (this.gender.equals(that.gender));

        return true;
    }

    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Person clone() {

        //return this;
        //go deeper the clone could be lets crete a new memory :3 nyahhh
        Person that = new Person();

        that.age = this.age;
        that.alive = this.alive;
        that.name = this.name;
        that.gender = this.gender;

        return that;
    }

    /**
     * Accessor method (or "getter" method) that give you (or "reads") the age
     * of this person object (which is a private property of this class which
     * normally cannot be read outside the class). Sometimes you write a
     * accessor method so user outside the class can "read only" that property
     * without the ability to change that property
     *
     * @return the person's current age value to "see" (access)
     */
    public int getAge() {
        return age;
    }

    /**
     * Another accessor method. Sometimes, we also write a "mutator" method to
     * go with the accessor method. Sometimes we write a mutator without a
     * accessor.
     *
     * @return the person's gender
     */
    public boolean getAlive() {

        return alive;
    }

    /**
     * Mutator method (or "setters") that 'changes' the encapsulated (private)
     * property of this person (which is a private property of this class which
     * cannot be changed outside the class). Often programmers write error
     * checking code into mutator methods so the property cannot just be "set"
     * to anything - but is error checked first
     *
     * @param alive the new alive to set (mutate) the property into
     */
    public void setAlive(boolean alive) {

        this.alive = alive;
    }
    
    /**
     * A "static" method means the method is "shared" by all objects of the 
     * class - it can also be called from the class itself, you can use the 
     * class name then a dot to call static methods
     */   
    public static void endTheWorld(){
        
        System.out.println("Boom!!!!!!!!!!!!!");
    }
    
    /**
     * Person eats food
     * @param food - what food the person is eating :3 (#^_^#)
     */
    public void consume(Food food) {
        
        System.out.println(name + " is eating " + food.eat());
    }

}
