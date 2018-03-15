package domaine;

public class Livre implements IEmpruntable{
	
	// 1. Attributs
	protected String titre;
	protected String auteur;
	protected String datePublication;
	
	protected String defaultFormat;
	protected String typeMedia;
	protected int quotaMedia;
	
	// 2. Constructeur
	public Livre (String monTitre, String monAuteur, String maDatePublication){
		titre= monTitre;
		auteur= monAuteur;
		datePublication = maDatePublication;
		defaultFormat = "auteur";
		typeMedia= "livre";
		quotaMedia = 5;
	}
	
	
	// 3. Methodes	
	
	
	public String toString() {	
		String message = "Titre: " + this.titre + "\tAuteur:" + this.auteur;
		// message = message + "Vous pouvez emprunter un maximum de " + quotaMedia + ".";
		return message;
	}
	
	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public String getDatePublication() {
		return datePublication;
	}


	public void setDatePublication(String datePublication) {
		this.datePublication = datePublication;
	}


	public String getDefaultFormat() {
		return defaultFormat;
	}


	public void setDefaultFormat(String defaultFormat) {
		this.defaultFormat = defaultFormat;
	}


	public String getTypeMedia() {
		return typeMedia;
	}


	public void setTypeMedia(String typeMedia) {
		this.typeMedia = typeMedia;
	}


	public int getQuotaMedia() {
		return quotaMedia;
	}


	public void setQuotaMedia(int quotaMedia) {
		this.quotaMedia = quotaMedia;
	}


	// Implementation methode abstraite infos()
	public void infos(String format) {			
		if(format.equals("auteur") || format.equals("titre")) {
			if(format.equals("auteur")){
				System.out.print("Auteur:" + auteur  + "\t" + 
									"Annee publication:" +datePublication + "\t" +  
									"Titre:" + titre) ;
			}		
			if (format.equals("titre")){
				System.out.print("Titre:" + titre + "\t" +
									"Auteur:" + auteur  + "\t" + 
									"Annee publication:" +datePublication) ;
			}
		}else
		{
			System.out.print("ERREUR: Format invalide");
		}
	}

	// Surcharge sur infos()
	// infos() est SURCHARGE pour pouvoir l'utiliser avec format par defaut
	public void infos(){
		infos(defaultFormat);
	}
	
	public void disponible() {
		System.out.println("Le livre "+ this.titre + " est bien disponible");
	}

/*
	// infosLivre() avec instruction SWITCH
	public String infosLivreSwitch(int numFormat) {		
		String message;
		switch(numFormat)
		{
		case 0:
			message = (auteur  + "\t" + datePublication + "\t" +  titre) ;
			break;
		case 1:
			message = (titre + "\t" + auteur + "\t" + datePublication) ;
			break;
		default:
			message = "ERREUR: Format invalide";
		}
		return message;
	}
	
	// Verifier si un livre a eté écrit par un auteur
	public boolean ecritPar (String pAuteur){
		System.out.println("Vrai ou faux : Le livre " + this.titre +
		" a ete ecrit par " + pAuteur + " ?");
		return (this.auteur == pAuteur) ? true	: false ;
	}
*/
	
}
