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
public class Dealer extends GamePlayers {  //class to handle dealer actions

    private ArrayList<String> dealerCards = new ArrayList<String>();  //arraylist to hold dealer cards
    private int cardValue = 0;   //value of dealers cards

    public void dealer(String newCard) {  //add new cards to the arraylist
        dealerCards.add(newCard);
    }

    public int dealervalue(int cardValue) {  //set the card value
        cardValue = cardValue;
        return cardValue;
    }

    public ArrayList<String> getDealerCards() {  //get the players cards
        return dealerCards;
    }

}
