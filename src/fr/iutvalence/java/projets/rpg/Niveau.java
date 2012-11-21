package fr.iutvalence.java.projets.rpg;

/**
 * Structure de niveau. un niveau demande int xp et debloque divers bonus voir une competence
 * 
 * @author goncalvs
 */
public class Niveau
{

	/**
	 * Niveau de base du Jeu Toute aventure commence au niveau 1
	 */
	public final static int NIVEAU_DEPART = 1;
	
	/**
	 * Niveau maximale du jeu
	 */
	public final static int NIVEAU_MAX=99;

	/**
	 * Niveau d'xp au debut de l'aventure
	 */
	public final static int XP_DEPART = 0;

	/**
	 * numero du level atteint
	 */
	// FIXME (FIXED)respecter les conventions d'écriture
	private int numLvl;

	/**
	 * xp necessaire pour atteindre le lvl
	 */
	// FIXME (FIXED)respecter les conventions d'écriture
	private int tauxXp;

	/**
	 * Initialisation du NIVEAU_DEPART avec XP_DEPART
	 */
	public Niveau()
	{
		this.numLvl = NIVEAU_DEPART;
		this.tauxXp = XP_DEPART;
	}

	/**
	 * definit les niveau avec leur taux de xp
	 * 
	 * @param num
	 *            numeros du lvl
	 * @param taux
	 *            xp necessaire pour atteindre ce niveau
	 */
	public Niveau(int num, int taux)
	{
		this.numLvl = num;
		this.tauxXp = taux;
	}

	/**
	 * retourne le niveau
	 * 
	 * @return le niveau
	 */
	public int getNiveau()
	{
		return this.numLvl;
	}

	/**
	 * retourne le taux xp necessaire au niveau
	 * 
	 * @return le taux xp necessaire au niveau
	 */
	public int getTaux()
	{
		return this.tauxXp;
	}

}
