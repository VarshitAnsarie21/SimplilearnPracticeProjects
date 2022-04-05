//----------------Example 1:---------------
const message = "ball bat";

// replace the first b with c
let result = message.replace('b', 'c');
console.log(result);


//-------------Example 2: Replace the first occurrence-------------
const text = "Java is awesome. Java is fun."

// passing a string as the first parameter
let pattern = "Java";
let new_text = text.replace(pattern, "JavaScript");
console.log(new_text);

// passing a regex as the first parameter
pattern = /Java/;
new_text = text.replace(pattern, "JavaScript");
console.log(new_text);


//---------------Example 3: Replace all occurrences---------------
//To replace all occurrences of the pattern, you need to use a regex with a g switch (global search). 
//For example, /Java/g instead of /Java/.

const text1 = "Java is awesome. Java is fun."

// notice the g switch in the regex pattern
const pattern1 = /Java/g;
const new_text1 = text.replace(pattern1, "JavaScript");
console.log(new_text1);


//---------------Example 4: Replace Without Considering Uppercase/Lowercase----------
/*  The replace() method is case sensitive. To perform the case-insensitive replacement, you need to use a 
regex with an i switch (case-insensitive search).  */

const text2 = "javaSCRIPT JavaScript"

// the first occurrence of javascript is replaced
const pattern2 = /javascript/i;  // case-insensitive search
const new_text2 = text.replace(pattern2, "JS");
console.log(new_text2)  // JS JavaScript

// all occurrences of javascript is replaced
const pattern3 = /javascript/gi;  // case-insensitive and global search
const new_text3 = text.replace(pattern3, "JS");
console.log(new_text3)  // JS JS



//-------------Example 5: Passing Function as a Replacement--------------------
//You can also pass a function (instead of a string) as the second parameter to the replace() method.

const text3 = "Random digit: 3"

// generate a random digit between 0 and 9
function generateRandomDigit() {
  return Math.floor(Math.random() * 10)
}

// regex to match a digit
const pattern4 = /\d/;

const new_text4 = text.replace(pattern4, generateRandomDigit);
console.log(new_text4)