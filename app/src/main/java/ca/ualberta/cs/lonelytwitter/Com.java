package ca.ualberta.cs.lonelytwitter;

import java.util.Collections;
import java.util.Comparator;

/**
 * Created by alsobaie on 10/12/17.
 */

public class Com implements Comparator<Tweet> {

    public Com(){

    }

    public int compare(Tweet tweet2, Tweet tweet1)
    {

        return  tweet1.getDate().compareTo(tweet2.getDate());
    }
}
