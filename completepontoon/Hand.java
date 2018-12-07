/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package completepontoon;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author 16007873
 */
public class Hand {

    int noOfCards = 52;
    private int cardNo = 0;
    private String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};  //array of suits
    private String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};  //array of cards

    ArrayList<String> hand = new ArrayList<String>();  //arraylist to hold the deck of cards

    public void hand() {  //function to generate a shuffled card deck

        int suitsNo = 0;
        int valuesNo = 0;

        for (int i = 0; i < noOfCards; ++i) {

            if (suitsNo == 4) {
                suitsNo = 0;
            } else if (valuesNo == 13) {
                valuesNo = 0;
            } else {
                String nextCard = values[valuesNo] + " of " + suits[suitsNo];
                hand.add(nextCard);
                suitsNo++;
                valuesNo++;
            }
        }

        Collections.shuffle(hand);  //shuffles the pack of cards

    }

    public String twist() { //choose a new card from the deck to be turned over
        String newCard = hand.get(cardNo);
        cardNo++;
        return newCard;
    }

    public int getcardNo() {
        return cardNo;
    }
}
