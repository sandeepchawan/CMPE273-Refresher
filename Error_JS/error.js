function validateAge() {
	var statusInfo = document.getElementById("status");
	try {
		var dob = document.getElementById("dateID").value;
		var bday = new Date(dob);
		bday.setDate(bday.getDate() + 1);
		var today = new Date();

		if (!bday.valueOf()) {
			alert("Invalid DOB");
			throw "invalid DOB!"
		} 
		
		//Add 18 years to their birthday, and compare 
		//with todays date
		bday.setDate(bday.getDate()+ 18*365);
		
		if (today.getTime() - bday.getTime() < 0) {
			alert("Age is low!");
			throw "age is low!";
		}

		statusInfo.innerHTML = "Congratulations! You will soon be redirected to the next page.";
		}
		catch(error) 
		{
			statusInfo.innerHTML = "Sorry, you cannot proceed further because "+ error;
		}
}