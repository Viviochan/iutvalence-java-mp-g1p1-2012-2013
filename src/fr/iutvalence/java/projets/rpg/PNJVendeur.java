package fr.iutvalence.java.projets.rpg;

/**
 * 
 * 
 * PNJ capable de vendre et d'acheter des items aux heros
 * 
 * Un PNJ Vendeur ne peut vendre que des item qui ont un prix non null
 * 
 * 
 * @author goncalvs
 * 
 */
public class PNJVendeur extends PNJ
{

	/**
	 * Definie le nombre de item que peut vendre le PNJ Vendeur
	 */
	// FIXME (FIXED)respecter les conventions d'écriture
	private int tailleMag;

	/**
	 * Le PNJ Vendeur vend des items figurant dans le tableau d item vend
	 * 
	 */
	private Item[] vend;

	/**
	 * Constructeur
	 * 
	 * @param posx
	 *            Abscisse x du pnj
	 * @param posy
	 *            Ordonnes y du pnj
	 * @param ph
	 *            Phrase qu'il se gardera de dire
	 * @param nbitem
	 *            nombre d'items differents a vendre
	 * @throws CoordonneesInvalideException si la position n est pas valide
	 */
	public PNJVendeur(int posx, int posy, String ph, int nbitem) throws CoordonneesInvalideException
	{
		super(posx, posy, ph);
		this.tailleMag = nbitem;
	}

	// FIXME ajouter une méthode permettant d'ajouter un objet à vendre
	/**
	 * Methode qui nous donne la listes des items vendables par le PNJVendeur A completer quand on aura trouver une
	 * methode de stockage des items
	 */
	public void vend()
	{
		this.vend = new Item[this.tailleMag];
		int i = 0;
		while (i <= this.tailleMag)
		{
			// on construits des items predefinies dans une base ou un autre elements qui stocke
		}

	}

	/**
	 * Retourne le nombre d item que le vendeur peut vendres
	 * 
	 * @return taillmag
	 */
	// FIXME (FIXED)respecter les conventions d'écriture
	public int getTailleMag()
	{
		return this.tailleMag;
	}

	/**
	 * Donne la liste des items vendue par le PNJVendeur
	 * 
	 * @return vend
	 */
	public Item[] getVend()
	{
		return this.vend;
	}

}
