import java.io.*;
import java.util.Scanner;

public class Leggi_Scrivi {

	private String leggi = "IO/input.txt";
	private String scrivi = "IO/out.txt";
	
	public void LeggiScrivi() throws IOException{
		Scanner scan =null;
		File inputFile=new File(leggi); //crea variabile di tipo file collegata a input
		File outFile=new File(scrivi); //crea variabile di tipo file collegata a output
		
		FileWriter scr=new FileWriter(outFile); //crea variabile che permette di scrivere collegato alla variabile file out
		
		BufferedWriter bscr = new BufferedWriter(scr); //crea buffer che serve a scrivere collegato al FileWriter
		
		scan = new Scanner(inputFile); //Scanner collegato all'input
		String Line;
			while(scan.hasNextLine()) {  //finisce quando non trova più nulla
				Line=scan.nextLine();
				Line=Line.toUpperCase();
				
				bscr.write(Line); //scrive nel file
				bscr.newLine(); //nuova riga
			}
			bscr.close();
				if(scan!=null)
					scan.close();
	}
	

}
