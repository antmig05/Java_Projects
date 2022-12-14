import java.util.Iterator;
import java.util.Vector;

public class Coda <C>{
	private Vector <C> q;
	private Iterator i;
	
	public Coda() {
		q = new Vector();
		i = q.iterator();
	}
	
	public void Insert(C n) {
		q.add(n);
	}
	public C remove() {
		return q.remove(0);
	}
	
	public void Stampa() {
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("FINE CODA");
	}
}
