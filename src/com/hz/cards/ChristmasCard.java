package com.hz.cards;

import com.hz.Printer;

public class ChristmasCard extends Card {
    public ChristmasCard(Printer printer) {
        super(printer);
    }

    @Override
    protected void printHeader() {
        this.printer.printLine("...*...*...*...*...*...*...");
    }

    @Override
    protected void printMessage() {
        this.printer.printLine("It's the most wonderful time of the year.");
    }

    @Override
    protected void printImage() {    
        this.printer.printLine("     .     .  .      +     .      .          .");
        this.printer.printLine("     .       .      .     #       .           .");
        this.printer.printLine("        .      .         ###            . This calls for celebrating! Congratulations!     .      .");
        this.printer.printLine("      .      .   \"#:. .:##\"##:. .:#\"  .      .");
        this.printer.printLine("          .      . \"####\"###\"####\"  .");
        this.printer.printLine("       .     \"#:.    .:#\"###\"#:.    .:#\"  .        .       .");
        this.printer.printLine("  .             \"#########\"#########\"        .        .");
        this.printer.printLine("        .    \"#:.  \"####\"###\"####\"  .:#\"   .       .");
        this.printer.printLine("     .     .  \"#######\"\"##\"##\"\"#######\"                  .");
        this.printer.printLine("                .\"##\"#####\"#####\"##\"           .      .");
        this.printer.printLine("    .   \"#:. ...  .:##\"###\"###\"##:.  ... .:#\"     .");
        this.printer.printLine("      .     \"#######\"##\"#####\"##\"#######\"      .     .");
        this.printer.printLine("    .    .     \"#####\"\"#######\"\"#####\"    .      .");
        this.printer.printLine("            .     \"      000      \"    .     .");
        this.printer.printLine("       .         .   .   000     .        .       .");
        this.printer.printLine(".. .. ..................O000O........................ ......");
    }

    @Override
    protected void printFooter() {
        this.printer.printLine("We wish you a merry christmas, and a happy new year!");
    }
}
