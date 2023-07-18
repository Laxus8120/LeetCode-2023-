class Solution {
    public  boolean searchMatrix(int[][] nums, int target) {

        for(int row = 0 ; row < nums.length ;row++ ){
            
            boolean res = binarysearch(nums, target,row);
            if(res) {
                return true;           
            }
        }
        return false;
}
    
    public boolean binarysearch(int[][] nums ,int target ,int row){
        
        int l = 0 , h = nums[row].length -1;
        while(l <= h){
            
            int mid = l +(h -l)/2;
            if(nums[row][mid] == target) {
                return true;
                
            }
            if(nums[row][mid] > target) h = mid - 1;
            else l = mid +1;
        }
        return false;
    }
}
