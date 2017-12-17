
class BMIRechner {
	double rechne(Katze katze) {
		double bmi = katze.gewicht / (katze.groesse * katze.groesse);
		return bmi;
	}
}
