 /*
 * LeetCode: 912. Sort an Array
 * Link: https://leetcode.com/problems/sort-an-array/
 *
 * Pattern: Merge Sort
 * Difficulty: Medium
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 *
 * Idea:
 * - Divide the array into two halves recursively.
 * - Sort both halves independently.
 * - Merge the two sorted halves using a temporary array.
 */

class Solution {

    public void merge(int[] nums, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int add = 0;
        int i = low;
        int j = mid + 1;

        while (i <= mid && j <= high) {

            if (nums[i] <= nums[j]) {
                temp[add++] = nums[i++];
            } else {
                temp[add++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[add++] = nums[i++];
        }

        while (j <= high) {
            temp[add++] = nums[j++];
        }

        for (int k = low; k <= high; k++) {
            nums[k] = temp[k - low];
        }
    }

    public int[] mergeSort(int[] nums, int low, int high) {

        if (low >= high)
            return nums;

        int mid = low + (high - low) / 2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);

        merge(nums, low, mid, high);

        return nums;
    }

    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}