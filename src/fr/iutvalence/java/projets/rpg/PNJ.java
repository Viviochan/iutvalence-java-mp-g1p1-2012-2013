package fr.iutvalence.java.projets.rpg;

/**
 * 
 * 
 * Un PNJ (personnage non-joueur) est capable soit de parler quand le heros le sollicite soit de vendre de items avec
 * l'extensions PNJVendeur
 * 
 * Ils aideront le hero a comprendre le contexte/l'histoire/probleme dans lequel il se situe et le guideront dans sa
 * quete
 * 
 * @author goncalvs
 * 
 */
public class PNJ
{

	/**
	 * Abscice de base pour le constructeur sans parametre
	 */
	public final static int ABSCISSE_BASE=9;
	
	/**
	 * Ordonne de base pour le constructeur sans parametre
	 */
	public final static int ORDONNEE_BASE=5;
	
	/**
	 * Position du PNJ
	 */
	private Position posPNJ;

	/**
	 * Les paroles que vous dira le pnj lorsque le hero le solicitera
	 */
	// FIXME le personnage ne prononce qu'une seule phrase ? (à discuter)
	private String phrase;

	/**
	 * Constructeur
	 * 
	 * Pose un pnj a cote du hero lors de la creation de celui-ci Le pnj est statique il ne bougera pas
	 * @throws CoordonneesInvalideException  si la position n est pas valide
	 */
	public PNJ() throws CoordonneesInvalideException
	{
		this.posPNJ= new Position(ABSCISSE_BASE,ORDONNEE_BASE);
		this.phrase = "Hello World";

	}

	/**
	 * Permet de poser un PNJ avec une position et une phrase
	 * @param posX Abscisse x du pnj
	 *            
	 * @param posY Ordonnes y du pnj
	 *            
	 * @param ph
	 *            Phrase qu'il se gardera de dire
	 * @throws CoordonneesInvalideException si la nouvelle position n est pas valide
	 */
	public PNJ(int posX, int posY, String ph) throws CoordonneesInvalideException
	{
		//this.pos_x_pnj = pos_x;
		//this.pos_y_pnj = pos_y;
		this.posPNJ= new Position(posX,posY);
		this.phrase = ph;
	}

	/**
	 * Retourne la phrase que le PNJ vous dira
	 * 
	 * @return phrase
	 * 
	 */
	public String getPhrase()
	{
		return this.phrase;
	}

	/**
	 * Retourne la position du PNJ
	 * @return posPNJ
	 */
	public Position getPosPNJ()
	{
		return this.posPNJ;
	}

	/**
	 * Modifie la position du PNJ
	 * @param posPNJ la nouvelle position
	 */
	public void setPosPNJ(Position posPNJ)
	{
		this.posPNJ = posPNJ;
	}

}
