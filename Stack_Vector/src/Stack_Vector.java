import java.util.Vector;
import java.util.Iterator;

public class Stack_Vector <V> {
	private int max_ele;
	private Vector <V> s;
	
	public Stack_Vector() {
		max_ele = 0;
		s = new Vector();
	}
	
	public void push(V n) {
		s.add(n);
		max_ele++;
	}
	
	public V pop() {
		max_ele--;
		return s.remove(max_ele);
	}
	
	public boolean empty() {
		return s.size()==0;
	}
	
	public void Stampa() {
		Iterator li = s.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("FINE STACK");
	}
}
