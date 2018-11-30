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
 *
 */
public class Player extends GamePlayers {  //class to handle player actions, currently only for one player

    private ArrayList<String> playerCards = new ArrayList<String>();  //arraylist to hold player cards

    public void players(String newCard) {  //add new cards to the arraylist
        playerCards.add(newCard);
    }

    public int playervalue(int cardValue) { //set the card value
        cardValue = cardValue;
        return cardValue;
    }


    public ArrayList<String> getPlayerCards() {  //get the players cards
        return playerCards;
    }
}
