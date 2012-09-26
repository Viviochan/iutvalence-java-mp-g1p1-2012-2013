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
	public int numlvl;
	/**
	 * xp necessaire pour atteindre le lvl
	 */
	public  int taux_xp;
	


	/**
	 * Constructeur
	 */
	
	
	/**
	 * Initialise le niveau de depart
	 */
	public Niveau(){
		this.numlvl=1;
		this.taux_xp=0;
	}
	
	/**
	 * definis les niveau avec leur taux de xp
	 * @param num  numeros du lvl
	 * @param taux xp necessaire pour atteindre ce niveau
	 */
	public Niveau(int num, int taux){
		this.numlvl=num;
		this.taux_xp=taux;
	}
	
	
	
}