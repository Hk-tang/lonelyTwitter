package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hktang on 1/17/17.
 */
public class HappyMood extends Mood {

    /**
     * Instantiates a new Happy mood for when no argument is given.
     */
    public HappyMood() {
        super("Happy");
    }

    /**
     * Instantiates a new Happy mood when a date argument is given
     *
     * @param date the date that is given at the time of the Tweet
     */
    public HappyMood(Date date) {
        super(date, "Happy");
    }

    /**
     * Changes the tweet message to add a :) behind the message
     * @return The message with :) added
     */
    @Override
    public String getMood() {
        return ":)" + super.getMood() + ":)";
    }

/*
    public String MoodFace(){
        return new String(":)");
    }
*/

}
