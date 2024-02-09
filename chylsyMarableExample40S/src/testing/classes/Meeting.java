/** Required package class namespace */
package testing.classes;

 
/**
 * Meeting.java - represents a meeting of people
 *
 * @author Chylsy Marable
 * @since Nov 21, 2023, 11:58:10 a.m.
 */
public class Meeting 
{
    
    private int count;
    private final int MAX;
    public Person[] members;
    
    /**
     * Default constructor, set class properties
     */
    public Meeting(){
        
        MAX = 500;
        count = 0;
        members = new Person[MAX];
    }
    
    /**
     * Have a person attend the meeting
     * 
     * @param person a Person object to attend the meeting
     */
    public void attend(Person person){
        
        // Assign (put, place) the person object (instance of the Person class)
        // passed into this method's parameter into the first empty (unassigned)
        // index (spot, element, location, subscript) of the array property
        // of the Meeting class (global variable)        
        members[count] = person;
        
        // Now advance the count
        count++;
                
        // Potential out of bounds ("range") error with count, we fix with
        if (count >= MAX) {
            // Potentially we could make the array bigger (resize, 
            // re-dimension) - however, whenever you do this it wipes out
            // (recreates, re-dimensions) all array content. So let's just
            // reassign the count
            count = 0;
        }
    }
    
    /**
     * Hold the meeting for all members
     */
    public void hold(){
        
        String message = "The meeting is about to begin!!!! \n";;

        for (Person member : members) {
            
            if(member != null) message += "\t";
            
            if (member instanceof Person)     message += "\t Person ->";
            if (member instanceof Student)    message += "\t Student ->";
            if (member instanceof Teacher)    message += "\t Teacher ->";
            if (member instanceof Doctor)     message += "\t Doctor ->";
            if (member instanceof DiskJockey) message += "\t DiskJockey ->";
            if (member instanceof MrWachs)    message += "\t MrWachs ->";
            if (member instanceof HighSchool) message += "\t HighSchool ->";
            if (member instanceof Husky)      message += "\t Husky ->";
            if (member instanceof Piper)      message += "\t Piper ->";
            if (member instanceof Athlete)    message += "\t Athlete ->";
        }
        
        message += "\nWith " + Student.total + " students present!";
        
        System.out.println(message);
    }
}
