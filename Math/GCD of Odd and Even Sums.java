/*
 * LeetCode: 3658. GCD of Odd and Even Sums
 * Link: https://leetcode.com/problems/gcd-of-odd-and-even-sums/
 *
 * Pattern: Math
 * Difficulty: Easy
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 *
 * Idea:
 * - The sum of the first n odd numbers is n².
 * - The sum of the first n even numbers is n(n + 1).
 * - gcd(n², n(n + 1)) = n because gcd(n, n + 1) = 1.
 */

class Solution {

    public int gcdOfOddEvenSums(int n) {
        return n;
    }
}