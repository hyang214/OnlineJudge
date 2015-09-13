package leetcode.easy;

public class Q058 {
	/*** Length of Last Word ***/
	
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        if(words.length < 1)
        	return 0;
        return words[words.length - 1].length();
    }
}
