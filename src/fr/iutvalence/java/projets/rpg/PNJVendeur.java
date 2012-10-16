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
	// FIXME respecter les conventions d'écriture
	private int taille_mag;
	
	
	/**
	 * Le PNJ Vendeur vend des items figurant dans le tableau d item vend
	 * 
	 */
	private Item[] vend;
	
	
	
	/**
	 * Constructeur
	 * @param pos_x Abscisse x du pnj
	 * @param pos_y Ordonnes y du pnj
	 * @param ph Phrase qu'il se gardera de dire
	 */
	public PNJVendeur(int pos_x, int pos_y, String ph, int nb_item){
		super(pos_x,pos_y,ph);
		this.taille_mag=nb_item;
		
		// FIXME doit être appelée en dehors du constructeur
		vend();
		
	}
	
	// FIXME compléter le commentaire
	/**
	 * 
	 */
	public void vend(){
		this.vend= new Item[taille_mag];
		int i=0;
		while(i<=taille_mag){
			//on construits des items predefinies dans une base ou un autre elements qui stocke
		}
		
		
	}
	
	

	/**
	 *Retourne le nombre d item que le vendeur peut vendres 
	 */
	// FIXME respecter les conventions d'écriture
	public int gettaille_mag(){
		return this.taille_mag;
	}

	
}
