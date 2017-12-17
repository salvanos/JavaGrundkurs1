
public class BMIRechner {
	public double rechne(Katze katze) {
		double bmi = katze.gewicht / (katze.groesse * katze.groesse);
		return bmi;
	}
}
