
/*
 * Errechnung des BMI-Wertes
 * bmi = K�rpergewicht / K�rpergr��e �
 */
class App {

	public static void main(String[] args) {
		double gewicht = 6.0;
		double groesse = .51;
		double bmi = gewicht / (groesse * groesse);
		System.out.printf(
			"Das Gewicht %.1f kg und die Gr��e %.1f m ergeben den BMI-Wert %.1f", gewicht, groesse, bmi);

	}

}
