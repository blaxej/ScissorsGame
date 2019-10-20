package game;

public class Scissors implements ChoiceStrategy {
    public boolean isWinWith(ChoiceStrategy oponent) {
        return oponent instanceof Paper;
    }
}
