class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[]bucket=new List[nums.length+1];
        HashMap<Integer,Integer>freqmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int currentcount=freqmap.getOrDefault(nums[i],0);
            freqmap.put(nums[i],currentcount+1);
        }
        for(int key:freqmap.keySet()){
            int freq=freqmap.get(key);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int res[]=new int[k];
        int index=0;
        for(int i=nums.length;i>=0 && index<k;i--){
            if(bucket[i]!=null){
                for(Integer integer:bucket[i]){
                    res[index++]=integer;
                }
            }
        }
       return res; 
    }
}
