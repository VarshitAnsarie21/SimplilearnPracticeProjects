let cities = ['Kota', 'Jaipur', "Udaipur"]

console.log(cities)

cities.push("Ajmer")
cities.push("Vadodara")

console.log("After adding two new cities")

console.log("lenght of cities array after adding new citites: "+ cities.length)
console.log(cities)

cities[0] = "Delhi"
cities[1] = "Chennai"
cities[4] = "Kolkata"

cities.pop()
cities.pop()

console.log("After Pop Opertation")

console.log("lenght of cities array: "+ cities.length)
console.log(cities)

//--------------------------------------------------------------------

let arr1 = ['Hello', 'World']
let arr2 = [1,3,9,5,4,9,6]

let arr3 = [...arr1, ...arr2]

console.log(arr3)

let arr4 = ['a', 'j','t', 'r', 'f']

let arr5 = [...arr3, ...arr4]

console.log(arr5)

