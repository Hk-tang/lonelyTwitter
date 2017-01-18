package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by hktang on 1/17/17.
 */

public abstract class Tweet implements Tweetable{
    private Date date; //This is date for Tweet class
    private String message;
    private String hiddenString;
    private ArrayList<Mood> moodArrayList = new ArrayList<Mood>();

    public Tweet(Date date, String message) throws TweetTooLongException {
        this.date = date; //This is date for constructor
        this.setMessage(message);
    }

    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        //this.message = message;
        this.date = new Date(); //current time and date
    }

    public abstract Boolean isImportant(); //Child classes must implement "isImportant"
    // Also allows you to keep using if you upcast

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() > 144){
            throw new TweetTooLongException();
        }
        else{
            this.message = message;
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void addMood(Mood mood){
        moodArrayList.add(mood);
    }

}
