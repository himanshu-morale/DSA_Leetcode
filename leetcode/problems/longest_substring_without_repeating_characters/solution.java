class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        HashSet<Character> set= new HashSet<>();
        int start=0;
        int maxLen=Integer.MIN_VALUE;
        for(int end=0;end<s.length();end++)
        {
            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            maxLen=Math.max(maxLen,end-start+1);
        }
        return maxLen==Integer.MIN_VALUE?0:maxLen;
    }
}