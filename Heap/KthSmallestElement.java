*
 * Problem: Kth Smallest Element in an Array
 * Link: 
 * Difficulty: Easy
 *
 * Approach: Using Max Heap and iterate thro Array.
 * Time Complexity: O(n logk)
 * Space Complexity: O(n logk)
 */

public static int findKthSmallest(int[] nums, int k){
        Heap heap = new Heap();
        for(int i : nums){
            heap.insert(i);
            if(heap.size() > k){
                heap.remove();
            }
        }
        return heap.peek();
    }
