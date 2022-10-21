/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */



class Scarecrow {

    /* Parts of the Scarecrow*/

    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    // private Hat hat;
    private Boot leftFoot;
    private Boot rightFoot;
    private Banner sign;
    private String message;

    /* Constructor */

    /**
     * Costructor for the Banner object
     * @param classes to make the parts of the Scarecrow
     * @return nothing
     */
    public Scarecrow(Pumpkin h, Shirt b, Pants p, Boot b1, Boot b2, Banner s) {
        head = h;
        body = b;
        legs = p;
        leftFoot = b1;
        rightFoot = b2;
        sign = s;
    }


    /**
     * Displays the Scarecrow: 
     * Calls the displays method of each part of the Scarecrow in the right order to draw the complete picture
     * @param none
     * @return void: does not return a value
     */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
        
    }

    /* Main method (for testing) */
    public static void main(String[] args) {

        String message = "Hello";

        //If a message was passed in on the command line, extract and store it 
        if (args.length > 0) {
            message = args[0];
        }

        // Modify the constructor
        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(), new Shirt(), new Pants(), new Boot("left"), new Boot("right"), new Banner(message)); 
        
        myScarecrow.display();
    }

}
