class Solution {
    public void moveZeroes(int[] nums) {
    int a = 0; // pointer to keep track of the position to place the next non-zero element
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            int temp = nums[i];
            nums[i] = nums[a];
            nums[a] = temp; // swap the non-zero element with the element at zeroPtr
            a++; // increment the zeroPtr
        }
    }
}
}