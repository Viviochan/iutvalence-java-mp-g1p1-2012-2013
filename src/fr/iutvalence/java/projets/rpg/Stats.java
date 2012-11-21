package fr.iutvalence.java.projets.rpg;

/**
 * classes definissant les attributs des monstres, du boss et du heros
 * 
 * @author goncalvs
 *
 *
 *creature= objet/element portant un objet de type stats
 */

public class Stats
{
	/**
	 * Niveau de vie de la creature si elle tombe a zero elle sera considerer comme morte
	 */
	private int pointsDeVie;

	/**
	 * Niveau de magie de la creature, permet le lancement de sort et autre magies
	 */
	private int pointDeMana;

	// FIXME (FIXED)commentaire ?
	/**
	 * Niveau de point de vie courant
	 */
	private int pdvcour;

	// FIXME (FIXED)commentaire ?
	/**
	 * Niveau de point de mana courant
	 */
	private int pdmcour;
	
	/**
	 * Niveau d'attaque de la creature permet de determiner la force de frappe lors des combats
	 */
	private int attaque;

	/**
	 * Niveau de defense de la creature permet de determiner la diminution des degat subis par l'adversaire
	 */
	private int defense;


	/**
	 * Experience de la creatures. Certains palier d'xp permettent de debloquer un niveau avec les bonus lui correspondant
	 */
	private int nbxp;

	/**
	 * Monnaie de la creature. Correspond a la quantite d or porter par la creature
	 */
	private int or;
	
	/**
	 * Constructeur
	 * 
	 * @param pdm  point de mana 
	 * @param pdv  point de vie
	 * @param att  attaque 
	 * @param def  defense
	 * @param nbxp  nombre de point de xp
	 * @param nbor  quantite or
	 * 
	 */
	public Stats(int pdm, int pdv, int att, int def, int nbxp, int nbor){
		this.pointDeMana=pdm;
		this.pointsDeVie=pdv;
		this.pdmcour=pdm;
		this.pdvcour=pdv;
		this.attaque=att;
		this.defense=def;
		this.nbxp=nbxp;
		this.or=nbor;
	}
	
	/**
	 * retourne les points de la creature
	 * 
	 * @return les points de la creature
	 */

	public int getPointsDeVie()
	{
		return this.pointsDeVie;
	}

	/**
	 * modifie les point de la creature
	 * 
	 * @param pdv
	 *            le bonus de point de vie a ajouter a ceux  de la creature
	 */
	public void setPointsDeVie(int pdv)
	{
		this.pointsDeVie = this.pointsDeVie + pdv;
	}

	/**
	 * retourne les point de mana de la creature
	 * @return point_de_mana
	 */
	public int getPointsDeMana()
	{
		return this.pointDeMana;
	}

	/**
	 * Retourne les points de mana de la creature
	 * 
	 * @param pdm le bonus de points de mana a ajouter a ceux de la creature
	 * 
	 * 
	 * 
	 */
	public void setPointsDeMana(int pdm)
	{
		this.pointDeMana = this.pointDeMana + pdm;
	}

	/**
	 * Le niveau d'attaque dde la creature
	 * 
	 * @return le niveau d'attaque de la creature
	 * 
	 */
	public int getAttaque()
	{
		return this.attaque;
	}

	/**
	 * Augemente l'attaque de la creature
	 * 
	 * @param  att le bonus d'attaque de a ajouter a celle de la creature
	 * 
	 */
	public void setAttaque(int att)
	{
		this.attaque = this.attaque + att;
	}

	/**
	 * Le niveau de defense de la creature
	 * 
	 * @return le niveau de defense de la creature
	 * 
	 */
	public int getDefense()
	{
		return this.defense;
	}

	/**
	 * Augmente le niveau de defense du hero
	 * 
	 * @param def
	 *            le niveau de defense du hero
	 * 
	 */
	public void setDefense(int def)
	{
		this.defense = this.defense + def;
	}

	
	/**
	 * retourne le nombre d'xp de la creature
	 * 
	 * @return l'xp que possede la creature
	 */
	public int getNbxp()
	{
		return this.nbxp;
	}

	/**
	 * On l'ajoute a l'xp que la creature possede deja
	 * 
	 * @param exp
	 *            l'xp recue soit par un item soit apres un combat
	 * 
	 */
	public void setNbXp(int exp)
	{
		this.nbxp = this.nbxp + exp;
	}

	/**
	 * Retourne la quantite d'or que la creature possede
	 * 
	 * @return or Donne l'or que la creature porte
	 */
	public int getOr()
	{
		return this.or;
	}

	/**
	 * on ajoute cet or a celui que la creature possede deja
	 * 
	 * @param piece
	 *            l'or recue lors d'un combat ou trouver
	 * 
	 */

	public void setOr(int piece)
	{
		this.or = this.or + piece;
	}
	
	
	
	
	public String toString(){
		return "( pdm:"+this.pointDeMana+" pdv:"+this.pointsDeVie+" attaque:"+this.attaque+" defense:"+this.defense+" experience:"+this.nbxp+" or:"+this.or+")";
	}




	/**
	 * Retourne les Point de vie courant 
	 * @return pdvcour
	 */
	public int getPdvcour()
	{
		return this.pdvcour;
	}




	/**
	 * Modifie les point de vie courant
	 * @param pdvcour nouveau niveau de vie
	 */
	public void setPdvcour(int pdvcour)
	{
		this.pdvcour = pdvcour;
	}




	/**
	 * Retourne les point de mana courant
	 * @return pdmcour 
	 */
	public int getPdmcour()
	{
		return this.pdmcour;
	}




	/**
	 * Modifie les point de mana courant
	 * @param pdmcour nouveau niveau de pdmcour
	 */
	public void setPdmcour(int pdmcour)
	{
		this.pdmcour = pdmcour;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
