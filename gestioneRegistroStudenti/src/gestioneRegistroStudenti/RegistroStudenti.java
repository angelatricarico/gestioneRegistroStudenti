package gestioneRegistroStudenti;

import java.util.ArrayList;

public class RegistroStudenti {
	
	
	ArrayList <Studente> studenti = new ArrayList <Studente> ();
	
	public void aggiungiStudente(Studente studente) {
		
		studenti.add(studente);
		System.out.println("Studente aggiunto con successo!");
		
	}
	
	public void cercaStudente(String matricola) {
		
		for (Studente studente : studenti) {
			if (studente.matricola().equals(matricola)) {
				System.out.println("Studente trovato: " + studente);
			} else {
				System.out.println("Studente non trovato");
			}
		}
		
	}
	
	public void visualizzaElencoStudenti() {
		
		System.out.println("Studenti presenti nel registro: ");
		for (Studente studente : studenti) {
			System.out.println(studente);
		}
	}
	
	public void controllaMatricolaEsistente(String matricola) {
		for (Studente studente : studenti) {
			if (studente.matricola().equals(matricola)) {
				System.out.println("Studente già inserito.");
			}
		}
	}
}
