class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxconsecutive=0;
        for(int n:nums){
            if(n==1){
                count++;
            }
            else{
                maxconsecutive=Math.max(count,maxconsecutive);
                count=0;
            }
        }
        return Math.max(maxconsecutive,count);
    }
}