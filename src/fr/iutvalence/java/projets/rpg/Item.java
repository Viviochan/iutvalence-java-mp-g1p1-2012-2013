package fr.iutvalence.java.projets.rpg;

/**
 * Dans cette classes on gerera les pieces d'equipement et les objet courant du jeu
 * 
 * La methode de gestion des items varie selon le type de celui-ci
 * 
 * un equipement ne se traiteras pas de la meme facon qu'une potion de soin ou un autre objet courant
 * 
 * @author goncalvs
 * 
 */
public class Item
{

	/**
	 * Nom de l'item
	 */
	// FIXME (FIXED)respecter les conventions d'écriture
	private String nomItem;

	/**
	 * Type de l'item: Objet/Equipement
	 * 
	 * Objet de soin/Objet de regen de pm
	 * 
	 * Equipement pour le bras/ la tete/ le buste / les jambes
	 */
	// FIXME (FIXED)respecter les conventions d'écriture
	private TypeItem typeItem;

	// FIXME (FIXED)ne aps définir comme un commentaire JavaDoc(comment ecrire les commentaire concernant l'avancement du
	// travail)
	

	/**
	 * bonus donné par l'item varie en fonction du type de celui-ci
	 */
	// FIXME (FIXED)respecter les conventions d'écriture
	private int bonusItem;

	/**
	 * Valeur marchande de l'item
	 * 
	 */
	// FIXME (FIXED)respecter les conventions d'écriture
	private int valItem;

	/**
	 * Valeur de l'item s'il est vendue par un pnj vendeur
	 * 
	 * Certains items n auront un prix null il ne seront recuperable que par les montres
	 */
	// FIXME (FIXED)respecter les conventions d'écriture
	private int prixItem;

	// FIXME (FIXED)corriger le commentaire (parler de fichier texte n'a pas de sens ici)
	/**
	 * Constructeur
	 * 
	 * Construit l'item selon les parametres donnees
	 * 
	 * @param nI
	 *            nom de l item
	 * @param type
	 *            type de l item
	 * @param bonus
	 *            bonus conferer par l item
	 * @param prix
	 *            prix de l item peut etre null
	 * @param valeur
	 *            valeur de l item
	 */
	// FIXME (FIXED)respecter les conventions d'écriture (paramètres)
	public Item(String nI, TypeItem type, int bonus, int prix, int valeur)
	{
		this.nomItem = nI;
		this.typeItem = type;
		this.bonusItem = bonus;
		this.prixItem = prix;
		this.valItem = valeur;

	}

	/**
	 * Retourne le nom de l item
	 * 
	 * @return le nom de l item
	 * 
	 */
	// FIXME (FIXED)respecter les conventions d'écriture
	public String getNomItem()
	{
		return this.nomItem;
	}

	/**
	 * retourne le type de l item
	 * 
	 * @return le type de l item
	 * 
	 */
	// a completer quand la class typeitem sera complete
	// FIXME (FIXED)respecter les conventions d'écriture
	public TypeItem getTypeItem()
	{
		return this.typeItem;
	}

	/**
	 * Retourne le bonus de l item
	 * 
	 * @return le bonus de l item
	 */
	// FIXME (FIXED)respecter les conventions d'écriture
	public int getBonusItem()
	{
		return this.bonusItem;
	}

	/**
	 * retourne la valeur de l item
	 * 
	 * @return la valeur de l item
	 */
	// FIXME (FIXED)respecter les conventions d'écriture
	public int getValItem()
	{
		return this.valItem;
	}

	/**
	 * retourne le prix de l item
	 * 
	 * @return le prix de l item
	 */
	// FIXME (FIXED)respecter les conventions d'écriture
	public int getPrixItem()
	{
		return this.prixItem;
	}

	// FIXME (FIXED)cette méthode est déjà défénie plus haut !


	// FIXME redéfinir toString
}
