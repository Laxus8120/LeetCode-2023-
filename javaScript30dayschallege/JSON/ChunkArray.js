// var chunk = function(arr, size) {
//     var result = [];
//     var res = [];
    
//     for (var i = 0; i < arr.length; i++) {
//         if (res.length < size) {
//             res.push(arr[i]); // Add elements to the temporary 'res' array
//         } else {
//             result.push(res.slice(0,size)); // Push a copy of 'res' to 'result'
//             res = []; // Reset 'res' for the next chunk
              
//         }
//     }
    
//     // Push the last chunk if it's not empty
//     if (res.length > 0) {
//         result.push(res);
//     }
    
//     return result;
// };

// var arr = [1, 2, 3, 4, 5];
// var size = 1;
// var result = chunk(arr, size);
// console.log(result); // Output: [[1], [2], [3], [4], [5]]

var size = 1;
var result = [1,2,3]
console.log(result.slice(1,3));
result = [];
console.log(result)