package it.polito.tdp.model;

import java.util.*;

public class Dizionario {

	private List <Parola> dizionario ;
	
	public Dizionario() {
		 this.dizionario=new LinkedList<Parola>();
	 }
	
	public void add(String parola, String traduz) {
		boolean flag= false;
		for(Parola p: dizionario) {
			if(p.getParolaAliena().equals(parola)) {
				flag = true;
				p.getTraduzione().add(traduz);
			}
		}
		if(flag==false) {
			dizionario.add(new Parola (parola, traduz));
		}
		
	}
	
	public Collection <String> getTraduzione (String parolaDaTradurre) {
		for(Parola p : dizionario) {
			if(p.getParolaAliena().equals(parolaDaTradurre)) {
				return p.getTraduzione();
			}
		}
		return null;
	}
}
