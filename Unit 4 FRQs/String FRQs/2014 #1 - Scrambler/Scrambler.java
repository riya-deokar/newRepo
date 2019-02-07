import java.util.*;
/**
 * Write a description of class Scrambler here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scrambler
{
    /**
     * Scrambles a given word.
     * @param word the word to be scrambled
     * @return the scrambled word (possibly equal to word)
     * Precondition: word is either an empty string or contains
     * only uppercase letters
     * Postcondition: the string returned was created from word as 
     * follows:
     *   - the word was scrambled, beginning at the first letter and
     *   continuing from left to right
     *   - two consecultive letters consisting of "A" followed by a letter
     *   that was not "A" were swapped
     *   - letters were swapped at most once
     */
    public static String scrambleWord(String word)
    {
        /* to be implemented in part (a) */
    }
    
    /**
     * Modifies wordList by replacing each word with its scrambled
     * version, removing any words that are unchanged as a result
     * of scrambling.
     * @param wordList the list of words
     * Precondition: wordList contains only non-null objects
     * Postcondition:
     *  - all words unchanged by scrambling have been removed from wordList
     *  - each of the remaining words has been replaced by its scrambled version
     *  - the relative ordering of the entries in wordList is the same
     *  as it was before the method was called
     *  
     *  Note: the original method from the FRQ is void, but to test
     *  the method, the wordList will need to be returned.
     */
    public static List<String> scrambleOrRemove(List<String> wordList)
    {
        /* to be implemented in part (b) */
        
        
        //add code for part b above
        return wordList; //DO NOT CHANGE - return used for testing
    }
}
