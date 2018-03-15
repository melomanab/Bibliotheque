package domaine;

public class MusiqueCD implements IEmpruntable{
	protected String titre;
	protected String datePublication;
	protected String interprete;
	
	public MusiqueCD(String titre, String datePublication, String interprete) {
		this.titre = titre;
		this.datePublication = datePublication;
		this.interprete = interprete;
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

	public String getInterprete() {
		return interprete;
	}

	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}
	
	public void disponible() {
		System.out.println("Le CD "+ this.titre + " est bien disponible");
	}

}
