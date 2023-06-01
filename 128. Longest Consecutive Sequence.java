T.C:O(n)
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int maxLength=1;
        int currentLength=1;      
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i]==nums[i-1]+1){
                    currentLength++;
                } else{
                    currentLength=1;
                }
                maxLength=Math.max(maxLength,currentLength);
            }
        }
        return maxLength;
    }
}
//Explanation:
In this code, we first check if the given array is empty or null. If so, we return 0,
as there are no elements to form a consecutive sequence.

Next, we sort the array in ascending order using Arrays.sort(nums).

We initialize maxLength and currentLength to 1, as each individual element in the
array can be considered a sequence of length 1.

Then, we iterate over the sorted array starting from the second element (i = 1). 
For each element, we compare it with the previous element (nums[i - 1]) to check if they form a consecutive sequence. If they do, we increment currentLength. If the sequence breaks, we reset currentLength to 1.

Finally, we update maxLength with the maximum length encountered so far using Math.max(maxLength, currentLength).

After iterating over all elements, we return maxLength as the result.