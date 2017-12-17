package de.java2enterprise.bmi;
import de.java2enterprise.bmi.controller.BMIRechner;
import de.java2enterprise.bmi.model.Katze;

public class App {

	public static void main(String[] args) {
		BMIRechner bmiRechner = new BMIRechner();
		
		Katze[] katze = new Katze[2];
		katze[0] = new Katze();
		katze[0].setName("Pinki");
		katze[0].setGewicht(6.0);
		katze[0].setGroesse(0.51);
		katze[0].isst();
		katze[0].isst();
		katze[0].isst();
		System.out.println(katze[0].getName());
		System.out.println(katze[0].getGewicht());
		System.out.println(katze[0].getGroesse());
		double bmi0 = bmiRechner.rechne(katze[0]);
		System.out.println(bmi0);

		katze[1] = new Katze();
		katze[1].setName("Flo");
		katze[1].setGewicht(5.2);
		katze[1].setGroesse(0.5);
		katze[1].isst();
		katze[1].spielt();
		katze[1].isst();
		katze[1].spielt();
		System.out.println(katze[1].getName());
		System.out.println(katze[1].getGewicht());
		System.out.println(katze[1].getGroesse());
		double bmi1 = bmiRechner.rechne(katze[1]);
		System.out.println(bmi1);
	}

}
