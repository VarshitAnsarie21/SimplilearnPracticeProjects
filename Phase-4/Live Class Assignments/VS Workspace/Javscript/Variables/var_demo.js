var age = 34;
console.log("age: " + age);

{
  age = 56;
}

console.log("age inside the block: " + age);

// ------------------let -----------------

let marks = 78;
console.log("Marks: " + marks);

{
  let marks = 34;
  console.log("Marks inside the block: " + marks);
}

console.log("Marks outside the block: " + marks);

//-----------------const ----------------

const marks1 = 99;

console.log("marks: " + marks1);

marks1 = 89;
console.log("marks: " + marks1);
