 time complexity of O(n^2)
Space Complexity: O(1)
class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<2){
            return s;
        }
        int start=0;
        int end=0;
        for(int i=0;i<n;i++){
            int length1=expandAroundCenter(s,i,i);
            int length2=expandAroundCenter(s,i,i+1);
            int length=Math.max(length1,length2);
            if(length>end-start){
                start=i-(length-1)/2;
                end=i+length/2;

            }
        }
        return s.substring(start,end+1);
    }
    private int expandAroundCenter(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}