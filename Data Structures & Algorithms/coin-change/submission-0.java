class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount<1){
            return 0;
        }
        int dp[]=new int[amount+1];
        for(int i=0;i<=amount;i++){
            dp[i]=amount+1;
        }
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i){
                    int temp=dp[i-coins[j]]+1;
                    if(temp<dp[i]){
                        dp[i]=temp;
                    }
                }
            }
        }
        if(amount<dp[amount]){
            return -1;
        }
       return dp[amount]; 
    }
}
