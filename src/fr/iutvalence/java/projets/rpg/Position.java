package fr.iutvalence.java.projets.rpg;

/**
 * @author goncalvs
 *
 */
public class Position {
	
	//FIXME (FIXED)regrouper les attribut y et x en une classe position
	/**
	 * Abscisse de l'objet
	 */
	private int x;
	
	/**
	 * Ordonnees de l'objet
	 */
	private int y;
	
	// FIXME compléter le commentaire (balises)
	
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
	 * @throws CoordonneesInvalideException 
	 */
	public void setX(int x) throws CoordonneesInvalideException {
		if(x>PlateaudeJeu.LONGUEUR){
			throw new CoordonneesInvalideException();
		}
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
	 * @throws CoordonneesInvalideException 
	 */
	public void setY(int y) throws CoordonneesInvalideException {
		if(y>PlateaudeJeu.LONGUEUR){
			throw new CoordonneesInvalideException();		
		}
		this.y = y;
	}
	
	public String toString(){
		return "("+this.x+","+this.y+")";
	}

		
	
}
