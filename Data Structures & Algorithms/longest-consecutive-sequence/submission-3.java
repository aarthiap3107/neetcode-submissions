class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>numset=new HashSet<>();
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            numset.add(nums[i]);
        }
        for (int num : numset) {
            if(!numset.contains(num-1)){
                int length=1;
            while(numset.contains(num+length)){
                length++;
            }
            maxLength=Math.max(length,maxLength);
        }
        }
        return maxLength;
    }
}
    
