class Solution {
    public int bitwiseComplement(int n) {
       if(n==0){
           return 1;
       }
       int power=0;
       int c=0;
       while(n>0){
           int rem=n%2;
           if(rem==0){
               c+=1<<power;
           }
           power++;
           n=n/2;
       }
       return c;

    }
}
