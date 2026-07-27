/*
 * LeetCode: 31. Next Permutation
 * Link: https://leetcode.com/problems/next-permutation/
 *
 * Pattern: Arrays
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Idea:
 * - Find the first index from the right where the current element is smaller than the next.
 * - Swap it with the next greater element on its right.
 * - Reverse the suffix to obtain the next lexicographically greater permutation.
 */

class Solution {

    public void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public void nextPermutation(int[] nums) {

        int idx = -1;
        int n = nums.length;

        for (int i = n - 2; i >= 0; i--) {

            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            reverse(nums);
            return;
        }

        for (int i = n - 1; i > idx; i--) {

            if (nums[i] > nums[idx]) {

                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }

        int start = idx + 1;
        int end = n - 1;

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}