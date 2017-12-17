package de.java2enterprise.bmi.model;

public class Fisch extends Lebewesen {
	
	public void isst() {
		super.gewicht += 0.001;
	}
	
	public void isst(double menge) {
		super.gewicht += menge;
	}
	
}
