class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int size = nums.length;

        int[] prifixProduct = new int[size];
        int[] suffixProduct = new int[size];

        prifixProduct[0] = 1;
        suffixProduct[size-1] = 1;

        int[] ans = new int[size];

        for(int i=1; i<size; i++){
            prifixProduct[i] = prifixProduct[i-1] * nums[i-1];
            suffixProduct[size-i-1] = suffixProduct[size-i] * nums[size-i];
        }

        for(int i=0; i<size; i++){
            ans[i] = prifixProduct[i] * suffixProduct[i];
        }

        return ans;
    }
}