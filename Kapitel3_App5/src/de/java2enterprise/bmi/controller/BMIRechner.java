package de.java2enterprise.bmi.controller;
import de.java2enterprise.bmi.model.Katze;

public class BMIRechner {
	public double rechne(Katze katze) {
		double bmi = katze.getGewicht() / (katze.getGroesse() * katze.getGroesse());
		return bmi;
	}
}
