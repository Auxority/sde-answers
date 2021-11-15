package com.hz;

import java.util.Arrays;

public class BooleanAdapter {
    private static String[] VALID_OPTIONS = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
    private ConsoleReader reader;

    public BooleanAdapter(ConsoleReader reader) {
        this.reader = reader;
    }

    // requests user input, and checks whether it is positive or not.
    public Boolean readResponse() {
        String rawAnswer = this.reader.readLine();
        return this.isPositive(rawAnswer);
    }

    private Boolean isPositive(String answer) {
        return Arrays.asList(BooleanAdapter.VALID_OPTIONS).contains(answer);
    }
}