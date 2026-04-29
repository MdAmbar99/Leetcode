class Solution {
    public int maxSubArray(int[] nums) {

        int size = nums.length;
        int b=1;

        int sum = nums[0];
        int maxSum= nums[0];
        
        while(b<size){
            sum = Math.max(nums[b] , sum+nums[b]) ;
            maxSum = Math.max(sum,maxSum);
            b++;
        }
        return maxSum;
    }
}