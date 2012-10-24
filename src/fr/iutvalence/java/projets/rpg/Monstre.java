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
	public final static String NOM_MOB = "Slim";

	/**
	 * Niveau de vie du monstre par defaut
	 */
	public final static int HP_MOB = 10;

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
	// FIXME respecter les conventions d'écriture
	private String nommonstre;

	/**
	 * Point de vie du monstre si 0 => mort
	 */
	// FIXME respecter les conventions d'écriture
	private int hpmonstre;

	/**
	 * niveau d'attaque du monstre
	 */
	// FIXME respecter les conventions d'écriture
	private int attaquemonstre;

	/**
	 * niveau de defense du monstre
	 */
	// FIXME respecter les conventions d'écriture
	private int defensemonstre;

	/**
	 * xp donner par le monstre lors de sa mort
	 */
	// FIXME respecter les conventions d'écriture
	private int xpmonstre;

	/**
	 * or donner par le monstre lors de sa mort
	 */
	// FIXME respecter les conventions d'écriture
	private int ormonstre;

	// FIXME corriger le commentaire
	/**
	 * Constructeur
	 * 
	 * On definie deux constructeurs
	 * 
	 * Si aucun parametres n'est donnés on créer un monstre definie par les constantes Un Slim
	 */
	public Monstre()
	{
		this.nommonstre = NOM_MOB;
		this.hpmonstre = HP_MOB;
		this.attaquemonstre = ATT_DEF_MOB;
		this.defensemonstre = ATT_DEF_MOB;
		this.ormonstre = OR_XP_MOB;
		this.xpmonstre = OR_XP_MOB;

	}

	/**
	 * On cree le monstre souhaiter en definissant tous ces details serviras a la base de donnees ou une collection de
	 * monstre
	 * 
	 * @param nomM
	 *            Nom du monstre a creer
	 * @param hpmob
	 *            Niveau de vie du monstre a creer
	 * @param attmob
	 *            Niveau d'attaque du monstre a creer
	 * @param defmob
	 *            Niveau de defense du monstre a creer
	 * @param ormob
	 *            Or donner par le monstre a creer
	 * @param xpmob
	 *            xp donner par le monstre a creer
	 */
	// FIXME respecter les conventions d'écriture (paramètres)
	public Monstre(String nomM, int hpmob, int attmob, int defmob, int ormob, int xpmob)
	{
		this.nommonstre = nomM;
		this.hpmonstre = hpmob;
		this.attaquemonstre = attmob;
		this.defensemonstre = defmob;
		this.ormonstre = ormob;
		this.xpmonstre = xpmob;

	}

	/**
	 * retourne le nom du monstre
	 * 
	 * @return le nom du monstre
	 */
	// FIXME respecter les conventions d'écriture
	public String getNommonstre()
	{
		return this.nommonstre;
	}

	/**
	 * retourne les point de vie du monstre
	 * 
	 * @return les point de vie du monstre
	 */
	// FIXME respecter les conventions d'écriture
	public int getHpmonstre()
	{
		return this.hpmonstre;
	}

	/**
	 * retourne l'attaque du monstre
	 * 
	 * @return l'attaque du monstre nous permettant plus loin le calcul des degats et diminution de degats
	 */
	// FIXME respecter les conventions d'écriture
	public int getAttmonstre()
	{
		return this.attaquemonstre;
	}

	/**
	 * retourne la defense du monstre
	 * 
	 * @return la defense du monstre nous permettant plus loin le calcul des degats et diminution de degats
	 */
	// FIXME respecter les conventions d'écriture
	public int getDefmonstre()
	{
		return this.defensemonstre;
	}

	/**
	 * retourne la quantite d'or porter par le monstre
	 * 
	 * @return l'or porter par le monstre que le heros pourra ajouter a sa bourse
	 */
	// FIXME respecter les conventions d'écriture
	public int getOrmonstre()
	{
		return this.ormonstre;
	}

	/**
	 * retourne le taux d'xp donner par le monstre
	 * 
	 * @return le taux d'xp que le monstre donne au heros
	 */
	// FIXME respecter les conventions d'écriture
	public int get_Xpmonstre()
	{
		return this.xpmonstre;
	}

	// FIXME redéfinir toString
}
