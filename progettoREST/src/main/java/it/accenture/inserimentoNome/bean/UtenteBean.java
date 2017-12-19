package it.accenture.inserimentoNome.bean;

//@Entity
// Classe che definisce le proprietà dell'utente -> CLASSE BEAN
public class UtenteBean {

	private String nome;
	private String cognome;
	private int id;
	private int eta;
	// Embedded specifica un attributo persistente il cui valore è istanza di una classa @Embeddable
//	@Embedded 
	private IndirizzoUtenteBean indirizzo;

	//Metodo costruttore di base
	public UtenteBean() {
	}

	public UtenteBean(String nome, String cognome, int id, IndirizzoUtenteBean indirizzo, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.id = id;
		this.indirizzo = indirizzo;
		this.eta=eta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public IndirizzoUtenteBean getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(IndirizzoUtenteBean indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "UtenteBean [nome=" + nome + ", cognome=" + cognome + ", id=" + id + ", eta=" + eta + ", indirizzo="
				+ indirizzo + "]";
	}



}
