import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Coda c = new Coda();
		Object dato;
		int scelta = 0;
		do {
			System.out.println("***Coda***");
			System.out.println("[1]INSERISCI");
			System.out.println("[2]ELIMINA");
			System.out.println("[3]STAMPA");
			System.out.println("[4]ESCI");
			scelta = in.nextInt();
			switch(scelta) {
			case 1:
				System.out.print("Inserisci il valore: ");
				dato = in.next();
				c.Insert(dato);
				break;
			case 2:
				c.remove();
				break;
			case 3:
				c.Stampa();
				break;
			default:
					break;
			}
		}while(scelta!=4);
	}

}
