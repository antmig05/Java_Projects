import java.util.Vector;

public class Esadecimale {
	private Vector N;
	
	public Esadecimale() {
		N = new Vector();
	}
	
	public void Converti(int n) {
		int x;
		while(n!=0) {
			x = n%16;
			if(x>=10) {
				switch(x) {
				case 10:
					N.add('A');
					break;
				case 11:
					N.add('B');
					break;
				case 12:
					N.add('C');
					break;
				case 13:
					N.add('D');
					break;
				case 14:
					N.add('E');
					break;
				case 15:
					N.add('F');
				}
			}
			else N.add(x);
			n = n/16;
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
