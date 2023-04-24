class Solution {
    public boolean isPalindrome(int x) {
        int rem=0;
        int num=x;
        int temp=0;
        while(x>0){
            rem=x%10;
            temp=temp*10+rem;
            x/=10;
        }
        if(num==temp){
            return true;
        }
        return false;
    }
}