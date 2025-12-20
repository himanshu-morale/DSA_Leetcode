class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int runningsum[]=new int [n];
        int sum=nums[0];
        runningsum[0]=sum;
        for(int i=1;i<n;i++){
            sum=sum+nums[i];
            runningsum[i]=sum;
        }
        return runningsum;
    }
}