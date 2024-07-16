// TypeScript - any Type

//Basic Types
let empName: any = 'Test'

console.log(empName)
empName = 30
console.log(empName)
empName = true
console.log(empName)

//Array

let anyArray: any[] = [];

anyArray.push('Test')
anyArray.push(3e)
anyArray.push(true)

console.log(anyArray)

//0bject

type Employee = {
    empName: any,
    age: any
}
let employee: Employee;

employee = (empName: 'test', age: 30}

    employee = (empName: 30, age: 'test'}

        console.log(employee)

// null and undefined

//0bject

// null and undefined