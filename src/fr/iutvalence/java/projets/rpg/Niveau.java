package fr.iutvalence.java.projets.rpg;


/**
 * Structure de niveau.
 * un niveau demande int xp et debloque divers bonus voir une competence
 */
public class Niveau{
	
	/**
	 * Attribut
	 */
	// FIXME d�clarer les attributs en private et ajouter si besoin des accesseurs en lecture publics
	/**
	 * numeros du level atteins
	 */
	private int numlvl;
	/**
	 * xp necessaire pour atteindre le lvl
	 */
	private  int taux_xp;
	


	/**
	 * Constructeur
	 */
	
	// FIXME �crire un commentaire correct
	/**
	 * Initialise le niveau de depart
	 */
	public Niveau(){
		this.numlvl=1;
		this.taux_xp=0;
	}
	
	// FIXME d�clarer les attributs en private et ajouter si besoin des accesseurs en lecture publics
	/**
	 * definis les niveau avec leur taux de xp
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