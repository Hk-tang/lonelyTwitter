package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

/**
 * Created by hktang on 2/14/17.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){
        if (tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
    }

    public boolean hasTweet (Tweet tweet){

        if (tweets.contains(tweet)){
            return true;
        }
        return false;
        //return tweets.contains(tweet);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public List getTweets(){
        /*ArrayList<Tweet> sortedTweetList = new ArrayList<Tweet>();
        while(sortedTweetList.size() != tweets.size()){

        }*/

        List list = tweets;
        Log.d("tag", list.toString());
        Collections.sort(list);
        Log.d("tag", list.toString());

        return list;
    }

    public int getCount(){
        return tweets.size();
    }
}
