package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by hktang on 2/14/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");

        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));

        try{
            tweets.add(tweet);
            assertTrue(false);
        }catch (IllegalArgumentException e){
            assertTrue(true);
        }
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another test tweet");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Last tweet");

        tweets.add(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }

    public void testStrings(){
        assertEquals("'test' should be 'test'", "test", "test");
        assertTrue("'test' should start with 't'", "test".startsWith("t"));
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("tweet 1");
        try {
            //Taken from: http://stackoverflow.com/questions/24104313/how-to-delay-in-java
            // On February 14 19:01
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e) {
            assertTrue(false);
        }

        Tweet tweet2 = new NormalTweet("tweet2");
        try {
            //Taken from: http://stackoverflow.com/questions/24104313/how-to-delay-in-java
            // On February 14 19:01
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e) {
            assertTrue(false);
        }

        Tweet tweet3 = new NormalTweet("tweet3");
        try {
            //Taken from: http://stackoverflow.com/questions/24104313/how-to-delay-in-java
            // On February 14 19:01
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e) {
            assertTrue(false);
        }

        Tweet tweet4 = new NormalTweet("tweet4");

        tweets.add(tweet2);
        tweets.add(tweet4);
        tweets.add(tweet1);
        tweets.add(tweet3);

        List sortedList = tweets.getTweets();

        assertEquals(sortedList.get(0), tweet1);
        assertEquals(sortedList.get(1), tweet2);
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("has tweet");

        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("tweet 1");
        assertEquals(tweets.getCount(), 0);
        tweets.add(tweet1);
        assertEquals(tweets.getCount(), 1);
        Tweet tweet2 = new NormalTweet("tweet 2");
        tweets.add(tweet2);
        assertEquals(tweets.getCount(), 2);
        Tweet tweet3 = new NormalTweet("tweet 3");
        tweets.add(tweet3);
        assertEquals(tweets.getCount(), 3);
    }
}
