package it.accenture.inserimentoNome.bean;

public class ProvaBean {
	
	private String string;
	
	public ProvaBean() {
		
	}

	public ProvaBean(String string) {
		super();
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return "ProvaBean [string=" + string + "]";
	}

}
