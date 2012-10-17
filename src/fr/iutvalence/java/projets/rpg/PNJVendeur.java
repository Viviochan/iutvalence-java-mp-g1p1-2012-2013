package fr.iutvalence.java.projets.rpg;



/**
 * 
 * 
 * PNJ capable de vendre et d'acheter des items aux heros
 * 
 * Un PNJ Vendeur ne peut vendre que des item qui ont un prix non null
 * 
 * 
 * @author goncalvs
 *
 */
public class PNJVendeur extends PNJ {
	
	/**
	 * Definie le nombre de item que peut vendre le PNJ Vendeur
	 */
	// FIXME respecter les conventions d'écriture(FIXED)
	private int taillemag;
	
	
	/**
	 * Le PNJ Vendeur vend des items figurant dans le tableau d item vend
	 * 
	 */
	private Item[] vend;
	
	
	
	/**
	 * Constructeur
	 * @param posx Abscisse x du pnj
	 * @param posy Ordonnes y du pnj
	 * @param ph Phrase qu'il se gardera de dire
	 * @param nbitem nombre d'items differents a vendre
	 */
	public PNJVendeur(int posx, int posy, String ph, int nbitem){
		super(posx,posy,ph);
		this.taillemag=nbitem;
		vend();
		
		// FIXME (FIXED)doit être appelée en dehors du constructeur(FIXED)
		//vend();On placeras la methode vend dans le constructeur d'aventure
		
	}
	
	// FIXME compléter le commentaire(FIXED)
	/**
	 * Methode qui nous donne la listes des items vendables par le PNJVendeur
	 * A completer quand on aura trouver une methode de stockage des items
	 */
	public void vend(){
		this.vend= new Item[taillemag];
		int i=0;
		while(i<=taillemag){
			//on construits des items predefinies dans une base ou un autre elements qui stocke
		}
		
		
	}
	
	

	/**
	 *Retourne le nombre d item que le vendeur peut vendres 
	 * @return taillmag
	 */
	// FIXME respecter les conventions d'écriture(FIXED)
	public int gettaillemag(){
		return this.taillemag;
	}

	/**
	 * Donne la liste des items vendue par le PNJVendeur
	 * @return vend
	 */
	public Item[] getVend(){
		return this.vend;
	}
	
}
