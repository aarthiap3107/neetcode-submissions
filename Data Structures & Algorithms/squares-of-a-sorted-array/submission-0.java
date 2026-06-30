class Solution {
    public int[] sortedSquares(int[] nums) {
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int left=0;
        int right=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[left]>nums[right]){
                result[i]=nums[left];
                left++;
            }
            else{
                result[i]=nums[right];
                right--;
            }
        }
        return result;
    }
}