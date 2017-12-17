
/*
 * Errechnung des BMI-Wertes
 * bmi = Körpergewicht / Körpergröße ²
 */
class App7 {

	public static void main(String[] args) {
		float gewicht = 6.0f;
		float groesse = .51f;
		float bmi = gewicht / (groesse * groesse);
		System.out.printf(
			"Das Gewicht %.1f kg und die Größe %.1f m ergeben den BMI-Wert %.1f", gewicht, groesse, bmi);

		int i = (bmi >= 25) ? 1 : ((bmi < 18) ? -1 : 0);
		switch(i) {
		case 0:
			System.out.println("\nPinkis Gewicht ist normal.");
			break;
		case 1:
			System.out.println("\nPinkis ist übergewichtig.");
			break;
		case -1:
			System.out.println("\nPinki ist untergewichtig.");
			break;
		default:
			System.out.println("\nSchiefgelaufen.");
			break;
		}
	}

}
