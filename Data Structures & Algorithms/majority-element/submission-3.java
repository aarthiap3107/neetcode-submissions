class Solution {
    public int majorityElement(int[] nums) {
        int majorityelement=nums[0];
        int votes=1;
        for(int i=1;i<nums.length;i++){
            if(votes==0){
                majorityelement=nums[i];
                votes++;
            }
            else if(majorityelement==nums[i]){
                votes++;
            }
            else{
                votes--;
            }
        }   
        return majorityelement;    
    }
}