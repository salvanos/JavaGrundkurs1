
/*
 * Errechnung des BMI-Wertes
 * bmi = Körpergewicht / Körpergröße ²
 */
class App3 {

	public static void main(String[] args) {
		float gewicht = 6.0f;
		float groesse = .51f;
		float bmi = gewicht / (groesse * groesse);
		System.out.printf(
			"Das Gewicht %.1f kg und die Größe %.1f m ergeben den BMI-Wert %.1f", gewicht, groesse, bmi);
		boolean übergewichtig = (bmi >= 25);
		System.out.println("\nPinki ist übergewichtig: " + übergewichtig);

	}

}
