/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package completepontoon;

import java.util.ArrayList;

/**
 *
 * @author 16007873
 */
public class Cards {

    public void Cards() {

    }

    public int CardValue(ArrayList<String> playerCards) {  //function to determine the values of cards in a players o dealers hand

        int cardValue = 0;  //int to hold the value of the cards

        for (int i = 0; i < playerCards.size(); i++) {
            String card[] = playerCards.get(i).split(" ");
            if (card[0].equals("Jack") || card[0].equals("King") || card[0].equals("Queen")) {
                cardValue = cardValue + 10;
            } else if (card[0].equals("Ace")) {
                if (cardValue <= 10) {
                    cardValue = cardValue + 10;
                } else {
                    cardValue++;
                }
            } else {
                cardValue = cardValue + Integer.parseInt(card[0]);
            }

        }

        return cardValue;
    }

}
