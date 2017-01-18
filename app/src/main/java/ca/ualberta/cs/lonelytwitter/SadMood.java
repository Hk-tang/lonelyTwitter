package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hktang on 1/17/17.
 */

public class SadMood extends Mood {
    public SadMood() {
        super("Sad");
    }

    public SadMood(Date date) {
        super(date, "Sad");
    }

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
