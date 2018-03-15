package service;

import java.util.ArrayList;

import domaine.Abonne;
import domaine.IEmpruntable;
import domaine.Livre;

public class ServiceAbonne {
	
	public void addLivre(Livre livre, Abonne abonne) {
		ArrayList<Livre>livresEmpruntes = abonne.getLivresEmpruntes();
		livresEmpruntes.add(livre);
	}
	
	public void emprunter(IEmpruntable doc, Abonne abonne){
		doc.disponible();
		System.out.println ("L'abonné "+ abonne.getPrenom() + " " + abonne.getNom() +
				" souhaite l'emprunter.");
	}
	
	public void retourner(IEmpruntable doc, Abonne abonne){
		System.out.println ("L'abonné "+  abonne.getPrenom()  + " " + abonne.getNom() +
				" souhaite rendre le document " + doc.getTitre() +".");
	}
	

}
