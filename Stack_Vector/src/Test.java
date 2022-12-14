import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Stack_Vector s = new Stack_Vector();
		Object dato;
		/*Stack_Vector <Integer> s = new Stack_Vector<>();
		 Stack_Vector <Double> s = new Stack_Vector<>();
		 Stack_Vector <String> s = new Stack_Vector<>();
		 Stack_Vector <Float> s = new Stack_Vector<>();*/
		int scelta = 0;
		do {
			System.out.println("*****STACK*****");
			System.out.println("[1]PUSH");
			System.out.println("[2]POP");
			System.out.println("[3]PRINT");
			System.out.println("[4]ESCI");
			scelta = in.nextInt();
			
			switch(scelta) {
			case 1: 
				System.out.print("Inserisci un dato:");
				dato = in.next();
				s.push(dato);
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.Stampa();
				break;
			default:
					break;
			}
		}while(scelta!=4);
		
	}

}
