import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Store {

		int item_id;
		String name;
		String category;
		Double price;
		
		Store(int id, String n, String c, Double p) {
			item_id = id;
			name = n;
			category = c;
			price = p;
		}
		
		public int getItem_id() {
			return item_id;
		}
		public String getName() {
			return name;
		}
		public String getCategory() {
			return category;
		}
		public Double getPrice() {
			return price;
		}
		
		public static void main(String[] args) {
				
			HashMap<Integer, Store> store_map = new HashMap<Integer,Store>();
			store_map.put(1, new Store(1,"cookie", "snacks", 1.5));
			System.out.println("Inserted item 1: cookie into the Map");
			store_map.put(2, new Store(2,"cake", "bakery", 10.5));
			System.out.println("Inserted item 2: cake into the Map");
			store_map.put(3, new Store(3,"choc", "sweet", 2.99));
			System.out.println("Inserted item 3: choc into the Map");
			store_map.put(4, new Store(4,"salt", "grocery", 0.19));
			System.out.println("Inserted item 4: salt into the Map");
			store_map.put(5, new Store(5,"facewash", "beauty", 4.79));
			System.out.println("Inserted item 5: facewash into the Map");
			store_map.put(6, new Store(6,"towel", "clothing", 7.99)) ;
			System.out.println("Inserted item 6: towel into the Map");
			
			System.out.println("Displaying the List of items in the Store:");
			Set<Map.Entry <Integer, Store>> entrySet = store_map.entrySet();
			Iterator<Map.Entry<Integer, Store>> iter = entrySet.iterator();
			while (iter.hasNext()) {
				Map.Entry<Integer, Store> entry = iter.next();
				System.out.println("Item-ID is- "+ entry.getKey() + " Name is- "+ entry.getValue().getName() + 
						" Category is- "+ entry.getValue().getCategory() + " Price is- $"+entry.getValue().getPrice());
			}

		}
}

