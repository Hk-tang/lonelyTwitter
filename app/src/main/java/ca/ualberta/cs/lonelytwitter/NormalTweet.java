package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hktang on 1/17/17.
 */
public class NormalTweet extends Tweet {
    /**
     * Instantiates a new Normal tweet when given a date and a message
     *
     * @param date    the date of tweet
     * @param message the message for tweet
     * @throws TweetTooLongException the tweet too long exception
     */
    public NormalTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    /**
     * Instantiates a new Normal tweet when only given the message
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public NormalTweet(String message) throws TweetTooLongException {
        super(message);
    }

    /**
     * This is a normal tweet, so it should return False because it is not important
     * @return False
     */
    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
