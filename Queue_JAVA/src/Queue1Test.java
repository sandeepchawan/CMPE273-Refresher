import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Queue1Test {

	private Queue1 my_queue;
	private int queue_size = 5;
	
	@Before
	public void init(){
		my_queue = new Queue1(queue_size);
	}
	
	@Test
	public void passengerCountShouldBeSameAsQueueSizeAfterBoarding() {
		my_queue.board_passengers_on_flight(my_queue.passenger_list);		
		assertEquals("Size of Queue must be", my_queue.passenger_count, my_queue.passenger_list.size());
	}

	@Test
	public void queueSizeShouldBeZeroAfterDeboarding() {
		my_queue.board_passengers_on_flight(my_queue.passenger_list);
		my_queue.deboard_passengers_from_flight(my_queue.passenger_list);
		assertEquals("Size of Queue must be", 0, my_queue.passenger_list.size());
	}
}
