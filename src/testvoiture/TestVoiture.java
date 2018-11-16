package testvoiture;

import utils.Voiture;

public class TestVoiture {

	public static void main(String[] args) {
		Voiture[] tableau = new Voiture[3];
		int i = 0;
		
		tableau[0] = new Voiture("BMW",220,8);
		tableau[1] = new Voiture("Ford", 200, 6);
		tableau[2] = new Voiture("Audi", 240, 8);
		
		for (Voiture voiture : tableau) {
			System.out.println(voiture.toString());
		}
	}

}
