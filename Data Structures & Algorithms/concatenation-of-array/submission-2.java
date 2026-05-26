class Solution {
    public int[] getConcatenation(int[] nums) {
        int concatarray[]=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            concatarray[i]=nums[i];
            concatarray[i+nums.length]=nums[i];

        }
return concatarray;
        }
    
        
    }
