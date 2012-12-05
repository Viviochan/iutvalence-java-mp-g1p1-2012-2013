package fr.iutvalence.java.projets.rpg;

/**
 * Plateau qui servira de base a notre jeu
 * 
 * @author goncalvs
 * 
 */
public class PlateaudeJeu
{

	// FIXME s'il n'y a que 2 états, on peut supprimer les 2 constantes et les remplacer par une valuer booléenne
	//Pour le moment on a deux etats mais il se peut que j en insere un 3eme pour differencier si c est un pnj ou un simple decors qui bloque
	/**
	 * Valeurs des cases A voi rsi on les geres avec un booleen ou pas
	 * 
	 * false: si le hero ne peux pas etre possitionner sur la case un autre objet est deja dessus (PNJ,decor,...)
	 */
	public final static boolean NON_PRATICABLE = false;

	/**
	 * true: si le hero peux etre positionner sur la case
	 */
	public final static boolean PRATICABLE = true;

	/**
	 * Definira la dimmension de notre map
	 * 
	 * la carte aura la forme d'un carre de : 1000*1000 que l'on gerera comme un tableau multidimensionnel a
	 * 2dimensios(Longueur definissant la taille des deux dimensios)
	 */
	public final static int LONGUEUR = 1000;

	/**
	 * Carte du jeu, carte sur laquelle le joueur pourra se deplacer
	 * 
	 * Les plateau se gerera en couple d'int appeler coordonnees (x,y) ces deux entiers nous permetrons de placer notre
	 * hero le boss et bien d'autre element du jeu
	 * 
	 * 
	 * la valeur de map [x][y] nous indiqueras si la case est praticable ou pas par praticable on sous entend si le hero
	 * peux marcher/etre dessus
	 * 
	 * Au niveau graphique elle seront colorer et definiront un style de lieu precis(prairie, montagne,....)
	 * 
	 * 
	 * map[x][y]=True ->case praticable map[x][y]=false -> case non praticable (un obstacle gene le hero du genre rocher arbre
	 * pnj,...)
	 * 
	 */
	private boolean[][] map;

	/**
	 * Constructeurs On construit un plateau et on rend toutes les cases praticables pour le hero Certaines deviendront
	 * impraticable lorsqu'on placera un element du style pnj dessus
	 * 
	 * exception: La casse du boss final est praticable mais elle declenche un combat
	 * 
	 */
	public PlateaudeJeu()
	{
		this.map = new boolean[LONGUEUR][LONGUEUR];
		for (int i = 0; i < LONGUEUR; i++)
		{
			for (int j = 0; j < LONGUEUR; j++)
			{
				this.map[i][j] = true;
			}
		}

	}
	/**
	 * Constructeur:
	 * Permet de concevoir un plateau de jeu en fonction d'une longueur et d'une largeur données
	 * @param x longueur du plateau
	 * @param y largeur du plateau
	 */
	public PlateaudeJeu(int x, int y)
	{
		this.map = new boolean[x][y];
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
			{
				this.map[i][j] = true;
			}
		}

	}

	/**
	 * Methode retournant la valeur de la case - 1 si elle est praticable - 0 si un pnj ou un objet est poser dessus
	 * 
	 * @param x
	 *            Abscisse sur la map
	 * @param y
	 *            Oordonnes sur la map
	 * @return la valeur de la case 1 si elle est praticable 0 si un pnj ou un objet est poser dessus
	 */
	public boolean getCase(int x, int y)
	{
		return this.map[x][y];

	}

	/**
	 * Methode permettant de changer la valeur de la case - si PRATICABLE on la change par NON_PRATICABLE - si
	 * NON_PRATICABLE on la change par PRATICABLE
	 * 
	 * @param x
	 *            Abscisse sur la map
	 * @param y
	 *            Oordonnes sur la map
	 * 
	 *            La nouvel valeur de la case voir si on remplace cette valeur par un booleen ou pas
	 */
	public void setCase(int x, int y)
	{
		
		// FIXME (FIXED)simplifier en utilisant une valeur booleenne au lieu des constantes
		//Voir dans les attributs
		if (this.map[x][y] == NON_PRATICABLE)
		{
			this.map[x][y] = PRATICABLE;
		}
		else
		{
			this.map[x][y] = NON_PRATICABLE;
		}
	}


	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String s = "Map generer";
		for(int i=0;i<LONGUEUR;i++){
			//System.out.print(i);
			for(int j=0;j<LONGUEUR;j++){
				System.out.print(this.map[i][j]);
			}
			
			System.out.print("\n");
		}
		return s;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
