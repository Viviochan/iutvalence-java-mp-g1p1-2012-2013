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
	private String nom_item;
	
	
	/**
	 * Type de l'item:
	 * Objet/Equipement
	 * 
	 * Objet de soin/Objet de regen de pm
	 * 
	 * Equipement pour le bras/ la tete/ le buste / les jambes
	 */
	private String type_item;
	
	/**
	 * Pour le type d'item on aura besoin d'un enum
	 * 
	 * public enum type={"Equipement_Bras";"Equipement_Jambes";"Equipement_Tete";...};
	 * et type_item prendras une des valeurs contenue dans l'enum de type
	 * 
	 * A definir dans une sous classe
	 */
	
	/**
	 * bonus donner par l'item varie en fonction du type de celui-ci
	 */
	private int bonus_item;
	
	/**
	 * Valeur marchande de l'item
	 */
	private int val_item;
	
	/**
	 * Valeur de l'item s'il est vendue par un pnj vendeur
	 */
	private int prix_item;

	
	
	
	
	/**
	 * Accesseur (creer avec la commande par defaut)
	 * Pet etre retirer ou modifier dans les seances futur
	 */
	/**
	* @return nom_item
	*  
	*/
	public String get_Nom_item() {
		return nom_item;
	}


	/**
	 * @return type_item
	 */
	public String getType_item() {
		return type_item;
	}

	/**
	 * @param type_item
	 */
	public void setType_item(String type_item) {
		this.type_item = type_item;
	}

	/**
	 * @return bonus_item
	 */
	public int getBonus_item() {
		return bonus_item;
	}



	/**
	 * @return val_item
	 */
	public int getVal_item() {
		return val_item;
	}


	/**
	 * @return prix_item
	 */
	public int getPrix_item() {
		return prix_item;
	}

	
}
