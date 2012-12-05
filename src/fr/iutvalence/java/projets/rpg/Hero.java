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

	/**
	 * Definie la position du hero sur le plateaudejeu
	 */
	private Position posHeros;

	/**
	 * Nom du hero
	 */
	private String nomDuHeros;	
	
	/**
	 * Statistique du heros
	 */
	private Stats stats;
	
	// FIXME (FIXED)commentaire
	/**
	 * Inventaire du Hero qui contiendra tous ces items trouver dans l'aventure
	 */
	private Item[] inventaire;

	// FIXME (FIXED) commentaire
	/**
	 * La taille de l'inventaire
	 */
	private int tailleInventaire;
	
	// FIXME (FIXED)commentaire
	/**
	 * Un item du type casque porter par le Hero
	 */
	private Item armurecasque;
	
	// FIXME (FIXED)commentaire
	/**
	 * Un item du type armure pour le buste porter par le Hero
	 */
	private Item armurebuste;
	
	// FIXME(FIXED) commentaire
	/**
	 * Un item du type armure bras porter par le Hero
	 */
	private Item armurebras;
	
	// FIXME (FIXED)commentaire
	/**
	 * Un item du type armure pied porter par le Hero
	 */
	private Item armurepied;
	
	// FIXME (FIXED)commentaire
	/**
	 * Un item du type bouclier porter par le Hero
	 */
	private Item bouclier;
	
	// FIXME (FIXED)commentaire
	/**
	 * Un item de type arme porter par le Hero
	 */
	private Item arme;
	
	
	// FIXME (FIXED)respecter les conventions d'écriture
	//element redefine dans la classe stat


	// FIXME(FIXED)respecter les conventions d'écriture
	//element redefine dans la classe stat

	// FIXME (FIXED)respecter les conventions d'écriture
	/**
	 * Niveau du heros.
	 */
	private int niveauHeros;


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
		this.posHeros = new Position(ABSCISSE_DEFAUT, ORDONNE_DEFAUT);
		this.nomDuHeros = NOMHERO;
		this.niveauHeros = NIV_BASE;
		this.stats=new Stats(MP_HERO,HP_HERO,ATT_DEF_HERO,ATT_DEF_HERO,XP_BASE,OR_BASE);
		this.inventaire= new Item[INVENTAIRE_SIZE];//definir les items de base lors de la creation dune partie ou laisserr vide
		this.tailleInventaire=0;
		Item debut= new Item("Lame du Faucon",TypeItem.Arme,12,10,5);
		this.arme=debut;
	}
	
	
	
	

	/**
	 * Initialisation a partir du constructeur par defaut
	 * 
	 * @param s
	 *            Nom du heros
	 * @throws CoordonneesInvalideException si les coordonnes de creations du heros ne sont pas valide
	 * 
	 */
	public Hero(String s) throws CoordonneesInvalideException
	{
		this();
		this.nomDuHeros = s;

	}


	
	/**
	 * Initialise une Hero a partir d'une position et d'un nom saisie
	 * @param s le nom du hero
	 * @param x l'abscisse du Hero
	 * @param y l'ordonnes du Heor
	 * @throws CoordonneesInvalideException si les coordonnes de creations du heros ne sont pas valide
	 */
	public Hero(String s, int x, int y) throws CoordonneesInvalideException
	{
		this.nomDuHeros = s;
		this.posHeros = new Position(x, y);
		this.nomDuHeros = NOMHERO;
		this.niveauHeros = NIV_BASE;
		this.stats=new Stats(MP_HERO,HP_HERO,ATT_DEF_HERO,ATT_DEF_HERO,XP_BASE,OR_BASE);
		this.inventaire= new Item[INVENTAIRE_SIZE];//definir les items de base lors de la creation dune partie ou laisserr vide
		this.tailleInventaire=0;
		Item debut= new Item("Lame du Faucon",TypeItem.Arme,12,10,5);
		this.arme=debut;
	}
	
	
	/**
	 * Retourne le niveau actuel du hero
	 * 
	 * @return niveauheros Donne le niveau actuel du Hero
	 */
	public int getNiveauHeros()
	{
		return this.niveauHeros;
	}

	/**
	 * Monte le niveau du heros de 1
	 */
	public void setNiveauHeros()
	{
		this.niveauHeros=this.niveauHeros+1;
	}

	/**
	 * Donner le nom du hero
	 * 
	 * @return nom_du_heros Donne le nom du hero
	 */
	public String getNomHeros()
	{
		return this.nomDuHeros;
	}

	/**
	 * Modifie le nom du hero
	 * 
	 * @param s
	 *            Change le nom du hero
	 */
	public void setNomHeros(String s)
	{
		this.nomDuHeros = s;
	}



	/**
	 * Donne la position du hero
	 * 
	 * @return (this.posheros.getX(),this.posheros.getY())
	 */
	public Position getPosHeros()
	{
		return this.posHeros;
	}

	/**
	 * change la position du heros
	 * 
	 * @param x
	 *            Nouvelle abscisse
	 * @param y
	 *            Nouvelles Ordonnees
	 * @throws CoordonneesInvalideException si les nouvelles coordonnes ne sont pas valide
	 * 
	 */
	public void setPosHeros(int x, int y) throws CoordonneesInvalideException
	{
		this.posHeros.setX(x);
		this.posHeros.setY(y);
	}

	/**
	 * change la position du heros
	 * 
	 * @param p
	 *            La nouvelle position
	 * 
	 * 
	 */
	public void setPosHero(Position p)
	{
		this.posHeros = p;
	}

	/**
	 * @return stats statistique 
	 */
	public Stats getStats(){
		return this.stats;
	}



	/**
	 * retourne le casque que le heros porte
	 * @return armurecasque 
	 */
	public Item getArmurecasque()
	{
		return this.armurecasque;
	}

	/**
	 * Change le casque du hero
	 * @param armurecasque un item de type casque
	 */
	public void setArmurecasque(Item armurecasque)
	{
		this.armurecasque = armurecasque;
	}

	/**
	 * Retourne l armure que le hero porte
	 * @return armure buste
	 */
	public Item getArmurebuste()
	{
		return this.armurebuste;
	}

	/**
	 * Modifie le buste que le hero porte
	 * @param armurebuste un item de type buste
	 */
	public void setArmurebuste(Item armurebuste)
	{
		this.armurebuste = armurebuste;
	}

	/**
	 * Retourne les  gants que le hero porte
	 * @return armurebras
	 */
	public Item getArmurebras()
	{
		return this.armurebras;
	}

	/**
	 * Modifie l armure du bras
	 * @param armurebras  nouvelle piece a modifier
	 */
	public void setArmurebras(Item armurebras)
	{
		this.armurebras = armurebras;
	}

	/**
	 * Retourne l armure du pied
	 * @return armurepied 
	 */
	public Item getArmurePied()
	{
		return this.armurepied;
	}

	/**
	 * Modifie l armure du pied
	 * @param armurepied nouvelle piece
	 */
	public void setArmurepied(Item armurepied)
	{
		this.armurepied = armurepied;
	}

	/**
	 * Retourne le bouclier
	 * @return bouclier
	 */
	public Item getBouclier()
	{
		return this.bouclier;
	}

	/**
	 * Modifie le bouclier
	 * @param bouclier nouveau bouclier
	 */
	public void setBouclier(Item bouclier)
	{
		this.bouclier = bouclier;
	}

	/**
	 * Retourne l arme
	 * @return arme
	 */
	public Item getArme()
	{
		return this.arme;
	}

	/**
	 * Modifie l arme
	 * @param arme la nouvelle arme
	 */
	public void setArme(Item arme)
	{
		this.arme = arme;
	}

	/**
	 * Retourne un item 
	 * @param i indice de l item dans l inventaire
	 * @return item a l emplacement i 
	 */
	public Item getInventaire(int i)
	{
		return this.inventaire[i];
	}

	/**
	 * Rajoute un item dans l inventaire
	 * @param item item utiliser
	 */
	public void setInventaire(Item item)
	{
			this.inventaire[this.tailleInventaire] = item;
	}
	

	
	public String toString(){
		return "(nom:"+this.nomDuHeros+" niveau:"+this.niveauHeros+" Statistiques;"+this.stats+" Position:"+this.getPosHeros()+")";
	}
	
	
}
