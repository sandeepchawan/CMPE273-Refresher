import static org.junit.Assert.*;

import org.junit.Test;

public class MultiThreadTest {
	
	@Test
	public void testOilIsConsumed(){
		Oil oil = new Oil("Sunflower", 3);
		assertEquals("Consumed Oil", true, oil.consumeOneLitre("consumer"));
	}

	@Test
	public void testThreadsJoin(){
	
	}
	
}
