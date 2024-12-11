package gestioneRegistroStudenti;

import java.util.Scanner;

public class Main {
	
	
	/* Gestione di un Registro di Studenti
Creare un programma Java che consenta di gestire un registro degli studenti. Il programma deve:

Registrare nuovi studenti con:
Nome,
Cognome,
Matricola (univoca).
Visualizzare l'elenco degli studenti.
Cercare uno studente tramite la matricola.
Requisiti Tecnici:
Creare una classe Studente con i campi necessari.
Utilizzare un ArrayList per memorizzare gli studenti.
Creare un menu testuale che permetta all'utente di:

Aggiungere uno studente.
Visualizzare tutti gli studenti.
Cercare uno studente per matricola.
Uscire dal programma */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		RegistroStudenti registro = new RegistroStudenti(); //creo l'oggetto registro
		
		int inizioCiclo = 0;
		while (inizioCiclo == 0) {
			System.out.println("BENVENUTO/A nel registro degli studenti interattivo! Scegli un'opzione del menù selezionando:"
					+ "\n1) Per aggiungere uno studente\n2) Per cercare uno studente\n3) Per visualizzare l'elenco degli studenti"
					+ "\n4) Per uscire dal menù");
			int inputUtente = scanner.nextInt();
			scanner.nextLine(); //per evitare l'errore che lo scanner salti un input
			
			switch (inputUtente) {
			
			case 1: 
				
				System.out.println("Inserisci il nome: ");
				String nome = scanner.nextLine();
				System.out.println("Inserisci il cognome: ");
				String cognome = scanner.nextLine();
				System.out.println("Inserisci la matricola: ");
				String matricola = scanner.nextLine();
				
				/*registro.controllaMatricolaEsistente(matricola);
				non sono riuscita ad implementare questa funzione tramite l'apposito metodo evitando di andare avanti comunque
				con l'aggiunta dello studente*/
				
				Studente studente = new Studente(nome, cognome, matricola); //passo all'oggetto studente i valori inseriti dall'utente
				registro.aggiungiStudente(studente);	//aggiungo all'arraylist studenti della classe registroStudenti
			break;
			
			case 2:
				
				System.out.println("Inserisci la matricola dello studente che vuoi cercare: ");
				String matricolaId = scanner.nextLine();
				registro.cercaStudente(matricolaId); //passo al metodo 'cercaStudente' della classe RegistroStudenti il valore inserito dall'utente
			break;
			
			case 3:
				
				registro.visualizzaElencoStudenti();
			break;
			
			case 4: 
				
				System.out.println("Sei uscito/a dal menù.");
			break;
			
			default:
				System.out.print("Input errato.");
			}
		}
		
		scanner.close();
	}
}


