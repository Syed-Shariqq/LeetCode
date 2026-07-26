/*
 * LeetCode: 2149. Rearrange Array Elements by Sign
 * Link: https://leetcode.com/problems/rearrange-array-elements-by-sign/
 *
 * Pattern: Arrays
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Idea:
 * - Create a result array of the same size.
 * - Place positive numbers at even indices.
 * - Place negative numbers at odd indices.
 */

class Solution {

    public int[] rearrangeArray(int[] nums) {

        int posIdx = 0;
        int negIdx = 1;
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < 0) {
                res[negIdx] = nums[i];
                negIdx += 2;
            } else {
                res[posIdx] = nums[i];
                posIdx += 2;
            }
        }

        return res;
    }
}