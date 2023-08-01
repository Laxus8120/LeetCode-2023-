# function.apply()

## why we need it ?

## How we use it ?

Let's say you have a function which just log the out the name.

```js
function printName(){
    name = 'hemant';
    console.log(this.name);
    // Output : undefined
}
```
* Now, her the `this` not belongs to any object or calss here.
* let's create a object 
    ```js
    const person  = {
        name : 'hemant'
    }
    ```
* Still we cant print the name because the name is not binded to our function.
* So, lets bind it using the apply function.

    `printName.apply(person);`

* When we do this we bind our `this` keyword to the person object we created.
* And still you cant imagine what is happeing you think like this.

    ```js
    function printName(){
    console.log(person.name);  // becasue the this is not bind to person object
    // Output : hemant 
    }
```
* If we wanna pass multiple parameter to our function like we want to greet others.

```js
    const person  = {
        name : 'hemant'
    }
    function printName(greeting){
    name = 'hemant';
    console.log(`${greeting} ${this.name`});
    }

    printName.apply(person,Hello) // it gonna gave us error why ?              * Wrong 
    printName.apply(person,[Hello]) // the second parameter has to be an array * Right way
```



## What are the scenerio we gonna use it ?

## is there any pros on using this function ?