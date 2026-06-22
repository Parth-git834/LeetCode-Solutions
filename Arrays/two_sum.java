/*
 * Problem: Two Sum (LeetCode #1)
 * Link: https://leetcode.com/problems/two-sum/
 * Difficulty: Easy
 *
 * Approach: HashMap to store seen values and their indices.
 * Check if complement (target - current) exists in map.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
