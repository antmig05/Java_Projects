import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    
	        int n=0,scelta=0;
	        Object dato=0;
	        Scanner x = new Scanner(System.in);
	        do
	        {
	            System.out.print("QUANTI ELEMENTI VUOI INSERIRE? ");
	            n=x.nextInt();
	        }while(n<=0||n>=10);
	        
	        //Stack <String> s = new Stack<>(n);
	        //Stack <Double> s = new Stack<>(n);
	        //Stack <Float> s = new Stack<>(n);
	        Stack <Integer> s = new Stack<>(n);
	        
	        do{
	            
	           try{
	                scelta=0;
	                System.out.println("[1]OPERAZIONE PUSH");
	                System.out.println("[2]OPERAZIONE POP");
	                System.out.println("[3]OPERAZIONE PEEK");
	                System.out.println("[4]STAMPA CONTENUTO STACK");
	                System.out.println("[5]ESCI");
	                System.out.print("FAI LA TUA SCELTA: ");
	                scelta = x.nextInt();
	             }catch(InputMismatchException e){
	                 System.out.println("VALORE NON VALIDO");
	                 x.next(); //questo serve per evitare che il try catch vada in loop
	            } 
	            
	            switch(scelta)
	            {
	                
	                case 1:
	                    if(!s.stack_full())
	                    {
	                        System.out.print("INSERISCI IL DATO: ");
	                        dato = x.nextInt();
	                        s.stack_push((int)dato);
	                    }
	                    else
	                        System.out.println("STACK PIENO ESTRAI QUALCHE DATO PRIMA");
	                break;
	                
	                case 2:
	                    if(!s.stack_empty())
	                        System.out.println(s.stack_pop());
	                    else
	                        System.out.println("STACK VUOTO INSERISCI QUALCHE DATO PRIMA");
	                break;
	                
	                case 3:
	                    if(!s.stack_empty())
	                        System.out.println(s.stack_peek());
	                    else
	                        System.out.println("STACK VUOTO INSERISCI QUALCHE DATO PRIMA");
	                break;
	                
	                case 4:
	                    if(!s.stack_empty())
	                        s.print_stack();
	                    else
	                        System.out.println("STACK VUOTO INSERISCI QUALCHE DATO PRIMA");    
	                    
	                break;
	                
	                case 5:
	                    
	                break;
	                
	                default:
	                    System.out.println("LE SCELTE POSSIBILI VANNO DA 1-5");
	                
	            }
	       
	       
	        
	        
	        }while(scelta!=5);
	       
	        
	        
	    
	}

}
