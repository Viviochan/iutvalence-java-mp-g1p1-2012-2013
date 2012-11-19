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
		System.out.print("coucou \n");
		System.out.print("le hero: \n");
		Hero zero= new Hero("Reinhart");
		//System.out.print(zero);
		Boss gilg= new Boss();
		//System.out.print(gilg);
		System.out.print("\n la map: \n");
		PlateaudeJeu carte= new PlateaudeJeu();
		//System.out.print(carte);
		Aventure aven= new Aventure();
		System.out.print(aven.perso);
		System.out.print(aven.demon);
		Direction dir=Direction.HAUT;
		aven.deplacementHeros(dir);
		System.out.print("le hero: \n");
		System.out.print(aven.perso);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
