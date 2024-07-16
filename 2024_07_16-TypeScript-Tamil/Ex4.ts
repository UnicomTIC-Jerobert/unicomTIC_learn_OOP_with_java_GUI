// TypeScript Objects

//Implicit or Type Inference
let employee = {
    empName: 'Test',
    age: 30,
    isPermanent: true
}

employee.age = 31

//Explicit

type Employee = {
    empName: String, age: number, isPermanent: boolean
}
let employee: {} = {
    empName: 'Test',
    age: 30,
    isPermanent: true
}

//Optional

type Employee = {
    empName: String, age?: number, isPermanent: boolean
}
let employee: Employee = {
    empName: 'Test',
    isPermanent: true,
}