public class array3 {

	/**
	 * @param args
	 */
	String[] parking_lot;
	int num_of_empty_slots;
	
	array3(int size_of_parking_lot) {
		parking_lot = new String[size_of_parking_lot];
		for (int i=0; i<parking_lot.length; i++) {
			parking_lot[i] = "";
		}
		num_of_empty_slots = size_of_parking_lot;
	}
	
	public boolean park_car(String car_name) {
		int i=0;
		if (num_of_empty_slots > 0) {
			for(String s: parking_lot) {
				if(s.equals("")) {
					parking_lot[i] = car_name;
					num_of_empty_slots--;
					System.out.println("Car Parked: " + car_name);
					return true;
				}
				i++;
			}
		} else {
			System.out.println("Sorry, parking Lot Full!! " + "Could not park: "+ car_name);
		}
		return false;
	}
	
	public boolean unpark_car(String car_name) {
		// Check if car exists in the lot
		int i=0;
		if (num_of_empty_slots < 10) { 
			for(String s: parking_lot) {
				if(s.equals(car_name)) {
					parking_lot[i] = "";
					num_of_empty_slots++;
					System.out.println("Car Unparked: " + car_name);
					return true;
				}
				i++;
			}
		}
		System.out.println("Car " + car_name + " not found, you are in the wrong Parking Lot!!");
		return false;

	}
	public static void main(String[] args) {
		array3 mall_parking = new array3(4);
		System.out.println("Size of Parking Lot is: "+ mall_parking.parking_lot.length);
		for (int i=0; i<2;i++) {
			mall_parking.park_car("Honda");
			mall_parking.park_car("BMW");
		}
		mall_parking.park_car("Ferrari");
		for (int i=0; i<2;i++) {
			mall_parking.unpark_car("BMW");
			mall_parking.unpark_car("Honda");
		}
		
		mall_parking.unpark_car("Ferrari");
	}

}
