/*
 * LeetCode: 922. Sort Array By Parity II
 * Link: https://leetcode.com/problems/sort-array-by-parity-ii/
 *
 * Pattern: Two Pointers
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Idea:
 * - Maintain one pointer for even indices and another for odd indices.
 * - If an element is misplaced, swap it with the corresponding misplaced element.
 * - Continue until both pointers reach the end of the array.
 */

class Solution {

    public int[] sortArrayByParityII(int[] nums) {

        int evenIdx = 0;
        int oddIdx = 1;

        while (evenIdx < nums.length && oddIdx < nums.length) {

            if (nums[evenIdx] % 2 == 0) {
                evenIdx += 2;
            } else if (nums[oddIdx] % 2 == 1) {
                oddIdx += 2;
            } else {
                int temp = nums[evenIdx];
                nums[evenIdx] = nums[oddIdx];
                nums[oddIdx] = temp;

                evenIdx += 2;
                oddIdx += 2;
            }
        }

        return nums;
    }
}