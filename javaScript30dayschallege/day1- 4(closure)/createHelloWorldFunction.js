// function sum(a,b){
//     console.log('sum called')
//     return a +b;
// } 

// // console.log(typeof(sum()));

// const add = function sum(a,b){  //! if are writing in this format this means we assign a new name to our sum function which is now add.
//     console.log('sum called')
//     return a +b;
// } 

// //todo: console.log(sum(3,4));  // here the type of sum is number because we returning the number;

// //todo: add(); // now here  we can run the function sum but we cannot use the value what sum returning because we are not storing it somehwere.

// const a = add(3,7);
// console.log(a)

// //todo: console.log(typeof(add));  // here type of add is function where we are not calling him as a function.

// //todo: console.log(typeof(add())); // here we call him as function and the type of this is number because it is returning as a function.

// // var createHelloWorld = function() {
// //     console.log('anonymous function called ')
// //     return function() {
// //         return "Hello World"
// //     }
// // };

// // const x = createHelloWorld();
// // console.log(typeof(x()));
// // x(); // * this thing is not going to work because the reutrn type of function is string so we need to called the function and print it.
// // console.log(x())

// //* How iffe work in above code look

// var createHelloWorld = function() {
//     console.log('anonymous function called ')
//     return function() {
//         return "Hello World"
//     }()   //* Here we run him and now the return type is not a function it going to have a value which is string here. 
// };

// const x = createHelloWorld();
// console.log(typeof(x));
// console.log(x)

// sum(3,4);

// const sum = function(a,b){
//     return a+ b
// }

// anonymous function cannot use function hoisting.

// add(3,4);
// console.log(sum)

// const sum = function add(a,b){  // this thing also give error with : add is not defined
//     return a+ b
// }

// sum(3,4);

// function sum(a,b){
//     console.log(a+b)  // only named function are allow to function hoisting.
// }

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

* so