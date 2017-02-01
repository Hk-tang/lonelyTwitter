package ca.ualberta.cs.lonelytwitter;

/**
 * Created by hktang on 1/17/17.
 */
public class TweetTooLongException extends Exception {
    /**
     * Instantiates a new Tweet too long exception with no parameters
     */
    public TweetTooLongException(){

    }

    /**
     * Instantiates a new Tweet too long exception.
     * Is given a detailed message to return
     *
     * @param detailMessage the detail message
     */
    public TweetTooLongException(String detailMessage) {
        super(detailMessage);
    }
}
