package seminar_1;

public class Task1 {

}

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int ind = 0;
        StringBuilder ans = new StringBuilder();
        while (ind < word1.length() || ind < word2.length()) {
            if (ind < word1.length()) {
                ans.append(word1.charAt(ind));
            }
            if (ind < word2.length()) {
                ans.append(word2.charAt(ind));
            }
            ind += 1;
        }
        return ans.toString();
    }
};
