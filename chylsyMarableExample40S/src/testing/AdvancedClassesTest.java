
package testing;

import javax.swing.JOptionPane;
import testing.classes.Apple;
import testing.classes.Athlete;
import testing.classes.Box;
import testing.classes.DiskJockey;
import testing.classes.Doctor;
import testing.classes.Husky;
import testing.classes.Meeting;
import testing.classes.MrWachs;
import testing.classes.PermissionForm;
import testing.classes.Person;
import testing.classes.Piper;
import testing.classes.Steak;
import testing.classes.Student;
import testing.classes.Teacher;

 
/**
 * AdvancedClassesTest.java - Advanced classes test in class example OwO
 *
 * @author Chylsy Marable
 * @since Oct 11, 2023, 11:57:23 a.m.
 */
public class AdvancedClassesTest 
{

    /**
     * Default constructor, set class properties
     */
    public AdvancedClassesTest() {
        
        System.out.println("Advanced classes testing...");
        
        Person daniel = new Person();
        daniel.name = "Daniel Jun"; 
        daniel.gender = "a little guy";
        
        int age = 17;
        
        for (int i = 0; i < age; i++) {
            
            daniel.birthday(); //I wanted my Person (daniel) to be older
        } 
        
        daniel.talk();
        
        daniel.die();
        daniel.talk();
        
        Student ryland = new Student("Ryland Cameron Tsuyuki", 16, "a pookie");
        ryland.talk();
        ryland.study();
        ryland.cram();
        ryland.cram();
        ryland.slackOff();
        
        ryland.talk();
        
        Student gavin = new Student("Gavin Mark Cornelius Mackay", 17, "a handsomesillyguy744");
        gavin.cram();
        gavin.cram();
        gavin.slackOff();
        
        gavin.talk();
        
        //Instantiated a teacher (mr wachs)
        Teacher mrWachs = new Teacher("Lawrence Patrick Wachs");
        mrWachs.talk();
        mrWachs.add(ryland);
        mrWachs.add(gavin);
        mrWachs.teach();
        
        Object sandwich = new Object();
        Object sandwich2 = new Object();
        Object sandwich3 = sandwich2;
        
        System.out.println("Object sandwich: " + sandwich.toString());
        System.out.println("Object sandwich2: " + sandwich2.toString());
        System.out.println("Object sandwich3: " + sandwich3.toString());
        
        System.out.println("Object person: " + daniel.toString());
        System.out.println("Object student: " + ryland.toString());
        System.out.println("Object teacher: " + mrWachs.toString());
        
        String string = new String("pookie");
        System.out.println("String as a string: " + string.toString());
        
        JOptionPane joptionpane = new JOptionPane();
        System.out.println("JOptionPane to string: " + joptionpane.toString());
        
        // The equals() method of the object class checks if two objects are
        // "equal" by using the "memory address" of each object and checks if 
        // the two objects being compared use the same address (true) or not 
        // (false) 
        if (sandwich.equals(sandwich2)) System.out.println("S = S2");
        if (sandwich2.equals(sandwich3)) System.out.println("S2 = S3");
        if (sandwich.equals(sandwich3)) System.out.println("S = S3");

        Person person = new Person();
        Person person2 = person;
        Person person3 = person2;
        
        if (person.equals(person2)) System.out.println("P = P2");
        if (person2.equals(person3)) System.out.println("P2 = P3");
        if (person.equals(person3)) System.out.println("P = P3");
        
        person = new Person("person1", 0, "1");
        person2 = new Person("person1", 0, "2");
        person3 = new Person("person1", 0, "2");

        if (person.equals(person2)) System.out.println("P = P2");
        if (person2.equals(person3)) System.out.println("P2 = P3");
        if (person.equals(person3)) System.out.println("P = P3");        
        
        Person clone = person.clone();
        System.out.println("Person is " + person.toString());
        System.out.println("Clone is " + clone.toString());
        if(person.equals(clone)) System.out.println("Person = Clone");
        
        clone.birthday(); //person and clone are no longer equal
        if (person.equals(clone)) System.out.println("Person = Clone");
        
        System.out.println("S1 (Ryland) total: " + ryland.total);
        System.out.println("S2 (Gavin) total: " + gavin.total);
        
        Student student3 = new Student();
        Student student4 = new Student("Student 4", 4, "4");
        
        System.out.println("S3 total: " + student3.total);
        System.out.println("S4 total: " + student4.total);
        
        ryland.total = 9;
        
        System.out.println("S1 (Ryland) total: " + ryland.total);
        System.out.println("S2 (Gavin) total: " + gavin.total);
        System.out.println("S3 total: " + student3.total);
        System.out.println("S4 total: " + student4.total);
        
        daniel.endTheWorld();
        ryland.endTheWorld();
        mrWachs.endTheWorld();
        
        Person.endTheWorld(); //auto complete only appears in reference
        Student.endTheWorld(); //to the class itself (=^_^=)
        Teacher.endTheWorld();                
        
        // You have seen calling method like this before, for example in
        // JOptionPane.showMessageDialog(null, "");
        // Not doing this...
        // JOptionPane jop = new JOptionPane();
        // jop.showMessageDialog(null,"Haii ~ OwO");
        
        // When we call static methods from the instances, the 
        // autocomplete/intellisense will not show it - but it does show it in
        // autocomplete/intellisense from the Class name
        
        //Instantiate other classes ^_^
        Doctor doctor = new Doctor();
        DiskJockey danielJunDJ = new DiskJockey();
        MrWachs mrLWachs = new MrWachs();
        Piper piper = new Piper();
        Husky husky = new Husky();
        Athlete athlete = new Athlete();
        
        System.out.println(doctor);
        System.out.println(danielJunDJ);
        System.out.println(mrLWachs);
        System.out.println(piper);
        System.out.println(husky);
        System.out.println(athlete);        
        
        Meeting meeting = new Meeting(); //(#^_^#)
        meeting.attend(daniel);
        meeting.attend(ryland);
        meeting.attend(gavin);
        
        meeting.hold();
        
        // Abstract classes can NOT ever be instantiated, for example:
        // HighSchool highSchool = new HighSchool();
        // Food food = new Food(1);
        
        // Abstract classes can NOT ever be instantiated, for example:
        // HighSchool highSchool = new HighSchool();
        // Food food = new Food(1);
        
        // Instantiate an object from a child class of an abstract class
        // using the abstract methods (that were made 'concrete') in that class 
        
        Apple apple = new Apple();
        apple.smell(2);
        
        Steak steak = new Steak();
        steak.smell(6);
        
        // Call the polymorphic method which accepts the abstract object (Food)
        // as an argument. Since the abstract class cannot be instantiated,
        // only children objects from the abstract class can be arguments
        // (in other words, apple and steak instances)
                
        mrWachs.consume(steak);
        husky.consume(apple);
        
        // An Interface can be thought of "as a set of rules" - like a class
        // but only contains method signatures (like abstract methods - but
        // you don't have to use the word 'abstract' inside interfaces).
        // Interfaces cannot be instantiated (made into objects like
        // Sports sports = new Sports(); like abstract classes). Like an
        // abstract class, interfaces are used by 'child' like classes that
        // 'implement' the interface (these classes "follow the rules" of
        // the interface ("the set of rules").
        

        athlete = new Athlete();
        // Set our opponent
        athlete.setOpponent("Royals");
        // Have our athletes compete in Three rounds of competition
        for (int round = 1; round <= 3; round++) {
            System.out.println("Round " + round);
            if (athlete.haveYouGotItSigned() == PermissionForm.NOT_SIGNED) {
                System.out.println("Oopsies :3, will do!");
                athlete.sign();
            }
            else {
                // Simulating a round (period) of hockey
                athlete.score("Havoc");
                athlete.score("Royals");
                athlete.score("Havoc");
                athlete.score("Havoc");
                athlete.endOfPeriod(round);
                // Simulate Ostrich racing
                athlete.lengthOfTrack(10);
                athlete.didRiderStayMounted();
            }            
        }
        // Check if we are a champion
        if (athlete.didIWin()) {
            athlete.consume(steak);
        }
        
                // A generic is defined as a characteristic of or relating 
        // to a class or group of things that is not specific. In 
        // Java, we can use generic methods and generic classes
        
        // Let us start by creating simple ("primitive") data types   
        boolean b = true;
        char    c = 'a';
        int     i = 0;
        double  d = 3.14;
        
        // Now use the primatives with a more complex data type (class)
        // called a 'wrapper' class from the primatives and use the 
        // constructor methods of those wrapper classes passing the 
        // primatives through the constructor methods  
        Boolean   bool      = new Boolean(b);
        Integer   integer   = new Integer(i);
        Double    doub      = new Double(d);
        Character character = new Character(c);
        
        // Also String (which was always 'complex' using the captial 'S'
        // to declare it) and its constructor method (usually not needed)..
        String string1 = new String("test");
        
        // Create and call a generic method on these variety of 'generic'
        // objects...
        output(bool);
        output(integer);
        output(doub);
        output(character);
        output(string1);
        output(athlete);
        
        // Test the generic method on another "complex" object (that we don't
        // create)...
        output(joptionpane);
        
        // This line uses "annoymous" object...
  
        output(new Object());
        
        // When using a class with a generic inside of it, and that
        // class is being instantiated (creating an object), then 
        // you define what type the generic is by using the angle 
        // brackets "< >" with the data type (which must be a 
        // 'class' type not a primitive) inside the brackets beside 
        // the class name on the left hand side of the equals sign. 
        // This is repeated on the right hand side of the equals 
        // sign as well (but you can leave these angle brackets 
        // empty - which is called the "diamond") before the round 
        // brackets of the constructor method.
        
        // This is the formal way to create a object from a class
        // with a generic...
        Box<Boolean> box1 = new Box<Boolean>(bool);        
        
        // This way is slightly shorter and uses the "diamond" on the 
        // right hand side (RHS) of the equals -> this IS the preferred 
        // way to create a object from a class with a generic...
        Box<Integer> box2 = new Box<>(integer);


        // This way also works (but can cause problems later...
        Box box3 = new Box(doub);
        
        // Now make more objects with the generic class...
        Box<Character> box4 = new Box<>(character);
        Box<String>    box5 = new Box<>(string1);
        Box<Athlete>   box6 = new Box<>(athlete);
        
        // Peek in all the boxes..  
        box1.peek();
        box2.peek();
        box3.peek();
        box4.peek();
        box5.peek();
        box6.peek();
        
        // Open all the boxes...        
        Boolean   newBoolean   = box1.open();
        Integer   newInteger   = box2.open();
        Double    newDouble    = (Double) box3.open();  // Casting required here
        Character newCharacter = box4.open();
        String    newString    = box5.open();
        Athlete   newAthlete   = box6.open();
        
        // Output all the newly returned data type objects...
        output(newBoolean);
        output(newInteger);
        output(newDouble);
        output(newCharacter);
        output(newString);
        output(newAthlete);
        
        
        System.out.println("Advanced classes complete!");
        
    }

    /**
     * Outputs a generic item with information about the data type. Generic
     * methods use 'generic' references rather than specific references. You do
     * not define the data type (the parameter) when the method is created.
     * Instead of defining the data type, a set of angle brackets "< >" is used
     * with a single letter (usually capital "T") inside which acts as a
     * 'placeholder' for the data type which will be defined in the argument
     * when the method is later called
     *
     * @param <T> the generic type used
     * @param item the item to output
     */
    private static <T> void output(T item) {
        
        //T is for Template :3
        
        String text = "Class simple name: ";
        text += item.getClass().getSimpleName();
        text += ", hash code: " + item.hashCode();
        text += ", To String: " + item.toString();   
        text += ", package name: " + item.getClass().getPackageName();           
        System.out.println(text);
    }
    
} 
