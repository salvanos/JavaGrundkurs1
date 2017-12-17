

class App {

	public static void main(String[] args) {
		BMIRechner bmiRechner = new BMIRechner();
		
		Katze[] katze = new Katze[2];
		katze[0] = new Katze();
		katze[0].name = "Pinki";
		katze[0].gewicht = 6.0;
		katze[0].groesse = 0.51;
		System.out.println(katze[0].name);
		System.out.println(katze[0].gewicht);
		System.out.println(katze[0].groesse);
		double bmi0 = bmiRechner.rechne(katze[0]);
		System.out.println(bmi0);

		katze[1] = new Katze();
		katze[1].name = "Flo";
		katze[1].gewicht = 5.2;
		katze[1].groesse = 0.5;
		System.out.println(katze[1].name);
		System.out.println(katze[1].gewicht);
		System.out.println(katze[1].groesse);
		double bmi1 = bmiRechner.rechne(katze[1]);
		System.out.println(bmi1);
	}

}
