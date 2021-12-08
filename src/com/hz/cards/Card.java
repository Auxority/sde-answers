package com.hz.cards;

import com.hz.Printer;

public abstract class Card {
    protected Printer printer;

    public Card(Printer printer) {
        this.printer = printer;
    }

    public void print() {
        this.printHeader();
        this.printMessage();
        this.printImage();
        this.printFooter();
    }

    protected abstract void printMessage();
    protected abstract void printImage();
    protected abstract void printFooter();
    protected abstract void printHeader();
}