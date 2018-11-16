package utils;

public class Voiture {

	String marque = "";
	double vitesse = 0.0;
	int puissance = 0;
	
	public Voiture (String marque, double vitesse, int puissance) {
		this.marque = marque;
		this.vitesse = vitesse;
		this.puissance = puissance;
}
	public String toString() {
		return "Marque : "+this.marque+ " Vitesse de : "+this.vitesse+ " avec une puissance de "+this.puissance;
				}
}
