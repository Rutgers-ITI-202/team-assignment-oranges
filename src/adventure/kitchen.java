/*
 * @author oranges
 * @version 1.0
 * @since 04/28/17

This class:
•	is the Kitchen Room Class
•	When the class is called it allows the user to walk into the Kitchen and move freely around to look for items that may help the player get closer to winning
•	Once method is called player is asked a few questions
•	Accepts commands from the player, and executes them.
	o	The method that executes commands should return a String to be displayed in the main text area.
*/

package adventure;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class kitchen { 
public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in);


String Go, Look, Pantry, Open, Cut, Refrigerator;


System.out.println(" You are on the second floor. There are 3 room which do you chose? ");
System.out.print("> ");
Go = keyboard.next();

if (Go.equalsIgnoreCase("kitchen")) {
    System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the 'refrigerator' or look in the 'pantry'. ");
    System.out.print(">  ");
    Look = keyboard.next();
    if (Look.equalsIgnoreCase("pantry")) {
    System.out.println("There's only a small knife and a few pieces of paper. Would you like to take the knife?");
    System.out.print(">  ");
    Pantry = keyboard.next();

    if (Pantry.equalsIgnoreCase("yes")) {
        System.out.println("  ");
        System.out.println("you put the knife in your bag");
    } else if (Pantry.equalsIgnoreCase("no")) {
        System.out.println("  ");
        System.out.println("You leave the knife");

    } 
    else{
    System.out.println("Would you like to open the fridge?");
    Open = keyboard.nextLine();
    if (Open.equalsIgnoreCase("refrigerator")) {
        System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. But on the top you see a watermelon. Do you want it: 'Yes' or 'No'?");
        System.out.print(">  ");
        Refrigerator = keyboard.next();
        {

        if (Refrigerator.equalsIgnoreCase("Yes")) {
            System.out.println(" You take the watermelon "); 
            
       
        } else if (Refrigerator.equalsIgnoreCase("No")) {
            System.out.println("  ");
            System.out.println("You die of starvation!");
        }    
        
        System.out.println("You need to cut it so that you can eat it. Do you want to use the knife?");
        Cut=keyboard.next();
        
        System.out.print(">  ");
        
        if (Cut.equalsIgnoreCase("yes"));
        System.out.println("You cut the watermelon");
        System.out.println("....there's a key inside!?");
    }
    }
    }
}
}
}
}



