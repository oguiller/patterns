package com.oguiller.patterns.observer;

import com.oguiller.patterns.observer.observers.RSSFeed;
import com.oguiller.patterns.observer.observers.TwitterFeed;

public class Client {

    public static void main(String args[]) {

        SoccerGame game = new SoccerGame();
        RSSFeed rssFeed = new RSSFeed(game);
        TwitterFeed twitterFeed = new TwitterFeed(game);

        game.setHomeTeamScore(1);
        game.setAwayTeamScore(0);

        System.out.println("RSSFeed: " + rssFeed.getResult());
        System.out.println("TwitterFeed: " + twitterFeed.getResult());

        game.setHomeTeamScore(2);
        game.setAwayTeamScore(0);

        System.out.println("RSSFeed: " + rssFeed.getResult());
        System.out.println("TwitterFeed: " + twitterFeed.getResult());
    }
}
