class Solution {
    public int removeElement(int[] nums, int val) {
         int current = 0;
        for(int index = 0 ; index < nums.length ; index++){
            if(nums[index] != val){
                nums[current] = nums[index];
                current++;
            }
        }
    return current;
    }
}