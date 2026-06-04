class Solution {
    public boolean canJump(int[] nums) {
        int finaldest=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]+i>=finaldest){
                finaldest=i;
            }
        }
        return finaldest==0;
    }
}
