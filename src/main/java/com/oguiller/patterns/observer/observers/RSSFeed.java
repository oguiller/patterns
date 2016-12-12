package com.oguiller.patterns.observer.observers;

import com.oguiller.patterns.observer.Game;

import java.util.Observable;
import java.util.Observer;


public class RSSFeed implements Observer {

    Observable observable;
    public String result;

    public RSSFeed(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        Game game = (Game) o;
        this.result = "<xml><result>" + game.getHomeTeamScore() + "-" + game.getAwayTeamScore() + "<result></xml>";
    }

    public String getResult() {
        return result;
    }
}
