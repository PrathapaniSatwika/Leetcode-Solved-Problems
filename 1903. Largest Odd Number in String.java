time complexity  is O(n)
class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        int endIndex=-1;
        for(int i=n-1;i>=0;i--){
            int digit=num.charAt(i)-'0';
            if(digit%2!=0){
                endIndex=i;
                break;
            }
        }
        if(endIndex==-1){
            return "";
        }
        return num.substring(0,endIndex+1);
    }
}
//In this code, we iterate through the characters of the input string num from right to left. We check if each digit is odd by performing % 2 operation on its numeric value (digit % 2 != 0). If we encounter an odd digit, we update the endIndex variable with the current index and break out of the loop.

After the loop, if endIndex remains -1, it means no odd digit was found in the string. In that case, we return an empty string. Otherwise, we use the substring() method to extract the substring from index 0 to endIndex + 1 (inclusive) and return it as the largest-valued odd integer substring.

The time complexity of this solution is O(n), where n is the length of the input string num.