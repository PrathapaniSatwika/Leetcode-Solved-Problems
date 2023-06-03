class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int element=nums[mid];
            if(element==target){
                return mid;
            } else if(element<target){
                low=mid+1;
            } else{
                high=mid-1;
            }
        }
        return -1;
    }
}