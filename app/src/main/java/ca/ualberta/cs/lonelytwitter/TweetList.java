package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by alsobaie on 10/12/17.
 */

public class TweetList{

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){

    }

    public void addTweet(Tweet tweet) throws IllegalArgumentException{
        if(tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }

        tweets.add(tweet);
    }

    public ArrayList<Tweet> getTweets(){
        Com c = new Com();
        Collections.sort(tweets, c);
        return tweets;
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public int getCount(){
        return tweets.size();
    }

    public void add(Tweet tweet){
        tweets.add(tweet);
    }


    public void delete(Tweet tweet){
        tweets.remove(tweet);

    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }
}
