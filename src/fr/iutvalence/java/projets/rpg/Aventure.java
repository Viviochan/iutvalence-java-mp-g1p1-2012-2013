package fr.iutvalence.java.projets.rpg;



// FIXME Le commentaire de classe n'est pas clair
// FIXME si cette classe représente la gestion d'une partie, comment une partie é�marre ?
/**
 * @author goncalvs
 *
 * 
 *Corresponds aux donnes d'une parties lancer
 *
 */
public class Aventure {
	
	/**
	 * Attribut
	 */

	// FIXME passer les attributs en public à moins que vous puissiez expliquer pour quelle raison ils doivent être nécessairement publics 
	// FIXME les attributs ne doivent pas être initialisés ici, c'est le rôle du constructeur
	
	// FIXME écrire un commentaire correct
	/**
	 * Creation de la carte
	 * 1000*1000 ou de LONGUEUR*LONGUEUR
	 */
	public PlateaudeJeu carte= new PlateaudeJeu();
	
	// FIXME écrire un commentaire correct
	// FIXME les attributs ne doivent pas être initialisés ici, c'est le rôle du constructeur
	/**
	 * Creation du heros
	 */
	public Hero perso= new Hero();
	
	// FIXME écrire un commentaire correct
	// FIXME les attributs ne doivent pas être initialisés ici, c'est le rôle du constructeur
	/**
	 * Creation du boss final
	 * position fixe sur la map et provoque un combat lorsque le joueurs s'approche de lui
	 */
	public Boss demon= new Boss();
	
	
	/**
	 * Ennemi creer lors du combat contre le joueur et recup d'une base de donnes
	 *
	 * public Monstre mob= new Monstre();
	*/
	
	// FIXME les attributs ne doivent pas être initialisés ici, c'est le rôle du constructeur
	/**
	 * Personnage vendeur et non vendeur du jeux(non jouable par le joueur)
	 */
	public PNJ npc=new PNJ();
	
	
	// FIXME écrire un commentaire correct
	/**
	 * Tableau contenant un exemplaire de chaque montre du jeu
	 * servant de base de donnees. L'indice du tableau pourra indiquer le level du monstre
	 * Donc a trier selon les hp att et def
	 */
	public Monstre[] Tab_Monstre;
	
	/**
	 * Tableau des niveaux du jeu
	 */
	public Niveau[] level;
	
	
	
	/**
	 * Tableau des competence du Jeu
	 */
	public Skill[] competence;
	
	
	
	// FIXME écrire un commentaire correct
	// FIXME gérer les erreurs en utilisant des exceptions
	/**
	 * Constructeur
	 * 
	 * Genere les elements necessaire a une aventure
	 * 
	 * error_code servira juste de teste d'erreur et on affichera le probleme selon la valeur de error_code
	 */
	public Aventure(){ 
		int error_code=level();
		if(error_code!=1) System.out.println("Le Tableau de niveau ne c'ets pas generer convenablement" ); ;

		
		
	}
	
	// FIXME écrire un commentaire correct
	// FIXME gérer les erreurs en utilisant des exceptions
	/**
	 * Constructeurs/Methodes
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
		// FIXME à cet endroit le tableau n'existe pas (il n'est pas alloué)
		this.level[1]=new Niveau();
		// FIXME est ce que la valeur 99 a vraiment un sens ? Si oui, il faudrait définir une constante plutôt
		for (i=2;i<99;i++){
			this.level[i]= new Niveau(i,xp);
			xp=(int) (xp + Math.floor(0.75*xp));
		}
		return 1;
	}
	
	// FIXME écrire un commentaire correct
	// FIXME gérer les erreurs avec des exceptions
	/**
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
		
		if((this.perso.pos_x_heros==x_arr)||((this.perso.pos_x_heros)+1==x_arr)||((this.perso.pos_x_heros) - 1==x_arr)){
			if((this.perso.pos_y_heros==y_arr)||((this.perso.pos_y_heros)+1==x_arr)||((this.perso.pos_y_heros) - 1==x_arr)){
				if (this.carte.map[x_arr][y_arr]==1){
					this.perso.pos_x_heros=x_arr;
					this.perso.pos_y_heros=y_arr;
				}

				
				else return -1;/*la case est non praticable*/
				
				
			}
			else return -2;//ordonnes trop eloigne
		}
		else return -3;//abscisse trop eloigne

		return 0;	
	}
	

	
	
	
	
	
	
	
	
}
