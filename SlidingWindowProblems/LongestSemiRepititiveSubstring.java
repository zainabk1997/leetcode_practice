// Intuition:
// The intuition is primarily based on the idea of maintaining a "sliding window" on the string and constantly updating this window to ensure that it contains at most one consecutive pair of the same digits.

// Algorithm:
// My solution follows the Sliding Window methodology. Below are the main steps:

// Initialization: Initialize three variables: left to mark the start of the window, countPair to count the number of consecutive character pairs, and res to store the length of the longest semi-repetitive substring.

// Traverse the string from left to right. The variable right represents the end of the window:

// Check for consecutive pairs: Inside the loop, check if the current character s[right] is the same as the previous one s[right - 1]. If they are, increment countPair.
// If countPair is more than 1, it means the substring is not semi-repetitive, so we need to move the left boundary of the window. Increment left and if the character at the new left position is the same as its previous character, decrement countPair.
// Update the result: Calculate the current length of the substring right - left + 1 and update res if it's bigger than the current res.
// Since the string is 0-indexed, we have to return res = length+1 

public class LongestSemiRepititiveSubstring {

    public int longestSemiRepetitiveSubstring(String s) {
        int left = 0;
        int countPair = 0;
        int res = 0;
        int right = 0;

        while (right < s.length()) {
            if (right > 0 && (s.charAt(right) == s.charAt(right - 1))) {
                countPair++;
            }
            while (countPair > 1) {
                left++;
                if (s.charAt(left) == s.charAt(left - 1)) {
                    countPair--;
                }
            }
            res = Math.max(res, right - left + 1);

            right++;
        }

        return res;
    }

    public static void main(String[] args) {
        LongestSemiRepititiveSubstring solution = new LongestSemiRepititiveSubstring();
        String s = "52233";
        int result = solution.longestSemiRepetitiveSubstring(s);
        System.out.println(result);
    }

}
