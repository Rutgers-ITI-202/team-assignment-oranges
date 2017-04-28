/*
 * @author oranges
 * @version 1.0
 * @since 04/28/17

This class:
•	is the SupplyCloset Class
•	Once method is called player is asked a few questions
•	Accepts commands from the player, and executes them.
	o	The method that executes commands should return a String to be displayed in the main text area.
*/

package adventure;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class supplycloset{
	public static void main( String[] args ){
	    Scanner keyboard = new Scanner(System.in);
	    


	System.out.println(" You are on the second floor. There are 3 room which do you chose? ");
	System.out.print("> ");
	String Go = keyboard.next();
	

	if (Go.equalsIgnoreCase("supply closet")) {
	    System.out.println("There are some broken tools lying around, a box of sanitary gloves, and some broken bulbs. Be careful or you’ll get hurt. ");
		System.out.println("Would you like to take anything from the room?");
	    	System.out.print(">  ");
		System.out.print("A. Broken tools B. Sanitary Gloves C. Broken bulbs");
	    	 String answer = keyboard.next();

	    if (answer.equalsIgnoreCase("A")) {
	        System.out.println("this is dangerous..");
		answer= keyboard.next();

	    } else if (answer.equalsIgnoreCase("C")){
		System.out.println("you will hurt yourself…");
	     	 answer= keyboard.next();
	    }
	    else  if (answer.equalsIgnoreCase("B")){
		System.out.println("these might seem useful…");
		Adventurer.backpack.add("sanitary gloves");
		System.out.println("would you like to leave?");
	 		answer = keyboard.next();
	    }

		 if (answer.equalsIgnoreCase("Yes")) {
	        System.out.println("you exit the room ");

	} else
	{
		System.out.println("what would you like to do with the remaining items?");
	}
		answer= keyboard.next();
	}
	}
		

}
		
		




