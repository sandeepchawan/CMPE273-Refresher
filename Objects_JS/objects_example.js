function item(name, mrp, tax) {
	this.name = name;
	this.mrp = mrp;
	this.tax = tax;
}

item.prototype = {
		constructor:item,
		getName: function(){
			return this.name;
		},
		getMrp: function(){
			return this.mrp;
		},
		sellingPrice: function(){
			return this.mrp + (this.mrp*this.tax/100);
		},
}

var soap = new item("dove", 2, 5);
console.log("Item name: " + soap.name);
console.log("MRP of " + soap.getName() + ": $" + soap.mrp);
console.log("Selling Price of " + soap.getName() + "(after adding taxes): $" + soap.sellingPrice());

