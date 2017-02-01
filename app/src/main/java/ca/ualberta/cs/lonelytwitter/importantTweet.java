package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hktang on 1/17/17.
 */
public class importantTweet extends Tweet {

    /**
     * Instantiates a new Important tweet when given both the date and a message
     *
     * @param date    the date
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public importantTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    /**
     * Instantiates a new Important tweet when only given the message
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public importantTweet(String message) throws TweetTooLongException {
        super(message);
    }

    /**
     * This is a boolean that says whether or not this tweet is True or not
     * @return This is an important tweet so this returns True
     */
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

    /**
     * Changes the tweet message to add 4 exclamation marks
     * @return The message with four exclamation behind
     */
    @Override
    public String getMessage() {
        return super.getMessage() + " !!!!";
    }
}
