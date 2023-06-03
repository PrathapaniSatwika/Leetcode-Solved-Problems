class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        if (nums == null || nums.length == 0)
            return result;
        
        int left = findLeftPosition(nums, target);
        
        if (left == -1)
            return result;
        
        int right = findRightPosition(nums, target);
        
        result[0] = left;
        result[1] = right;
        
        return result;
    }
    
    private int findLeftPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int position = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] >= target) {
                right = mid - 1;
                
                if (nums[mid] == target)
                    position = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return position;
    }
    
    private int findRightPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int position = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] <= target) {
                left = mid + 1;
                
                if (nums[mid] == target)
                    position = mid;
            } else {
                right = mid - 1;
            }
        }
        
        return position;
    }
}
