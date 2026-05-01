class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;

        int target = 2;
        for(int i= n - 2 ; i>=0; i--){
            if(nums[i+1] != nums[i]){
                target--;
            }
            if(target == 0){
                return nums[i];
            }
        } 

        if(target !=0){
            return nums[n-1];
        }
        return 0;
    }
}