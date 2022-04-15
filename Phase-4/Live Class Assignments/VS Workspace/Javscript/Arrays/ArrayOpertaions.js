//-----array declaration
let dailyActivities = ['eat', 'sleep']

//-------add element to last position
dailyActivities.push("exercise")

//-------add element to first position i.e zeroth index
dailyActivities.unshift("work")

//-------add element to 2nd index
dailyActivities[2] = "enjoy"

//-------add element to 3rd index
dailyActivities[3] = "walking"

console.log(dailyActivities)

//----------------------------------------------------------------

let dailyActivities1 = ['work', 'eat', 'sleep','exercise']

dailyActivities1.pop()

console.log(dailyActivities1)

const removedElement = dailyActivities1.pop()

console.log(removedElement)
console.log(dailyActivities1)