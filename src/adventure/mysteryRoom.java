/*
 * @author oranges
 * @version 1.0
This class:
•	is the Mystery Room Class
•	When the class is called it allows the user to walk into the MysteryRoom and move freely around to look for items that may help the player get closer to winning
•	Class will help player find pliers and find a key to help win the game
•   Once method is called player is asked a few questions
•	Accepts commands from the player, and executes them.
	o	The method that executes commands should return a String to be displayed in the main text area.
*/
package adventure;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class mysteryRoom {
	public static void main( String[] args ){
	    Scanner keyboard = new Scanner(System.in);


	System.out.println(" You are on the second floor. There are 3 room which do you chose? ");
	System.out.print("> ");
	String Go = keyboard.next();

	if (Go.equalsIgnoreCase("mystery room")) {
	    System.out.println("Nothing out of the ordinary but the floor is making weird sounds and there are a pair of pliers in the corner ");
		System.out.println("Would you like to take anything from the room?");
	    	System.out.print(">  ");
		System.out.print("A. Grab the pliers B. Try opening up the floor C. Leave the room");
	    	String answer = keyboard.next();

	    if (answer.equalsIgnoreCase("A")) {
	        System.out.println("you pick up the pliers");
		System.out.println("the pliers might help open up the floor…would you like to try it?");
		 answer= keyboard.next();
		
		if(answer.equalsIgnoreCase("yes")){
			
		}
		System.out.println("YOU FIND A KEY. You now exit the room since you find what you are looking for.");
		//EXIT ROOM
		
	    } else if (answer.equalsIgnoreCase("B")){
		System.out.println("nothing happens…");
	     	answer= keyboard.next();

	    }else  if (answer.equalsIgnoreCase("C")){
		//LEAVE ROOM

	}


		
	}
}
	}
