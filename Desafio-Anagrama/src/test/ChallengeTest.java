package test;

import com.company.Challenge;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ChallengeTest {

    @Test
    public void testChallenge() {

        assertTrue(Challenge.nestedAnagrams("bored cat", "act robed"));
        assertTrue(Challenge.nestedAnagrams("cat cat", "act"));
        assertTrue(Challenge.nestedAnagrams("parrot flea lion hornet", "leaf loin raptor throne"));
        assertFalse(Challenge.nestedAnagrams("parrot flea lion hornet", "leaf loin raptoo throne"));
    }
}
