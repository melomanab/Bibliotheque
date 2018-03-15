package domaine;

public class BD extends Livre{
	private String dessinateur;
	
	public BD (String monTitre, String monAuteur, String maDatePublication, String monDessinateur) {
		super(monTitre, monAuteur, maDatePublication);
		dessinateur = monDessinateur;
		typeMedia= "BD";
		quotaMedia= 3;
	}
	
	// Exemple REDEFINITON 
	public void infos(String format) {
		super.infos(format);
		System.out.print("\tDessinateur: " + dessinateur);
	}

}
