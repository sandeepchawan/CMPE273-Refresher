import static org.junit.Assert.*;

import org.junit.Test;


public class JarsTest {

	@Test
	public void testPushAndPopInAStack() {
		Jars<Integer> jar1 = new Jars<Integer>();
		jar1.items.push(new Integer(1));
		assertTrue("Integer popped is 1", jar1.items.pop() == 1);
	}
	
	@Test
	public void objectsShouldBeUniqueToAJar() {
		Jars<Integer> jar1 = new Jars<Integer>();
		jar1.items.push(new Integer(1));
		Jars<String> jar2 = new Jars<String>();
		jar2.items.push(new String("abc"));
		assertNotSame("Both the objects are not same", jar1.items.peek(), jar2.items.peek());
	}

}
