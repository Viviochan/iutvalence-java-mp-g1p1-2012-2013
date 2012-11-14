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

	// FIXME se servir du type Position

	/**
	 * Abscisse du pnj
	 */
	//private int pos_x_pnj;

	/**
	 * Oordonne du pnj
	 */
	//private int pos_y_pnj;
	
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
	 * @throws CoordonneesInvalideException 
	 */
	public PNJ() throws CoordonneesInvalideException
	{
		//this.pos_x_pnj = 9;
		//this.pos_y_pnj = 5;
		this.posPNJ= new Position(9,5);
		this.phrase = "Hello World";

	}

	// FIXME compléter le commentaire
	/**
	 * 
	 * @param pos_x
	 *            Abscisse x du pnj
	 * @param pos_y
	 *            Ordonnes y du pnj
	 * @param ph
	 *            Phrase qu'il se gardera de dire
	 * @throws CoordonneesInvalideException 
	 */
	// FIXME respecter les conventions d'écriture
	public PNJ(int posX, int posY, String ph) throws CoordonneesInvalideException
	{
		//this.pos_x_pnj = pos_x;
		//this.pos_y_pnj = pos_y;
		this.posPNJ= new Position(posX,posY);
		this.phrase = ph;
	}

	/**
	 * Abscisse du PNJ
	 * 
	 * @return pos_x_pnj
	 * 
	 */
	// FIXME (FIXED)respecter les conventions d'écriture

	/**
	 * Ordonnee du PNJ
	 * 
	 * @return pos_y_pnj
	 * 
	 */
	// FIXME (FIXED)respecter les conventions d'écriture


	// FIXME corriger le commentaire (regarder ce que cela produit en sortie de Javadoc)
	/**
	 * La phrase que le pnj dira lorsque on interrargira avec celui-ci
	 * 
	 * @return phrase
	 * 
	 * 
	 */
	public String getPhrase()
	{
		return phrase;
	}

	public Position getPosPNJ()
	{
		return this.posPNJ;
	}

	public void setPosPNJ(Position posPNJ)
	{
		this.posPNJ = posPNJ;
	}

}
