package com.hz.cards;

import com.hz.Printer;

public class GraduationCard extends Card {
    public GraduationCard(Printer printer) {
        super(printer);
    }

    @Override
    protected void printHeader() {
        this.printer.printLine("--@--#--&----------------------&--#--@--");
    }

    @Override
    protected void printMessage() {
        this.printer.printLine("This calls for celebrating! Congratulations!");
    }

    @Override
    protected void printImage() {    
        this.printer.printLine("     ,_");
        this.printer.printLine("| `\"\"---..._____");
        this.printer.printLine("'-...______    _````\"\"\"\"\"\"\"'`|");
        this.printer.printLine("       \\   ```` ``\"---...__  |");
        this.printer.printLine("       |`              |   ``!");
        this.printer.printLine("       |               |     A");
        this.printer.printLine("       |               /\\   /#\\");
        this.printer.printLine("       /`--..______..-'  |  ###");
        this.printer.printLine("      |   /  `\\    /`--. |  ###");
        this.printer.printLine("     _|  |  .-;`-./;-.  ||  ###");
        this.printer.printLine("    / \\  \\ /\\_|    |_/\\ //\\ ##'");
        this.printer.printLine("    |  `-' \\__/ _  \\__/ |  |`#");
        this.printer.printLine("   \\_,                 /_/");
        this.printer.printLine("       `\\              /");
        this.printer.printLine("         '.  '.__.'  .'");
        this.printer.printLine(" jgs      `-,____,-'");
        this.printer.printLine("           /\"\"\"I\"\"\\");
        this.printer.printLine("           /`---'--'\\");
    }

    @Override
    protected void printFooter() {
        this.printer.printLine("--@--#--&----------------------&--#--@--");
    }
}
