package de.java2enterprise.bmi;
import de.java2enterprise.bmi.controller.BMIRechner;
import de.java2enterprise.bmi.model.Fisch;
import de.java2enterprise.bmi.model.Katze;
import de.java2enterprise.bmi.model.Lebewesen;

public class App {

	public static void main(String[] args) {
		BMIRechner bmiRechner = new BMIRechner();
		
		Lebewesen[] lebewesen = new Lebewesen[3];
		
		lebewesen[0] = new Katze();
		lebewesen[0].setName("Pinki");
		lebewesen[0].setGewicht(6.0);
		lebewesen[0].setGroesse(0.51);
		lebewesen[0].isst();
		lebewesen[0].isst();
		lebewesen[0].isst();
		System.out.println(lebewesen[0].getName());
		System.out.println(lebewesen[0].getGewicht());
		System.out.println(lebewesen[0].getGroesse());
		double bmi0 = bmiRechner.rechne(lebewesen[0]);
		System.out.println(bmi0);

		lebewesen[1] = new Katze();
		lebewesen[1].setName("Flo");
		lebewesen[1].setGewicht(5.2);
		lebewesen[1].setGroesse(0.5);
		lebewesen[1].isst();
		((Katze)lebewesen[1]).spielt();
		lebewesen[1].isst();
		((Katze)lebewesen[1]).spielt();
		System.out.println(lebewesen[1].getName());
		System.out.println(lebewesen[1].getGewicht());
		System.out.println(lebewesen[1].getGroesse());
		double bmi1 = bmiRechner.rechne(lebewesen[1]);
		System.out.println(bmi1);
		
		lebewesen[2] = new Fisch();
		lebewesen[2].setName("Peter");
		lebewesen[2].setGewicht(0.005);
		lebewesen[2].setGroesse(0.01);
		lebewesen[2].isst();
		lebewesen[2].isst();
		System.out.println(lebewesen[2].getName());
		System.out.println(lebewesen[2].getGewicht());
		System.out.println(lebewesen[2].getGroesse());
		double bmi2 = bmiRechner.rechne(lebewesen[2]);
		System.out.println(bmi2);
		
		System.out.println("Anzahl der Berechnungen: " + BMIRechner.zähler);
	}

}
