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
public class Dealer extends GamePlayers {

    private ArrayList<String> dealerCards = new ArrayList<String>();
    private int cardValue = 0;

    public void dealer(String newCard) {
        dealerCards.add(newCard);
        System.out.println(dealerCards);
    }

    public void dealervalue(int cardValue) {
        cardValue = cardValue;
        System.out.println(cardValue);
    }

    public ArrayList<String> getDealerCards() {
        return dealerCards;
    }

}
