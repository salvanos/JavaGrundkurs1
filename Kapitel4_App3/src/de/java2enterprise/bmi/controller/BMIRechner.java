package de.java2enterprise.bmi.controller;
import de.java2enterprise.bmi.model.Lebewesen;

public class BMIRechner {
	public static int z�hler;
	
	public static double rechne(Lebewesen lebewesen) {
		double bmi = lebewesen.getGewicht() / (lebewesen.getGroesse() * lebewesen.getGroesse());
		z�hler++;
		return bmi;
	}
}
