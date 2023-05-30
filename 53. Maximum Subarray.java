Kadane's algorithm
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currentSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}
//In this code, we use the Kadane's algorithm to find the subarray with the 
largest sum. We iterate over the array, calculating the maximum sum ending at
each element. If adding the current element improves the sum,
we include it in the subarray. We also update the maximum sum 
if the current sum is greater. Finally, we return the maximum sum.