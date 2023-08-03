class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<>();
        int[] result=new int[nums1.length];
        Arrays.fill(result,-1);
        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                int index = stack.pop();
                if (index < nums2.length) {
                    int targetIndex = getIndex(nums1, nums2[index]);
                    if (targetIndex != -1) {
                        result[targetIndex] = nums2[i];
                    }
                }
            }
            stack.push(i);
        }

        return result;
    }
    private int getIndex(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}