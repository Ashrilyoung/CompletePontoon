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

    public void gameMenu() { //a function to display options to the player

        String choice = "";
        int playerChoice = 0;
        Hand hand = new Hand();
        hand.hand();
        Cards card = new Cards();

        Player newPlayer = new Player();   //to be changed in the future to allow player choice!!
        Dealer theDealer = new Dealer();

//        for (int i = 0; i <= 1; i++) {          //to be changed in the future!!
        newPlayer.players(hand.twist());
        theDealer.dealer(hand.twist());
//        }

        Scanner kboard = new Scanner(System.in);                //keyboard scanner to listen for keypresses
        System.out.println("Do you wish to Play y/n?");     //display a message for user
        choice = kboard.next();                                 //stores the most recent keyboard press in the choice variable
        while (choice.equalsIgnoreCase("y")) //while choice variable is y
        {

            System.out.println("Do you wish to 1. twist, 2. stick or 3. exit the game losing all you bets?"); //display a message for user
            playerChoice = kboard.nextInt();                             //assign the next keyboard press to the choice variable
            switch (playerChoice) {
                case 1:
                    newPlayer.players(hand.twist());
                    newPlayer.playervalue(card.CardValue(newPlayer.getPlayerCards()));
//                    theDealer.dealervalue(card.CardValue(theDealer.getDealerCards()));
                    break;
                case 2:
                    //hand.stick
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid selection!");
                    break;
            }

        }

    }
}
