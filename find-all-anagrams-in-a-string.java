// Problem: Find All Anagrams in a String
// LeetCode: 438
// Link: https://leetcode.com/problems/find-all-anagrams-in-a-string/
// Topic: Sliding Window
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        if (s.length() < p.length()) {
            return list;
        }

        int[] window = new int[26];
        int[] target = new int[26];

        // Store frequency of characters in p
        for (int i = 0; i < p.length(); i++) {
            target[p.charAt(i) - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character to window
            window[s.charAt(right) - 'a']++;

            // Shrink window if it becomes larger than p
            while (right - left + 1 > p.length()) {
                window[s.charAt(left) - 'a']--;
                left++;
            }

            // Compare both frequency arrays
            if (Arrays.equals(window, target)) {
                list.add(left);
            }
        }

        return list;
    }
}
