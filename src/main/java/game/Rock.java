package game;

public class Rock implements ChoiceStrategy {


    public boolean isWinWith(ChoiceStrategy oponent) {
        return oponent instanceof Scissors;
    }
}
