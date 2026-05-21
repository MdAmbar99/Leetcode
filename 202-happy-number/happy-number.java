class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        int newNum = 0;
        while(newNum != 1){
            newNum = 0;
            while(n>0){
                int digit = n%10;
                newNum = newNum + (digit * digit);
                n = n / 10;
            }
            n = newNum;

            if(list.contains(newNum)){
                return false;
            }
            list.add(newNum);
        }
        return true;
    }
}