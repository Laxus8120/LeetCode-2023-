public class index {
    public int[] twoSum(int[] numbers, int target) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            
            if (set.contains(complement)) {
                // Find the indices by searching for the complement
                int index1 = findIndex(numbers, complement);
                int index2 = i + 1; // Current index (1-indexed)
                return new int[]{index1, index2};
            }
            
            set.add(numbers[i]);
        }
        
        return new int[]{-1, -1}; // No solution found
        }
    
        private int findIndex(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i + 1; // Return 1-indexed index
            }
        }
        return -1; // Element not found
}

// *class Solution {
    public int[] twoSum(int[] nums, int target) {

        int l= 0 , h = nums.length -1;
        while(l < h){
            
            
            if((nums[l] + nums[h]) == target) return new int[]{l+1, h+1};
            else if((nums[l] + nums[h]) > target)  h--;
            else l++;
        }
        return new int[]{};
    }
}
// //*class Solution {
//     public int[] twoSum(int[] nums, int target) {

//         int l= 0 , h = nums.length -1;
//         while(l < h){
            
            
//             if((nums[l] + nums[h]) == target) return new int[]{l+1, h+1};
//             else if((nums[l] + nums[h]) > target)  h--;
//             else l++;
//         }
//         return new int[]{};
//     }
// //

