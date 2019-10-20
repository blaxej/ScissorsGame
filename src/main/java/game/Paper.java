package game;

public class Paper implements ChoiceStrategy{

    public boolean isWinWith(ChoiceStrategy oponent) {
        return oponent instanceof Rock;
    }
}
