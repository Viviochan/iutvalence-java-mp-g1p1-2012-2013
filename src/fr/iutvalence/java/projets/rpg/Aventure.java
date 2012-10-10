package fr.iutvalence.java.projets.rpg;



/**
 * @author goncalvs
 *
 *La classe Aventure s'occupera de lancer une partie 
 *
 *Pour la gestion de celle-ci on creera une classe partie
 *
 */
public class Aventure {
	
	/**
	 * Attribut
	 */
	/**
	 * Correspond a une direction que prend le hero
	 * Direction: Gauche
	 */
	final static String GAUCHE="gauche";
	/**
	 * Correspond a une direction que prend le hero
	 * Direction: Droite
	 */
	final static String DROITE="droite";
	/**
	 * Correspond a une direction que prend le hero
	 * Direction: Haut
	 */
	final static String HAUT="haut";
	/**
	 * Correspond a une direction que prend le hero
	 * Direction: Bas
	 */
	final static String BAS="bas";
	

	/**
	 * L'attribut qui nous permettrat de gerer la carte pendant une aventure
	 * 
	 */
	public PlateaudeJeu carte;
	

	/**
	 * Le Hero de notre aventure
	 */
	public Hero perso;
	

	/**
	 *Boss de l'aventure
	 */
	public Boss demon;
	
	/**
	 * Personnage vendeur et non vendeur du jeux(non jouable par le joueur)
	 */
	public PNJ npc;
	
	

	/**
	 * Collection ou tableau servant de base de donnes de monstre
	 * On la consultera pour chaque combat pour definir qui affronte le hero
	 */
	public Monstre[] Tab_Monstre;
	
	/**
	 * Tableau des niveaux du jeu
	 */
	public Niveau[] level;
	
	
	/**
	 * Le niveau maximal que le heros pourra atteindre
	 */
	public final static int NIVEAU_MAX=99;
	
	
	/**
	 * Tableau des competence du Jeu
	 */
	public Skill[] competence;
	
	
	

	/**
	 * Constructeur
	 * 
	 * Initialise les elements necessaire pour debuter une aventure
	 * 
	 * error_code servira juste de teste d'erreur et on affichera le probleme selon la valeur de error_code
	 */
	public Aventure(){ 
		this.carte= new PlateaudeJeu();
		this.perso= new Hero();
		this.demon= new Boss();
		int error_code=level();
		if(error_code!=1) System.out.println("Le Tableau de niveau ne c'ets pas generer convenablement" ); ;

		
		
	}
	
	/**
	 *Methodes ->Niveaux
	 * 
	 * level:
	 * Tableau qui nous permettra de gerer le niveau du hero en le comparant a celui-ci
	 * @return 1 si le tableau c'est bien remplie
	 * 
	 * construis le tableau de niveaux avec leur taux d'xp respectif
	 * 
	 * Pour chaque niveau on aura besoin de 75% d'xp en plus
	 */
	public int level(){
		int i=1;
		int xp=20;
		this.level=new Niveau[NIVEAU_MAX+1];
		this.level[0]=new Niveau(0,0);
		this.level[1]=new Niveau();
		for (i=2;i<NIVEAU_MAX;i++){
			for (i=2;i<99;i++){
				this.level[i]= new Niveau(i,xp);
				xp=(int) (xp + Math.floor(0.75*xp));
			}
		}
		return 1;
		
	}
	
	/**
	 * Methode permettant de gerer la monter de niveau du heros
	 * On test le taux de xp sur la table level et en fonction de celui ci
	 * On augmente le niveau du heros ou pas
	 * @return le nouveau niveau du heros
	 */
	public int level_up(){
		int lvlheros=this.perso.getNb_xp();
		int tauxlvlsuiv=this.level[lvlheros+1].getTaux();
		while(lvlheros>=tauxlvlsuiv){
			lvlheros++;
			tauxlvlsuiv=this.level[lvlheros+1].getTaux();
		}
		while(lvlheros>this.perso.getNb_xp()){
			this.perso.setNiveauheros();
		}	
		return (this.perso.getNb_xp());
		
	}



	/**
	 * 
	 * Methodes ->Heros
	 * Deplacement:
	 * on entre les coordonnes souhaiter
	 * On verifie si ce sont des coordonnes proche du heros en premier
	 * et ensuite on test si on peux se deplacer sur la case
	 * sinon on redemende de taper les coordonnees et on envoie un message expliquant pourquoi
	 * @param x_arr 
	 * @param y_arr 
	 * 
	 * 
	 * @return 0
	 */
	public int DeplacementHeros(int x_arr, int y_arr){
		int val_case;
		if((this.perso.getPos_x_heros()==x_arr)||((this.perso.getPos_x_heros())+1==x_arr)||((this.perso.getPos_x_heros()) - 1==x_arr)){
			if((this.perso.getPos_y_heros()==y_arr)||((this.perso.getPos_y_heros())+1==x_arr)||((this.perso.getPos_y_heros()) - 1==x_arr)){
				val_case=this.carte.getCase(x_arr, y_arr);
				if (val_case==1){
					this.perso.setPos_x_heros(x_arr);
					this.perso.setPos_y_heros(y_arr);
				}
				else return -1;/*la case est non praticable*/
				
				
			}
			else return -2;//ordonnes trop eloigne
		}
		else return -3;//abscisse trop eloigne

	return 0;	
	}
	
	
	/**
	 * On gere le deplacement du heros a partir de constante placer en parametre
	 * En fonction de la direction donner on change les coordonnes du hero
	 * 
	 * @param s Une direction (GAUCHE,DROITE,HAUT,BAS)
	 * @return 0 si le deplacement a bien ete effectuer
	 * 
	 * 
	 * Attention il manque encore gerer les exceptions
	 */
	public int DeplacementHeros(String s){
		int x=this.perso.getPos_x_heros();
		int y=this.perso.getPos_y_heros();
		if(s==this.GAUCHE){
			if(this.carte.getCase(x-1, y)==1){
				this.perso.setPos_x_heros(x-1);
			}
			else return -1;
		}
		if(s==this.DROITE){
			if(this.carte.getCase(x+1, y)==1){
				this.perso.setPos_x_heros(x+1);
			}
			else return -2;
		}
		if(s==this.HAUT){
			if(this.carte.getCase(x-1, y)==1){
				this.perso.setPos_y_heros(y+1);
			}
			else return -3;
		}
		if(s==this.BAS){
			if(this.carte.getCase(x-1, y)==1){
				this.perso.setPos_y_heros(x-1);
			}
			else return -4;
		}
		return 0;
	}
	
	
	
	
	/**
	 * Methodes PNJ
	 * Placement du ou des pnj par defaut
	 * 
	 * 
	 * 
	 * @return 0
	 */
	public int placementPnj(){
		return 0;
	}

	
	
	
	
	
	
	
	
}
