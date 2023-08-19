function fun(name){
    this.name = name;
    this.age = 16

    const arrowFunction = () =>{
        return 'hello'
    }
    this.arrowFunction = arrowFunction;
}

const Fun = new fun('hemant')
console.log(Fun)