package fr.iutvalence.java.projets.rpg;


/**
 * Definition des stats du heros que le joueur va incarner
 * 
 * @author goncalvs
 *
 */
public class Hero {
	

	
	// FIXME (FIXED)regrouper les définitions des constantes (avant celles des attributs)
	
	
	/**
	 * Point d'abscisse de depart
	 */
	// FIXME (FIXED)indiquer une visibilité
	public final static int ABSCISSE_DEFAUT=10;

	/**
	 * Point d'oordonne de depart
	 */
	// FIXME (FIXED)indiquer une visibilité
	public final static int ORDONNE_DEFAUT=5;
	
	/**
	 * Niveau de vie du hero au depart
	 */
	// FIXME (FIXED) indiquer une visibilité
	public final static int HP_HERO=35;
	
	/**
	 * Niveau de mana du hero au depart
	 */
	// FIXME (FIXED)indiquer une visibilité
	public final static int MP_HERO=6;
	
	/**
	 * Niveau d'attaque et de defense au depart
	 */
	// FIXME (FIXED)indiquer une visibilité
	public final static int ATT_DEF_HERO=30;
	
	/**
	 * Niveau de depart du jeu
	 */
	// FIXME (FIXED)indiquer une visibilité
	public final static int NIV_BASE=1;
	
	/**
	 * Xp au depart. Au debut de l'aventure le nombre d'xp est a 0
	 */
	// FIXME (FIXED)indiquer une visibilité
	public final static int XP_BASE=0;
	
	/**
	 * Niveau d'or au depart
	 */
	// FIXME (FIXED) indiquer une visibilité
	public final static int OR_BASE=500;
	
	// FIXME (FIXED)placer les définitions des constantes avant celles des attributs
	/**
	 * Nom par defaut du Heros
	 */
	public final static String NOMHERO="Vivio";
	
	/**
	 * Definie la position du hero sur le plateaudejeu
	 */
	private Position posheros;

	// FIXME corriger le commentaire (on ne doit pas dire qui fixe la valeur)(FIXED)
	/**
	 * Nom du hero
	 */
	// FIXME (non résolu) respecter les conventions d'écriture
	private String nomduheros;
	
	/**
	 * Niveau de vie du heros, si elle tombe a 0 "GAME OVER"
	 */
	// FIXME respecter les conventions d'écriture
	private int pointdevie;
	

	/**
	 * Niveau de magie du heros, permet le lancement de sort et autre magies
	 */
	// FIXME respecter les conventions d'écriture
	private int pointdemana;
	

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
	private int nbxp;
	
	

	/**
	 * Monnaie du heros. Permet l'achat de divers items dans le jeu
	 */
	private int or;
	


	// FIXME compléter le commentaire (indiquer dans quel étate est l'objet créé)
	/**
	 * Initialise le heros sans specifier de nom
	 * 
	 * poshero: (10,5)
	 * nomduhero: "Vivio"
	 * pointdevie: 35
	 * pointdemana: 6
	 * niveauheros: 1
	 * attaque: 30
	 * defense: 30
	 * nbxp: 0
	 * or: 500
	 * @throws CoordonneesInvalideException 
	 */	
	public Hero() throws CoordonneesInvalideException{
		this.posheros=new Position(ABSCISSE_DEFAUT,ORDONNE_DEFAUT);
		this.nomduheros=NOMHERO;
		this.pointdevie= HP_HERO;
		this.pointdemana= MP_HERO;
		this.niveauheros= NIV_BASE;
		this.attaque= ATT_DEF_HERO;
		this.defense= ATT_DEF_HERO;
		this.nbxp= XP_BASE;
		this.or= OR_BASE;
		
	}
	

	// FIXME corriger le commentaire (indiquer dans quel étate est l'objet créé)
	/**
	 * Initialisation a partir du constructeur par defaut 
	 * @param s  Nom du heros
	 * @throws CoordonneesInvalideException 
	 * 
	 */
	public Hero(String s) throws CoordonneesInvalideException{
		this();	
		this.nomduheros=s;
		
	}


	// FIXME compléter le commentaire
	/**
	 * retounre le nombre d'xp du hero
	 * @return l'xp que possede le hero
	 */
	// FIXME respecter les conventions d'écriture
	public int getNbxp() {
		return nbxp;
	}

	/**
	 * On l'ajoute a l'xp que le hero possede deja
	 * @param exp l'xp recue soit par un item soit apres un combat
	 * 
	 */
	// FIXME respecter les conventions d'écriture
	public void setNbxp(int exp) {
		this.nbxp = nbxp+exp;
	}

	// FIXME compléter le commentaire
	/**
	 * Retourne la quantite d'or que le hero possede
	 * @return or Donne l'or que le hero porte
	 */
	// FIXME respecter les conventions d'écriture
	public int getOrHero() {
		return or;
	}

	/**
	 * on ajoute cet or a celui que le hero possede deja
	 * @param piece l'or recue lors d'un combat ou trouver
	 *
	 */
	
	public void setOrHero(int piece) {
		this.or = this.or+piece;
	}
	
	// FIXME respecter les conventions d'écriture
	/**
	 * Retourne le niveau actuel du hero
	 * @return niveauheros Donne le niveau actuel du Hero
	 */
	public int getNiveauHeros() {
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
	 * Donner le nom du hero
	 * @return nom_du_heros Donne le nom du hero
	 */
	// FIXME respecter les conventions d'écriture
	public String getNomduheros() {
		return nomduheros;
	}

	// FIXME (FIXED)compléter le commentaire
	/**
	 * Modifie le nom du hero
	 * @param s Change le nom du hero
	 */
	// FIXME respecter les conventions d'écriture
	public void setNomduheros(String s) {
		this.nomduheros = s;
	}

	// FIXME (FIXED)compléter le commentaire
	/**
	 * retourne les point de vie du hero
	 * @return pointdevie
	 */
	// FIXME respecter les conventions d'écriture
	public int getPointdevie() {
		return pointdevie;
	}

	// FIXME (FIXED)compléter le commentaire
	/**
	 * modifie les point de vie du hero
	 * @param pdv
	 */
	// FIXME respecter les conventions d'écriture
	public void setPointdevie(int pdv) {
		this.pointdevie = this.pointdevie+pdv;
	}

	// FIXME (FIXED)compléter le commentaire
	/**
	 * @return point_de_mana
	 */
	// FIXME respecter les conventions d'écriture
	public int getPointdemana() {
		return pointdemana;
	}

	// FIXME (FIXED)compléter le commentaire
	/**
	 * Retourne les point de mana du hero
	 * @param pdm
	 */
	// FIXME respecter les conventions d'écriture
	public void setPointdemana(int pdm) {
		this.pointdemana = this.pointdemana+pdm;
	}
	
	/**
	 * Le niveau d'attaque du heros
	 * @return attaque
	 * 
	 */
	public int getAttaque() {
		return attaque;
	}

	// FIXME (FIXED)compléter le commentaire
	/**
	 * Augemente l'attaque du hero
	 * @param att
	 * 
	 */
	public void setAttaque(int att) {
		this.attaque = this.attaque+att;
	}

	
	/**
	 * Le niveau de defense du heros
	 * @return defense
	 * 
	 */
	public int getDefense() {
		return defense;
	}

	// FIXME (FIXED)compléter le commentaire
	/**
	 * Augmente le niveau de defense du hero
	 * @param def
	 * 
	 */
	public void setDefense(int def) {
		this.defense = this.defense+def;
	}


	/**
	 * Donne la position du hero
	 * @return (this.posheros.getX(),this.posheros.getY())
	 */
	public Position getPosheros() {
		return this.posheros;
	}


	/**
	 * change la position du heros
	 * @param x Nouvelle abscisse
	 * @param y Nouvelles Ordonnees
	 * @throws CoordonneesInvalideException 
	 * 
	 */
	public void setPosheros(int x, int y) throws CoordonneesInvalideException {
		this.posheros.setX(x);
		this.posheros.setY(y);
	}

	/**
	 * change la position du heros
	 * @param p La nouvelle position
	 * 
	 * 
	 */
	public void setPosshero(Position p){
		this.posheros=p;
	}


	// FIXME redéfinir toString

}
