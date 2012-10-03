package fr.iutvalence.java.projets.rpg;


/**
 * @author goncalvs
 *
 */
public class Skill {
	
	
	/**
	 * Attribut
	 */
	

	/**
	 * Nom du skill
	 */
	private String nom;

	/**
	 * niveau pour debloquer la competence
	 */
	private int lvl;
	
	

	/**
	 * Cout en point de mana de la competence
	 */
	private int cout_pm;
	

	/**
	 * Effet du skill
	 */
	private String effet;
	
	/**
	 * Constantes
	 */
	/**
	 * Nom de la competence par defaut
	 */
	final static String NOM_DEFAUT="HEAL";
	
	/**
	 * Niveau de base de la competence par defaut
	 */
	final static int NIV_COMT_BASE=5;
	/**
	 * Cout en pm de la competence par defaut
	 */
	final static int COUT_COMPT_BASE=3;
	/**
	 * Effet de la competence par defaut
	 */
	final static String EFF_COMPT_BASE="regenere les pv de 30pts";
	
	
	/**
	 * Constructeur
	 * 
	 * construction de la competence definie en parametre
	 * @param s nom de la competence
	 * @param n niveau de la competence
	 * @param pm cout en point de mana de la competence
	 * @param nomEff effet de la competence
	 */
	public Skill(String s, int n,int  pm,String nomEff){
		this.nom= s;
		this.lvl= n;
		this.cout_pm= pm;
		this.effet= nomEff;
		}
	
	/**
	 * Cree la competence de base Heal
	 * qui regenere 30point de vie du hero et est deblocable au lvl 5
	 */
	public Skill(){
		this.nom= NOM_DEFAUT;
		this.lvl=NIV_COMT_BASE;
		this.cout_pm= COUT_COMPT_BASE;
		this.effet= EFF_COMPT_BASE;
	}

	
	/**
	 * Accesseur
	 */
	
	/**
	 * Donne le nom de la competence
	 * @return nom
	 */
	
	public String getNom() {
		return nom;
	}


	/**
	 * retourne le niveau necessaire pour utiliser la competence
	 * @return lvl
	 */
	public int getLvl() {
		return lvl;
	}

	/**
	 * retourne le cout en point de mana de la competence
	 * @return cout_pm
	 */

	public int getCout_pm() {
		return cout_pm;
	}


	/**
	 * Donne l'effet de la competence
	 * @return effet
	 */
	public String getEffet() {
		return effet;
	}



}
