function createAdder(a) {
    return function add(b) {
      const sum = a + b;
      return sum;
    }
  }
  const addTo2 = createAdder(2);
  const value = addTo2(5);
  console.log(value)