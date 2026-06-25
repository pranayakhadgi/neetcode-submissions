class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Pass 1: Build prefix products into result
        result[0] = 1; // empty product before index 0
        for (int i = 1; i < n; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        // After pass 1 with [1,2,3,4]: result = [1, 1, 2, 6]
        
        // Pass 2: Multiply suffix products into result
        int suffix = 1; // empty product after last index
        for (int i = n-1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];
        }
        // After pass 2: result = [24, 12, 8, 6]
        
        return result;
    }
}