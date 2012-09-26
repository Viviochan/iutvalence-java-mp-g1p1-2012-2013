package fr.iutvalence.java.projets.rpg;


/**
 * @author goncalvs
 *Classe des monstres qui serviront a la base de donnes
 */
public class Monstre {
	
	// FIXME déclarer les attributs en private et ajouter si besoin des accesseurs en lecture publics
	/**
	 * Attribut
	 * Nom du montre en question
	 */
	public String nom_monstre;
	
	/**
	 * Point de vie du monstre si 0 => mort
	 */
	public int hp_monstre;
	
	/**
	 * niveau d'attaque du monstre
	 */
	public int attaque_monstre;
	
	/**
	 * niveau de defense du monstre
	 */
	public int defense_monstre;
	
	
	/**
	 * xp donner par le monstre lors de sa mort
	 */
	public int xp_monstre;
	
	/**
	 * or donner par le monstre lors de sa mort
	 */
	public int or_monstre;



	// FIXME écrire un commentaire correct
	/**
	 * Constructeur
	 * 
	 * si rien est definis on creera un slim / gluant
	 * Monstre de base du jeu
	 */
	public Monstre(){
		// TODO définir une constante pour le nom par défaut
		this.nom_monstre="Slim";
		
		// FIXME définir des constantes pour les valeurs par défaut
		this.hp_monstre=10;
		this.attaque_monstre=5;
		this.defense_monstre=5;
		this.or_monstre=3;
		this.xp_monstre=5;
		
	}
	
	// FIXME finir la documentation
	/**
	 * On cree le monstre souhaiter en definissant tous ces details
	 * serviras a la base de donnees ou une collection de monstre
	 * @param nomM 
	 * @param hp_mob 
	 * @param att_mob 
	 * @param def_mob 
	 * @param or_mob 
	 * @param xp_mob 
	 */
	
	public Monstre(String nomM,int hp_mob,int att_mob, int def_mob, int or_mob, int xp_mob){
		this.nom_monstre=nomM;
		this.hp_monstre=hp_mob;
		this.attaque_monstre=att_mob;
		this.defense_monstre=def_mob;
		this.or_monstre=or_mob;
		this.xp_monstre=xp_mob;
		
	}
	


	
}
	
	
	
	
	
	
	
	
	
	
