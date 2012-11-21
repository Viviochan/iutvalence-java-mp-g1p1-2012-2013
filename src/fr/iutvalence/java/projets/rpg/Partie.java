// FIXME déplacer dans un autre paquetage

// FIXME la classe partie ne doit pas contenir de main.
package fr.iutvalence.java.projets.rpg;

/**
 * Dan scette classe on gerrera notre jeu en tout point
 * 
 * reste vide pour le moment elle permettra de faire certains test le moment voulue
 * 
 * @author goncalvs
 * 
 */
public class Partie
{

	/**
	 * @param args
	 * @throws CoordonneesInvalideException 
	 * @throws DirectionInvalideException 
	 */
	public static void main(String[] args) throws CoordonneesInvalideException, DirectionInvalideException
	{
		int x=9;
		int y=5;
		Direction dir=Direction.BAS;
		System.out.print("coucou \n");
		System.out.print("le hero: \n");
		Aventure aven= new Aventure();
		System.out.print(aven.perso);
		System.out.print("\n le hero: \n");
		aven.deplacementHeros(x,y);
		System.out.print(aven.perso);
		aven.deplacementHeros(x,4);
		aven.deplacementHeros(8,4);
		System.out.print("\n le hero: \n");
		System.out.print(aven.perso);
		System.out.print("\n le hero: \n");
		aven.deplacementHeros(Direction.GAUCHE);
		System.out.print(aven.perso);


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
