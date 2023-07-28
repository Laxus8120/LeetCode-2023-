### 2704. To Be Or Not To Be

```js
var expect = function(val) {
    const toBe = (a) =>{
        if(a === val){
            return true;
        }
        else{
            throw "Not Equal"
        }
    }
    const notToBe  = (b)=>{
        if(b!==val){
            return true;
        }
        else{
            throw "Equal"
        }
    }
    return {
        toBe,
        notToBe
    }
};
```

***What is `throw` ?

* The throw keyword in JavaScript is used to raise an exception or an error explicitly. When throw is used inside a function, it stops the function's normal execution flow and triggers an exception. This allows you to handle exceptional cases and communicate errors or unexpected conditions in your code.

***What is This `===`?




