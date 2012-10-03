package fr.iutvalence.java.projets.rpg;


/**
 * @author goncalvs
 *Classe des monstres qui serviront a la base de donnes
 */
public class Monstre {
	
	/**
	 * Attribut
	 * Nom du montre en question
	 */

	private String nom_monstre;
	

	/**
	 * Point de vie du monstre si 0 => mort
	 */

	private int hp_monstre;
	


	/**
	 * niveau d'attaque du monstre
	 */
	private int attaque_monstre;
	

	/**
	 * niveau de defense du monstre
	 */
	private int defense_monstre;
	

	/**
	 * xp donner par le monstre lors de sa mort
	 */
	private int xp_monstre;
	

	/**
	 * or donner par le monstre lors de sa mort
	 */
	private int or_monstre;



	/**
	 * Constructeur
	 * 
	 * si rien est definis on creera un slim / gluant
	 * Monstre de base du jeu
	 */
	public Monstre(){
		this.nom_monstre="Slim";
		this.hp_monstre=10;
		this.attaque_monstre=5;
		this.defense_monstre=5;
		this.or_monstre=3;
		this.xp_monstre=5;
		
	}
	

	/**
	 * On cree le monstre souhaiter en definissant tous ces details
	 * serviras a la base de donnees ou une collection de monstre
	 * @param nomM 
	 * @param hp_mob 
	 * @param att_mob 
	 * @param def_mob 
	 * @param or_mob 
	 * @param xp_mob 
	 */
	
	public Monstre(String nomM,int hp_mob,int att_mob, int def_mob, int or_mob, int xp_mob){
		this.nom_monstre=nomM;
		this.hp_monstre=hp_mob;
		this.attaque_monstre=att_mob;
		this.defense_monstre=def_mob;
		this.or_monstre=or_mob;
		this.xp_monstre=xp_mob;
		
	}
	

	
	/**
	* Accesseur
	* @return  le nom du monstre
	*/
	
	public String get_Nom_monstre(){
		return this.nom_monstre;
	}
	
	/**
	 * @return les point de vie du monstre
	 */
	public int get_Hp_monstre(){
		return this.hp_monstre;
	}
	
	
	/**
	 * @return l'attaque du monstre nous permettant plus loin le calcul des degats et diminution de degats
	 */
	public int get_Att_monstre(){
		return this.attaque_monstre;
	}
	
	
	/**
	 * @return la defense du monstre nous permettant plus loin le calcul des degats et diminution de degats
	 */
	public int get_Def_monstre(){
		return this.defense_monstre;
	}
	
	/**
	 * @return l'or porter par le monstre que le heros pourra ajouter a sa bourse
	 */
	public int get_Or_monstre(){
		return this.or_monstre;
	}
	
	/**
	 * @return le taux d'xp que le monstre donne au heros
	 */
	public int get_Xp_monstre(){
		return this.xp_monstre;
	}

	
}
	
	
	
	
	
	
	
	
	
	
