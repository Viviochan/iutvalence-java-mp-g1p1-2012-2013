package fr.iutvalence.java.projets.rpg;

/**
 * Les differentes actions que le joueur peut faire lors d un combat
 * 
 * @author goncalvs
 *
 */
public enum Action
{
	/**
	 * Correspond a l'ordre d'attaquer
	 */
	ATTAQUER,

	
	/**
	 * Correspond a l'ordre defendre
	 */
	DEFENDRE,
	/**
	 * Correspond a l'utilisation de l'inventaire
	 */
	INVENTAIRE,

	/**
	 * Correspond a une demande d'interaction avec un element du Plateau de Jeu
	 */
	INTERAGIR,
	/**
	 *Correspond a l'ordre fuite
	 */
	FUITE,

	/**
	 * Correspond a une action vide
	 */
	RIEN
	
}
