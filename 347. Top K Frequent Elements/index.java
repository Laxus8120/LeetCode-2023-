class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // O(1) time
        if (k == nums.length) {
            return nums;
        }
        
        // 1. build hash map : character and how often it appears
        // O(N) time
        Map<Integer, Integer> count = new HashMap();
        for (int n: nums) {
          count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // init heap 'the less frequent element first'
        Queue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> count.get(n1) - count.get(n2));
        //PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(count::get)); // also can use this.
        
        // 2. keep k top frequent elements in the heap
        // O(N log k) < O(N log N) time
        for (int n: count.keySet()) {
          heap.add(n);
          if (heap.size() > k) heap.poll();    
        }

        // 3. build an output array
        // O(k log k) time
        int[] top = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            top[i] = heap.poll();
        }
        return top;
    }
}

/*
 * The `count.keySet()` is used in a for-each loop to iterate over all the keys in the count map. For each key n.
 * In this line 'PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(count::get));', the PriorityQueue constructor is used to create a new PriorityQueue object named heap. The constructor takes an argument, which is a custom comparator that determines how the elements in the PriorityQueue should be ordered.
 In this case, the custom comparator is defined as Comparator.comparingInt(count::get). Let's explain what this comparator does:
 count::get is a method reference that refers to the get method of the count map. This method reference represents a function that, given an element, retrieves its count from the count map.
 Comparator.comparingInt is a static method that creates a comparator based on the provided key extractor function.
 * 
 */