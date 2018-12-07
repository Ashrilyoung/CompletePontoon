/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package completepontoon;

/**
 *
 * @author 16007873
 */
public class WinConditions {

    public String WinConditions(int playerCardValue, int dealerCardValue) {
        String result  = "";
        if (playerCardValue > dealerCardValue && playerCardValue <= 21) {
            System.out.println("Congratulations you have won the Game!");
            result  = "Congratulations you have won the Game!";
        } else if (dealerCardValue > playerCardValue && dealerCardValue <= 21) {
            System.out.println("Bust! Dealer has won the Game!");
            result  = "Bust! Dealer has won the Game!";
        } else if (dealerCardValue == playerCardValue && dealerCardValue <= 21) {
            System.out.println("Draw!");
            result  = "Draw!";
        }else{
            System.out.println("Bust!");
            result  = "Bust!";
        }
        return result;
    }

}
