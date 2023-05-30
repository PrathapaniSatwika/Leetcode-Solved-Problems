Dutch national Flag algorithm
class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            switch(nums[mid]){
                case 0:
                swap(nums,low,mid);
                low++;
                mid++;
                break;
                case 1:
                 mid++;
                 break;
                 case 2:
                 swap(nums,mid,high);
                 high--;
                 break;
            }
        }
    }
    private void swap(int [] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
Explanation:
In the Solution class, the sortColors method implements the "Dutch National
 Flag algorithm". The low, mid, and high pointers are used to partition
 the array into three sections: 0s on the left, 1s in the middle, and
 2s on the right.

The swap method is a private helper method that swaps two elements in the array.
time complexity:
The time complexity of the Dutch National Flag algorithm used to sort colors in this case (0s, 1s, and 2s) is O(n),
where n is the length of the input array.
The algorithm performs a single pass through the array, 
using three pointers (`low`, `mid`, and `high`) to partition the elements into 
three sections. 
In each iteration, only constant time operations are performed,
such as comparisons and swapping elements.

Since the algorithm iterates through the array once, 
the time complexity is linear with respect to the size of the input array, 
resulting in O(n) time complexity.

It's important to note that this time complexity assumes the input size remains 
constant throughout the execution of the algorithm.