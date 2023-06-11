 time complexity of O(n)
space complexity of O(1)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] sMap=new int[256];
        int tMap[]=new int[256];
        for(int i=0;i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(sMap[sChar]!=tMap[tChar]){
                return false;
            }
            sMap[sChar]=i+1;
            tMap[tChar]=i+1;
        }
        return true;
    }
}
// we use two integer arrays sMap and tMap of size 256. Each array represents the mapping between characters. Initially, all elements of both arrays are 0.

The for loop iterates through each character of the strings. For each character, we compare the corresponding elements in sMap and tMap. If they are not equal, it means the mapping is inconsistent, and the function returns false.

If the mapping is consistent, we update the elements in both arrays at the indices corresponding to the characters. Since the arrays are initialized with 0 and we need to differentiate between mapped and unmapped characters, we use i + 1 as the value for the mapped characters.

If the loop completes without encountering any inconsistencies, the function returns true, indicating that the strings are isomorphic.