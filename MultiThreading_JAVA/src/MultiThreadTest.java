import static org.junit.Assert.*;
import org.junit.Test;

public class MultiThreadTest {

	@Test
	public void testOilIsConsumed() {
		Oil oil = new Oil("Sunflower", 3);
		assertEquals("Consumed Oil", true, oil.consumeOneLitre("consumer"));
	}

	boolean checkThreadTerminated(final Thread t) {
		if (t.getState() == Thread.State.TERMINATED) {
			return true;
		} else {
			return false;
		}
	}

	boolean checkThreadNew(final Thread t) {
		if (t.getState() == Thread.State.NEW) {
			return true;
		} else {
			return false;
		}
	}

	@Test
	public void testThreadsGoesIntoTerminatedState() throws InterruptedException {
		final CookFood cook = new CookFood();
		final Oil oil = new Oil("sunflower", 10);

		Thread dalThread = new Thread(new Runnable()
		{
			public void run() {
				cook.cookDal(oil);
			}
		});

		Thread curryThread = new Thread(new Runnable()
		{
			public void run() {
				cook.cookCurry(oil);
			}
		});

		dalThread.start();
		curryThread.start();

		dalThread.join();
		curryThread.join();

		assertEquals("Thread Waits", true, checkThreadTerminated(dalThread));
		assertEquals("Thread Waits", true, checkThreadTerminated(curryThread));
	}

	@Test
	public void testThreadsStateNew() throws InterruptedException {
		final CookFood cook = new CookFood();
		final Oil oil = new Oil("sunflower", 10);
		
		Thread dalThread = new Thread(new Runnable()
		{
			public void run() {
				cook.cookDal(oil);
			}
		});

		Thread curryThread = new Thread(new Runnable()
		{
			public void run() {
				cook.cookCurry(oil);
			}
		});

		assertEquals("Thread Waits", true, checkThreadNew(dalThread));
		assertEquals("Thread Waits", true, checkThreadNew(curryThread));
	}
}
