package com.hz;

public class Main {
    public static void main(String[] args) {
	    // write your code here

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        BooleanAdapter adapter = new BooleanAdapter(reader);

        // ask questions
        String q1 = "Do you like eating vegetables?";

        String good = "You healthy person!";
        String bad = "Maybe you should try to eat some carrots";

        // ask question to user
        writer.write(q1);

        // read response and decide whether the user input is positive or negative
        Boolean ans1 = adapter.readResponse();

        if (ans1) {
            writer.write(good);
        } else {
            writer.write(bad);
        }

        // allow user to read our response
        reader.readLine();
    }
}
