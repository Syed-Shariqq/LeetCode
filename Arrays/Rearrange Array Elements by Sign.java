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
 * - Store positive and negative numbers in separate arrays.
 * - Traverse both arrays simultaneously.
 * - Place positive numbers at even indices and negative numbers at odd indices.
 */

class Solution {

    public int[] rearrangeArray(int[] nums) {

        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2];

        int posIdx = 0;
        int negIdx = 0;

        for (int i = 0; i < nums.length; i++) {

            if (!(nums[i] < 0)) {
                pos[posIdx] = nums[i];
                posIdx++;
            } else {
                neg[negIdx] = nums[i];
                negIdx++;
            }
        }

        for (int i = 0; i < nums.length / 2; i++) {
            nums[2 * i] = pos[i];
            nums[2 * i + 1] = neg[i];
        }

        return nums;
    }
}