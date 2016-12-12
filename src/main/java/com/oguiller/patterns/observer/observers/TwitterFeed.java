package com.oguiller.patterns.observer.observers;

import com.oguiller.patterns.observer.Game;

import java.util.Observable;
import java.util.Observer;

public class TwitterFeed implements Observer {

    Observable observable;
    public String result;

    public TwitterFeed(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        Game game = (Game) o;
        this.result = "{result:" + game.getHomeTeamScore() + "-" + game.getAwayTeamScore() + "}";
    }

    public String getResult() {
        return result;
    }
}

