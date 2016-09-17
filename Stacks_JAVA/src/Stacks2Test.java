import static org.junit.Assert.*;

import org.junit.Test;


public class Stacks2Test {

	@Test
	public void numberOfBulletsLoadedShouldMatchStackSize() {
		Stacks2 my_stack = new Stacks2();
		int no_of_bullets = 10;
		my_stack.load_gun(no_of_bullets);
		assertEquals("Number of Bullets loaded should be", no_of_bullets, my_stack.bullets_stack.size());
	}
	
	@Test
	public void stackMustBeEmptyAfterFiringAllBullets() {
		Stacks2 my_stack = new Stacks2();
		int no_of_bullets = 10;
		my_stack.load_gun(no_of_bullets);
		my_stack.fire(no_of_bullets);
		assertEquals("Stack size should be", 0, my_stack.bullets_stack.size());
	}

}
