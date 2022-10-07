package io.codelex.enums.practice;

public enum RockPaperScissors {
    ROCK("r"),
    PAPER("p"),
    SCISSORS("s");
    private final String input;


    RockPaperScissors(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }
}
