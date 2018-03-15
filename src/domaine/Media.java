package domaine;

public abstract class Media {
	// 1. Attributs
	protected String titre;
	protected String auteur;
	protected String datePublication;
	protected String defaultFormat;
	protected String typeMedia;
	
	// 2. Constructeur
	protected Media (String monTitre, String monAuteur, String maDatePublication){
		titre= monTitre;
		auteur= monAuteur;
		datePublication = maDatePublication;
		defaultFormat = "auteur";
	}
	
	// Methode abstraite: ECHEC
		protected void infos(String format) {
			System.out.println("---Infos pour" + typeMedia + "selectionné:");
		}

}
