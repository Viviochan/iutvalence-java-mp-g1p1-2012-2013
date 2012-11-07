package fr.iutvalence.java.projets.rpg;

/**
 * Definition des stats du heros que le joueur va incarner
 * 
 * @author goncalvs
 * 
 */
public class Hero
{
	
	
	/**
	 * Bonus en point de vie gagner a chaque lvl up
	 */
	public final static int BONUS_HP=5;
	/**
	 * Bonus en point de mana gagner a chaque lvl up
	 */
	public final static int BONUS_MP=6;
	/**
	 * bonus en attaque gagner a chaque lvl up
	 */
	public final static int BONUS_ATT=3;
	/**
	 * bonus en defense gagner a chaque lvl up
	 */
	public final static int BONUS_DEF=2;
	

	/**
	 * Point d'abscisse de depart
	 */
	public final static int ABSCISSE_DEFAUT = 10;

	/**
	 * Point d'oordonne de depart
	 */
	public final static int ORDONNE_DEFAUT = 5;

	/**
	 * Niveau de vie du hero au depart
	 */
	public final static int HP_HERO = 35;

	/**
	 * Niveau de mana du hero au depart
	 */
	public final static int MP_HERO = 6;

	/**
	 * Niveau d'attaque et de defense au depart
	 */
	public final static int ATT_DEF_HERO = 30;

	/**
	 * Niveau de depart du jeu
	 */
	public final static int NIV_BASE = 1;

	/**
	 * Xp au depart. Au debut de l'aventure le nombre d'xp est a 0
	 */
	public final static int XP_BASE = 0;

	/**
	 * Niveau d'or au depart
	 */
	public final static int OR_BASE = 500;
	
	/**
	 * 
	 */
	public final static int INVENTAIRE_SIZE=50;

	/**
	 * Nom par defaut du Heros
	 */
	public final static String NOMHERO = "Vivio";

	// FIXME respecter les conventions d'écriture
	/**
	 * Definie la position du hero sur le plateaudejeu
	 */
	private Position posheros;

	/**
	 * Nom du hero
	 */
	// FIXME (non résolu) respecter les conventions d'écriture
	private String nomduheros;

	
	
	/**
	 * Statistique du heros
	 */
	private Stats stats;
	
	
	private Item[] Inventaire;
	/**
	 * Niveau de vie du heros, si elle tombe a 0 "GAME OVER"
	 */
	// FIXME respecter les conventions d'écriture
	//private int pointdevie;

	/**
	 * Niveau de magie du heros, permet le lancement de sort et autre magies
	 */
	// FIXME respecter les conventions d'écriture
	//private int pointdemana;

	/**
	 * Niveau d'attaque du heros permet de determiner la force de frappe lors des combats
	 */
	//private int attaque;

	/**
	 * Niveau de defense du heros permet de determiner la diminution des degat subis par l'adversaire
	 */
	//private int defense;

	// FIXME respecter les conventions d'écriture
	/**
	 * Niveau du heros.
	 */
	private int niveauheros;

	/**
	 * Experience du heros. Certains palier d'xp permettent de debloquer un niveau avec les bonus lui correspondant
	 */
	// FIXME respecter les conventions d'écriture
	//private int nbxp;

	/**
	 * Monnaie du heros. Permet l'achat de divers items dans le jeu
	 */
	//private int or;

	/**
	 * Initialise le heros sans specifier de nom
	 * 
	 * poshero: (10,5) nomduhero: "Vivio" pointdevie: 35 pointdemana: 6 niveauheros: 1 attaque: 30 defense: 30 nbxp: 0
	 * or: 500
	 * 
	 * @throws CoordonneesInvalideException 1
	 */
	public Hero() throws CoordonneesInvalideException
	{
		this.posheros = new Position(ABSCISSE_DEFAUT, ORDONNE_DEFAUT);
		this.nomduheros = NOMHERO;
		this.niveauheros = NIV_BASE;
		this.stats=new Stats(MP_HERO,HP_HERO,ATT_DEF_HERO,ATT_DEF_HERO,XP_BASE,OR_BASE);
		this.Inventaire= new Item[INVENTAIRE_SIZE];//definir les items de base lors de la creation dune partie ou laisserr vide

	}

	// FIXME compléter le commentaire (documenter @throws)
	/**
	 * Initialisation a partir du constructeur par defaut
	 * 
	 * @param s
	 *            Nom du heros
	 * @throws CoordonneesInvalideException 2
	 * 
	 */
	public Hero(String s) throws CoordonneesInvalideException
	{
		this();
		this.nomduheros = s;

	}


	/**
	 * Retourne le niveau actuel du hero
	 * 
	 * @return niveauheros Donne le niveau actuel du Hero
	 */
	public int getNiveauHeros()
	{
		return this.niveauheros;
	}

	/**
	 * Monte le niveau du heros de 1
	 */
	// FIXME respecter les conventions d'écriture
	public void setNiveauheros()
	{
		this.niveauheros++;
	}

	/**
	 * Donner le nom du hero
	 * 
	 * @return nom_du_heros Donne le nom du hero
	 */
	// FIXME respecter les conventions d'écriture
	public String getNomduheros()
	{
		return this.nomduheros;
	}

	/**
	 * Modifie le nom du hero
	 * 
	 * @param s
	 *            Change le nom du hero
	 */
	// FIXME respecter les conventions d'écriture
	public void setNomduheros(String s)
	{
		this.nomduheros = s;
	}



	/**
	 * Donne la position du hero
	 * 
	 * @return (this.posheros.getX(),this.posheros.getY())
	 */
	// FIXME respecter les conventions d'écriture
	public Position getPosheros()
	{
		return this.posheros;
	}

	// FIXME compléter le commentaire
	/**
	 * change la position du heros
	 * 
	 * @param x
	 *            Nouvelle abscisse
	 * @param y
	 *            Nouvelles Ordonnees
	 * @throws CoordonneesInvalideException 2
	 * 
	 */
	// FIXME respecter les conventions d'écriture
	public void setPosheros(int x, int y) throws CoordonneesInvalideException
	{
		this.posheros.setX(x);
		this.posheros.setY(y);
	}

	/**
	 * change la position du heros
	 * 
	 * @param p
	 *            La nouvelle position
	 * 
	 * 
	 */
	// FIXME respecter les conventions d'écriture
	public void setPosshero(Position p)
	{
		this.posheros = p;
	}

	/**
	 * @return stats statistique 
	 */
	public Stats getStats(){
		return this.stats;
	}

	// FIXME redéfinir toString

	
	public String toString(){
		return "(nom:"+this.nomduheros+" niveau:"+this.niveauheros+" Statistiques;"+this.stats+")";
	}
	
	
	
	
	
}
