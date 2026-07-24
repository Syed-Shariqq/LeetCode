/*
 * LeetCode: 448. Find All Numbers Disappeared in an Array
 * Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 *
 * Pattern: Hashing
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Idea:
 * - Create a boolean array to mark the numbers present in the input array.
 * - Traverse the array and mark each encountered number.
 * - Collect all indices that remain unmarked.
 */

import java.util.*;

class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        Boolean[] seen = new Boolean[nums.length + 1];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= nums.length; i++) {
            seen[i] = false;
        }

        for (int i = 0; i < nums.length; i++) {
            seen[nums[i]] = true;
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!seen[i]) {
                list.add(i);
            }
        }

        return list;
    }
}