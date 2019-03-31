package distribuerBoissonVersionEnum.distributeur;

import java.util.Scanner;


public class Distributeur {

	public static void main(String[] args) {

		Utils  util = new Utils();

		util.setboisson(Boissons.CAFE);// espace de nom (naspace) = Boissons
		util.getInfo();
		util.setboisson(Boissons.THE);
		util.getInfo();
		util.setboisson(Boissons.EAU);
		util.getInfo();
		util.setboisson(Boissons.CHOCOLAT);
		util.getInfo();

		Scanner clavier = new Scanner(System.in);	

		String boissonChoisie;
		float prixBoissonChoisie = 0.0f;
		int choix = 4;

		do {
			choix = Utils.readIntBoisson(clavier, "Veuillez choisir une boisson en indiquant le chiffre qui y correspond: ");
			switch (choix) {
			case 1:
				boissonChoisie = Boissons.CAFE.getNom();
				prixBoissonChoisie = Boissons.CAFE.getPrix();

				break;
			case 2:
				boissonChoisie = Boissons.THE.getNom();
				prixBoissonChoisie = Boissons.THE.getPrix();

				break;
			case 3:
				boissonChoisie = Boissons.EAU.getNom();
				prixBoissonChoisie = Boissons.EAU.getPrix();

				break;
			case 4:
				boissonChoisie = Boissons.CHOCOLAT.getNom();
				prixBoissonChoisie =  Boissons.CHOCOLAT.getPrix();

				break;
			default:
				boissonChoisie = "Erreur de saisi";	
				break;
			}
		} while (choix != Boissons.CAFE.getId() && choix != Boissons.THE.getId() && choix != Boissons.EAU.getId() && choix != Boissons.CHOCOLAT.getId() && boissonChoisie == "Erreur de saisi");

		Scanner scanpaye = new Scanner(System.in);
		float paye;

		do {
			paye = Utils.readFloatPaye(scanpaye, "Veuillez payer votre " + boissonChoisie
					+ " dont le prix est: " + prixBoissonChoisie + " euro(s)\n NB: Remplacez le point par une virgule");
		}while( paye < prixBoissonChoisie );

		if (paye == prixBoissonChoisie) {
			System.out.println("Votre " + boissonChoisie + " est servi(e), à bientôt !");
		}else {
			System.out.print("Votre " + boissonChoisie + " est servi(e), veuillez récupérer le reste qui est de: ");
			Utils.rendreMonnaie(prixBoissonChoisie, paye);
			System.out.printf(" %s", "euro(s)");
		}
	}
}