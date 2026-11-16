package personnages;

public class Yakuza extends Humain{
	private int reputation = 0;
	private String clan;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	

	public int getReputation() {
		return reputation;
	}

	
	public void extorquer(Commercant commercant) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(commercant.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentExtorque = commercant.seFaireExtorquer();
		gagnerArgent(argentExtorque);
		reputation++;
		parler("J’ai piqué les " + argentExtorque + " sous de " + commercant.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
	}
	
	
	public int perdre() {
		int perte = getArgent();
		perdreArgent(perte);
		parler("J’ai perdu mon duel et mes " + perte + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
		reputation--;
		return perte;
	}
	
	
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
		gagnerArgent(gain);
		reputation++;
	}
	
}
