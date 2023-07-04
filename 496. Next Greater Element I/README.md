# nextGreaterElement

### complexity

***Here's a breakdown of the code:***

Building the next greater element map:

The first loop iterates over the elements in nums2. This loop has a time complexity of O(nums2), as it visits each element once.
Inside the loop, the while loop pops elements from the stack until a greater element is found or the stack is empty. This while loop will not exceed the total number of elements in nums2, so its time complexity is also O(nums2). The map insertion operation inside the while loop has an average time complexity of O(1).

Therefore, the overall complexity of building the next greater element map is O(nums2).
Building the result array:

The second loop iterates over the elements in nums1. This loop has a time complexity of O(nums1), as it visits each element once.
Inside the loop, the map lookup operation using map.getOrDefault() has an average time complexity of O(1).
Therefore, the overall complexity of building the result array is O(nums1).

* Since these two operations are performed separately and not nested within each other, the total time complexity of the code is O(nums1 + nums2).
