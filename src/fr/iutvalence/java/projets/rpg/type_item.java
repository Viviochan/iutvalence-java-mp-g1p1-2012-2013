package fr.iutvalence.java.projets.rpg;

/**
 *
 * 
 * Type enum qui  nous servira a differencier chaque item
 * Et la gestion de ceux-ci se fera en fonction de ce type
 * 
 * 
 *  @author goncalvs
 *
 */
public enum type_item {
	/**
	 * Definie le type d'objet: soin
	 * Augmente/Redonne les hp de la valeur bonus_item
	 */
	objet_de_soin,
	/**
	 * Definie le type d'objet: recup
	 * Augmente/Redonne les mp de la valeur bonus_item
	 */
	objet_de_recup,
	/**
	 * Definie le type d'objet: soutien
	 * Augmente/Redonne les ' ' de la valeur bonus_item
	 */
	objet_de_soutien,
	/**
	 *Definie le type d'objet: equipement poru la tete
	 * Augmente la defense du hero de la valeur bonus_item 
	 */
	equipement_tete,
	/**
	 * Definie le type d'objet: equipement pour le bras
	 * Augmente la defense du hero de la valeur bonus_item
	 */
	equipement_bras,
	/**
	 * Definie le type d'objet: equipement pour le corps/buste
	 * Augmente la defense du hero de la valeur bonus_item
	 */
	equipement_corps,
	/**
	 * Definie le type d'objet: equipement pour le pied
	 * Augmente la defense du hero de la valeur bonus_item
	 */
	equipement_pied,
	/**
	 * Definie le type d'objet: arme
	 * Augmente l'attaque du hero de la valeur bonus_item
	 */
	arme,
	/**
	 * Definie le type d'objet: bouclier
	 * Augmente la defense du hero de la valeur bonus_item
	 */
	bouclier;

}
