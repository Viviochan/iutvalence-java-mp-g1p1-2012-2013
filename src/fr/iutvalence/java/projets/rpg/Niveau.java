package fr.iutvalence.java.projets.rpg;


/**
 * Structure de niveau.
 * un niveau demande int xp et debloque divers bonus voir une competence
 * 
 * @author goncalvs
 */
public class Niveau{
	
	
	/**
	 * Niveau de base du Jeu
	 * Toute aventure commence au niveau 1
	 */
	// FIXME (FIXED)visibilité
	final static int NIVEAU_DEPART=1;
	
	/**
	 * Niveau d'xp au debut de l'aventure
	 */
	// FIXME (FIXED)visibilité
	final static int XP_DEPART=0;
	
	// FIXME essayer d'écrire sans faute d'orrhographe (merci)
	/**
	 * numero du level atteint
	 */
	// FIXME respecter les conventions d'écriture
	private int numlvl;
	

	/**
	 * xp necessaire pour atteindre le lvl
	 */
	// FIXME respecter les conventions d'écriture
	private  int tauxxp;
	





	/**
	 * Initialisation du NIVEAU_DEPART avec XP_DEPART
	 */
	public Niveau(){
		this.numlvl=NIVEAU_DEPART;
		this.tauxxp=XP_DEPART;
	}
	

	/**
	 * definit les niveau avec leur taux de xp
	 * @param num  numeros du lvl
	 * @param taux xp necessaire pour atteindre ce niveau
	 */
	public Niveau(int num, int taux){
		this.numlvl=num;
		this.tauxxp=taux;
	}
	

	// FIXME corriger le commentaire
	/**
	 * retourne le niveau
	 * 
	 * @return numlvl
	 */
	public int getNiveau(){
		return this.numlvl;
	}
	

	// FIXME corriger le commentaire
	/**
	 * retourne le taux xp necessaire au niveau
	 * 
	 * @return tauxxp
	 */
	public int getTaux(){
		return this.tauxxp;
	}
	
}
