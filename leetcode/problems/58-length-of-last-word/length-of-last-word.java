class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        // String[] res=s.split(" ");
        // return res[res.length-1].length();

        int i=s.length()-1;
        int count=0;
        while(i>=0 && s.charAt(i)==' ')
        {
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
    }
}