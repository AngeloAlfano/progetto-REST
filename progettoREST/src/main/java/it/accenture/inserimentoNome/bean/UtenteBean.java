package it.accenture.inserimentoNome.bean;

//@Entity
// Classe che definisce le proprietà dell'utente -> CLASSE BEAN
public class UtenteBean {

	private String nome;
	private String cognome;
	private int id;
	private int altezza;
	private int peso;
	private int eta;

	// Embedded specifica un attributo persistente il cui valore è istanza di
	// una classa @Embeddable
	// @Embedded
	private IndirizzoUtenteBean indirizzo;

	// Metodo costruttore di base
	public UtenteBean() {
	}

	public UtenteBean(String nome, String cognome, int id, IndirizzoUtenteBean indirizzo, int peso, int altezza,
			int eta) {

		super();
		this.nome = nome;
		this.cognome = cognome;
		this.id = id;
		this.indirizzo = indirizzo;
		this.peso = peso;
		this.altezza = altezza;
		this.eta = eta;
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

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int peso) {
		this.eta = eta;

	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	@Override
	public String toString() {
		return "UtenteBean [nome=" + nome + ", cognome=" + cognome + ", id=" + id + ", altezza=" + altezza + ", peso="
				+ peso + ", eta=" + eta + ", indirizzo=" + indirizzo + "]";
	}

}
