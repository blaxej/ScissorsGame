package game;

public enum Result {

    ROCK("r")
    PAPER('P');
    SCISSORS("s");

    private String actionSymbol;

    Result(String actionSymbol) {
        this.actionSymbol = actionSymbol;
    }

    public String getActionSymbol() {
        return actionSymbol;
    }
    public ChoiceStrategy choiceStrategy () {
        return new;
    }

}
