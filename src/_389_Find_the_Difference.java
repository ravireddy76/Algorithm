/**
 * 
 * Given two strings s and t which consist of only lowercase letters.
 * 
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 * 
 * Find the letter that was added in t.
 * 
 * Example:
 * 
 * Input:
 * s = "abcd"
 * t = "abcde"
 * 
 * Output:
 * e
 * 
 * Explanation:
 * 'e' is the letter that was added.
 * @author shengyizhang
 *
 */

// Note: Be careful if the newly added character is already in the orgin string

public class _389_Find_the_Difference {
	public char findTheDifference(String s, String t) {
        int[] array1 = new int[26];
        int[] array2 = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
        	int index = s.charAt(i) - 'a';
        	array1[index]++;
        }
        
        for (int i = 0; i < t.length(); i++) {
        	int index = t.charAt(i) - 'a';
        	array2[index]++;
        }
        
        for (int i = 0; i < array1.length; i++) {
        	if (array2[i] > array1[i]) {
        		return (char)('a' + i);
        	}
        }
        
        return ' ';
    }
}
