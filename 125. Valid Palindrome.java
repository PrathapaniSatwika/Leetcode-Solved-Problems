class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String ans="";
        String math="";
        for(int i=0;i<s.length();i++)
        {

            if(  (s.charAt(i)>=97 && s.charAt(i)<=122) || s.charAt(i)>=48 && s.charAt(i)<=57){
ans+=s.charAt(i);
math=s.charAt(i)+math;

            }
        }
        
        return ans.equalsIgnoreCase(math);
        
    }
}