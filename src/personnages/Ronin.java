package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = (int)(getArgent() * 0.1);
		parler(beneficiaire.getNom() + " prend ces 6 sous.");
		beneficiaire.recevoir(don);
		perdreArgent(don);
	}
}
