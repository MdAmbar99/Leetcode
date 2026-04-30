class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> map1 = new TreeMap<>();
        Map<Integer, Integer> map2 = new TreeMap<>();

        for(Integer num : nums1){
            map1.put(num , map1.getOrDefault(num, 0) + 1);
        }

        for(Integer num : nums2){
            map2.put(num , map2.getOrDefault(num, 0) + 1);
        }

        Map<Integer,Integer> ans = new HashMap<>();

        for(Map.Entry<Integer,Integer> entry : map1.entrySet()){
            if(map2.containsKey(entry.getKey())){
                ans.put(entry.getKey(), Math.min(entry.getValue(), map2.get(entry.getKey())));
            }    
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(Map.Entry<Integer,Integer> val : ans.entrySet()){
            for(int i = 0; i < val.getValue(); i++){
                result.add(val.getKey());
            }
        }
        
        int[] answer = new int[result.size()];

        for(int i = 0 ; i < answer.length; i++){
            answer[i]=result.get(i);
        }

        return answer;
    }
}