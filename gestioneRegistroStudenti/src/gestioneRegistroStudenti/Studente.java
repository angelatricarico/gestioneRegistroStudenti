package gestioneRegistroStudenti;

public class Studente {
	
	String nome;
	String cognome;
	String matricola;
	
	
	public Studente (String nome, String cognome, String matricola) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
		
	}
	
	public String matricola () { //per ritornare il valore di matricola nei metodi della classe RegistroStudenti
		return matricola;
	}
	
	public String toString() { //per ritornare una stringa circa i dettagli degli studenti stampati secondo il metodo visualizzaElenco di RegistroStudenti
		return "Nome: " + nome + " " + "cognome: " + cognome + " " + "matricola: " + matricola; 
	}

}
