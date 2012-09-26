package fr.iutvalence.java.projets.rpg;


/**
 * Definition des stats du heros que le joueur va incarner
 * 
 * @author goncalvs
 *
 */
public class Hero {
	
	/**
	 * Attributs
	 * 
	 * 
	 * Abscisse du heros sur la map
	 */
	
	// FIXME déclarer les attributs en private et ajouter si besoin des accesseurs en lecture publics

	public int pos_x_heros;
	
	/**
	 * Ordonnes du heros sur la map
	 * Le couple pos_x_heros et pos_y_heros donnerons les coordonnees de celuici sur la carte du jeu
	 */
	public int pos_y_heros;
	/**
	 * Nom du hero donner soit par le joueur soit definie par le constructeur
	 */
	public String nom_du_heros;
	/**
	 * Niveau de vie du heros, si elle tombe a 0 "GAME OVER"
	 */
	public int point_de_vie;
	
	/**
	 * Niveau de magie du heros, permet le lancement de sort et autre magies
	 */
	public int point_de_mana;
	
	
	/**
	 * Niveau d'attaque du heros permet de determiner la force de frappe lors des combats
	 */
	public int attaque;
	
	
	/**
	 * Niveau de defense du heros permet de determiner la diminution des degat subis par l'adversaire
	 */
	public int defense;
	
	
	/**
	 * Niveau du heros.
	 */
	public int niveauheros;
	
	
	/**
	 * Experience du heros. Certains palier d'xp permettent de debloquer un niveau avec les bonus lui correspondant
	 */
	public int nb_xp;
	
	
	
	/**
	 * Monnaie du heros. Permet l'achat de divers items dans le jeu
	 */
	public int or;
	

	/**
	 * Tableau des competence du heros
	 * competences debloquer par le heros
	public Skill[] competence;
	*/
	

	
	// FIXME définir des constantes pour les valeurs par défaut
	/**
	 * Constructeurs
	 */	
	/**
	 * Initialise le heros sans specifier de nom
	 */	
	public Hero(){
		this.pos_x_heros=10;
		this.pos_y_heros=5;
		this.point_de_vie= 30;
		this.point_de_mana=10;
		this.niveauheros=1;
		this.attaque=30;
		this.defense=30;
		this.nb_xp=0;
		this.or=500;
		
	}
	
	// FIXME écrire un commentaire correct
	/**
	 * @param s  Nom du hero taper au clavier par le joueur ou definit par defaut
	 * Initialisation a partir du constructeur par defaut 
	 */
	public Hero(String s){
		this();	
		this.nom_du_heros=s;
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
