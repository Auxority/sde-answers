package com.hz;

import com.hz.cards.Card;
import com.hz.cards.ChristmasCard;
import com.hz.cards.GraduationCard;
import com.hz.cards.PostCard;

public class Main {
    public static void main(String[] args) {
        // Lets print some cards
        Printer printer = new Console();

        Card postCard = new PostCard(printer);
        Card graduationCard = new GraduationCard(printer);
        Card christmasCard = new ChristmasCard(printer);

        postCard.print();
        graduationCard.print();
        christmasCard.print();
    }
}
