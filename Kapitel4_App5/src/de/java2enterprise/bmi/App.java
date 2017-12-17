package de.java2enterprise.bmi;
import de.java2enterprise.bmi.controller.BMIRechner;
import de.java2enterprise.bmi.model.Fisch;
import de.java2enterprise.bmi.model.Katze;
import de.java2enterprise.bmi.model.Lebewesen;

public class App {

	public static void main(String[] args) {
		
		Lebewesen[] lebewesen = new Lebewesen[3];
		
		lebewesen[0] = new Katze("Pinki", 6.0, 0.51);
		lebewesen[0].isst();
		lebewesen[0].isst();
		lebewesen[0].isst();
		System.out.println(lebewesen[0].getName());
		System.out.println(lebewesen[0].getGewicht());
		System.out.println(lebewesen[0].getGroesse());
		double bmi0 = BMIRechner.rechne(lebewesen[0]);
		System.out.println(bmi0);
		System.out.println(
			bmi0 >= BMIRechner.BMI_MAX ? "Übergewichtig" :
				(bmi0 < BMIRechner.BMI_MIN ? "Untergewichtig" :
					"Normalgewichtig")
				);

		lebewesen[1] = new Katze("Flo", 5.2, 0.5);
		lebewesen[1].isst();
		((Katze)lebewesen[1]).spielt();
		lebewesen[1].isst();
		((Katze)lebewesen[1]).spielt();
		System.out.println(lebewesen[1].getName());
		System.out.println(lebewesen[1].getGewicht());
		System.out.println(lebewesen[1].getGroesse());
		double bmi1 = BMIRechner.rechne(lebewesen[1]);
		System.out.println(bmi1);
		System.out.println(
				bmi1 >= BMIRechner.BMI_MAX ? "Übergewichtig" :
					(bmi1 < BMIRechner.BMI_MIN ? "Untergewichtig" :
						"Normalgewichtig")
					);
		
		System.out.println("Anzahl der Berechnungen: " + BMIRechner.zähler);
	}

}
