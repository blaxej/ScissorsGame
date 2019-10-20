package game;

public class Sissors implements ChoiceStrategy {
    public boolean isWinWith(ChoiceStrategy oponent) {
        return oponent instanceof Paper;
    }
}
