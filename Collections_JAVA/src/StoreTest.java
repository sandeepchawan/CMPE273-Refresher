import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class StoreTest {

	HashMap<Integer, Store> store_map = new HashMap<Integer,Store>();
	
	@Before
	public void init() {
		store_map.put(1, new Store(1,"cookie", "snacks", 1.5));
		store_map.put(2, new Store(2,"cake", "bakery", 10.5));
		store_map.put(3, new Store(3,"choc", "sweet", 2.99));
	}
	
	@Test
	public void mapShouldContainKeyAfterInsertion() {
		assertTrue("Contains Key 1", store_map.containsKey(1));
	}
	
	@Test
	public void mapShouldNotContainKeyAfterDeletion() {
		store_map.remove(1);
		assertFalse("Contains Key 1", store_map.containsKey(1));
	}
	
	@Test
	public void itemDetailsMustBeInsertedCorrectly() {
		//Check if item_name has been inserted correctly
		assertEquals("Item Name is correct", "cookie", store_map.entrySet().iterator().next().getValue().getName());
	}

	
	@Test
	public void mapShouldBeEmptyAfterDeletionOfAllKeys() {
		store_map.remove(1);
		store_map.remove(2);
		store_map.remove(3);
		assertTrue("Map is Empty", store_map.isEmpty());
	}

}
