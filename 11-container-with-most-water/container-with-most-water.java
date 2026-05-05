class Solution {
    public int maxArea(int[] height) {
        int size = height.length;

        int maxWater = 0;
        int width = size-1;
        int water;

        int a=0;
        int b=size-1;

        while(a<b){
            water = Math.min(height[a],height[b]) * width;
            maxWater = Math.max(water,maxWater);

            if(height[a] < height[b]){
                a++;
            }
            else{
                b--;
            }
            width--;
        }
        return maxWater;
    }
}