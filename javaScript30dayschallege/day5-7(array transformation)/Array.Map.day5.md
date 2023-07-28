# for in And for of Loop Difference ?

***1. for...in loop:

* The for...in loop is used to iterate over the enumerable properties of an object. It iterates over the keys (property names) of an object, including its prototype chain. This loop is generally used for object iteration.

Here's the basic syntax of the for...in loop:

```javascript
Copy code
for (const key in object) {
  // Access the property using object[key]
}
Example:

javascript
Copy code
const person = {
  name: "John",
  age: 30,
  city: "New York"
};

for (const key in person) {
  console.log(key + ": " + person[key]);
}
// Output:
// name: John
// age: 30
// city: New York
```

>Note: It's important to be cautious when using for...in with arrays, as it can also iterate over non-numeric properties added to the Array.prototype.

***2. for...of loop:

* The for...of loop is used to iterate over the iterable objects such as arrays, strings, maps, sets, and other objects that implement the iterable protocol. It provides an easier and more concise way to loop through elements compared to traditional for loops.

Here's the basic syntax of the for...of loop:

```javascript
Copy code
for (const element of iterable) {
  // Access the current element directly as 'element'
}
Example:

javascript
Copy code
const numbers = [1, 2, 3, 4, 5];

for (const num of numbers) {
  console.log(num);
}
// Output: 1, 2, 3, 4, 5

```

>for...of loop is especially useful when you want to iterate over the elements of an array or any other iterable without having to deal with indices or property names.

>In summary, use for...in loop when you want to iterate over the properties of an object, and use for...of loop when you want to iterate over the elements of an iterable such as an array or a string.

### Note: It's important to be cautious when using for...in with arrays, as it can also iterate over non-numeric properties added to the Array.prototype.? 


* In JavaScript, the for...in loop is used to iterate over the enumerable properties of an object, including its prototype chain. When you use for...in with an array, it will loop over not only the array elements but also any enumerable properties defined on the Array.prototype.

For example, consider the following code:

```javascript
Copy code
Array.prototype.customProperty = "I am a custom property";

const numbers = [1, 2, 3, 4, 5];

for (const index in numbers) {
  console.log(index + ": " + numbers[index]);
}
Output:

makefile
Copy code
0: 1
1: 2
2: 3
3: 4
4: 5
customProperty: I am a custom property

```

* In this example, we add a custom property named customProperty to the Array.prototype. Then, we use the for...in loop to iterate over the numbers array. As a result, the loop iterates not only over the numeric indices of the array (0, 1, 2, 3, 4) but also includes the customProperty, which is not part of the original array.

* This behavior can lead to unexpected results and errors if you are not aware of it. When you use for...in with arrays, any enumerable properties defined on the Array.prototype (or on any object's prototype chain) will be iterated over. This is why it's important to be cautious when using for...in with arrays.

* To avoid including non-numeric properties from the prototype chain when iterating over arrays, it's generally recommended to use the for...of loop for array iteration. The for...of loop only iterates over the elements of the array and doesn't include prototype properties.



## Array.map() function 

* The map() method takes a callback function as an argument, which is called once for each element in the array. The callback function receives three arguments: the current element, the current index, and the array itself. It then returns the result, which is added to the new array that map() creates.

Here's the basic syntax of the map() method:

```javascript
Copy code
const newArray = array.map((currentValue, index, array) => {
  // Your mapping logic goes here
  return newValue;
});
```

Let's look at some examples of using the map() method:

Example 1: Doubling the elements of an array

```javascript
Copy code
const numbers = [1, 2, 3, 4, 5];
const doubledNumbers = numbers.map((num) => num * 2);

console.log(doubledNumbers); // Output: [2, 4, 6, 8, 10]
```

Example 2: Converting an array of names to uppercase

```javascript
Copy code
const names = ["Alice", "Bob", "Charlie"];
const uppercaseNames = names.map((name) => name.toUpperCase());

console.log(uppercaseNames); // Output: ["ALICE", "BOB", "CHARLIE"]
```
Example 3: Mapping objects to a specific property

```javascript
Copy code
const students = [
  { name: "John", age: 25 },
  { name: "Alice", age: 22 },
  { name: "Bob", age: 30 },
];

const studentNames = students.map((student) => student.name);

console.log(studentNames); // Output: ["John", "Alice", "Bob"]
```

In each example, the map() function applies the provided mapping logic to each element of the array and creates a new array with the results. The original array remains unchanged, and the new array contains the transformed values as per the mapping function.