package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hktang on 1/17/17.
 */
public class SadMood extends Mood {
    /**
     * Instantiates a new Sad mood when given no parameters
     */
    public SadMood() {
        super("Sad");
    }

    /**
     * Instantiates a new Sad mood when given the date
     *
     * @param date the date
     */
    public SadMood(Date date) {
        super(date, "Sad");
    }

    /**
     * Changes the tweet message to a message in front
     * @return The message changed with addition of text
     */
    @Override
    public String getMood() {
        return "This is the format specific of" + super.getMood();
    }

/*
    public String MoodFace(){
        return new String(":(");
    }
    */
}
