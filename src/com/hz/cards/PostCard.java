package com.hz.cards;

import com.hz.Printer;

public class PostCard extends Card {
    public PostCard(Printer printer) {
        super(printer);
    }

    @Override
    protected void printHeader() {
        this.printer.printLine("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }

    @Override
    protected void printMessage() {
        this.printer.printLine("Greetings from the netherlands!");
    }

    @Override
    protected void printImage() {
        this.printer.printLine("        Art by Hayley Jane Wakenshaw");
        this.printer.printLine("");
        this.printer.printLine("             /)  (\\");
        this.printer.printLine("        .-._((,~~.))_.-,");
        this.printer.printLine("         `=.   99   ,='");
        this.printer.printLine("           / ,o~~o. \\");
        this.printer.printLine("          { { .__. } }");
        this.printer.printLine("           ) `~~~\' (");
        this.printer.printLine("          /`-._  _\\.-\\");
        this.printer.printLine("         /         )  \\");
        this.printer.printLine("       ,-X        #   X-.");
        this.printer.printLine("hjw   /   \\          /   \\");
        this.printer.printLine("     (     )| |  | |(     )");
        this.printer.printLine("      \\   / | |  | | \\   /");
        this.printer.printLine("       \\_(.-( )--( )-.)_/");
        this.printer.printLine("       /_,\\ ) /  \\ ( /._\\");
        this.printer.printLine("           /_,\\  /._\\");
    }

    @Override
    protected void printFooter() {
        this.printer.printLine("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");        
    }
}
