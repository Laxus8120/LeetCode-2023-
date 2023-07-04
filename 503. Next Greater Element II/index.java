class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> s = new Stack<>();
        int[]  res  = new int[nums.length];
        Arrays.fill(res, -1);

        for(int i = 0 ; i < nums.length ; i++){
            while(!s.isEmpty() && nums[i] > nums[s.peek()]){
                res[s.pop()] = nums[i];     
            }
            s.push(i);
        }
        for(int i = 0 ; i < nums.length ; i++){
            while(!s.isEmpty() && nums[i] > nums[s.peek()]){
                res[s.pop()] = nums[i];     
            }
        }
        return res;
    }
}