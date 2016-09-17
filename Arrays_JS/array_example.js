var library = [];

library.push("Two-states");
library.push("Dooms-day");
library.push("Seven-habits");
library.push("Game-of-thrones");

console.log("Books in the library: ");
print_array(library);

function print_array(array) {
	for (i=0; i<array.length; i++)
		console.log(array[i]);

}

library.sort();
console.log("Books in the library after sorting: ");
print_array(library);

console.log("Removing book: '"+ library.shift() + "' from the library");
console.log("Books remaining in the library after removal: ");
print_array(library);