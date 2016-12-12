package com.oguiller.patterns.observer;

import java.util.Observable;

public class SoccerGame extends Observable implements Game {

    Integer homeTeamScore;
    Integer awayTeamScore;

    public SoccerGame() {
    }

    public Integer getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(Integer score) {
        this.homeTeamScore = score;
        this.setChanged();  // Important if we do not setChanged the observers will not realized something has changed (check notifyObservers code)
        notifyObservers();
    }

    public Integer getAwayTeamScore() {
        return awayTeamScore;
    }


    public void setAwayTeamScore(Integer awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
        this.setChanged();
        notifyObservers();
    }
}
