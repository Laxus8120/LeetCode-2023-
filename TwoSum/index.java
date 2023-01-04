
/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

   You may assume that each input would have exactly one solution, and you may not use the same element twice.

   You can return the answer in any order.
 */
    // TimeComplexity - O(n)
    
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] res = new int[2];
        for(int i =0; i < nums.length ; i++){
            if(map.containsKey(target - nums[i])){
                res[0] = i;
                res[1] = map.get(target - nums[i]);
            }
            map.put(nums[i],i);
        }
        return res;
    }
} 
