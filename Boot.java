/*
 * Boot class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */



public class Boot {
  
    private String direction;

    /**
     * Costructor for the boots object
     * @param direction of each boot: left or right
     * @return nothing
     */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }


     /**
     * Prints ASCII art depicting a left or right to the console
     * @param none
     * @return void: does not return a value
     */
    public void display() {
        if (this.direction.equals("left")) {
          System.out.print("        |______|");
        } else if (this.direction.equals("right")) {
          System.out.print("|______|");
        } else {
          System.out.println("Which boot?");
        }
    }
  

    /* main method (for testing) */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        myLeftBoot.display();
        myRightBoot.display();
    }
}
