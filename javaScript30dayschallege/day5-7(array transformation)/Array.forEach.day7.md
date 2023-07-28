# Array.forEach()

* The array.forEach() function is a built-in method in JavaScript used to loop over the elements of an array and perform a specified operation on each element. It is an alternative to using a traditional for loop when you want to iterate through the elements of an array without creating a new array or returning any values.

>The basic syntax of the array.forEach() method is as follows:

```javascript
Copy code
array.forEach(callback(currentValue[, index[, array]]) {
  // Perform an operation on the currentValue
});
```
* callback: A function that will be called once for each element in the array.
* currentValue: The current element being processed in the array.
* index (optional): The index of the current element being processed.
* array (optional): The array on which forEach was called.
* The forEach() method does not create a new array; it simply iterates through the elements of the existing array and applies the *operation defined in the callback function to each element.

> Unlike other array methods like map(), filter(), or reduce(), the forEach() method does not return anything, and it doesn't modify the original array elements.

> So, to clarify, the forEach() method itself does not return anything and does not create a new array. However, you can modify the elements of the original array inside the forEach() callback if you choose to do so. The numbers array is directly modified in this example.

* Let's look at some examples of using the array.forEach() function:

>Example 1: Logging each element of the array

```javascript
Copy code
const numbers = [1, 2, 3, 4, 5];

numbers.forEach((num) => {
  console.log(num);
});
// Output: 1, 2, 3, 4, 5
```
>Example 2: Doubling each element of the array in-place

```javascript
Copy code
const numbers = [1, 2, 3, 4, 5];

numbers.forEach((num, index, array) => {
  array[index] = num * 2;
});

console.log(numbers); // Output: [2, 4, 6, 8, 10]
```

>Example 3: Summing the elements of the array

```javascript
Copy code
const numbers = [1, 2, 3, 4, 5];
let sum = 0;

numbers.forEach((num) => {
  sum += num;
});

console.log(sum); // Output: 15
```

In each example, the forEach() method iterates through the elements of the array and applies the specified operation in the callback function for each element. It is commonly used when you want to perform some side effect or action for each element, such as logging, updating the array in-place, or calculating a running total.





