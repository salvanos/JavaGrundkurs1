
/*
 * Errechnung des BMI-Wertes
 * bmi = Körpergewicht / Körpergröße ²
 */
class App8 {

	public static void main(String[] args) {
		double groesse = .51;
		System.out.println("Gewicht\tGröße\tBMI\tAuswertung");
		for(double gewicht = 4.0; gewicht < 7.0; gewicht = gewicht + 0.2) {
			double bmi = gewicht / (groesse * groesse);
			System.out.printf(
				"%.1f\t%.1f\t%.1f\t", gewicht, groesse, bmi);
	
			int i = (bmi >= 25) ? 1 : ((bmi < 18) ? -1 : 0);
			switch(i) {
			case 0:
				System.out.println("Normal");
				break;
			case 1:
				System.out.println("Übergewichtig");
				break;
			case -1:
				System.out.println("Untergewichtig");
				break;
			default:
				System.out.println("Schiefgelaufen");
				break;
			}
		}
	}

}
