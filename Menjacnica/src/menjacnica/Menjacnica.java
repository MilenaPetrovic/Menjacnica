package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejs.menjacnicaInterfejs;
import valuta.Valuta;

public class Menjacnica implements menjacnicaInterfejs{

	@Override
	public void dodajKurs(Valuta valuta, GregorianCalendar datum) {
				
	}

	@Override
	public boolean obrisiKurs(Valuta valuta, GregorianCalendar datum) {
		
		return false;
	}

	@Override
	public Valuta pronadjiKurs(Valuta valuta, GregorianCalendar datum) {
		
		return null;
	}

}
