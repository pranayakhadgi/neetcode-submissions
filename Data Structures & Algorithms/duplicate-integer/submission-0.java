class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.Arrays.sort(nums);
        var hasDuplicate = false; int store = 0;
        for(var i = 0; i < nums.length - 1; i++){
            store = nums[i]; 
            if(store == nums[i+1]) return true; 
        }
        return hasDuplicate;
    }
}