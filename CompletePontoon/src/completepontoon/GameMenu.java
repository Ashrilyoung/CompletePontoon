/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package completepontoon;

import java.util.Scanner;

/**
 *
 * @author 16007873
 */
public class GameMenu {

    public void GameMenu() { //a function to display options to the player

        String choice = "";
        int playerChoice = 0;
        Hand hand = new Hand();
        hand.Hand();

        Scanner kboard = new Scanner(System.in);                //keyboard scanner to listen for keypresses
        System.out.println("Do you wish to Play y/n?");     //display a message for user
        choice = kboard.next();                                 //stores the most recent keyboard press in the choice variable
        while (choice.equalsIgnoreCase("y")) //while choice variable is y
        {
            System.out.println("Do you wish to 1. twist or 2. stick"); //display a message for user
            playerChoice = kboard.nextInt();                             //assign the next keyboard press to the choice variable
            switch (playerChoice) {
                case 1:
                    hand.twist();
                    break;
                case 2:
                    //hand.stick
                    break;
                default:
                    System.out.println("Invalid selection!");
                    break;
            }
        }
    }
}
