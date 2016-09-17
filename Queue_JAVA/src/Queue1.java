import java.util.Queue;
import java.util.LinkedList;

public class Queue1 {

    public Queue<Integer> passenger_list;
    public int passenger_count;
	/**
	 * @param args
	 */
    Queue1 (int count) {
    	passenger_count = count;
    	passenger_list = new LinkedList<Integer>();
    }
    
    public void board_passengers_on_flight(Queue<Integer> pass_list) {
    	for (int i=1; i<passenger_count+1; i++) {
    		pass_list.add(i);
    		System.out.println("Boarded Passenger:" + i);
    	}
    }
    
    public void deboard_passengers_from_flight(Queue<Integer> pass_list) {
    	for (int i=1; i<passenger_count+1; i++) {
    		pass_list.remove(i);
    		System.out.println("De-boarded PassengeJavar:" + i);
    	}
    }
    
	public static void main(String[] args) {
		Queue1 airline_queue = new Queue1(5);
		airline_queue.board_passengers_on_flight(airline_queue.passenger_list);
		System.out.println("Total number of passengers onboard: "+ airline_queue.passenger_list.size());
		airline_queue.deboard_passengers_from_flight(airline_queue.passenger_list);
	}

}

