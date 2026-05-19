class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>maxheap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            maxheap.add(stones[i]);
        }
        while(maxheap.size()>1){
            int first=maxheap.poll();
            int second=maxheap.poll();

            if(first!=second){
                maxheap.add(first-second);
            }
            
        }
        if(maxheap.isEmpty()){
            return 0;
        }
        return maxheap.poll();
        
    }
}
