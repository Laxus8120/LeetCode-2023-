# Array arr.filter()

The array.filter() function is a built-in method in JavaScript that allows you to create a new array containing all elements from the original array that satisfy a certain condition. It applies a callback function to each element in the array and includes the elements in the new array for which the callback function returns true.

The basic syntax of the array.filter() method is as follows:

```javascript
Copy code
const newArray = array.filter(callback(element[, index[, array]]) {
  // Return true to include the element in the new array, false to exclude it.
});
```

* callback: A function that will be called once for each element in the array.
* element: The current element being processed in the array.
* index (optional): The index of the current element being processed.
* array (optional): The array on which filter was called.
* The callback function should return a boolean value (true or false). If it returns true, the element will be included in the new array; * if it returns false, the element will be excluded.

Let's look at some examples of using the array.filter() function:

>Example 1: Filtering even numbers from an array

```javascript
Copy code
const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const evenNumbers = numbers.filter((num) => num % 2 === 0);
console.log(evenNumbers);
// Output: [2, 4, 6, 8, 10]
```
>Example 2: Filtering names that start with "A" from an array

```javascript
Copy code
const names = ["Alice", "Bob", "Anna", "John", "Amy"];

const namesStartingWithA = names.filter((name) => name.startsWith("A"));
console.log(namesStartingWithA);
// Output: ["Alice", "Anna", "Amy"]
```
>Example 3: Filtering objects based on a property

```javascript
Copy code
const students = [
  { name: "John", age: 25 },
  { name: "Alice", age: 22 },
  { name: "Bob", age: 30 },
];

const adults = students.filter((student) => student.age >= 18);
console.log(adults);
// Output: [
//   { name: "John", age: 25 },
//   { name: "Alice", age: 22 },
//   { name: "Bob", age: 30 }
// ]
```
>In each example, the filter() function applies the specified condition to each element of the array and creates a new array containing the elements that satisfy the condition. The original array remains unchanged. filter() is a useful method for extracting specific elements from an array based on a given condition.