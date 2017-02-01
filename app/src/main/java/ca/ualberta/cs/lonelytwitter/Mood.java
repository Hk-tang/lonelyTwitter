package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hktang on 1/17/17.
 */
public abstract class Mood {
    private Date date;
    private String mood;

    /**
     * Instantiates a new Mood when given a date and a mood
     *
     * @param date the date
     * @param mood the mood
     */
//Can have two constructors because they have different signatures
    public Mood(Date date, String mood) {
        this.date = date;
        this.mood = mood;
    }

    /**
     * Instantiates a new Mood when only the mood is given
     * The date used is the time of the tweet
     *
     * @param mood the mood
     */
    public Mood(String mood) {
        this.date = new Date();
        this.mood = mood;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
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
     * Gets mood.
     *
     * @return the mood
     */
    public String getMood() {
        return mood;
    }

    /**
     * Sets mood.
     *
     * @param mood the mood
     */
    public void setMood(String mood) {
        this.mood = mood;
    }
//public abstract String MoodFace();
}
