/** Required package class namespace */
package testing.classes;

 
/**
 * Teacher.java - represents a Teacher. This class uses inheritance to inherit
 * the properties and methods from the Person class. This class also 
 * "associates" with the Student class by making a reference to them within 
 * the class. This is sometimes simplified as a "has a" relationship.
 *
 * @author Chylsy Marable
 * @since Oct 30, 2023, 11:51:19 a.m.
 */
public class Teacher extends Person
{
    
    private int count;
    private final int MAX;
    public Student[] students;
    
    /**
     * Default constructor, set class properties
     */
    public Teacher(String name) {
        
        super(name, 45, "Teacher");
        
        MAX = 100;
        count = 0;
        students = new Student[MAX];
    }
    /**
     * Adds a new student to this teacher
     * 
     * @param student the student object to add
     */
    public void add(Student student) {
        
        students[count] = student; 
        count++;
        
        if (count >= MAX) count = 0;
    }

    /**
     * Teaches all the students this teacher has an association with by making
     * them study (and makes all the students "smarter")
     */
    public void teach() {
        
        for (int i = 0; i < students.length; i++) {
            // With arrays of "objects" (meaning not primitive data types, but
            // "class" level data types) all indices (plural of "index") in
            // the array are initially set to "null"
            if (students[i] != null) {                  // Array spot not a null
                students[i].study();                    // Make this spot study
                students[i].talk();                     // and talk
            }
        }
    }
    
         
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Teacher: " + super.toString();
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
    public Teacher clone() {
        return this;
    }
}
