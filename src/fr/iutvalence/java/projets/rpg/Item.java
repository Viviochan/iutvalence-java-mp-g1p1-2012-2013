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
	private String nom_item;
	
	
	/**
	 * Type de l'item:
	 * Objet/Equipement
	 * 
	 * Objet de soin/Objet de regen de pm
	 * 
	 * Equipement pour le bras/ la tete/ le buste / les jambes
	 */
	// FIXME respecter les conventions d'écriture
	private type_item typeitem;
	
	
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
	private int bonus_item;
	
	/**
	 * Valeur marchande de l'item
	 * 
	 */
	// FIXME respecter les conventions d'écriture
	private int val_item;
	
	/**
	 * Valeur de l'item s'il est vendue par un pnj vendeur
	 * 
	 * Certains items n auront un prix null 
	 * il ne seront recuperable que par les montres
	 */
	// FIXME respecter les conventions d'écriture
	private int prix_item;

	
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
	public Item(String nI, type_item type, int bonus, int prix, int valeur){
		this.nom_item=nI;
		this.typeitem=type;
		this.bonus_item=bonus;
		this.prix_item=prix;
		this.val_item=valeur;
		
	}
	
	// FIXME corriger le commentaire
	/**
	 * Retourne le nom de l item
	* @return nom_item
	*  
	*/
	// FIXME respecter les conventions d'écriture
	public String get_Nom_item() {
		return this.nom_item;
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
	public int getBonus_item() {
		return this.bonus_item;
	}



	/**
	 * retourne la valeur de l item
	 * @return val_item
	 */
	// FIXME respecter les conventions d'écriture
	public int getVal_item() {
		return this.val_item;
	}


	/**
	 * retourne le prix de l item
	 * @return prix_item
	 */
	// FIXME respecter les conventions d'écriture
	public int getPrix_item() {
		return this.prix_item;
	}

	// FIXME redéfinir toString
}
