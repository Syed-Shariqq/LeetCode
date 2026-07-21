/*
 * LeetCode: 7. Reverse Integer
 * Link: https://leetcode.com/problems/reverse-integer/
 *
 * Pattern: Math
 * Difficulty: Medium
 *
 * Time Complexity: O(log₁₀(n))
 * Space Complexity: O(1)
 *
 * Idea:
 * - Extract the last digit using modulo.
 * - Check for integer overflow before appending the digit.
 * - Build the reversed number digit by digit.
 */

class Solution {

    public int reverse(int x) {

        int reversed = 0;

        while (x != 0) {

            int lastDig = x % 10;

            if (reversed > Integer.MAX_VALUE / 10 ||
                (reversed == Integer.MAX_VALUE / 10 && lastDig > 7)) {
                return 0;
            }

            if (reversed < Integer.MIN_VALUE / 10 ||
                (reversed == Integer.MIN_VALUE / 10 && lastDig < -8)) {
                return 0;
            }

            reversed = reversed * 10 + lastDig;
            x /= 10;
        }

        return reversed;
    }
}