
public class Coda<V> {
	private int max_ele;
	private int num_ele;
	private V []queue;
	private int front;
	private int back;
	
	public Coda(int n) {
		max_ele = n;
		num_ele = 0;
		queue = (V[]) new Object[n];
		front = 0;
		back = -1;
	}
	
	public void queue_insert(V n) {
		queue[++back] = n;
		num_ele++;
	}
	
	public V queue_remove() {
		num_ele--;
		return queue[front++];
	}
	
	public V queue_peek() {
		return queue[front];
	}
	public boolean empty() {
		return num_ele == 0;
	}
	
	public boolean full() {
		return num_ele == max_ele;
	}
	
	public void print_queue() {
		while(!empty()) {
			System.out.println(queue_remove());
		}
		System.out.println("Fine Coda");
	}
}
