function tvRemote (tv, type) {
	this.tv = tv;
	this.type = type;
}

tvRemote.prototype.increaseVolume = function () {
	console.log("Increased volume");
}

tvRemote.prototype.decreaseVolume = function () {
	console.log("Decreased volume");
}

tvRemote.prototype.changeChannel = function (number) {
	console.log("Changed channel to number " + number);
}

var sonytv = new tvRemote("sony", "lcd");
sonytv.increaseVolume();
sonytv.changeChannel(35);