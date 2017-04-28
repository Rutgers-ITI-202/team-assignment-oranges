/*
 * @author oranges
 * @version 1.0
This class:
•	is the BedRoom Class
•	When the class is called it allows the user to walk into the BedRoom and move freely around to look for items that may help the player get closer to winning
•   Once method is called player is asked a few questions
•	Accepts commands from the player, and executes them.
	o	The method that executes commands should return a String to be displayed in the main text area.
*/
package adventure;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class bedRoom {
	public static void main( String[] args ){
	    Scanner keyboard = new Scanner(System.in);


	String Go; 
	String Look;
	String Examine;
	String Next;

	System.out.println(" You are on the second floor. There are 3 room which do you chose? ");
	System.out.print("> ");
	Go = keyboard.next();

	if (Go.equalsIgnoreCase("bedroom")) {
	    System.out.println("Looks like a regular bedroom. Old bed, small lamp on a table, and a closet. Do you want to look examine them?");
	    System.out.print(">  ");
	    Look = keyboard.next();
	    
	} else if (Look.equalsIgnoreCase("no")) {
	    System.out.println("You exit the room"); }//
	

	    if (Look.equalsIgnoreCase("yes")) {
	        System.out.println("What would you like to look at first?");
	        System.out.println("Bed, lamp, or closet?");

	    } 
	    if (Examine.equalsIgnoreCase("bed")) {
	        System.out.println("You examine the bed and there is nothing really seems like an empty bed");
	        System.out.print(">  ");
	        Next = keyboard.next();
	    
	   } else if (Examine.equalsIgnoreCase("table")) {
	            System.out.println(" you touch the table and it breaks. You step back and your heart starts racing…"); 
	            Next = keyboard.next();
	       
	        }else if (Examine.equalsIgnoreCase("closet")) {
	            System.out.println(" It’s an empty closet..bummer"); 
		   Next = keyboard.next();
			break;
	        }    
	        
		System.out.println(" Doesn’t look like you found anything useful…you decide to leave");
		//back to the corridor
	      
	    }
	}
}
