package domaine;

public class FilmDVD implements IEmpruntable{
	
	protected String titre;
	protected String datePublication;
	protected String realisateur;
	protected String acteur; //Pour l'instant unique, après il sera une collection 
	
	public FilmDVD(String titre, String datePublication, String realisateur, String acteur) {
		this.titre = titre;
		this.datePublication = datePublication;
		this.realisateur = realisateur;
		this.acteur = acteur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDatePublication() {
		return datePublication;
	}

	public void setDatePublication(String datePublication) {
		this.datePublication = datePublication;
	}

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	public String getActeur() {
		return acteur;
	}

	public void setActeur(String acteur) {
		this.acteur = acteur;
	}
	
	public void disponible() {
		System.out.println("Le DVD "+ this.titre + " est bien disponible");
	}

}
