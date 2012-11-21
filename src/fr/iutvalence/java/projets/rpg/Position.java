package fr.iutvalence.java.projets.rpg;

/**
 * @author goncalvs
 * 
 */
public class Position
{
	/**
	 * Abscisse de l'objet
	 */
	private int x;

	/**
	 * Ordonnees de l'objet
	 */
	private int y;

	
	// FIXME ne pas soulever d'exception ici, mais plutot dans la partie (à discuter)
	/**
	 * Construit la position d'abscisse xd et d'ordonnees yd mais si xd ou yd depasse la LONGUEUR du tableau On retourne
	 * une exception liee aux coordonnees
	 * 
	 * @param xd la nouvelle abscisse
	 * @param yd la nouvelle ordonne
	 * @throws CoordonneesInvalideException si la nouvelle position genere n est pas valide
	 * 
	 */
	public Position(int xd, int yd) throws CoordonneesInvalideException
	{
		if ((xd > PlateaudeJeu.LONGUEUR) || (yd > PlateaudeJeu.LONGUEUR)||(xd<0)||(yd<0))
		{
			throw new CoordonneesInvalideException();
		}
		else
		{
			this.setX(xd);
			this.setY(yd);
		}
	}

	/**
	 * Retourne l'abscisse de la position
	 * 
	 * @return x
	 */
	public int getX()
	{
		return this.x;
	}

	/**
	 * Modifie l'abscisse de la position
	 * 
	 * @param x nouvelle abscisse
	 * @throws CoordonneesInvalideException si la nouvelle position genere n est pas valide
	 */
	public void setX(int x) throws CoordonneesInvalideException
	{
		if (x > PlateaudeJeu.LONGUEUR)
		{
			throw new CoordonneesInvalideException();
		}
		this.x = x;
	}

	/**
	 * Retourne l'ordonne de la position
	 * 
	 * @return y
	 */
	public int getY()
	{
		return this.y;
	}

	/**
	 * Modifie l'ordonnee de la position
	 * 
	 * @param y nouvelle ordonnes
	 * @throws CoordonneesInvalideException si la nouvelle position genere n est pas valide
	 */
	public void setY(int y) throws CoordonneesInvalideException
	{
		if (y > PlateaudeJeu.LONGUEUR)
		{
			throw new CoordonneesInvalideException();
		}
		this.y = y;
	}

	public String toString()
	{
		return "(" + this.x + "," + this.y + ")";
	}

}
