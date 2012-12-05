package fr.iutvalence.java.projets.rpg;

/**
 * 
 * Classe des monstres qui serviront a la base de donnes
 * 
 * @author goncalvs
 */
public class Monstre
{

	/**
	 * Nom du monstre creer par defaut
	 */
	public final static String NOM_MOB = "Slime";

	/**
	 * Niveau de vie du monstre par defaut
	 */
	public final static int HP_MOB = 10;

	/**
	 * Les monstre ne possede pas de point de mana
	 */
	public final static int MP_MOB = 0;
	/**
	 * attaque et defense du monstre par defaut
	 */
	public final static int ATT_DEF_MOB = 5;

	/**
	 * or et xp donner par le monstre par defaut
	 */
	public final static int OR_XP_MOB = 3;

	/**
	 * 
	 * Nom du montre en question
	 */
	private String nomMonstre;

	
	/**
	 * 
	 */
	private Stats stat;
	

	/**
	 * Constructeur
	 * 
	 * 
	 * Si aucun parametre n'est donné on créer un monstre defini par les constantes 
	 * 
	 *  nomM: Slim
	 *            Nom du monstre a creer
	 *  hpmob: 10
	 *            Niveau de vie du monstre a creer
	 *  attmob: 5
	 *            Niveau d'attaque du monstre a creer
	 *  defmob: 5
	 *            Niveau de defense du monstre a creer
	 *  ormob: 3
	 *            Or donner par le monstre a creer
	 *  xpmob: 3
	 *            xp donner par le monstre a creer
	 */
	public Monstre()
	{
		this.nomMonstre = NOM_MOB;
		this.stat= new Stats(0,HP_MOB,ATT_DEF_MOB,ATT_DEF_MOB,OR_XP_MOB,OR_XP_MOB);

	}

	/**
	 * On cree le monstre souhaiter en definissant tous ces details serviras a la base de donnees ou une collection de
	 * monstre
	 * 
	 * @param nomM
	 *            Nom du monstre a creer
	 * @param hpMob
	 *            Niveau de vie du monstre a creer
	 * @param attMob
	 *            Niveau d'attaque du monstre a creer
	 * @param defMob
	 *            Niveau de defense du monstre a creer
	 * @param orMob
	 *            Or donner par le monstre a creer
	 * @param xpMob
	 *            xp donner par le monstre a creer
	 */
	// FIXME respecter les conventions d'écriture (paramètres)
	public Monstre(String nomM, int hpMob, int attMob, int defMob, int orMob, int xpMob)
	{
		this.nomMonstre = nomM;
		this.stat= new Stats(0,hpMob,attMob,defMob,orMob,xpMob);
	}

	/**
	 * retourne le nom du monstre
	 * 
	 * @return le nom du monstre
	 */
	public String getNomMonstre()
	{
		return this.nomMonstre;
	}

	
	
	/**
	 * retourne les statistique du monstre
	 * 
	 * @return stat les stats du monstre
	 */
	public Stats getStats(){
		return this.stat;
	}

	
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return "( Nom monstre: "+this.nomMonstre+" Stats: "+this.stat+")";
			
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
