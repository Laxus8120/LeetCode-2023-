// const person = {
//     "name": "hemant ",
//     "age" : 14
// }

// for(const key in person){
//     console.log(key); // output ; name age
// }
// //Note; as we use for..in loop in above object person we can iterate the enumberable properties of object like "name" and "age" but we cannot use the 
// // the for...of loop, lets see what will happen.

// const person = {
//     "name": "hemant ",
//     "age" : 14
// }

// for(const key in person){
//     console.log(key); // error : person is not iterable
// }

// // we cannnot do this.

// // but we can iterate over other object such as array, strings, maps, sets.

const arr = [ 1,5,3,4];
const result =[];
for(const key of arr){
    console.log(key)
    result[key] 
}
