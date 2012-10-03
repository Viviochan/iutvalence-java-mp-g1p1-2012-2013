package fr.iutvalence.java.projets.rpg;


/**
 * @author goncalvs
 * Boss final du jeu 
 * il correspond au dernier element du jeu, une fois que le heros l'aura battue le jeu sera finis
 * ces stats sont hors normes mais tout de meme abordable avec un minimum de strategie.
 * 
 * IA basique 
 * 1tour:attaque
 * 2tour:defense
 * 3tour:heal
 * 
 * si plus de temps complexifier l'ia du boss
 *
 *
 *Le boss est une extension de monstre il est differencier d'eux car il possede une position fixe sur la map
 */
public class Boss extends Monstre {

		/**
		 * Attributs
		 * Abscisse du boss
		 */
		private int pos_boss_x;
		/**
		 * Oordonnes du boss
		 */
		private int pos_boss_y;
		
		
		/**
		 * Construction du Boss par rapport aux constructeurs de monstre
		 * nom:Lord Dragon
		 * point de vie:350
		 * attaque:110
		 * defense:110
		 * or:0
		 * xp:0
		 * Un seul et unique boss sera inclus dans le jeu
		 * On integrera des sous boss pris dans la base de monstre
		 */
		public Boss(){
			super("Lord Dragon",350,110, 110, 0, 0);
			this.pos_boss_x= 500;
			this.pos_boss_y= 1000;

			
			
		}


		/**
		 * Accesseur du Boss
		 * peut ne pas avoir d'utilite dans le jeu
		 */
		
		/**
		 * @return pos_boss_x
		 */
		public int getPos_boss_x() {
			return pos_boss_x;
		}


		/**
		 * @return pos_boss_y
		 */
		public int getPos_boss_y() {
			return pos_boss_y;
		}


		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
}
