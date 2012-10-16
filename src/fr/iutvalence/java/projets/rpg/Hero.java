package fr.iutvalence.java.projets.rpg;


/**
 * Definition des stats du heros que le joueur va incarner
 * 
 * @author goncalvs
 *
 */
public class Hero {
	
	
	// FIXME regrouper abscisse et ordonnee dans une classe "Position"
	// FIXME (non résolu) respecter les conventions d'écriture
	/**
	 *
	 * Abscisse du heros sur la map
	 */
	private int pos_x_heros;


	/**
	 * Ordonnes du heros sur la map
	 * Le couple pos_x_heros et pos_y_heros donnerons les coordonnees de celuici sur la carte du jeu
	 */
	// FIXME (non résolu) respecter les conventions d'écriture
	private int pos_y_heros;

	// FIXME corriger le commentaire (on ne doit pas dire qui fixe la valeur)
	/**
	 * Nom du hero donné soit par le joueur soit definie par le constructeur
	 */
	// FIXME (non résolu) respecter les conventions d'écriture
	private String nom_du_heros;

	
	// FIXME placer les définitions des constantes avant celles des attributs
	/**
	 * Nom par defaut du Heros
	 */
	final static String NOM_HERO="Vivio";
	
	/**
	 * Niveau de vie du heros, si elle tombe a 0 "GAME OVER"
	 */
	// FIXME respecter les conventions d'écriture
	private int point_de_vie;
	

	/**
	 * Niveau de magie du heros, permet le lancement de sort et autre magies
	 */
	// FIXME respecter les conventions d'écriture
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
	// FIXME respecter les conventions d'écriture
	private int nb_xp;
	
	

	/**
	 * Monnaie du heros. Permet l'achat de divers items dans le jeu
	 */
	private int or;
	

	// FIXME regrouper les définitions des constantes (avant celles des attributs)
	
	
	/**
	 * Point d'abscisse de depart
	 */
	// FIXME indiquer une visibilité
	final static int ABSCISSE_DEFAUT=10;

	/**
	 * Point d'oordonne de depart
	 */
	// FIXME indiquer une visibilité
	final static int OORDONNE_DEFAUT=5;
	
	/**
	 * Niveau de vie du hero au depart
	 */
	// FIXME indiquer une visibilité
	final static int HP_HERO=35;
	
	/**
	 * Niveau de mana du hero au depart
	 */
	// FIXME indiquer une visibilité
	final static int MP_HERO=6;
	
	/**
	 * Niveau d'attaque et de defense au depart
	 */
	// FIXME indiquer une visibilité
	final static int ATT_DEF_HERO=30;
	
	/**
	 * Niveau de depart du jeu
	 */
	// FIXME indiquer une visibilité
	final static int NIV_BASE=1;
	
	/**
	 * Xp au depart. Au debut de l'aventure le nombre d'xp est a 0
	 */
	// FIXME indiquer une visibilité
	final static int XP_BASE=0;
	
	/**
	 * Niveau d'or au depart
	 */
	// FIXME indiquer une visibilité
	final static int OR_BASE=500;


	// FIXME compléter le commentaire (indiquer dans quel étate est l'objet créé)
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
	

	// FIXME corriger le commentaire (indiquer dans quel étate est l'objet créé)
	/**
	 * Initialisation a partir du constructeur par defaut 
	 * @param s  Nom du heros
	 * 
	 */
	public Hero(String s){
		this();	
		this.nom_du_heros=s;
		
	}


	// FIXME compléter le commentaire
	/**
	 * @return l'xp que possede le hero
	 */
	// FIXME respecter les conventions d'écriture
	public int getNb_xp() {
		return nb_xp;
	}

	/**
	 * On l'ajoute a l'xp qu ele hero possede deja
	 * @param exp l'xp recue soit par un item soit apres un combat
	 * 
	 */
	// FIXME respecter les conventions d'écriture
	public void setNb_xp(int exp) {
		this.nb_xp = nb_xp+exp;
	}

	// FIXME compléter le commentaire
	/**
	 * @return or Donne l'or que le hero porte
	 */
	// FIXME respecter les conventions d'écriture
	public int get_Or_Hero() {
		return or;
	}

	/**
	 * on ajoute cet or a celui que le hero possede deja
	 * @param piece l'or recue lors d'un combat ou trouver
	 *
	 */
	
	public void set_Or_Hero(int piece) {
		this.or = or+piece;
	}
	
	// FIXME respecter les conventions d'écriture
	/**
	 * @return niveauheros Donne le niveau actuel du Hero
	 */
	public int get_Niveau_Heros() {
		return niveauheros;
	}

	/**
	 * Monte le niveau du heros de 1
	 */
	// FIXME respecter les conventions d'écriture
	public void setNiveauheros() {
		this.niveauheros++;
	}

	/**
	 * @return nom_du_heros Donne le nom du hero
	 */
	// FIXME respecter les conventions d'écriture
	public String getNom_du_heros() {
		return nom_du_heros;
	}

	// FIXME compléter le commentaire
	/**
	 * @param s Change le nom du hero
	 */
	// FIXME respecter les conventions d'écriture
	public void setNom_du_heros(String s) {
		this.nom_du_heros = s;
	}

	// FIXME compléter le commentaire
	/**
	 * @return point_de_vie
	 */
	// FIXME respecter les conventions d'écriture
	public int getPoint_de_vie() {
		return point_de_vie;
	}

	// FIXME compléter le commentaire
	/**
	 * @param pdv
	 */
	// FIXME respecter les conventions d'écriture
	public void setPoint_de_vie(int pdv) {
		this.point_de_vie = point_de_vie+pdv;
	}

	// FIXME compléter le commentaire
	/**
	 * @return point_de_mana
	 */
	// FIXME respecter les conventions d'écriture
	public int getPoint_de_mana() {
		return point_de_mana;
	}

	// FIXME compléter le commentaire
	/**
	 * @param pdm
	 */
	// FIXME respecter les conventions d'écriture
	public void setPoint_de_mana(int pdm) {
		this.point_de_mana = point_de_mana+pdm;
	}
	
	/**
	 * Le niveau d'attaque du heros
	 * @return attaque
	 * 
	 */
	public int getAttaque() {
		return attaque;
	}

	// FIXME compléter le commentaire
	/**
	 * Lors des lvl up on augmente l'attaque du heros de att
	 * @param att
	 * 
	 */
	public void setAttaque(int att) {
		this.attaque = attaque+att;
	}

	
	/**
	 * Le niveau de defense du heros
	 * @return defense
	 * 
	 */
	public int getDefense() {
		return defense;
	}

	// FIXME compléter le commentaire
	/**
	 * Lors des lvl up on augmente la defense du heros de def
	 * @param def
	 * 
	 */
	public void setDefense(int def) {
		this.defense = defense+def;
	}

	/**
	 * Donne l'abscisse du heros
	 * @return pos_x_heros
	 * 
	 */
	// FIXME respecter les conventions d'écriture
	public int getPos_x_heros() {
		return pos_x_heros;
	}

	// FIXME compléter le commentaire
	/**
	 *
	 * Change l'abscisse du heros 
	 * +1: si on va vers la droit
	 * -1: si on va vers la gauche
	 *  @param x
	 */
	// FIXME respecter les conventions d'écriture
	public void setPos_x_heros(int x) {
		this.pos_x_heros = pos_x_heros+x;
	}

	/**
	 * Donne l'oordonnee du heros
	 * @return pos_y_heros
	 * 
	 */
	// FIXME respecter les conventions d'écriture
	public int getPos_y_heros() {
		return pos_y_heros;
	}

	// FIXME compléter le commentaire
	/**
	 * 
	 * Change l'oordonne du heros 
	 * +1: si on va vers le haut
	 * -1:si on va vers le bas
	 * @param y
	 */
	// FIXME respecter les conventions d'écriture
	public void setPos_y_heros(int y) {
		this.pos_y_heros = pos_y_heros+y;
	}

	// FIXME redéfinir toString

}
