package utils;

public class Voiture {

	String marque = "";
	String vitesse = "";
	String puissance = "";
	
	public Voiture ( String marque, String vitesse, String puissance) {
		this.marque = marque;
		this.vitesse = vitesse;
		this.puissance = puissance;
}
	public String toString() {
		return "Marque : "+marque+ " Vitesse de : "+vitesse+ " avec une puissance de "+puissance;
				}
}
