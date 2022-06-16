package jana60.valutazioni;

import java.util.Random;

public class Main {
	/*
	 * create un array di studenti (i dati degli studenti possono essere chiesti
	 * all’utente oppure inseriti nel codice con dei valori di test). L’id di ogni
	 * studente deve essere univoco nell’array (possiamo usare un numero
	 * progressivo). Il programma deve poi stampare a video per ogni studente se è
	 * stato promosso o bocciato e quanti studenti sono stati promossi in tutto.
	 */

	public static void main(String[] args) {
		Random random = new Random();
		Studente[] studenti = new Studente[5];

		int studentiPromossi = 0;

		for (int i = 0; i < studenti.length; i++) {
			int percAssenze = random.nextInt(101);
			double mediaVoti = random.nextDouble() * 5;
			int idStudente = i + 1;

			studenti[i] = new Studente(idStudente, percAssenze, mediaVoti);

			if (studenti[i].promosso()) {
				System.out.println("Lo studente numero " + idStudente + " è stato promosso");
				studentiPromossi++;
			} else {
				System.out.println("Lo studente numero " + idStudente + " è stato bocciato");
			}
		}

		if (studentiPromossi > 1) {
			System.out.println("Sono stati promossi " + studentiPromossi + " studenti");
		} else {
			System.out.println("È stato promosso " + studentiPromossi + " studente");
		}

	}

}
