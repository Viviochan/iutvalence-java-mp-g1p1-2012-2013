package fr.iutvalence.java.projets.rpg;


/**
 * @author goncalvs
 *
 */
public class PlateaudeJeu {
	
	/**
	 * Definira la dimmension de notre map
	 * 
	 * la carte aura la forme d'un carre de :
	 * 1000*1000
	 * que l'on gerera comme un tableau multidimensionnel a 2dimensios(Longueur definissant la taille
	 * des deux dimensios)
	 */
	public final static int LONGUEUR=1000;
	
	/**
	 * Carte du jeu, carte sur laquelle le joueur pourra se deplacer
	 * 
	 * Les plateau se gerera en couple d'int appeler coordonnees (x,y)
	 * ces deux entiers nous permetrons de placer notre hero le boss et bien d'autre element du jeu
	 * 
	 * 
	 * la valeur de map [x][y] nous indiqueras si la case est praticable ou pas
	 * par praticable on sous entend si le hero peux marcher/etre dessus
	 * 
	 * Au niveau graphique elle seront colorer et definiront un style de lieu precis(prairie, montagne,....)
	 * 
	 * 
	 * map[x][y]=1 ->case praticable
	 * map[x][y]=0 -> case non praticable (un obstacle gene le hero du genre rocher arbre pnj,...)
	 *
	 */
	private int[][] map;

	
	// FIXME déplacer les définitions des constantes avant celles des attributs
	/**
	 * Valeurs des cases
	 * A voi rsi on les geres avec un booleen ou pas
	 * 
	 * 0: si le hero ne peux pas etre possitionner sur la case
	 *  un autre objet est deja dessus (PNJ,decor,...)
	 */
	public final static int NON_PRATICABLE=0;
	
	/**
	 * 1: si le hero peux etre positionner sur la case
	 */
	public final static int PRATICABLE=1;

	


	
	// FIXME corriger le commentaire (ne pas dire à quoi servent les variables locales !!)
	/**
	 * Constructeurs
	 * On construit un plateau et on rend toutes les cases praticables pour le hero
	 * Certaines deviendront impraticable lorsqu'on placera un element du style pnj dessus
	 * 
	 *  exception: La casse du boss final est praticable mais elle declenche un combat
	 * 
	 * int i correspond aux abscisse
	 * int j correspond aux oordonne
	 */
	public PlateaudeJeu(){
		this.map= new int[LONGUEUR] [LONGUEUR];
		for(int i=0;i<LONGUEUR;i++){
			for(int j=0;j<LONGUEUR;j++){
				this.map[i][j]=PRATICABLE;
			}
		}
		
	}
	
	
	// FIXME compléter le commentaire
	/**
	 * @param x Abscisse sur la map
	 * @param y Oordonnes sur la map
	 * @return la valeur de la case 1 si elle est praticable 0 si un pnj ou un objet est poser dessus
	 */
	public int getCase(int x, int y){
		return this.map[x][y];
	
	}

	// FIXME compléter le commentaire
	/**
	 * @param x Abscisse sur la map
	 * @param y Oordonnes sur la map
	 * @param Val La nouvel valeur de la case voir si on remplace cette valeur par un booleen ou pas
	 */
	public void setCase(int x, int y, int Val){
		this.map[x][y]=Val;
	}


}
