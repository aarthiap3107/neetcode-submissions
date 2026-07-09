class Solution {
    public int jump(int[] nums) {
        int totaljumps = 0;
        int finaldest = nums.length - 1;
        int coverage = 0;
        int lastjumpidx = 0;
        if (nums.length == 1) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + i > coverage) {
                coverage = nums[i] + i;}
                if (i == lastjumpidx) {
                    lastjumpidx = coverage;
                    totaljumps++;
                    if (coverage >= finaldest) {
                        return totaljumps;
                    }
                }
            }
        return totaljumps;
    }
}
