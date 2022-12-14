import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci il numero degli elementi massimi della coda: ");
		int n = in.nextInt();
		Coda <Integer> q = new Coda<>(n);
		int s = 0;
		do {
			System.out.println("[1]INSERISCI");
			System.out.println("[2]RIMUOVI");
			System.out.println("[3]PEEK");
			System.out.println("[4]STAMPA");
			System.out.println("[5]ESCI");
			s = in.nextInt();
			switch(s) {
			case 1:
				System.out.print("Inserisci elemento della coda: ");
				Object x = in.nextInt();
				q.queue_insert((int)x);
				break;
			case 2:
				q.queue_remove();
				break;
			case 3:
				System.out.println(q.queue_peek());
				break;
			case 4:
				q.print_queue();
				break;
			default: 
					s =5;
					break;
			}
		}while(s!=5);
	}

}
