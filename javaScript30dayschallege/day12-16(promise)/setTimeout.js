// const nums = [3,4,2];
// const TimerId  = setTimeout(()=>{
//     nums.push(5);
//     console.log(nums);
// },4000)
// console.log(nums)
// clearTimeout(TimerId)

// debounce doubt
var TimerId = setTimeout(()=>{
    console.log('hello')
},4000)
clearTimeout(TimerId);
