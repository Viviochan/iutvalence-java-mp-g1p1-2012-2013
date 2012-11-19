package fr.iutvalence.java.projets.rpg;

/**
 * 
 * Type enum qui nous servira a differencier chaque item Et la gestion de ceux-ci se fera en fonction de ce type
 * @author goncalvs
 * 
 */
public enum TypeItem
{
	/**
	 * Definie le type d'objet: soin Augmente/Redonne les hp de la valeur bonus_item
	 */
	// FIXME respecter les conventions d'écriture
	
	Objet_de_Soin,
	/**
	 * Definie le type d'objet: recup Augmente/Redonne les mp de la valeur bonus_item
	 */
	// FIXME respecter les conventions d'écriture
	
	Objet_de_Recup,
	/**
	 * Definie le type d'objet: soutien Augmente/Redonne les ' ' de la valeur
	 * bonus_item
	 */
	// FIXME respecter les conventions d'écriture
	
	Objet_de_Soutien,
	/**
	 * Definie le type d'objet: equipement poru la tete Augmente la defense du hero de la valeur bonus_item
	 */
	// FIXME respecter les conventions d'écriture
	
	Equipement_Tete,
	/**
	 * Definie le type d'objet: equipement pour le bras Augmente la defense du hero de la valeur bonus_item
	 */
	// FIXME respecter les conventions d'écriture
	
	Equipement_Bras,
	/**
	 * Definie le type d'objet: equipement pour le corps/buste Augmente la defense du hero de la valeur bonus_item
	 */
	// FIXME respecter les conventions d'écriture
	
	Equipement_Corps,
	/**
	 * Definie le type d'objet: equipement pour le pied Augmente la defense du hero de la valeur bonus_item
	 */
	// FIXME respecter les conventions d'écriture
	
	Equipement_Pied,
	/**
	 * Definie le type d'objet: arme Augmente l'attaque du hero de la valeur bonus_item
	 */
	// FIXME respecter les conventions d'écriture
	
	Arme,
	/**
	 * Definie le type d'objet: bouclier Augmente la defense du hero de la valeur bonus_item
	 */
	// FIXME respecter les conventions d'écriture
	
	Bouclier;

}
