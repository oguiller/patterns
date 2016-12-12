package com.oguiller.patterns.observer;

public interface Game {

    public Integer getHomeTeamScore();

    public void setHomeTeamScore(Integer score);

    public Integer getAwayTeamScore();

    public void setAwayTeamScore(Integer score);
}
