package org.generics.services;

import org.generics.models.*;

public class maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paire p = new Paire("abc", "xyz");
		
		String a = (String)p.getPremier();
		System.out.println(a);
		
		//Plante
		//Double x = (Double)p.getSecond();
		
		String x = (String)p.getSecond();
		System.out.println(x);
		
		PaireGen<String> pg = new PaireGen<>("abc", "xyz");
		
		String b = (String)pg.getPremier();
		System.out.println(b);
		
		//Ne compile pas
		//Double y = (Double)pg.getSecond();
		
		String y = (String)pg.getSecond();
		System.out.println(y);
		
		//Truc<? extends Classe> : tout type héritant de Classe, Classe incluse
		//Truc<? super Classe> : tout type dont Classe hérite, Classe incluse

	}

}
