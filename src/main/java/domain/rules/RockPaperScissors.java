package domain.rules;

import domain.Move;
import domain.Result;
import domain.Rules;

import static domain.Move.*;

public class RockPaperScissors implements Rules {
    @Override
    public Result decide(Move mine, Move theirs) {
        if(mine.equals(theirs)){
            return Result.DRAW;
        }
        switch (mine) {
            case ROCK:
                return check(theirs.equals(SCISSORS));
            case PAPER:
                return check(theirs.equals(ROCK));
            case SCISSORS:
                return check(theirs.equals(PAPER));
        }
        return null;
    }
    private Result check(boolean win){
        if(win){
            return Result.WIN;
        } else{
            return Result.LOSE;
        }
    }
}
