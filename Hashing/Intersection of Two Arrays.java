/*
 * LeetCode: 349. Intersection of Two Arrays
 * Link: https://leetcode.com/problems/intersection-of-two-arrays/
 *
 * Pattern: Hashing
 * Difficulty: Easy
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n)
 *
 * Idea:
 * - Store all elements of the first array in a HashSet.
 * - Traverse the second array and check if the element exists in the HashSet.
 * - Store common elements in another HashSet to ensure uniqueness.
 */

import java.util.*;

class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                ans.add(num);
            }
        }

        int[] result = new int[ans.size()];
        int index = 0;

        for (int num : ans) {
            result[index++] = num;
        }

        return result;
    }
}