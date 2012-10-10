package fr.iutvalence.java.projets.rpg;


/**
 * 
 *Classe des monstres qui serviront a la base de donnes
 *
 *@author goncalvs
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
	 * Nom du monstre creer par defaut
	 */
	final static String NOM_MOB="Slim";
	/**
	 * Niveau de vie du monstre par defaut
	 */
	final static int HP_MOB=10;
	/**
	 * attaque et defense du monstre par defaut
	 */
	final static int ATT_DEF_MOB=5;
	/**
	 * or et xp donner par le monstre par defaut
	 */
	final static int OR_XP_MOB=3;


	/**
	 * Constructeur
	 * 
	 * On definie deux constructeurs
	 * Par defaut on construira un slim avec ces stats de bases
	 * sinon on construit un monstre en fonction des parametres donnes
	 */
	public Monstre(){
		this.nom_monstre=NOM_MOB;
		this.hp_monstre=HP_MOB;
		this.attaque_monstre=ATT_DEF_MOB;
		this.defense_monstre=ATT_DEF_MOB;
		this.or_monstre=OR_XP_MOB;
		this.xp_monstre=OR_XP_MOB;
		
	}
	

	/**
	 * On cree le monstre souhaiter en definissant tous ces details
	 * serviras a la base de donnees ou une collection de monstre
	 * @param nomM   Nom du monstre a creer
	 * @param hp_mob  Niveau de vie du monstre a creer
	 * @param att_mob  Niveau d'attaque du monstre a creer
	 * @param def_mob  Niveau de defense du monstre a creer
	 * @param or_mob  Or donner par le monstre a creer
	 * @param xp_mob  xp donner par le monstre a creer
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
	
	
	
	
	
	
	
	
	
	
