package seminar_1;

public class Task3 {
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m -= 1;
        n -= 1;
        int copyInd = nums1.length - 1;
        while (n >= 0) {
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[copyInd] = nums1[m--];
            } else {
                nums1[copyInd] = nums2[n--];
            }
            copyInd -= 1;
        }
    }
}