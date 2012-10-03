package fr.iutvalence.java.projets.rpg;


/**
 * Structure de niveau.
 * un niveau demande int xp et debloque divers bonus voir une competence
 */
public class Niveau{
	
	/**
	 * Attribut
	 */

	/**
	 * numeros du level atteins
	 */

	private int numlvl;
	

	/**
	 * xp necessaire pour atteindre le lvl
	 */
	private  int taux_xp;
	
	
	/**
	 * Constantes
	 */
	/**
	 * Niveau de base du Jeu
	 * Toute aventure commence au niveau 1
	 */

	final static int NIVEAU_DEPART=1;
	
	/**
	 * Niveau d'xp au debut de l'aventure
	 */
	final static int XP_DEPART=0;

	/**
	 * Constructeur
	 */
	

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
	

	/**
	 * @param num
	 * @return taux_xp
	 */
	public int getNiveau(int num){
		return this.taux_xp;
	}
	

	
	/**
	 * @param taux
	 * @return numlvl
	 */
	public int getTaux(int taux){
		return this.numlvl;
	}
	
}
