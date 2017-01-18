package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hktang on 1/17/17.
 */

public abstract class Mood {
    private Date date;
    private String mood;

    //Can have two constructors because they have different signatures
    public Mood(Date date, String mood) {
        this.date = date;
        this.mood = mood;
    }
    public Mood(String mood) {
        this.date = new Date();
        this.mood = mood;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }
//public abstract String MoodFace();
}
