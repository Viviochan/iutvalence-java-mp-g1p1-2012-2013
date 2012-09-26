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
	public String nom;
	
	/**
	 * niveau pour debloquer la competence
	 */
	public int lvl;
	
	
	/**
	 * Cout en point de mana de la competence
	 */
	public int cout_pm;
	
	/**
	 * Effet du skill
	 */
	public String effet;
	
	
	
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
		this.nom=s;
		this.lvl=n;
		this.cout_pm=pm;
		this.effet=nomEff;
		}
	
	/**
	 * Cree la competence de base Heal
	 * qui regenere 30point de vie du hero et est deblocable au lvl 5
	 */
	public Skill(){
		this.nom="Heal";
		this.lvl=5;
		this.cout_pm=3;
		this.effet="regenere les pv de 30pts";
	}
	

}
