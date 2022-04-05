//------------- Example 1: Create Multiple Objects with Constructor Function---------------
//In JavaScript, you can create multiple objects from a constructor function.

// constructor function
function Person () {
    this.name = 'John',
    this.age = 23,

     this.greet = function () {  // function expression
        console.log('hello');
    }
}

// create objects
const person1 = new Person();
const person2 = new Person();

// access properties
console.log(person1.name);  // John
console.log(person2.name);  // John -----------

// constructor function
function Person1 () {
    this.name = 'John',
    this.age = 23
}

// create an object
const person = new Person1();



//-------------Example 2: JavaScript Constructor Function Parameters -------------------
//You can also create a constructor function with parameters. For example,

// constructor function
function Person3 (person_name, person_age, person_gender) {

   // assigning  parameter values to the calling object
    this.name = person_name,
    this.age = person_age,
    this.gender = person_gender,

    this.greet = function () {
        return ('Hi' + ' ' + this.name);
    }
}


// creating objects
const person3 = new Person3('John', 23, 'male');
const person4 = new Person3('Sam', 25, 'female');

// accessing properties
console.log(person3.name); // "John"
console.log(person4.name); // "Sam"



//--------------Example 3: Adding Properties And Methods in an Object----------------
//You can add properties or methods in an object like this:

// constructor function
function Person4 () {
    this.name = 'John',
    this.age = 23
}

// creating objects
let person5 = new Person4();
let person6 = new Person4();

// adding property to person1 object
person5.gender = 'male';

// adding method to person1 object
person5.greet = function () {
    console.log('hello');
}

person6.greet();   // hello

// Error code person2 doesn't have greet() method
person6.greet();



//----------------------Example 4: JavaScript Object Prototype---------------------
//You can also add properties and methods to a constructor function using a prototype. For example,

// constructor function
function Person5 () {
    this.name = 'John',
    this.age = 23
}

// creating objects
let person7 = new Person5();
let person8 = new Person5();

// adding new property to constructor function
Person.prototype.gender = 'Male';

console.log(person7.gender); // Male
console.log(person8.gender); // Male

//-------------Passing any Number of argument to function ------------------

function add(){
    let sum= 0

    for(let i=0; i< arguments.length; i++){
        sum = sum + arguments[i]
    }

    return sum
}

console.log(add(1,2))
console.log(add(1,2,3,4,5))
console.log(add(3,5,7))
console.log(add(3,4,5,6,7,8,9))