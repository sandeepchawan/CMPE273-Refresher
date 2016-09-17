// Valid numbers must start with +91 and must contain exactly 10 digits. 
// Valid 10-digit Indian phone numbers as of today, start with a 9 or 8 or 7.
// Hence the first digit after +91 must be 9 or 8 or 7

var pattern = /^(\+91)([7-9])\d{9}$/
	
var number1 = "+919441235412";
var number2 = "+916775556765";

console.log(number1+ " is " + (pattern.test(number1) ? "valid" : "invalid"));
console.log(number2+ " is " + (pattern.test(number2) ? "valid" : "invalid"));