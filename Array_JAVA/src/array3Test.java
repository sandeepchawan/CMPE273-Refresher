import static org.junit.Assert.*;

import org.junit.Test;


public class array3Test {

	@Test
	public void shouldNotAcceptMoreCarsIfLotIsFull() {
		array3 mall_parking = new array3(2);
		mall_parking.park_car("benz");
		mall_parking.park_car("ford");
		assertEquals("Could not park car", false, mall_parking.park_car("Ferrari"));
	}
	@Test
	public void doNotUnparkNonExistentCars() {
		array3 mall_parking = new array3(2);
		mall_parking.park_car("benz");
		mall_parking.park_car("ford");
		assertEquals("Could not unpark car", false, mall_parking.unpark_car("Ferrari"));
	}

}
