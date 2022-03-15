package it.polito.tdp.model;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Parola {
	private String parolaAliena;
	private List <String> traduzione;
	
	public Parola(String parolaAliena, String traduzione) {
		super();
		this.parolaAliena = parolaAliena;
		this.traduzione = new LinkedList <String> ();
		this.traduzione.add(traduzione);
		
	}

	public String getParolaAliena() {
		return parolaAliena;
	}


	public Collection<String> getTraduzione() {
		return traduzione;
	}
	
	public void addTraduzione(String trad) {
		traduzione.add(trad);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((parolaAliena == null) ? 0 : parolaAliena.hashCode());
		result = prime * result + ((traduzione == null) ? 0 : traduzione.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parola other = (Parola) obj;
		if (parolaAliena == null) {
			if (other.parolaAliena != null)
				return false;
		} else if (!parolaAliena.equals(other.parolaAliena))
			return false;
		if (traduzione == null) {
			if (other.traduzione != null)
				return false;
		} else if (!traduzione.equals(other.traduzione))
			return false;
		return true;
	}
	
	
	
}
