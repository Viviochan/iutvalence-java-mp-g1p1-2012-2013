package fr.iutvalence.java.projets.rpg;


/**
 * Definition des stats du heros que le joueur va incarner
 * 
 * @author goncalvs
 *
 */
public class Hero {
	
	/**
	 * Attributs
	 * 
	 * 
	 * Abscisse du heros sur la map
	 */
	


	private int pos_x_heros;

	

	/**
	 * Ordonnes du heros sur la map
	 * Le couple pos_x_heros et pos_y_heros donnerons les coordonnees de celuici sur la carte du jeu
	 */

	private int pos_y_heros;

	/**
	 * Nom du hero donner soit par le joueur soit definie par le constructeur
	 */

	private String nom_du_heros;

	/**
	 * Nom par defaut du Heros
	 */
	final static String NOM_HERO="Vivio";
	
	/**
	 * Niveau de vie du heros, si elle tombe a 0 "GAME OVER"
	 */
	private int point_de_vie;
	

	/**
	 * Niveau de magie du heros, permet le lancement de sort et autre magies
	 */
	private int point_de_mana;
	

	/**
	 * Niveau d'attaque du heros permet de determiner la force de frappe lors des combats
	 */
	private int attaque;
	

	/**
	 * Niveau de defense du heros permet de determiner la diminution des degat subis par l'adversaire
	 */
	private int defense;
	

	/**
	 * Niveau du heros.
	 */
	private int niveauheros;
	

	/**
	 * Experience du heros. Certains palier d'xp permettent de debloquer un niveau avec les bonus lui correspondant
	 */
	private int nb_xp;
	
	

	/**
	 * Monnaie du heros. Permet l'achat de divers items dans le jeu
	 */
	private int or;
	

	/**
	 * Tableau des competence du heros
	 * competences debloquer par le heros
	 * public Skill[] competence;
	 */
	final static int ABSCISSE_DEFAUT=10;
	final static int OORDONNE_DEFAUT=5;
	
	final static int HP_HERO=35;
	
	final static int MP_HERO=6;
	
	final static int ATT_DEF_HERO=30;
	
	final static int NIV_BASE=1;
	final static int XP_BASE=0;
	final static int OR_BASE=500;

	

	/**
	 * Constructeurs
	 */	
	/**
	 * Initialise le heros sans specifier de nom
	 */	
	public Hero(){
		this.nom_du_heros=NOM_HERO;
		this.pos_x_heros= ABSCISSE_DEFAUT;
		this.pos_y_heros= OORDONNE_DEFAUT;
		this.point_de_vie= HP_HERO;
		this.point_de_mana= MP_HERO;
		this.niveauheros= NIV_BASE;
		this.attaque= ATT_DEF_HERO;
		this.defense= ATT_DEF_HERO;
		this.nb_xp= XP_BASE;
		this.or= OR_BASE;
		
	}
	

	/**
	 * @param s  Nom du heros
	 * Initialisation a partir du constructeur par defaut 
	 */
	public Hero(String s){
		this();	
		this.nom_du_heros=s;
		
	}


	/**
	 * @return l'xp que possede le hero
	 */
	public int getNb_xp() {
		return nb_xp;
	}

	/**
	 * @param exp l'xp recue soit par un item soit apres un combat
	 * On l'ajoute a l'xp qu ele hero possede deja
	 */
	public void setNb_xp(int exp) {
		this.nb_xp = nb_xp+exp;
	}

	/**
	 * @return or Donne l'or que le hero porte
	 */
	public int get_Or_Hero() {
		return or;
	}

	/**
	 * @param piece l'or recue lors d'un combat ou trouver
	 * on ajoute cet or a celui que le hero possede deja
	 */
	public void set_Or_Hero(int piece) {
		this.or = or+piece;
	}

	/**
	 * @return niveauheros Donne le niveau actuel du Hero
	 */
	public int get_Niveau_Heros() {
		return niveauheros;
	}

	/**
	 * Monte le niveau du heros de 1
	 */
	public void setNiveauheros() {
		this.niveauheros++;
	}

	/**
	 * @return nom_du_heros Donne le nom du hero
	 */
	public String getNom_du_heros() {
		return nom_du_heros;
	}

	/**
	 * @param s Change le nom du hero
	 */
	public void setNom_du_heros(String s) {
		this.nom_du_heros = s;
	}

	/**
	 * @return point_de_vie
	 */
	public int getPoint_de_vie() {
		return point_de_vie;
	}

	/**
	 * @param pdv
	 */
	public void setPoint_de_vie(int pdv) {
		this.point_de_vie = point_de_vie+pdv;
	}

	/**
	 * @return point_de_mana
	 */
	public int getPoint_de_mana() {
		return point_de_mana;
	}

	/**
	 * @param pdm
	 */
	public void setPoint_de_mana(int pdm) {
		this.point_de_mana = point_de_mana+pdm;
	}

	/**
	 * @return attaque
	 * Le niveau d'attaque du heros
	 */
	public int getAttaque() {
		return attaque;
	}

	/**
	 * @param att
	 * Lors des lvl up on augmente l'attaque du heros de att
	 */
	public void setAttaque(int att) {
		this.attaque = attaque+att;
	}

	/**
	 * @return defense
	 * Le niveau de defense du heros
	 */
	public int getDefense() {
		return defense;
	}

	/**
	 * @param def
	 * Lors des lvl up on augmente la defense du heros de def
	 */
	public void setDefense(int def) {
		this.defense = defense+def;
	}

	/**
	 * @return pos_x_heros
	 * Donnes l'abscisse du heros
	 */
	public int getPos_x_heros() {
		return pos_x_heros;
	}

	/**
	 * @param x
	 * Change l'abscisse du heros 
	 * +1: si on va vers la droit
	 * -1: si on va vers la gauche
	 */
	public void setPos_x_heros(int x) {
		this.pos_x_heros = pos_x_heros+x;
	}

	/**
	 * @return pos_y_heros
	 * Donne l'oordonnes du heros
	 */
	public int getPos_y_heros() {
		return pos_y_heros;
	}

	/**
	 * @param y
	 * Change l'oordonne du heros 
	 * +1: si on va vers le haut
	 * -1:si on va vers le bas
	 */
	public void setPos_y_heros(int y) {
		this.pos_y_heros = pos_y_heros+y;
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
