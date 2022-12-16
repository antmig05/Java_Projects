import java.util.Vector;
public class Ottale {
	private Vector N;
	
	public Ottale() {
		N = new Vector();
	}
	
	public void Converti(int n) {
		int x;
		while(n!=0) {
			x = n%8;
			N.add(x);
			n = n/8;
		}
	}
	
	public void Stampa() {
		for(int i=N.size()-1;i>=0;i--) {
			System.out.print(N.get(i));
		}
		System.out.println("\nFINE NUMERO");
	}
	
	public void clear() {
		N.clear();
	}
}
