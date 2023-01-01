// Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.

 /* HASHSET SOLUTION 
  * Time Complexity - O(n)
  * Space Complexity - 
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> s = new HashSet<>();
        for(int n : nums){
            s.add(n);
        }
        return nums.length == s.size()? false :true;
    }
}

//--------------------------------------------------------------------
/* Normal Solution
 * TimeComplexity - O(n^2)
 * SpaceComplexity - O(n)
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0 ; i<nums.length; i++){

            for(int j = i +1; j < nums.length; j++){
                if(nums[j] == nums[i]){
                return true;
            }
            
            }
        }
        return false;
    }
}