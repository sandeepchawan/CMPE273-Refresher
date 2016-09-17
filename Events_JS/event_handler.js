var submitInfo = document.getElementById("submit");

submitInfo.addEventListener("click", storePersonalInfo);

function storePersonalInfo() {
	var firstname = document.getElementById("fname");
    var lastname = document.getElementById("lname");
    var statusInfo = document.getElementById("status");

    if (firstname.value && lastname.value) {
    	console.log("Storing " + firstname.value + " " + lastname.value + " in DB");
    	statusInfo.innerHTML = "Submitted your information successfully.";
    } else if (!firstname.value){
    	console.log("First Name missing!");
    	statusInfo.innerHTML = "Please enter the first-name and resubmit.";
    } else {
    	statusInfo.innerHTML = "Please enter the last-name and resubmit.";
    	console.log("Last Name missing!");
    }

}