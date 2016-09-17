function Superhero () {}

Superhero.prototype = {
		constructor:Superhero,
		attack: function() {
			if (this.power > 9) {
				console.log(this.name + " is making a ground attack!");
				this.power -= 10;
			} else {
				console.log("No power left, recharge "+ this.name + " !!");
			}
		},
		recharge: function(power) {
			this.power = power;
			console.log("Recharged "+this.name+ " to power: "+power);
		},
		statistics: function() {
			console.log("Statistics for "+this.name+"- "+ "Weapon:"+this.weapon+ " Speed:"+this.speed
					+ " Power:"+this.power);
		}
}

function Ninja(name, weapon, speed, power){
	this.name = name;
	this.weapon=weapon;
	this.speed=speed;
	this.power=power;
};


Ninja.prototype = new Superhero(); //Inheritance

var kuzumi = new Ninja("Kuzumi", "blade", 60, 30);
kuzumi.statistics();
kuzumi.attack();

//Override the attack function
Ninja.prototype.attack = function(){
	if (this.power > 5) {
		console.log(this.name + " can jump and attack!!");
		this.power -= 5;
	} else {
		console.log("No power left, recharge "+ this.name + " !!");
	}
}
console.log("attack function has been replaced!");

var nagato = new Ninja("Nagato", "sword", 90, 60);
nagato.statistics();
nagato.attack();
nagato.recharge(100);
