import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		
		ArrayList<Dokument> lista= new ArrayList<Dokument>();
		Dokument dokument= new Dokument("dok1","tresc");
		Dokument dokument1= new Dokument("dok2","tresc");
		Dokument dokument2= new Dokument("dok3","tresc");
		lista.add(dokument);
		lista.add(dokument1);
		lista.add(dokument2);
		Ramka mojaRamka= new Ramka(lista);
		mojaRamka.setVisible(true);
	}

	
}
