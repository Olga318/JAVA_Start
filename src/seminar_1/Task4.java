package seminar_1;

public class Task4 {
}

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1;
        while (end >= 0) {
            while (end > 0 && s.charAt(end) == ' ') {
                end -= 1;
            }
            int start = end;

            while (start >= 0 && s.charAt(start) != ' ') {
                start -= 1;
            }

            sb.append(" ");
            sb.append(s.substring(start + 1, end + 1));
            end = start - 1;
        }

        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }

        return sb.toString().strip();
    }
}