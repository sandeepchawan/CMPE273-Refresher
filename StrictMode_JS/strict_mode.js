"use strict";

var employee = Object.defineProperties({}, {
					empID: {
						value:88432,
						writable:false,
						},
					empName: {
						value:"Sandeep",
						writable:true,
					}	
					});

//Trying to change empID, throws a compilation error
//employee.empID = 45321;

console.log("Employee name is " + employee.empName);

employee.empName = "Sandeep Chawan";
console.log("Changed employee name to " + employee.empName);
