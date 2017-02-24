/*
 * @author oranges
 * @version 1.0
This class:
•	Contains the main method used to start the game.
•	Talks to the AdventureModel and to the Adventurer classes, as needed.
*/


package adventure;

import java.util.Scanner;
import java.util.ArrayList;


public class TextAdventure {

//import scanner 
	private static Scanner scan; 
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			// introduce the game and it's rules/directions
			scan = new Scanner(System.in); //new scanner
			System.out.println("You are stranded in the attic of a haunted house and need to get out by sunrise. To get out you need gather 3 sets of keys.\nThe bronze key will let you out of the attic which is on the third floor to the staircase.\nThe silver key will let you out of the second floor which has 2 separate rooms and is located in one of those rooms.\nThe gold key will be located on the first floor which has 3 separate rooms and is located in one of those rooms.\nThe gold key will let you out of the house.\nGood luck or you maybe trapped forever….");
			String answer=" ";
			System.out.println("Would you like to play?"); //allows the player to decide if they want to play
			answer = scan.next();

			if (answer.equalsIgnoreCase("No")){
			System.out.println("Have fun being trapped and eaten by bats RIP");
			return;
			
			} else if(answer.equalsIgnoreCase("Yes")){ //conditional statement to pick up items an decide what to do with it
			System.out.println("You look around the attic and you notice how old and dusty it looks.\nYou notice something on the table and you notice a small key.\nWhat do you want to do?");
			System.out.println("A. Pick up the key.");
			System.out.println("B. Discared the key.");
			answer = scan.next();
			
			if (answer.equalsIgnoreCase("B")){
				System.out.println("Are you dumb..."); //game ends because you are trapped
				return;
				
			} else if(answer.equalsIgnoreCase("A")){
				System.out.println("You examine the key and notice that it is rusty... \nWhat do you want to do?");
				System.out.println("A. Use key on door.");
				System.out.println("B. Use key on drawer");
				System.out.println("C. Put the key in your backpack"); //adds the key to the arraylist called backpack
				answer = scan.next();

				if (answer.equalsIgnoreCase("A")){
					System.out.print("The key fits and the door opens leading to a hallway...");
					System.out.print("The key served its purpose...you discard it");
					Adventurer.backpack.remove("key"); // key is no longer useful so you remove from the arraylist
					return;
			}
				else if (answer.equalsIgnoreCase("B")){
					Adventurer.backpack.add("key");
					System.out.print("The key does not seem to fit..."); 
					return;
					
			}	else if (answer.equalsIgnoreCase("C")){
					Adventurer.backpack.add("key");
					System.out.print("your backpack includes:" + " " + Adventurer.backpack); //adds key to backpack for further use
					return;
					
				
				}
							
		}
	}
	}
}

 