class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int size1 = nums1.length;
        int size2 = nums2.length;

        int a=0;
        int b=0;

        int i=0;
        int[] ans = new int[size1];

        while(a<size1 && b<size2){
            if(nums1[a] == nums2[b]){
                ans[i] = nums1[a];
                i++;
                a++;
                b++;
            }
            else if(nums1[a]<nums2[b]){
                a++;
            }
            else{
                b++;
            }
        }
        return Arrays.copyOf(ans,i);
    }
}