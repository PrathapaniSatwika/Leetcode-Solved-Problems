class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            //check if mid index is even
            if(mid%2==1){
                mid--;
            }
            //check if the next element is equal to the current element
            if(nums[mid]!=nums[mid+1]){
                right=mid;
            } else{
                left=mid+2;
            }
        }
        return nums[left];
    }
}