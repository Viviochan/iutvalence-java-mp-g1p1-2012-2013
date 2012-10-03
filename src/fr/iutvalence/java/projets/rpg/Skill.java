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
	
	final static String NOM_DEFAUT="HEAL";
	
	
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
		this.setNom(s);
		this.setLvl(n);
		this.setCout_pm(pm);
		this.setEffet(nomEff);
		}
	
	/**
	 * Cree la competence de base Heal
	 * qui regenere 30point de vie du hero et est deblocable au lvl 5
	 */
	public Skill(){
		this.setNom("Heal");
		this.setLvl(5);
		this.setCout_pm(3);
		 
		this.setEffet("regenere les pv de 30pts");
	}

	
	/**
	 * Accesseur
	 */
	
	/**
	 * 
	 * @return nom
	 */
	
	public String getNom() {
		return nom;
	}


	/**
	 * 
	 * @return lvl
	 */
	public int getLvl() {
		return lvl;
	}

	/**
	 * 
	 * @return cout_pm
	 */

	public int getCout_pm() {
		return cout_pm;
	}


	/**
	 * 
	 * @return effet
	 */
	public String getEffet() {
		return effet;
	}



}
