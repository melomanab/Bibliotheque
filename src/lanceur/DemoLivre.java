
package lanceur;

import domaine.Abonne;
import domaine.BD;
import domaine.FilmDVD;
import domaine.Livre;
// import java.util.Scanner;
import domaine.MusiqueCD;
import service.ServiceAbonne;

/**
 * @author(
		   name = "Beatriz Moreno",
		   date = "15/03/2018"
		)
 *
 */

class DemoLivre{

// --------------------------------
// 0. Methode main
// --------------------------------
	
public static void main(String[] args) {	
	
	// --------------------------------
	// 1. ---- Declarations
	// --------------------------------
	Abonne monAbonne;
	ServiceAbonne monServiceAbonne; 
	
	Livre monLivre;
	Livre monLivre2;
	
	BD maBD;
	MusiqueCD monCD;
	FilmDVD monDVD;
	// --------------------------------
	// 2. ---- Instantiation
	// --------------------------------
	monAbonne = new Abonne("MORENO", "Beatriz");
	monServiceAbonne = new ServiceAbonne();
	
	monLivre = new Livre ("Linterna magica", "Ingmar BERGMAN", "1987");
	monLivre2 = new Livre ("1984", "George Orwell", "1949");
	
	maBD = new BD ("Les vieux fourneaux(tome 1)", "Wilfrid LUPANO", "2014",
					"Paul CAUUET");
	monCD = new MusiqueCD("Temple of Low Men", "1988", "Crowded House");
	monDVD = new FilmDVD("Mary Reilly", "1996", "Stephen FREARS", "John MALKOVITCH");
	
	//	monTroisiemeLivre = new Livre ("Ma famille et autres animaux","Gerald Durrell","1956");
	
	// --------------------------------
	// 3. ----Utilisation 
	// --------------------------------
	System.out.println("\n---Infos sur monAbonne sans emprunts:");
	System.out.println(monAbonne);
	
	monServiceAbonne.addLivre(monLivre, monAbonne);
	monServiceAbonne.addLivre(monLivre2, monAbonne);
	
	System.out.println(monAbonne);

/*
	// monServiceAbonne
	
	
	// Infos Livre
	System.out.println("\n---Infos sur monLivre et maBD:");
	monLivre.infos("auteur");
	// Call toString()
	System.out.println(monLivre);
	
	// Infos BD
	maBD.infos("auteur");
	System.out.println(maBD);
	
	// Association de monLivre et maBD a monAbonne

	// monAbonne.setLivresEmpruntes(monLivre);

	
	// monAbonne.setBDsEmpruntes(maBD);

		
	// Infos disponibilit�
	System.out.println("\n---Infos disponiblilit� monCD, monDVD, monLivre, maBD:");
	monCD.disponible();
	monDVD.disponible();
	monLivre.disponible();
	maBD.disponible();
	
	
	System.out.println("\n---Demande d'emprunt de plusieurs IDocuments avec methode unique .emprunter()");
	monAbonne.emprunter(monLivre);
	monAbonne.emprunter(monCD);
	monAbonne.emprunter(monDVD);
	monAbonne.emprunter(maBD);
	
	System.out.println("\n---Demande de retour de plusieurs IDocuments avec methode unique .retourner()");
	monAbonne.retourner(monLivre);
	monAbonne.retourner(monCD);
	monAbonne.retourner(monDVD);
	monAbonne.retourner(maBD);
	// monAbonne.emprunter(monCD);
	
//	monLivre.infos("titre");
//	maBD.infos("titre");
//	
//	monLivre.infos();
//	maBD.infos();
	
	
	// System.out.println(monAutreLivre.infosLivre());
	// System.out.println(monTroisiemeLivre.infosLivre());
	
	// Utilisation infosLivre() avec differents fomats
	// System.out.println (monLivre);
	
	
	
	
/* Vieux code: ignorer
	System.out.println ("\n---Demo if:");	
	System.out.println(monLivre.infosLivre("titre"));
	System.out.println(monLivre.infosLivre("auteur"));
	System.out.println(monLivre.infosLivre("none"));
	
	// Utilisation infosLivre() sans parametre
	System.out.println ("\n---Demo surcharge:");
	System.out.println(monLivre.infosLivre());
	// System.out.println(monAutreLivre.infosLivre());
	// System.out.println(monTroisiemeLivre.infosLivre());
	
	// Utilisation infosLivreSwitch() avec instruction switch(format)
	System.out.println ("\n---Demo switch:");	
	System.out.println(monLivre.infosLivreSwitch(0));
	System.out.println(monLivre.infosLivreSwitch(1));
	System.out.println(monLivre.infosLivreSwitch(5));
	
	// Utilisation ecritPar
	System.out.println ("\n---Demo operateur ternaire:");
	System.out.println(monLivre.ecritPar("Ingmar Bergman"));


	// Utilisation infosLivre() avec format donné par l'utilisateur
	System.out.println ("\n---Demo infosLivre() avec scanner:");
	Scanner sc = new Scanner(System.in);
	char reponse='O';
	
	while(reponse=='O'){
		System.out.println ("Introduire format: (auteur/titre)");
		String userFormat = sc.nextLine(); // .replaceAll("\\s", "");
		// System.out.println("-"+ userFormat +"-");
		System.out.println(monLivre.infosLivre(userFormat));
	
		do{
			System.out.println("Voulez-vous continuer ? (O/N)");
			//On récupère la réponse de l'utilisateur
			reponse = sc.nextLine().charAt(0);
		} while (reponse!='O' && reponse!='N');
	}
	System.out.println("Au revoir!");


	// Utilisation infosLivreSwitch() avec format donné par l'utilisateur
	System.out.println ("\n---Demo infosLivreSwitch() avec scanner:");
	Scanner sc2 = new Scanner(System.in);
	String reponse2 = "O"; //.charAt(0);
	
	while(reponse2.equals("O")){
		System.out.println ("Introduire format: ");
		System.out.println ("0-auteur");
		System.out.println ("1-titre");
		int numUserFormat = sc2.nextInt(); 
		// System.out.println(1);
		System.out.println(monLivre.infosLivreSwitch(numUserFormat));
		
		do {
		System.out.println("Voulez-vous continuer ? (O/N)");
		//On récupère la réponse de l'utilisateur
		reponse2 = sc2.nextLine(); //.charAt(0);
		}while (reponse2.equals("O"));
	}
	
	System.out.println("Au revoir!");
*/	
	}
}
