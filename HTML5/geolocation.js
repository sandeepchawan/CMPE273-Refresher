var currentLoc = document.getElementById("currLoc");

function getLoc() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(displayPosition, catchError);
    } else {
        currentLoc.innerHTML = "Your browser doesnt support this.";
    }
}

function displayPosition(position) {
    var latitude = position.coords.latitude;
    var longitude = position.coords.longitude;
    var accuracy = position.coords.accuracy;
    currentLoc.innerHTML = "Your coordinates are "+ latitude +"," + longitude +" with accuracy "+accuracy;

    var map_loc = "http://maps.googleapis.com/maps/api/staticmap?center="
    +latitude+","+longitude+"&zoom=14&size=400x300&sensor=false";
    document.getElementById("mapPlace").innerHTML = "<img src='"+map_loc+"'>";
}

function catchError(err) {
    switch(err.code) {
        case err.PERMISSION_DENIED:
            currentLoc.innerHTML = "Permission denied by user"
            break;
        case err.POSITION_UNAVAILABLE:
            currentLoc.innerHTML = "Location information is unavailable."
            break;
        case err.TIMEOUT:
            currentLoc.innerHTML = "Timed out!"
            break;
        case err.UNKNOWN_ERROR:
            currentLoc.innerHTML = "An unknown err occurred."
            break;
    }
}