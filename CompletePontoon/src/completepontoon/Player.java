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
public class Player extends GamePlayers {

    private ArrayList<String> playerCards = new ArrayList<String>();
    private int cardValue = 0;

    public void players(String newCard) {
        playerCards.add(newCard);
        System.out.println(playerCards);
    }

    public void playervalue(int cardValue) {
        cardValue = cardValue;
        System.out.println(cardValue);
    }


    public ArrayList<String> getPlayerCards() {
        return playerCards;
    }
}
