# Find on your own.

* Js is a paradigm lanaguage.
* JS is wealky typed language.
* hoisting does not work in arrow function as well as anonymous function.

### what is a curry function ?

* A curried function is a function that takes multiple arguments one at a time, rather than taking them all together in a single call. Each call to a curried function returns a new function that expects the next argument until all arguments are provided, and the final result is returned.

### what is memosiation ?


### what is debouncing ?

* A debounced function is a function whose execution is delayed by `t` millisecond and whose execution is cancelled if it is called again within that window of time. The debounced function should also recieve the passed parameter.

```js
ar debounce = function(fn, t) {
    let id ;
    return function(...args) {
        clearTimeout(id)
        id = setTimeout(() => fn(...args),t);
    }
};
/**
 * const log = debounce(console.log, 100);
 * log('Hello'); // cancelled
 * log('Hello'); // cancelled
 * log('Hello'); // Logged at t=100ms
 */
```
### what is throttle function ?

A throttled function is first called without delay and then, for a time intervel of `t` millisecond , can't be executed but should store the latest function argument provided to call `fn` with them after the end of the delay.

---

### what is JSON ?

* JSON:

JSON (JavaScript Object Notation) is a popular data-interchange format that serves as a lightweight alternative to XML. It is widely used for transmitting and storing data in a structured format.
JSON consists of two main data structures: objects and arrays. The data is represented as a combination of key-value pairs, enclosed in curly braces {} for objects, and square brackets [] for arrays. The keys in an object must be strings, while the values can be any valid JSON data type, including objects and arrays.

* Example of a JSON Object:

```js
{
  "name": "Pavitr Prabhakar",
  "age": 17,
  "city": "Mumbattan"
}
```

* Example of a JSON Array:

```js
[
  "Peter",
  "Gwen",
  "Miles"
]
```

* JSON.parse():

JSON.parse() is a built-in JavaScript function that converts a `JSON string` into a JavaScript object, arrayor a primitive value (such as a string, number, boolean, or null). It takes a valid JSON string as input and returns a corresponding JavaScript object, array or primitive value. This allows developers to work with JSON data in a native JavaScript format.

Example of using JSON.parse():

```js
const jsonString = '{"name":"Pavitr Prabhakar","age"17,"city":"Mumbattan"}';
const parsedObject = JSON.parse(jsonString);
console.log(parsedObject.name); // Output: Pavitr Prabhakar
console.log(parsedObject.age); // Output: 17
console.log(parsedObject.city); // Output: Mumbattan
```
Now how to find length or size?
In JavaScript, the length or size property is used to determine the number of elements in an array or the number of key-value pairs in an object. For arrays, the length property returns the highest numeric index plus one. For objects, the length property is not available, so we need to use other methods like Object.keys() to get the number of key-value pairs.

* Example of using length property:

```js const spiders = ["Peter", "Gwen", "Miles"];
console.log(spiders.length); // Output: 3

const person = {
  name: "Pavitr Prabhakar",
  age: 17,
  city: "Mumbattan"
};
console.log(Object.keys(person).length); // Output: 3 
```
>NOTE- if we use Object.keys(person) it going to give us array consisting of keys any using length after that gonna give us the size of that array.

>NOTE - and for an array the Object.keys(person) gonna give you the arrray consisting of indexes of elements like this.

```js
const obj = [null, false, 0]

console.log(Object.keys(obj)) // Output : [ '0', '1', '2' ] and then we can use the .length to find the length. 
```

### what is idempotency key ?

