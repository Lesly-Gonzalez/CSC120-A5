/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

// import java.util.*;
 

public class Banner {
    
    /* Message to print on Banner */
    private String message;

  
    /**
     * Costructor for the Banner object
     * @param message (either hard-coded or passed by the user in the command line)
     * @return nothing
     */
    public Banner(String m) {
        this.message = m;
    }

    /**
     * Displays the banner ("bubble" shape) with the message inside
     * @param none
     * @return void: does not return a value
     */
    public void display() {
    
        System.out.println( "   ***" + "*".repeat( this.message.length()) + "***");
        System.out.println( "  *** " + "~".repeat( this.message.length()) + " ***");
        System.out.println( "*** " + "~ " + this.message + " ~" + " ***"); 
        System.out.println( "  *** " + "~".repeat( this.message.length()) + " ***");
        System.out.println( "   ***" + "*".repeat( this.message.length()) + "***");
        System.out.println( "          ***********");
        System.out.println( "                  ***");

    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello world");
        myBanner.display();
    }
}

