class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int result[]=new int[nums1.length];
        Stack<Integer>stack=new Stack<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            int element=nums2[i];
            while(!stack.isEmpty() && stack.peek()<=element){
                stack.pop();
            }
            if(stack.isEmpty()){
                map.put(element,-1);
            }
            else{
                map.put(element,stack.peek());
            }
            stack.push(element);
        }
        for(int i=0;i<nums1.length;i++){
            result[i]=map.get(nums1[i]);
        }
        return result;
    }
}