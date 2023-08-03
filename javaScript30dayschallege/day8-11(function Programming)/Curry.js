// Non-curried function
function add(a, b) {
    return a + b;
  }
  
  console.log(add(2, 3)); // Output: 5
  
  // Curried function
  function curriedAdd(a) {
    return function (b) {
      return a + b;
    };
  }
  
  console.log(curriedAdd(2)); // Output: 5

  //In this example, add is a non-curried function that takes two arguments a and b and returns their sum. On the other hand,
  // curriedAdd is a curried function that takes a single argument a and returns a new function that takes another argument b and returns their sum.
  //When calling curriedAdd(2), it returns a new function that expects the second argument b. By calling curriedAdd(2)(3), we provide the second argument, and the final result 5 is returned.
  
  function fn(a, b) {
    return a + b;
  }
  
  var curry = function (fn) {
    return function curried(...args) {
      if (args.length >= fn.length) {
        return fn(...args);
      } else {
        return function (...nextArgs) {
          return curried(...args.concat(nextArgs));
        };
      }
    };
  };
  
  const csum = curry(fn);
  console.log(csum(3)(4)); // Output: 7
  
  
