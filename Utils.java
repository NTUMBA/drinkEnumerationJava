package distribuerBoissonVersionEnum.distributeur;

import java.util.Scanner;

public class Utils {

	//ATTRIBUT
	private Boissons boisson;

	// Methode pour afficher les boissons disponibles et leur prix respectif
	public void getInfo() {
		switch (boisson) {

		case CAFE:
			boisson.AfficherNomEtPrix();
			break;
		case THE:
			boisson.AfficherNomEtPrix();
			break;
		case EAU:
			boisson.AfficherNomEtPrix();
			break;
		case CHOCOLAT:
			boisson.AfficherNomEtPrix();
			break;
		}
	}
	// SETTER
	public void setboisson(Boissons boisson) {
		this.boisson = boisson;
	}
	// Methode qui contraint le user a ecrire un nombre entier
	public static int readIntBoisson(Scanner clavier, String prompt) {
		System.out.println(prompt);
		while (!clavier.hasNextInt()) {
			System.out.println("Erreur de saisi veuillez recommencer");
			clavier.nextLine();
		}
		final int input = clavier.nextInt();
		clavier.nextLine();// Vidage buffer
		return input;
	}
	// Methode qui contraint le user a ecrire un nombre reel pour payer la boisson
	public static float readFloatPaye(Scanner scanpaye, String prompt) {
		System.out.println(prompt);
		while (!scanpaye.hasNextFloat()) {
			System.out.println("Erreur de saisi veuillez recommencer");
			scanpaye.nextLine();
		}
		final float input = scanpaye.nextFloat();
		scanpaye.nextLine();// Vidage buffer
		return input;
	}
	//Methode qui calcule la différence 
	public static void rendreMonnaie(float cout, float paye) {
		System.out.printf("%.2f", (paye - cout));
	}

}
