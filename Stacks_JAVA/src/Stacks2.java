import java.util.Stack;

public class Stacks2 {

	Stack<Integer> bullets_stack;	
	/**
	 * @param args
	 */
	
	Stacks2() {
		bullets_stack = new Stack<Integer>();
	}
	public void load_gun(int no_of_bullets) {
		for (int i=0; i<no_of_bullets; i++) {
		    bullets_stack.push(i);
		}
		System.out.println("Number of bullets loaded in the gun: "+ bullets_stack.size());
	}
	
	public void fire(int no_of_bullets) {
		System.out.println("Order received to fire " + no_of_bullets + " bullets");
		for (int i=0; i<no_of_bullets; i++) {
			if (!bullets_stack.isEmpty()) {
				bullets_stack.pop();
			} else {
				System.out.println("Could fire only "+ i + " bullets! Reload the gun.");
				break;
			}
		}
		if (!bullets_stack.isEmpty()) {
			System.out.println("Fired "+ no_of_bullets + " bullets!");
			System.out.println("Number of bullets remaining: "+ bullets_stack.size());
		}
	}
	
	public static void main(String[] args) {
		
		Stacks2 machine_gun = new Stacks2();
		machine_gun.load_gun(10);
		machine_gun.fire(6);
		machine_gun.fire(8);
	}

}
