/*
 * @author oranges
 * @version 1.0
 * @since 04/28/17

This class:
•   is the Bathroom Class
•	When the class is called it allows the user to walk into the Bathroom and move freely around to look for items that may help the player get closer to winning
•	Class will help player find gloves and find a key to help win the game
•   Once method is called player is asked a few questions
•	Accepts commands from the player, and executes them.
	o	The method that executes commands should return a String to be displayed in the main text area.
*/
package adventure;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class bathroom {
	public static void main( String[] args ){
	    Scanner keyboard = new Scanner(System.in);


	System.out.println(" You are on the first floor. There are 3 room which do you chose? ");
	System.out.print("> ");
	String Go = keyboard.next();


	if (Go.equalsIgnoreCase("bathroom")) {
	    System.out.println("Pretty dirty bathroom…you look around and see that in the toilet something is shining ");
		System.out.println("…it’s the key but the water is disgusting. Do you have gloves?");
	    	System.out.print(">  ");
		 Go = keyboard.next();
        String answer = keyboard.next();
		if(Go.equalsIgnoreCase("yes")){
		System.out.print("A. Use the gloves B. Don’t use the gloves");
					    
	     answer = keyboard.next();

	   } else if (answer.equalsIgnoreCase("no")) {
	        System.out.println("go find the gloves");
	        System.out.println("You have left the room");
		//LEAVE ROOM 

		if(answer.equalsIgnoreCase("A")){
		System.out.println("YOU FIND A KEY. You now exit the room since you find what you are looking for.");
		//EXIT ROOM
		
	    } else if (answer.equalsIgnoreCase("B"));
		System.out.println("you’re hand will get infected and you will not do it…");
	     	 answer= keyboard.next();
		//try and catch here as well

	    }
	}


		
	}


}
