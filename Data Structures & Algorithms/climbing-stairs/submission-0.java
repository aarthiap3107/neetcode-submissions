class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;        }
    
    int firststep=1;
    int secondstep=2;
    for(int i=3;i<=n;i++){
        int temp=firststep+secondstep;
        firststep=secondstep;
        secondstep=temp;
    }
    return secondstep;
}
}
