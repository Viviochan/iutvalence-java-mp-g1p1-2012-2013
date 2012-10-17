package fr.iutvalence.java.projets.rpg;


// FIXME corriger le commentaire (ne pas utiliser le commentaire Javadoc pour indiquer comment on va faire évoluer la classe par la suite)
/**
 * 
 * Boss final du jeu 
 * il correspond au dernier element du jeu
 * 
 *Le boss est une extension de monstre il est differencié d'eux car il possede une position fixe sur la map
 *
 *@author goncalvs
 */
public class Boss extends Monstre {

	/**
	 * Constantes de construction du boss
	 */
	/**
	 * Nom du boss
	 */
	// FIXME indiquer une visibilité
	public final static String NOM_BOSS="Dragon Lord";
	
	// FIXME indiquer une visibilité
	/**
	 * Abscisse du boss sur la map
	 */
	public final static int ABSCISSE_BOSS=500;
	
	// FIXME indiquer une visibilité
	/**
	 * Ordonnee du boss sur la map
	 */
	// FIXME renommer la constante
	public final static int OORDONNE_BOSS=1000;
	
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
	 * Position du boss sur le plateau de jeu
	 */
	private Position posboss;
		
		

		
		
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
		public Boss() throws CoordonneesInvalideException{
			super(NOM_BOSS,HP_BOSS,ATT_DEF_BOSS, ATT_DEF_BOSS, OR_XP_BOSS, OR_XP_BOSS);
			this.posboss= new Position(ABSCISSE_BOSS, OORDONNE_BOSS);

			
			
		}


		/**
		 * Donne la position du boss
		 * @return posboss
		 */
		public Position getpossboss(){
			return this.posboss;
		}
		
		// FIXME redéfinir toString
}
