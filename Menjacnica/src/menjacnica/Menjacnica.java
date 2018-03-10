package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.menjacnicaInterfejs;
import valuta.Valuta;

public class Menjacnica implements menjacnicaInterfejs{
	LinkedList<Valuta> kursnaLista = new LinkedList<Valuta>();
	
	@Override
	public void dodajKurs(Valuta valuta) {
		kursnaLista.add(valuta);
	}

	@Override
	public void obrisiKurs(Valuta valuta) {
		kursnaLista.remove(valuta);
	}

	@Override
	public Valuta pronadjiKurs(String naziv, GregorianCalendar datum) {
		for(int i = 0; i < kursnaLista.size(); i++)
			if(kursnaLista.get(i).getNaziv().equals(naziv) && kursnaLista.get(i).getDatum().equals(datum))
				return kursnaLista.get(i);
		throw new RuntimeException("U kursnoj listi ne postoji kurs za unet naziv valute i datum");
	}

}
