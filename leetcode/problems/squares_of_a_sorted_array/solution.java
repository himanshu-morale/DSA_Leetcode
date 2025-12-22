class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        int[] res=new int[nums.length];
        int left=0,right=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(Math.pow(nums[left],2)>Math.pow(nums[right],2)){
                res[i]=nums[left]*nums[left];
                left++;
            }else{
                res[i]=nums[right]*nums[right];
                right--;
            }
        }
        return res;
    }
}