package fr.iutvalence.java.projets.rpg;


/**
 * @author goncalvs
 *
 */
public class PlateaudeJeu {
	
	/**
	 * Attribut
	 * 
	 * LONGUER d'un cote du tableau on pretend que la carre formeras un carre
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
	
	
	public int [] [] map = new int[LONGUEUR] [LONGUEUR];
	
	
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
		for(int i=0;i<LONGUEUR;i++){
			for(int j=0;j<LONGUEUR;j++){
				this.map[i][j]=1;
			}
		}
		
	}

}
