import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Binario n = new Binario();
		System.out.print("Inserisci un numero da convertire: ");
		int x = in.nextInt();
		n.Converti(x);
		n.Stampa();
		n.clear();
	}

}
