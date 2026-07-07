class Solution {
    public int maxProduct(int[] nums) {
        int maxprod=nums[0];
        int leftprod=1;
        int rightprod=1;
        for(int i=0;i<nums.length;i++){
            if(leftprod==0){
                leftprod=1;
            }
            if(rightprod==0){
                rightprod=1;
            }
            leftprod*=nums[i];
            rightprod*=nums[nums.length-1-i];
            maxprod=Math.max(maxprod,Math.max(leftprod,rightprod));
        }
        
        return maxprod;
    }
}
