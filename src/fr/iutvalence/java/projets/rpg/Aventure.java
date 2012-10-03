package fr.iutvalence.java.projets.rpg;



// FIXME Le commentaire de classe n'est pas clair
// FIXME si cette classe repr�sente la gestion d'une partie, comment une partie d�marre ?
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

	// FIXME passer les attributs en public � moins que vous puissiez expliquer pour quelle raison ils doivent �tre n�cessairement publics 
	// FIXME les attributs ne doivent pas �tre initialis�s ici, c'est le r�le du constructeur
	
	// FIXME �crire un commentaire correct
	/**
	 * L'attribut qui nous permettrat de gerer la carte pendant une aventure
	 * 
	 */
	public PlateaudeJeu carte;
	
	// FIXME �crire un commentaire correct
	/**
	 * Le Hero de notre aventure
	 */
	public Hero perso;
	
	// FIXME �crire un commentaire correct
	/**
	 *Boss de l'aventure
	 */
	public Boss demon;
	
	
	/**
	 * Personnage vendeur et non vendeur du jeux(non jouable par le joueur)
	 */
	public PNJ npc;
	
	
	// FIXME �crire un commentaire correct
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
	
	
	
	// FIXME �crire un commentaire correct
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
	
	// FIXME �crire un commentaire correct
	/**
	 *Methodes ->Niveaux
	 * 
	 * level:
	 * @return 1 si le tableau c'est bien remplie
	 * 
	 * construis le tableau de valeur des niveau avec leur taux d'xp respectif
	 * 
	 * Pour chaque niveau on aura besoin de 75% d'xp en plus
	 */
	public int level(){
		int i=1;
		int xp=20;
		this.level=new Niveau[NIVEAU_MAX+1];
		this.level[0]=new Niveau(0,0);
		// FIXME � cet endroit le tableau n'existe pas (il n'est pas allou�)
		this.level[1]=new Niveau();
		for (i=2;i<NIVEAU_MAX;i++){
			this.level[i]= new Niveau(i,xp);
			xp=(int) (xp + Math.floor(0.75*xp));
		}
		return 1;
	}
	


	/**
	 * 
	 * Attention methode de gestion a passer dans la classe Partie lorsqu on la creera
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
				// TODO g�rer les erreurs avec des exceptions
				
				else return -1;/*la case est non praticable*/
				
				
			}
			else return -2;//ordonnes trop eloigne
		}
		else return -3;//abscisse trop eloigne

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
