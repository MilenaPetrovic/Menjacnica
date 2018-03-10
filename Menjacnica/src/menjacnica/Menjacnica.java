package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.menjacnicaInterfejs;

public class Menjacnica implements menjacnicaInterfejs{
	LinkedList<Valuta> kursnaLista = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(Valuta valuta) {
		if(valuta == null)
			throw new RuntimeException("Morate uneti valutu");
		
		if(kursnaLista.contains(valuta))
			throw new RuntimeException("Uneta valuta postoji u kursnoj listi");

		kursnaLista.add(valuta);
	}

	@Override
	public void obrisiKurs(Valuta valuta) {
		if(!kursnaLista.contains(valuta))
			throw new RuntimeException("Uneta valuta ne postoji u kursnoj listi");
		
		kursnaLista.remove(valuta);
	}

	@Override
	public Valuta pronadjiKurs(String naziv, GregorianCalendar datum) {
		for(int i = 0; i < kursnaLista.size(); i++)
			if(kursnaLista.get(i).getNaziv().equals(naziv) && kursnaLista.get(i).getDatum().equals(datum))
				return kursnaLista.get(i);
		throw new RuntimeException("U kursnoj listi ne postoji kurs za unetu valutu i datum");
	}

}
