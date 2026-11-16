package personnages;

public class Yakuza extends Humain{
	private int reputation = 0;
	private String clan;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}

	public void extorquerCommercant(Commercant commercant) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(commercant.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentExtorque = commercant.seFaireExtorquer();
		gagnerArgent(argentExtorque);
		reputation++;
		parler("J’ai piqué les " + argentExtorque + " sous de " + commercant.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
	}
	
}
