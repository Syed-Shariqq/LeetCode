/*
 * LeetCode: 1299. Replace Elements with Greatest Element on Right Side
 * Link: https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 *
 * Pattern: Reverse Traversal
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Idea:
 * - Traverse the array from right to left.
 * - Keep track of the maximum element seen so far.
 * - Replace the current element with the maximum, then update the maximum.
 */

class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int curr = arr[i];
            arr[i] = max;
            max = Math.max(max, curr);
        }

        return arr;
    }
}
