class Solution {
    public int maxProduct(int[] nums) {
        
        int size = nums.length;

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int answer = nums[0];

        for(int i = 1 ; i < size ; i++){
            int tempMax = maxProduct;

            maxProduct = Math.max(nums[i], Math.max(maxProduct * nums[i], minProduct * nums[i]));
            minProduct = Math.min(nums[i], Math.min(tempMax * nums[i], minProduct * nums[i]));

            answer = Math.max(answer,maxProduct);
        }
        return answer;
    }
}