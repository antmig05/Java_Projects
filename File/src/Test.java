import java.io.*;
public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Leggi_Scrivi a=new Leggi_Scrivi();
		try {
		a.LeggiScrivi();
		}
		catch(Exception ex) {      //Exception è eccezione in generale
			System.out.println(ex.toString()); //eccezione catturata da ex
		}
		
	}

}
