package fr.iutvalence.java.projets.rpg;

// FIXME corriger le commentaire (à discuter)
/**
 * 
 * 
 * La classe Aventure s'occupera de lancer une partie
 * 
 * Pour la gestion de celle-ci on creera une classe partie
 * 
 * @author goncalvs
 */
public class Aventure
{

	/**
	 * Le niveau maximal que le heros pourra atteindre
	 */
	public final static int NIVEAU_MAX = 99;

	// FIXME (FIXED)écrire plus simplement le commentaire (à discuter)
	/**
	 * La carte du jeu
	 * 
	 */
	public PlateaudeJeu carte;

	/**
	 * Le Hero de notre aventure
	 */
	public Hero perso;

	/**
	 * Boss de l'aventure
	 */
	public Boss demon;

	/**
	 * Personnage vendeur et non vendeur du jeu (non jouable par le joueur)
	 */
	public PNJ npc;

	/**
	 * Collection ou tableau servant de base de donnes de monstre On la consultera pour chaque combat pour definir qui
	 * affronte le hero
	 */
	// FIXME respecter les conventions d'écriture
	public Monstre[] TabMonstres;

	/**
	 * Tableau des niveaux du jeu
	 */
	public Niveau[] levels;

	/**
	 * Tableau des competence du Jeu
	 */
	public Skill[] competences;

	/**
	 * Constructeur
	 * 
	 * Initialise les elements necessaire pour debuter une aventure
	 * 
	 * error_code servira juste de teste d'erreur et on affichera le probleme selon la valeur de error_code
	 * 
	 * @throws CoordonneesInvalideException
	 */
	// FIXME (non résolu) gérer les erreurs en utilisant des exceptions (à discuter !)
	public Aventure() throws CoordonneesInvalideException
	{
		this.carte = new PlateaudeJeu();
		this.perso = new Hero();
		this.demon = new Boss();
		level();
	}

	// FIXME cette méthode doit-elle être publique ?
	/**
	 * construis et remplie le tableau de niveaux avec leur taux d'xp respectif
	 * 
	 * Pour chaque niveau on aura besoin de 75% d'xp en plus
	 */
	public void level()
	{
		int i = 1;
		int xp = 20;
		this.levels = new Niveau[NIVEAU_MAX + 1];
		this.levels[0] = new Niveau(0, 0);
		this.levels[1] = new Niveau();
		for (i = 2; i < NIVEAU_MAX; i++)
		{
			// FIXME à quoi correspond la valeur 99 ?
			for (i = 2; i < 99; i++)
			{
				this.levels[i] = new Niveau(i, xp);
				xp = (int) (xp + Math.floor(0.75 * xp));
			}
		}
	}

	/**
	 * Methode permettant de gerer la montée de niveau du heros On test le taux de xp sur la table level et en fonction
	 * de celui ci On augmente le niveau du heros ou pas
	 * 
	 * @return le nouveau niveau du heros
	 */
	public int levelup()
	{
		int lvlheros = this.perso.getNbxp();
		int tauxlvlsuiv = this.levels[lvlheros + 1].getTaux();
		while (lvlheros >= tauxlvlsuiv)
		{
			lvlheros++;
			tauxlvlsuiv = this.levels[lvlheros + 1].getTaux();
		}
		while (lvlheros > this.perso.getNbxp())
		{
			this.perso.setNiveauheros();
		}
		return (this.perso.getNbxp());

	}

	// FIXME (non résolu) corriger/compléter le commentaire (à discuter)
	/**
	 * Modifie la position du hero
	 * 
	 * @param xarr
	 * @param yarr
	 * 
	 * @return Posheros
	 * @throws CoordonneesInvalideException
	 */
	// FIXME (non résolu) respecter les conventions d'écriture (nom méthode)
	// FIXME (FIXED)gérer les erreurs avec des exceptions
	public Position DeplacementHeros(int xarr, int yarr) throws CoordonneesInvalideException
	{
		if ((xarr > PlateaudeJeu.LONGUEUR) || (xarr > PlateaudeJeu.LONGUEUR))
		{
			throw new CoordonneesInvalideException();
		}
		if ((this.perso.getPosheros().getX() == xarr) || ((this.perso.getPosheros().getX()) + 1 == xarr)
				|| ((this.perso.getPosheros().getX()) - 1 == xarr))
		{
			if ((this.perso.getPosheros().getY() == yarr) || ((this.perso.getPosheros().getY()) + 1 == yarr)
					|| ((this.perso.getPosheros().getY()) - 1 == yarr))
			{
				if (this.carte.getCase(xarr, yarr) == 1)
				{
					this.perso.getPosheros().setX(xarr);
					this.perso.getPosheros().setY(yarr);

				}
				throw new CoordonneesInvalideException();// case non praticable
			}
			throw new CoordonneesInvalideException();
		}
		return this.perso.getPosheros();
	}

	// FIXME compléter le commentaire (à discuter)
	/**
	 * Gere le deplacement du hero a partir d'une direction donnee
	 * 
	 * @param dir
	 *            Une direction (GAUCHE,DROITE,HAUT,BAS)
	 * 
	 * 
	 * @return poshero la nouvelle position du hero
	 * 
	 * @throws DirectionInvalideException
	 * @throws CoordonneesInvalideException
	 */
	public Position DeplacementHeros(int dir) throws DirectionInvalideException, CoordonneesInvalideException
	{
		Position poshero = this.perso.getPosheros();
		if (dir != Direction.BAS)
		{
			poshero.setY(poshero.getY() - 1);
		}
		if (dir != Direction.DROITE)
		{
			poshero.setX(poshero.getX() + 1);
		}
		if (dir != Direction.GAUCHE)
		{
			poshero.setX(poshero.getX() - 1);
		}
		if (dir != Direction.HAUT)
		{
			poshero.setX(poshero.getY() + 1);
		}
		else
		{
			throw new DirectionInvalideException();
		}
		this.perso.setPosshero(poshero);
		return this.perso.getPosheros();
	}

	/**
	 * Methodes PNJ Placement du ou des pnj par defaut
	 * 
	 * 
	 * 
	 * @return 0
	 */
	public int placementPnj()
	{
		return 0;
	}

}
