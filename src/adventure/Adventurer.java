/*
 * @author oranges
 * @version 1.0
 * @since 04/28/17

An adventurer has:
•	A location (some room).
•	An inventory (the things being carried).  When the player executes the “take thing” command, the item should be added to the inventory.
An adventurer can:
•	Move from room to room.
•	Carry a number of objects.
•	Pick up, drop, look at, and use various objects.
 */

package adventure;

import java.util.ArrayList;

public class Adventurer {
	
	//import arraylist called backpack that will be called in TextAdventure
	public static ArrayList<String> backpack = new ArrayList<String>();

	private boolean bronzekey = false; // all the items that you will need for the game 
	private boolean silverkey = false;
	private boolean goldkey = false;
	private boolean flashlight = false;
	private boolean knife = false;
	
	private boolean watch = false;
	
	//create a player identity
	String name;
	public void setName(String n){
	name = n;
	}
	public String getName(){
	return name;
	}
	/**
	 * These statements below activate Bronze key, SilverKey, GoldKey, Flashlight, Knife, Watch
	 * @return
	 */
	
	public boolean bronzekey(){
		return true ;
	}
	
	public boolean silverkey(){
		return true;
	}
	public boolean goldkey(){
		return true;
	}
	public boolean flashlight(){
		return true;
	}
	public boolean knife(){
		return true;
	}
	public boolean watch(){
		return true;
	}
	
}


	

	
	
    
