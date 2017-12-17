
class App {

	public static void main(String[] args) {
		Katze meineKatze = new Katze();
		meineKatze.name = "Pinki";
		meineKatze.gewicht = 6.0;
		meineKatze.groesse = 0.51;
		System.out.println(meineKatze.name);
		System.out.println(meineKatze.gewicht);
		System.out.println(meineKatze.groesse);
		
		BMIRechner bmiRechner = new BMIRechner();
		double bmi = bmiRechner.rechne(meineKatze);
		System.out.println(bmi);
	}

}
