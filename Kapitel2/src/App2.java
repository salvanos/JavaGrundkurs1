
/*
 * Errechnung des BMI-Wertes
 * bmi = K�rpergewicht / K�rpergr��e �
 */
class App2 {

	public static void main(String[] args) {
		float gewicht = 6.0f;
		float groesse = .51f;
		float bmi = gewicht / (groesse * groesse);
		System.out.printf(
			"Das Gewicht %.1f kg und die Gr��e %.1f m ergeben den BMI-Wert %.1f", gewicht, groesse, bmi);

	}

}