const numbers = [1, 2, 3, 4, 5];

numbers.forEach((num, index, array) => {
  array[index] = num * 2;
});

console.log(numbers);