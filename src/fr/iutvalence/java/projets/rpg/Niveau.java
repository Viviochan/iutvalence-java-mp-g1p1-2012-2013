package fr.iutvalence.java.projets.rpg;


/**
 * Structure de niveau.
 * un niveau demande int xp et debloque divers bonus voir une competence
 */
public class Niveau{
	
	/**
	 * Attribut
	 */
	// FIXME réfléchir à la visibilité
	// FIXME respecter les conventions d'écriture
	/**
	 * numeros du level atteins
	 */
	public int numlvl;
	
	// FIXME réfléchir à la visibilité
	// FIXME respecter les conventions d'écriture
	/**
	 * xp necessaire pour atteindre le lvl
	 */
	public  int taux_xp;
	


	/**
	 * Constructeur
	 */
	
	// FIXME écrire un commentaire correct
	/**
	 * Initialise le niveau de depart
	 */
	public Niveau(){
		this.numlvl=1;
		this.taux_xp=0;
	}
	
	// FIXME déclarer les attributs en private et ajouter si besoin des accesseurs en lecture publics
	/**
	 * definit les niveau avec leur taux de xp
	 * @param num  numeros du lvl
	 * @param taux xp necessaire pour atteindre ce niveau
	 */
	public Niveau(int num, int taux){
		this.numlvl=num;
		this.taux_xp=taux;
	}
	
	// FIXME méthodes ?
	
}