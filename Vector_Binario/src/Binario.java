import java.util.Vector;

public class Binario {
	private Vector N;
	
	public Binario() {
		N = new Vector();
	}
	
	public void Converti(int n) {
		int x;
		while(n!=0) {
			x = n%2;
			N.add(x);
			n = n/2;
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
