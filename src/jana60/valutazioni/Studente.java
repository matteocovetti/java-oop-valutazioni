package jana60.valutazioni;

public class Studente {
	/*
	 * id dello studente (intero), percentuale assenze (intero), media voti (numero
	 * decimale). La classe deve avere un costruttore con parametri e anche un
	 * metodo che calcola, in base a percentuale delle assenze e media dei voti, se
	 * lo studente è promosso o bocciato
	 */

	// attributi
	int idStudente;
	int percAssenze;
	double mediaVoti;

	// costruttore
	public Studente(int idStudente, int percAssenze, double mediaVoti) {
		super();
		this.idStudente = idStudente;
		this.percAssenze = percAssenze;
		this.mediaVoti = mediaVoti;
	}

	// metodi
	boolean promosso() {
		if (percAssenze >= 25 && percAssenze <= 50 && mediaVoti > 2) {
			return true;
		} else if (percAssenze < 25 && mediaVoti >= 2) {
			return true;
		} else {
			return false;
		}
	}
}
