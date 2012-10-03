package fr.iutvalence.java.projets.rpg;


// FIXME corriger le commentaire
/**
 * @author goncalvs
 *
 *Un PNJ (personnage non-joueur) sont capable soit de parler quand le heros les sollicite
 *soit de vendre des items avec l'extensions PNJVendeur
 *
 *Il aideront le hero a comprendre le contexte/l'histoire/probleme dans lequelle il se situe
 *et le guideras dans sa quetes
 *
 */
public class PNJ {
	

	/**
	 * Attributs
	 */
	
	/**
	 * Abscisse du pnj
	 */
	private int pos_x_pnj;


	/**
	 * Oordonne du pnj
	 */
	private int pos_y_pnj;
	
	
	// FIXME Le personnage ne prononce qu'une seule phrase ? Il faudrait r�fl�chir � mieux mod�liser le discours d'un personnage 
	/**
	 * Les paroles que vous dira le pnj lorsque le hero le solicitera
	 */
	private String phrase;
	
	
	
	/**
	 * Constructeur
	 * 
	 * Pose un pnj a cote du hero lors de la creation de celui-ci
	 * Le pnj est statique il ne bougera pas
	 */
	public PNJ(){
		
		// FIXME et si le hero n'est plus � c�t� de (9,5) ?? A reprendre...
		this.pos_x_pnj= 9;
		this.pos_y_pnj= 5;
		this.phrase="Hello World";
		
	}
	
	
	// FIXME �crire le commentaire
	/**
	 * 
	 * @param pos_x Abscisse x du pnj
	 * @param pos_y Ordonnes y du pnj
	 * @param ph Phrase qu'il se gardera de dire
	 */
	public PNJ(int pos_x, int pos_y, String ph){
		this.pos_x_pnj=pos_x;
		this.pos_y_pnj= pos_y;
		this.phrase=ph;
	}


	/**
	 * @return pos_x_pnj
	 * Abscisse du PNJ
	 */
	public int getPos_x_pnj() {
		return pos_x_pnj;
	}




	/**
	 * @return pos_y_pnj
	 * Oordonnes du PNJ
	 */
	public int getPos_y_pnj() {
		return pos_y_pnj;
	}





	/**
	 * @return phrase
	 * La phrase que le pnj dira lorsque on interrargira avec celui-ci 
	 *
	 */
	public String getPhrase() {
		return phrase;
	}



	
	
}