import java.util.Stack;

public class Jars<T> {
	Stack<T> items;
	
	Jars() {
		items = new Stack<T>();
	}
	
	public void add(T t) {
		items.push(t);
	}
	
	public T get() {
		return items.pop();
	}
	
	public void display() {
		System.out.printf("%s \n", items.toString().replaceAll("\\[", "").replaceAll("\\]", ""));
	}
	
	public static void main(String[] args) {
	
		Jars<Integer> jar1 = new Jars<Integer>();
		jar1.items.push(new Integer(1));
		jar1.items.push(new Integer(2));
		jar1.items.push(new Integer(3));
		System.out.printf("Contents in Jar1 are: ");
		jar1.display();
		
		Jars<String> jar2 = new Jars<String>();
		jar2.items.push(new String("abc"));
		jar2.items.push(new String("xyz"));
		jar2.items.push(new String("jkl"));
		System.out.printf("Contents in Jar2 are: ");
		jar2.display();

	}

}
