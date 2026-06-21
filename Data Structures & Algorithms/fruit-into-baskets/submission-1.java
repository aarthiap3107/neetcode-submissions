class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        HashMap<Integer,Integer>basket=new HashMap<>();
        int maxlength=0;
        for(int right=0;right<fruits.length;right++){
            int currentcount=basket.getOrDefault(fruits[right],0);
            basket.put(fruits[right],currentcount+1);
            while(basket.size()>2){
                int fruitcount=basket.get(fruits[left]);
                if(fruitcount==1){
                    basket.remove(fruits[left]);
                }
                else{
                    basket.put(fruits[left],fruitcount-1);  
                }
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
        }

    return maxlength;    
    }
}