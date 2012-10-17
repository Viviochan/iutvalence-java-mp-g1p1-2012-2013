package fr.iutvalence.java.projets.rpg;

/**
 * @author goncalvs
 *
 */
public class Position {
	
	/**
	 * Abscisse de l'objet
	 */
	private int x;
	
	/**
	 * Ordonnees de l'objet
	 */
	private int y;
	
	
	/**
	 * Construit la position d'abscisse xd et d'ordonnees yd mais si xd ou yd depasse la LONGUEUR du tableau
	 * On retourne une exception liee aux coordonnees
	 * 
	 * @param xd 
	 * @param yd 
	 * @throws CoordonneesInvalideException 
	 * 
	 */
	public Position(int xd,int yd) throws CoordonneesInvalideException{
		if((xd>PlateaudeJeu.LONGUEUR)||(yd>PlateaudeJeu.LONGUEUR)){
			throw new CoordonneesInvalideException();
		}
		else{
			this.setX(xd);
			this.setY(yd);
		}	
	}


	/**
	 * Retourne l'abscisse de la position
	 * @return x
	 */ 
	public int getX() {
		return x;
	}


	/**
	 * Modifie l'abscisse de la position
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}


	/**
	 * Retourne l'ordonne de la position
	 * @return y
	 */
	public int getY() {
		return y;
	}


	/**
	 * Modifie l'ordonnee de la position
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	

		
	
}
