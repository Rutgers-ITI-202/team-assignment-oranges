/*
 * @author oranges
 * @version 1.0
 * @since 04/28/17

This class:
•	is the Office Class
•	When the class is called it allows the user to walk into the Office and move freely around to look for items that may help the player get closer to winning
•	Class will get player to use the saved flashlight to save for later
•   Once method is called player is asked a few questions
•	Accepts commands from the player, and executes them.
	o	The method that executes commands should return a String to be displayed in the main text area.
*/
package adventure;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class office {
	public static void main( String[] args ){
	    Scanner keyboard = new Scanner(System.in);


	String Go;
	String Look;  

	System.out.println(" You are on the second floor. There are 3 room which do you chose? ");
	System.out.print("> ");
	Go = keyboard.next();

	if (Go.equalsIgnoreCase("office")) {
	    System.out.println("Looks like a nice small office. Does not look like theres much there and it is kind of dark but you need to find something to use. ");
	     System.out.println("There seems to be a small object in the corner. Do you want to check it out?");
	    System.out.print(">  ");
	    Look = keyboard.next();
	    /**
	     * Conditional ask the player if they want to go and check out the corner 
	     */
	    if (Look.equalsIgnoreCase("yes")) {
	        System.out.println("you check it out and see that it is a flashlight! You put it in your bag");
		Adventurer.backpack.add("flashlight");

		if (Look.equalsIgnoreCase("yes")) {
		System.out.println("everything comes into view. You see a small desk, a few books on a shelf—nothing to interesting");
		System.out.println("do you want to exit the room or look around?");
		///LEAVE ROOM 
		}


	
	    }
	    }
	    
	    }
}
