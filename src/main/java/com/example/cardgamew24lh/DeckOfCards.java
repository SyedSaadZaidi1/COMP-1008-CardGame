package com.example.cardgamew24lh;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

    private ArrayList<com.example.cardgamew24lh.Card> deck;

    /**
     * This is a Constructor. It will allocate system memory for
     * ArrayList to hold the Card objects, It will create 52 Card objects
     * and put them in ArrayList.
     */
    public DeckOfCards() {
        deck = new ArrayList<>();

        List<String> suits = com.example.cardgamew24lh.Card.getValidSuits();
        List<String> faceNames = com.example.cardgamew24lh.Card.getValidFaceName();
//Looping against card objects -faceNames & suits to build a deck
        for(int i=0; i <suits.size(); i++){
            for(int x=0; x <faceNames.size(); x++){
                //Building the deck, adding Cards to deck one at a time
                deck.add(new com.example.cardgamew24lh.Card((suits.get(i)),faceNames.get(x)));

            }
        }

    }

    public com.example.cardgamew24lh.Card dealTopCard(){
        if (deck.size()>0)
            return deck.remove(0);
        return null;
    }
    public void shuffle(){
        Collections.shuffle(deck);
    }

}
