class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxconsecutive=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
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