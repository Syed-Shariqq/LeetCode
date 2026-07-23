/*
 * LeetCode: 283. Move Zeroes
 * Link: https://leetcode.com/problems/move-zeroes/
 *
 * Pattern: Two Pointers
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Idea:
 * - Find the first zero in the array.
 * - Use a second pointer to find the next non-zero element.
 * - Swap the non-zero element with the zero and continue until the end.
 */

class Solution {

    public void moveZeroes(int[] nums) {

        int i = 0;
        int j = -1;

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == 0) {
                j = k;
                break;
            }
        }

        if (j == -1) return;

        i = j + 1;

        while (i < nums.length && j < nums.length) {

            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            } else {
                i++;
            }
        }
    }
}