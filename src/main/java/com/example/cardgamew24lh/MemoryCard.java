package com.example.cardgamew24lh;

public class MemoryCard extends org.example.comp1009w2v2.Card {
    private boolean matched;

    public MemoryCard(String suit, String faceName, boolean matched) {
        super(suit, faceName);
        this.matched = false;
    }

    public boolean isMatched(){
        return matched;
    }

    public void setMatched(boolean matched){
        this.matched = matched;
    }

    public boolean isSameCard(MemoryCard otherCard){
        return(this.getSuit().equals(otherCard.getSuit()) && (this.getFaceName().equals(otherCard.getFaceName())));
    }
}
