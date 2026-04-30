class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Map<Integer, Integer> element = new TreeMap<>();

        for(int num : nums){
            element.put(num , element.getOrDefault(num, 0) + 1);
        }

        for(Integer value : element.values()){
            if(value > 1){
                return true;
            }
        }

        return false;
    }
}