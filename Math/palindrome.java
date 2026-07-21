/*
 * LeetCode: 9. Palindrome Number
 * Link: https://leetcode.com/problems/palindrome-number/
 *
 * Pattern: Math
 * Difficulty: Easy
 *
 * Time Complexity: O(log₁₀(n))
 * Space Complexity: O(1)
 *
 * Idea:
 * - Reverse the digits of the number.
 * - Compare the reversed number with the original.
 * - If both are equal, the number is a palindrome.
 */

class Solution {
    public boolean isPalindrome(int x) {

        int copy = x;
        int reversed = 0;

        while (x > 0) {
            int lastDig = x % 10;
            reversed = (reversed * 10) + lastDig;
            x /= 10;
        }

        return reversed == copy;
    }
}