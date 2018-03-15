package domaine;

import java.util.ArrayList;

public class Abonne {
	
	// Attributs
	String nom;
	String prenom;
	ArrayList<Livre> livresEmpruntes; // un seul pour l'instant, avant de voir les collections
	BD BDsEmpruntes; // une seule pour l'instant
	
	MusiqueCD empruntsMusique;
	FilmDVD empruntsFilm;
	
	
	// Constructeur
	public Abonne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.livresEmpruntes = new ArrayList<Livre>();
		// this.BDsEmpruntes = bDsEmpruntes;
	}


	// toString
	public String toString() {

		String message = "Abonne: [" + this.prenom + " " +  this.nom + "]";
		if(!livresEmpruntes.isEmpty()) {
				message = message + "\nDocuments empruntés:";
			for (Livre currentLivre: livresEmpruntes) {
				message = message + "\n" + currentLivre.toString();
			}
		}else {
			message = message + "\nVous n'avez pas de documents empruntés.";
		}

		return message;
	}
	
	// Getters / Setters
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public ArrayList<Livre> getLivresEmpruntes() {
		return livresEmpruntes;
	}


	public void setLivresEmpruntes(ArrayList<Livre> livresEmpruntes) {
		this.livresEmpruntes = livresEmpruntes;
	}


	public BD getBDsEmpruntes() {
		return BDsEmpruntes;
	}


	public void setBDsEmpruntes(BD bDsEmpruntes) {
		BDsEmpruntes = bDsEmpruntes;
	}


	public MusiqueCD getEmpruntsMusique() {
		return empruntsMusique;
	}


	public void setEmpruntsMusique(MusiqueCD empruntsMusique) {
		this.empruntsMusique = empruntsMusique;
	}


	public FilmDVD getEmpruntsFilm() {
		return empruntsFilm;
	}


	public void setEmpruntsFilm(FilmDVD empruntsFilm) {
		this.empruntsFilm = empruntsFilm;
	}


	
	
}
