package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = (int)(getArgent() * 0.1);
		parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
		perdreArgent(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force  >= adversaire.getReputation()) {
			parler("Je t'ai eu petit yakuza!");
			gagnerArgent(adversaire.perdre());
			honneur++;
		}
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			int perte = getArgent();
			adversaire.gagner(perte);
			perdreArgent(perte);
			honneur--;
		}
	}
}
