/**
 * @author oranges
 * @version 1.0
 * @since 04/28/17
 * 
 * Final room in the game, this class allows the player to win the game by exiting the building 
 * 
 */
package adventure;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class MainLobby {
public static void main( String[] args ){

    Scanner keyboard = new Scanner(System.in);
    /**
     * Creates scanner for user input
     */
    

System.out.println(" You made it to the final room and the main lobby");
System.out.println(" What would you like to do?");
System.out.print("> ");
System.out.print("A. Use the final key");
System.out.print("B. Die");
String answer = keyboard.nextLine();

/**
 * Ask player a series of questions to win the game 
 */

if (answer.equalsIgnoreCase("No")){
System.out.println("LOL what okay bye");
return;
}
if(answer.equalsIgnoreCase("Yes")){
System.out.println("Congrats you completed the game");
return;
}
 
}
}
