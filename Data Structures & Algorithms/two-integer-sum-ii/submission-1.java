class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int cursum=nums[left]+nums[right];
            if(cursum>target){
                right--;
            }
            else if(cursum<target){
                left++;
            }
            else{
                return new int[]{left+1,right+1};
            }
        }
        return new int[0];
    }
}
