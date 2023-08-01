## function 

In js there are two ways to declare a function ;

    1. using function name :  

    ```js
    function sum(a,b){
        return a+b;
    }
    ```

    2. using anonymous function (no names):

    ```js
    const sum  = function(a,b); 
    console.log(sum);
    ```

### Immediately Invoked Function Expression (IIFE):

    You can create a function and immediately execute it in Javascript.

```js
const result = (function(a, b) {
const sum = a + b;
return sum;
})(3, 4);
console.log(result); // 7
```

>Why would you write code like this? It gives you the opportunity to encapsulate a variable within a new scope. For example, another developer can immediately see that sum can't be used anywhere outside the function body.

### function hoisting

```js 
add(3,7);

function add(a,b){
    return a+b;
}
```

* Now, in above code we can call the function add before we decalring it, this is called functoin hoisting.
* what function hoisting does he take all function declaration and hoist them on the top of the file.
* So, it act as the function is declare before it is called.

### arrow function 

* there is one more way of declaring the functoin.
```js
 const arrowFunction = ()=>{

}
```
>Note -  here one thing to note is that the arrow function does not allow function hoisting.
>Note -  also anonymous function does not allow function hoisting too.


### Closures

* what closures means that funtion in javascript have access to variable outside of there scope.
* An important topic in JavaScript is the concept of closures. When a function is created, it has access to a reference to all the variables declared around it, also known as it's `lexical environment.` The combination of the function and its enviroment is called a `closure`. This is a powerful and often used feature of the language.
* closures is all about `HIDDEN STATE`.

```js
function createAdder(a) {
  function f(b) {
    const sum = a + b;
    return sum;
  }
  return f;
}
const f = createAdder(3);
console.log(f(4)); // 7

// In this example, createAdder passes the first parameter a and the inner function has access to it. This way, createAdder serves as a factory of new functions, with each returned function having different behavior.
```

>when js is created it dont have function and people go around using `factory functoins`

```js
function createCounter(){
    let value = 0;
    function increment(){
        return ++value;
    }

    return{
        increment : increment
    }
}

const counter1 = createCounter();
const counter2 = createCounter();

console.log(counter1.increment());
console.log(counter1.increment());

console.log(counter2.increment());

// output is : 1, 2, 1 
```

* so, the output is obvious that each counter has its own value because we creating a new instance.
* but how js doing that we know closures tell us that  increment function have access to `value variable` , but every time createCounter function is called we are creating a new value variable so each increment have copy to its own copy of value and when we are returning increment function we are exposing access to ur increment function. so this is `hidden state `   `let value = 0;` 

### ...args(spread operator)

```js
const a = [1,2];
const b = [ 3,4];
cosole.log(...a,...b);

// the spread operator let you concatinate these two array.
```