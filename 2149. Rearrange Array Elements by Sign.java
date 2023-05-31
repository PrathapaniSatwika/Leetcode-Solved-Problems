T.C:O(n)
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        List<Integer> positive=new ArrayList<>();
        List<Integer> negative=new ArrayList<>();
        for(int num : nums){
            if(num>0){
                positive.add(num);
            } else{
                negative.add(num);
            }
        }
         int [] rearrange=new int[n];
         int i=0;
         int j=0;
         int k=0;
         while(i<positive.size() && j<negative.size()){
             rearrange[k++]=positive.get(i++);
             rearrange[k++]=negative.get(j++);
         }
         while(i<positive.size()){
             rearrange[k++]=positive.get(i++);
         }
         while( j<negative.size()){
             rearrange[k++]=negative.get(j++);
         }
         return rearrange;
    }
}
Explanation
This code uses two separate lists, positive and negative, to store positive and negative integers from the input array, respectively. It iterates through the input array and adds positive integers to the positive list and negative integers to the negative list.

Then, it creates a new array rearranged of the same length as the input array. It uses three indices i, j, and k to keep track of the positions in the positive, negative, and rearranged arrays, respectively.

It uses a while loop to merge the positive and negative integers in the rearranged array according to the given conditions. It starts by adding a positive integer from the positive list and then a negative integer from the negative list. It continues this process until either the positive or negative list is exhausted.

Finally, it appends any remaining positive or negative integers from the lists to the end of the rearranged array.

The code prints the rearranged array in the main method using Arrays.toString() for demonstration purposes.