package de.java2enterprise.bmi.model;

public class Katze extends Lebewesen {
	private Ball ball;
	
	public Katze() {
		super();
		System.out.println("Die Katze wird erstellt.");
	}

	public Katze(String name, double gewicht, double groesse) {
		super();
		System.out.println("Die Katze wird erstellt.");
		super.setName(name);
		super.setGewicht(gewicht);
		super.setGroesse(groesse);
	}
	
	public void finalize() {
		System.out.println("Die Katze wird entfernt.");
	}

	public Ball getBall() {
		return ball;
	}

	public void setBall(Ball ball) {
		this.ball = ball;
	}
	
	public void isst() {
		super.gewicht += 0.1;
	}
	
	public void isst(double menge) {
		super.gewicht += menge;
	}
	
	public void spielt() {
		super.gewicht -= 0.1;
	}
}
