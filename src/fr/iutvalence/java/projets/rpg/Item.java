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
public class Item {

	/**
	 * Nom de l'item
	 */
	// FIXME respecter les conventions d'écriture
	private String nomitem;
	
	
	/**
	 * Type de l'item:
	 * Objet/Equipement
	 * 
	 * Objet de soin/Objet de regen de pm
	 * 
	 * Equipement pour le bras/ la tete/ le buste / les jambes
	 */
	// FIXME respecter les conventions d'écriture
	private typeitem typeitem;
	
	
	// FIXME ne aps définir comme un commentaire JavaDoc
	/**
	 * Pour le type d'item on aura besoin d'un enum
	 * 
	 * public enum type={"Equipement_Bras";"Equipement_Jambes";"Equipement_Tete";...};
	 * et type_item prendras une des valeurs contenue dans l'enum de type
	 * 
	 * A definir dans une sous classe
	 */
	
	/**
	 * bonus donné par l'item varie en fonction du type de celui-ci
	 */
	// FIXME respecter les conventions d'écriture
	private int bonusitem;
	
	/**
	 * Valeur marchande de l'item
	 * 
	 */
	// FIXME respecter les conventions d'écriture
	private int valitem;
	
	/**
	 * Valeur de l'item s'il est vendue par un pnj vendeur
	 * 
	 * Certains items n auront un prix null 
	 * il ne seront recuperable que par les montres
	 */
	// FIXME respecter les conventions d'écriture
	private int prixitem;
	
	// FISME corriger le commentaire (parler de fichier texte n'a pas de sens ici)
	/**
	 * Constructeur
	 * 
	 * Les donnees des items seront stocker dans un fichier txt ou une base de donnees 
	 * lors du lancement d une aventure on ouvre la base pour creer un table d item qui servira
	 * base de donne dynamique
	 * 
	 * @param nI  nom de l item
	 * @param type  type de l item
	 * @param bonus bonus conferer par l item
	 * @param prix   prix de l item peut etre null
	 * @param valeur  valeur de l item
	 */
	// FIXME respecter les conventions d'écriture (paramètres)
	public Item(String nI, typeitem type, int bonus, int prix, int valeur){
		this.nomitem=nI;
		this.typeitem=type;
		this.bonusitem=bonus;
		this.prixitem=prix;
		this.valitem=valeur;
		
	}
	
	// FIXME corriger le commentaire
	/**
	 * Retourne le nom de l item
	* @return nom_item
	*  
	*/
	// FIXME respecter les conventions d'écriture
	public String get_Nom_item() {
		return this.nomitem;
	}


	/**
	 * retourne le type de l item
	 * @return type_item
	 * 	 
	 */
	// FIXME respecter les conventions d'écriture
	public String gettypeitem() {
		return "coucou";
	}


	/**
	 * Retourne le bonus de l item
	 * @return bonus_item
	 */
	// FIXME respecter les conventions d'écriture
	public int getBonusitem() {
		return this.bonusitem;
	}



	/**
	 * retourne la valeur de l item
	 * @return val_item
	 */
	// FIXME respecter les conventions d'écriture
	public int getValitem() {
		return this.valitem;
	}


	/**
	 * retourne le prix de l item
	 * @return prix_item
	 */
	// FIXME respecter les conventions d'écriture
	public int getPrixitem() {
		return this.prixitem;
	}

	// FIXME redéfinir toString
}
