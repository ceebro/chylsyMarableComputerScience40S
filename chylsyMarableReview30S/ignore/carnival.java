
public class Carnival
{
    
    public static final String TITLE = "The Carnival";
    
    public static void main(String args[]) {

        welcome();
        
    }
    
    public static void welcome(){
        
        String welcomeMessage = "Welcome to " + TITLE + "!";
        output(welcomeMessage);
    }
    
    public static void output(String message){
        
        JOptionPane.showMessageDialog(
            null,
            message,
            TITLE,
            JOptionPane.PLAIN_MESSAGE
        );
    }
}
