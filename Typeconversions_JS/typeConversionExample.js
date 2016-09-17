var bankBalance = 100;

function withdrawMoney(money) {
	if (bankBalance) {  //Automatic typeConversion to boolean true/false
		console.log("Successfully withdrew $" + money );
		bankBalance -= money;
		console.log("Available Bank Balance is $" + bankBalance);
	} 
} 

withdrawMoney(10);
withdrawMoney(30);
withdrawMoney(30);