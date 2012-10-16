package fr.iutvalence.java.projets.rpg;


/**
 * Structure de niveau.
 * un niveau demande int xp et debloque divers bonus voir une competence
 * 
 * @author goncalvs
 */
public class Niveau{
	
	// FIXME essayer d'écrire sans faute d'orrhographe (merci)
	/**
	 * numeros du level atteins
	 */
	// FIXME respecter les conventions d'écriture
	private int numlvl;
	

	/**
	 * xp necessaire pour atteindre le lvl
	 */
	// FIXME respecter les conventions d'écriture
	private  int taux_xp;
	
	/**
	 * Niveau de base du Jeu
	 * Toute aventure commence au niveau 1
	 */

	// FIXME visibilité
	final static int NIVEAU_DEPART=1;
	
	/**
	 * Niveau d'xp au debut de l'aventure
	 */
	// FIXME visibilité
	final static int XP_DEPART=0;


	/**
	 * Initialisation du NIVEAU_DEPART avec XP_DEPART
	 */
	public Niveau(){
		this.numlvl=NIVEAU_DEPART;
		this.taux_xp=XP_DEPART;
	}
	

	/**
	 * definit les niveau avec leur taux de xp
	 * @param num  numeros du lvl
	 * @param taux xp necessaire pour atteindre ce niveau
	 */
	public Niveau(int num, int taux){
		this.numlvl=num;
		this.taux_xp=taux;
	}
	

	// FIXME corriger le commentaire
	/**
	 * retourne le niveau
	 * 
	 * @return taux_xp
	 */
	public int getNiveau(){
		return this.numlvl;
	}
	

	// FIXME corriger le commentaire
	/**
	 * retourne le taux xp necessaire au niveau
	 * 
	 * @return numlvl
	 */
	public int getTaux(){
		return this.taux_xp;
	}
	
}
