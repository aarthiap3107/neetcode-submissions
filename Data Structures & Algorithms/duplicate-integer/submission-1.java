class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>hashset=new HashSet<>();
        for(int n:nums){
            if(hashset.contains(n)){
                return true;
            }
            hashset.add(n);
        }
        return false;
    }
}