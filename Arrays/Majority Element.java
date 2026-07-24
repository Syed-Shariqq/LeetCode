/*
 * LeetCode: 169. Majority Element
 * Link: https://leetcode.com/problems/majority-element/
 *
 * Pattern: Boyer-Moore Voting Algorithm
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Idea:
 * - Use the Boyer-Moore Voting Algorithm to find a potential majority candidate.
 * - Verify whether the candidate appears more than n/2 times.
 * - Return the candidate if it is the majority element.
 */

class Solution {

    public int majorityElement(int[] nums) {

        int count = 0;
        int el = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                count = 1;
                el = nums[i];
            } else if (nums[i] == el) {
                count++;
            } else {
                count--;
            }
        }

        int count1 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el)
                count1++;

            if (count1 > nums.length / 2)
                return el;
        }

        return -1;
    }
}