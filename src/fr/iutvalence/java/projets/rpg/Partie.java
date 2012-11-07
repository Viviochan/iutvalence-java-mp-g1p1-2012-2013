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
	 */
	public static void main(String[] args)
	{
		System.out.print("coucou \n");
	
	
	for(int i=0;i<50;i++){

		for(int j=0;j<50;j++){
			
			if(j==0){
				System.out.print("|");
			}
			if(i==0){
				System.out.print("_");
			}
			if(j==50){
				System.out.print("|\n");
			}
			if(i==50){
				System.out.print("_\n");
			}
		}
	}
	}
}
