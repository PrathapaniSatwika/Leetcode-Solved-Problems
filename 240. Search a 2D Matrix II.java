class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int rows=matrix.length;
         if(rows==0){
             return false;
         }
         int columns=matrix[0].length;
         int low=0;
         int high=columns-1;
         while(low<rows && high>=0){
             if(matrix[low][high]==target){
                 return true;
             } else if(matrix[low][high]<target){
                 low++;
             } else{
                 high--;
             }
         }
         return false;
    }
}