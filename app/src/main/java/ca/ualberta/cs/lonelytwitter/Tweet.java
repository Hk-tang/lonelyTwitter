package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by hktang on 1/17/17.
 *
 *  Tweet class is a super class that impements Tweetable
 */
public abstract class Tweet implements Tweetable{
    private Date date; //This is date for Tweet class
    private String message;
    private String hiddenString;
    private ArrayList<Mood> moodArrayList = new ArrayList<Mood>();

    /**
     * Instantiates a new Tweet when given a date and a message
     *
     * @param date    the date
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public Tweet(Date date, String message) throws TweetTooLongException {
        this.date = date; //This is date for constructor
        this.setMessage(message);
    }

    /**
     * Instantiates a new Tweet when only given a message
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        //this.message = message;
        this.date = new Date(); //current time and date
    }

    /**
     * Is important boolean.
     *
     * @return the boolean
     */
    public abstract Boolean isImportant(); //Child classes must implement "isImportant"
    // Also allows you to keep using if you upcast

    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
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

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Add mood.
     *
     * @param mood the mood
     */
    public void addMood(Mood mood){
        moodArrayList.add(mood);
    }

    /**
     * Seperates the message and the date with a line
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

}
