class Solution {
    public String frequencySort(String s) {
        int [] frequencies=new int[256];
        for(char c:s.toCharArray()){
            frequencies[c]++;
        }
        StringBuilder sortedString=new StringBuilder();
        while(sortedString.length()<s.length()){
            int maxFrequency=0;
            char maxChar=0;
            for(int i=0;i<frequencies.length;i++){
                if(frequencies[i]>maxFrequency){
                    maxFrequency=frequencies[i];
                    maxChar=(char) i;
                }
            }
            for(int i=0;i<maxFrequency;i++){
                sortedString.append(maxChar);
            }
            frequencies[maxChar]=0;
        }
        return sortedString.toString();
    }
}