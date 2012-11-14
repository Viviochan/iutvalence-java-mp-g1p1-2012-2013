package fr.iutvalence.java.projets.rpg;

/**
 * Boss/Monstre final du jeu
 * 
 * @author goncalvs
 */
public class Boss extends Monstre
{

	/**
	 * Nom du boss
	 */
	public final static String NOM_BOSS = "Dragon Lord";

	/**
	 * Abscisse du boss sur la map
	 */
	public final static int ABSCISSE_BOSS = 500;

	/**
	 * Ordonnee du boss sur la map
	 */
	// FIXME (FIXED)renommer la constante
	public final static int ORDONNE_BOSS = 1000;

	/**
	 * Points de vie du boss
	 */
	public final static int HP_BOSS = 350;

	/**
	 * Niveau d'attaque et de defense du boss
	 */
	public final static int ATT_DEF_BOSS = 110;

	/**
	 * Niveau d'or et d'xp donner par le boss
	 */
	public final static int OR_XP_BOSS = 0;

	/**
	 * Position du boss sur le plateau de jeu
	 */
	private Position posboss;
	

	/**
	 * Construction du Boss par rapport aux constructeurs de monstre nom:Lord Dragon point de vie:350 attaque:110
	 * defense:110 or:0 xp:0 Un seul et unique boss sera inclus dans le jeu On integrera des sous boss pris dans la base
	 * de monstre
	 * 
	 * @throws CoordonneesInvalideException 1
	 */
	public Boss() throws CoordonneesInvalideException
	{
		super(NOM_BOSS, HP_BOSS, ATT_DEF_BOSS, ATT_DEF_BOSS, OR_XP_BOSS, OR_XP_BOSS);
		this.posboss = new Position(ABSCISSE_BOSS, ORDONNE_BOSS);

	}

	// FIXME (FIXED)renommer la méthode en respectant les conventions d'écriture
	/**
	 * Donne la position du boss
	 * 
	 * @return posboss
	 */
	public Position getPossBoss()
	{
		return this.posboss;
	}

	// FIXME redéfinir toString
}
