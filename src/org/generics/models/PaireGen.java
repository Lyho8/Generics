package org.generics.models;

public class PaireGen<T> {
	
	private T premier;
	private T second;
	
	public PaireGen(T premier, T second) {
		super();
		this.premier = premier;
		this.second = second;
	}

	public T getPremier() {
		return premier;
	}

	public void setPremier(T premier) {
		this.premier = premier;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}
}
