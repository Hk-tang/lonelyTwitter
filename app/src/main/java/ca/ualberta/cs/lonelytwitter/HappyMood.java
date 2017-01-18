package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hktang on 1/17/17.
 */

public class HappyMood extends Mood {

    public HappyMood() {
        super("Happy");
    }

    public HappyMood(Date date) {
        super(date, "Happy");
    }

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
