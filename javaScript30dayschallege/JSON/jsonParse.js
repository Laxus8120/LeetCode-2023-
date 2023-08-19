const jsonString = {
    "name" : "hemant",
    "age" : 12,
    "city" : "barielly"
}

const parseString = JSON.parse(jsonString);

console.log(typeof(parseString));
console.log(typeof(jsonString))