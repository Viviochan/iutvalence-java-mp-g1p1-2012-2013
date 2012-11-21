// FIXME déplacer dans un autre paquetage

// FIXME la classe partie ne doit pas contenir de main.
package fr.iutvalence.java.projets.rpg.test;

import fr.iutvalence.java.projets.rpg.Aventure;
import fr.iutvalence.java.projets.rpg.CoordonneesInvalideException;
import fr.iutvalence.java.projets.rpg.DirectionInvalideException;
import fr.iutvalence.java.projets.rpg.Item;
import fr.iutvalence.java.projets.rpg.ModeCombatInvalidException;
import fr.iutvalence.java.projets.rpg.TypeItem;
import fr.iutvalence.java.projets.rpg.Direction;

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
	 * @throws ModeCombatInvalidException 
	 */
	public static void main(String[] args) throws CoordonneesInvalideException, DirectionInvalideException, ModeCombatInvalidException
	{
		int x=9;
		int y=5;
		int pdvcour=20;
		Item objet= new Item("Fléau des dragons",TypeItem.Arme,73,10,5);
		Item debut= new Item("Lame du Faucon",TypeItem.Arme,12,10,5);
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
		aven.perso.getStats().setPdvcour(pdvcour);
		System.out.print("\n le hero: \n");
		System.out.print(aven.perso);
		aven.itemUse(debut);
		System.out.print("\n le hero: \n");
		System.out.print(aven.perso);
		aven.itemUse2(objet);
		System.out.print("\n le hero: \n");
		System.out.print(aven.perso);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
