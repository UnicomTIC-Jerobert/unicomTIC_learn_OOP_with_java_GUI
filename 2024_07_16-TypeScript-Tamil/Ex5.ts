// TypeScript - Union Types

//More than one Type - union type

// Union Type - OR - '|'

//implicit or Type Inference

let unionArray = ['one', 1, true]

unionArray.push('two')
unionArray.push(2)
unionArray.push(false)
console.log(unionArray)

//Explicit

let errorCode: (string | number);

errorCode = '401'
errorCode = 401

let unionArray: (string | number | boolean)[] = []