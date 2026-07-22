/*
 * LeetCode: 2942. Find Words Containing Character
 * Link: https://leetcode.com/problems/find-words-containing-character/
 *
 * Pattern: String Traversal
 * Difficulty: Easy
 *
 * Time Complexity: O(n × m)
 * Space Complexity: O(1) (excluding the output list)
 *
 * Idea:
 * - Traverse each word one character at a time.
 * - If the target character is found, add the word's index.
 * - Stop checking the current word once the character is found.
 */

import java.util.*;

class Solution {

    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            String currentWord = words[i];

            for (int j = 0; j < currentWord.length(); j++) {

                if (currentWord.charAt(j) == x) {
                    indices.add(i);
                    break;
                }
            }
        }

        return indices;
    }
}