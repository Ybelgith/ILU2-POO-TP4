package villagegaulois;

import personnages.Gaulois;
//test machine pc push
public interface IVillage {
	<P extends Produit> boolean installerVendeur(Etal<P> etal, Gaulois vendeur, P[] produit, int prix);

	void acheterProduit(String produit, int quantiteSouhaitee);
}
