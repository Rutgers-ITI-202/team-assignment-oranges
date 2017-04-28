/*
 * @author oranges
 * @version 1.0
 * @since 04/28/17
This class:
•	Creates the Rooms, the Things, and the Adventurer.
•	Connects the Rooms with "paths" to other Rooms.
•	Places Things in the Rooms.
•	Places the Adventurer in some Room.
•	Accepts commands from the player, and executes them.
	o	As commands are entered, they should be copied to the main text area.
	o	The method that executes commands should return a String to be displayed in the main text area.
*/


package adventure;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class AdventureModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating methods for the different rooms for part 2
		
		public static void hallway(){
			System.out.print("You are now in the hallway");
			
		}
		/**
		 * This method alls the user to walk into the hall to enter more rooms 
		 */
		
		public static void kitchen(){
			System.out.print("You are now in the Kitchen");

			
		}
		/**
		 * Once called you enter the Kitchen and start looking for keys 
		 */
		public static void office(){
			System.out.print("You are now in the Office Room");

			
		}
		/**
		 * Once called you walk into the Office and look for a flashlight 
		 */
		public static void bathroom(){
			System.out.print("You are now in the Bathroom");

			
		}
		/**
		 * Once you enter the bathroom you can use gloves to retrieve key
		 */
		
		public static void MainLobby(){
			System.out.print("You are now in the Main Lobby");

			
		}
		/**
		 * Once called you can final finish the game by using the final Key and Exiting the building
		 */
		
		public static void supplycloset(){
			System.out.print("You are now in the Supply Closet");

			
		}
		/**
		 * When supply closet is called you will find gloves that can be added to your backpack 
		 */
		public static void bedRoom(){
			System.out.print("You are now in the BedRoom");
           
			
			
		}
		
		/**
		 * The method starts the Bedroom class
		 */
		public static void mysteryRoom(){
			System.out.print("You are now in the Mystery Room");

			
		}
		/**
		 * This room you will find pliers and keys
		 */
		
		
	}
	
}
			
