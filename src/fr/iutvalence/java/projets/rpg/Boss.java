package fr.iutvalence.java.projets.rpg;


// FIXME corriger le commentaire (ne pas utiliser le commentaire Javadoc pour indiquer comment on va faire évoluer la classe par la suite)
/**
 * 
 * Boss final du jeu 
 * il correspond au dernier element du jeu, une fois que le heros l'aura battu le jeu sera fini
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
 *Le boss est une extension de monstre il est differencié d'eux car il possede une position fixe sur la map
 *
 *@author goncalvs
 */
public class Boss extends Monstre {


	
		// FIXME regrouper abscisse et ordonnée dans une classe "Position"
		/**
		 * 
		 * Abscisse du boss
		 */
		// FIXME (non résolu) respecter les conventions d'écriture
		private int pos_boss_x;


		/**
		 * Ordonnees du boss
		 */
		// FIXME (non résolu) respecter les conventions d'écriture
		private int pos_boss_y;
		
		
		/**
		 * Constantes de construction du boss
		 */
		/**
		 * Nom du boss
		 */
		// FIXME indiquer une visibilité
		final static String NOM_BOSS="Dragon Lord";
		
		// FIXME indiquer une visibilité
		/**
		 * Abscisse du boss sur la map
		 */
		final static int ABSCISSE_BOSS=500;
		
		// FIXME indiquer une visibilité
		/**
		 * Ordonnee du boss sur la map
		 */
		// FIXME renommer la constante
		final static int OORDONNE_BOSS=1000;
		
		/**
		 * Points de vie du boss
		 */
		public final static int HP_BOSS=350;
		
		/**
		 * Niveau d'attaque et de defense du boss
		 */
		public final static int ATT_DEF_BOSS=110;
		
		/**
		 * Niveau d'or et d'xp donner par le boss
		 */
		public final static int OR_XP_BOSS=0;
		
		
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
			super(NOM_BOSS,HP_BOSS,ATT_DEF_BOSS, ATT_DEF_BOSS, OR_XP_BOSS, OR_XP_BOSS);
			this.pos_boss_x= ABSCISSE_BOSS;
			this.pos_boss_y= OORDONNE_BOSS;

			
			
		}


		// FIXME compléter le commentaire
		/**
		 * @return pos_boss_x
		 */
		public int getPos_boss_x() {
			return pos_boss_x;
		}

		// FIXME compléter le commentaire
		/**
		 * @return pos_boss_y
		 */
		public int getPos_boss_y() {
			return pos_boss_y;
		}
		
		// FIXME redéfinir toString
}
