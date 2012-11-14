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
	 */
	public static void main(String[] args) throws CoordonneesInvalideException
	{
		System.out.print("coucou \n");
		System.out.print("le hero: \n");
		Hero zero= new Hero("Reinhart");
		System.out.print(zero);
		System.out.print("\nle boss: \n");
		Boss Gilgamesh= new Boss();
		System.out.print(Gilgamesh);
	}
}
