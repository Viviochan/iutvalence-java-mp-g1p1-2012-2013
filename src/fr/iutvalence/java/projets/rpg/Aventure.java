package fr.iutvalence.java.projets.rpg;
import java.lang.Math;

// FIXME corriger le commentaire (à discuter)
/**
 * 
 * 
 * La classe Aventure s'occupera de lancer une partie
 * 
 * Pour la gestion de celle-ci on creera une classe partie
 * 
 * @author goncalvs
 */
public class Aventure
{

	/**
	 * Le niveau maximal que le heros pourra atteindre
	 */
	public final static int NIVEAU_MAX = 99;
	
	/**
	 * Le nombre de monstres differents possible de rencontrer dans le jeu
	 */
	public final static int NB_MAX_MONSTRE=5;

	
	/**
	 * Taux de rencontre maximum que le jeu peux atteindre
	 * chaque pas generera un combat
	 */
	public final static int TAUX_MAX_RENCONTRE=10;
	/**
	 * Le taux de rencontre de monstre lors d'un deplacement
	 * il est de 2 qui correspond a 20%
	 */
	public final static int TAUX_RENCONTRE=2;
	
	/**
	 * Le nombre d items maximal que l on peut porter sur soi
	 */
	public final static int CAPACITE_INVENTAIRE=20;
	
	/**
	 * La carte du jeu
	 * 
	 */
	public PlateaudeJeu carte;

	/**
	 * Le Hero de notre aventure
	 */
	public Hero perso;

	/**
	 * Boss de l'aventure
	 */
	public Boss demon;

	/**
	 * Personnage vendeur et non vendeur du jeu (non jouable par le joueur)
	 */
	public PNJ npc;

	/**
	 * Collection ou tableau servant de base de donnes de monstre On la consultera pour chaque combat pour definir qui
	 * affronte le hero
	 */
	// FIXME (FIXED)respecter les conventions d'écriture
	public Monstre[] tabMonstres;
	
	/**
	 * 
	 */
	public Monstre ennemi;
	
	/**
	 * booleen permettant de differencier si le hero est en combat ou se deplace sur la carte
	 */
	public boolean modeCombat;
	
	/**
	 * Tableau des niveaux du jeu
	 */
	public Niveau[] levels;

	/**
	 * Tableau des competence du Jeu
	 */
	public Skill[] competences;

	
	/**
	 * L inventaire du hero il  contiendras tous les items que celui-ci transporte
	 */
	public Item[] inventaire;

	/**
	 * Constructeur
	 * 
	 * Initialise les elements necessaire pour debuter une aventure
	 * 
	 * error_code servira juste de teste d'erreur et on affichera le probleme selon la valeur de error_code
	 * 
	 * @throws CoordonneesInvalideException la position generer n est pas valide
	 */
	// FIXME ici, il faudrait faire en sorte que si la position du heros et du boss n'est pas bonne, on doit la générer de nouveau
	public Aventure() throws CoordonneesInvalideException
	{
		this.carte = new PlateaudeJeu();
		this.perso = new Hero();
		this.demon = new Boss();
		level();
		TabMonstres();
		this.modeCombat=false;
	}

	// FIXME cette méthode doit-elle être publique ?
	/**
	 * construis et remplie le tableau de niveaux avec leur taux d'xp respectif
	 * 
	 * Pour chaque niveau on aura besoin de 75% d'xp en plus
	 */
	public void level()
	{
		int i = 1;
		int xp = 20;
		this.levels = new Niveau[NIVEAU_MAX + 1];
		this.levels[0] = new Niveau(0, 0);//Niveau 0
		this.levels[1] = new Niveau();//Niveau 1
		for (i = 2; i < NIVEAU_MAX; i++)
		{
			// FIXME(FIXED) à quoi correspond la valeur 99 ?
			for (i = 2; i < Niveau.NIVEAU_MAX; i++)//On remplie du Niveau 2 jusqu'au niveau max ici 99
			{
				this.levels[i] = new Niveau(i, xp);
				xp = (int) (xp + Math.floor(0.75 * xp));
			}
		}
	}

	/**
	 * Methode permettant de gerer la montée de niveau du heros On test le taux de xp sur la table level et en fonction
	 * de celui ci On augmente le niveau du heros ou pas
	 * 
	 * @return le nouveau niveau du heros
	 */
	public int levelup()
	{
		int lvlheros = this.perso.getStats().getNbxp();
		int tauxlvlsuiv = this.levels[lvlheros + 1].getTaux();
		while (lvlheros >= tauxlvlsuiv)
		{
			lvlheros++;
			tauxlvlsuiv = this.levels[lvlheros + 1].getTaux();
		}
		while (lvlheros > this.perso.getStats().getNbxp())
		{
			//on augmente le niveau du hero et on augmente les stats en fonction du bonus par niveau definis en constante dans la classe hero
			this.perso.setNiveauHeros();
			this.perso.getStats().setPointDeVie(Hero.BONUS_HP);
			this.perso.getStats().setPointdemana(Hero.BONUS_MP);
			this.perso.getStats().setAttaque(Hero.BONUS_ATT);
			this.perso.getStats().setDefense(Hero.BONUS_DEF);
		}
		return (this.perso.getStats().getNbxp());

	}
	
	/**
	 * Methode permettent le remplissage du tableau de monstre en lisant la base de donnees a la table monstre
	 * 
	 * 
	 * 
	 * @return 0 si la table de monstre a ete bien lus et recopier
	 */
	public int TabMonstres(){
		Monstre[] dataMonstre= new Monstre[NB_MAX_MONSTRE];
		dataMonstre[0]= new Monstre();
		dataMonstre[1]=new Monstre("SanguinisVache",13,12,6,4,7);
		dataMonstre[2]=new Monstre("Vampivol",15,17,12,10,10);
		dataMonstre[3]=new Monstre("GreenArrow",17,16,12,9,16);
		dataMonstre[4]=new Monstre("SlimeRouge",19,23,18,20,22);
		//dataMonstre[]=new Monstre();
	this.tabMonstres=dataMonstre;
	
	return 0;
	}
	
	/**
	 * 
	 */
	public void initInventaire(){
		Item[] sac= new Item[CAPACITE_INVENTAIRE];
		sac[0]= new Item("herbes medicinal",TypeItem.Objet_de_Soin,30,10,5);
		sac[0]= new Item("herbes medicinal",TypeItem.Objet_de_Soin,30,10,5);
		sac[0]= new Item("herbes medicinal",TypeItem.Objet_de_Soin,30,10,5);
		sac[0]= new Item("herbes medicinal",TypeItem.Objet_de_Soin,30,10,5);
		sac[0]= new Item("herbes medicinal",TypeItem.Objet_de_Soin,30,10,5);
	}
	

	
	/**
	 * Methodes PNJ Placement du ou des pnj par defaut
	 * 
	 * 
	 * 
	 * @return 0
	 */
	public int placementPnj()
	{
		return 0;
	}
	
	
	
	
	// FIXME (FIXED)corriger/compléter le commentaire (à discuter)
	/**
	 * Permet le deplacement du Hero a partir de coordonnees
	 * 
	 * @param xarr abscisse de la position souhaite
	 * @param yarr ordonneer de la position souhaite
	 * 
	 * @return Posheros la nouvelle position du hero
	 * @throws CoordonneesInvalideException la nouvelle position est non valide
	 */
	// FIXME (FIXED)respecter les conventions d'écriture (nom méthode)
	public Position deplacementHeros(int xarr, int yarr) throws CoordonneesInvalideException
	{
		if ((xarr > PlateaudeJeu.LONGUEUR) || (xarr > PlateaudeJeu.LONGUEUR))
		{
			throw new CoordonneesInvalideException();
		}
		if ((this.perso.getPosHeros().getX() == xarr) || ((this.perso.getPosHeros().getX()) + 1 == xarr)
				|| ((this.perso.getPosHeros().getX()) - 1 == xarr))
		{
			if ((this.perso.getPosHeros().getY() == yarr) || ((this.perso.getPosHeros().getY()) + 1 == yarr)
					|| ((this.perso.getPosHeros().getY()) - 1 == yarr))
			{
				if (this.carte.getCase(xarr, yarr) == 1)
				{
					this.perso.getPosHeros().setX(xarr);
					this.perso.getPosHeros().setY(yarr);

				}
				throw new CoordonneesInvalideException();// case non praticable
			}
			throw new CoordonneesInvalideException();
		}
		DeclencheCombat();
		return this.perso.getPosHeros();
	}

	// FIXME compléter le commentaire (à discuter)
	/**
	 * Gere le deplacement du hero a partir d'une direction donnee
	 * 
	 * @param dir Une direction (GAUCHE,DROITE,HAUT,BAS)
	 *            
	 * @return poshero la nouvelle position du hero
	 * 
	 * @throws DirectionInvalideException la direction choisie n est pas valable
	 * @throws CoordonneesInvalideException les coordonnees depassent les bornes de la cartes
	 */
	public Position deplacementHeros(Direction dir) throws DirectionInvalideException, CoordonneesInvalideException
	{
		Position poshero = this.perso.getPosHeros();
		if (dir == Direction.Bas)
		{
			poshero.setY(poshero.getY() - 1);
		}
		if (dir == Direction.Droite)
		{
			poshero.setX(poshero.getX() + 1);
		}
		if (dir == Direction.Gauche)
		{
			poshero.setX(poshero.getX() - 1);
		}
		if (dir == Direction.Haut)
		{
			poshero.setX(poshero.getY() + 1);
		}
		else
		{
			throw new DirectionInvalideException();
		}
		this.perso.setPossHero(poshero);
		DeclencheCombat();
		return this.perso.getPosHeros();
	}



	
	
	/**
	 * Methode qui a permettra de definir si un deplacement provoque un combat avec un ennemi ou non
	 * 
	 * @return 0 si la methode c est bien execute
	 * @throws CoordonneesInvalideException si la position de repop du hero n est pas valide
	 */
	public int DeclencheCombat() throws CoordonneesInvalideException{
		int nb = (int) (Math.random() * TAUX_MAX_RENCONTRE );
		if (nb<=TAUX_RENCONTRE){
			//on genere un combat
			this.modeCombat=true;
			Combat();
		}
		return 0;
	}
	
	/**
	 * Methode gerant un combat avec un ennemi
	 * @return string etat de la fin du combat 
	 * @throws CoordonneesInvalideException  si le hero perd il est teleporter a une la position par defaut
	 * 
	 */
	//il manque a gere si le perso utilise un item
	
	//on gere une collection de monstre egal a nbmonstre et on gere ensuite les differents
	//monstre choisie poru que les stats soit adapter aux heros
	//on met en place le reste des elements du combat
	//on gere les differentes possibilites d action du perso et on adapte le calcul de dommage
	public String Combat() throws CoordonneesInvalideException{
		int hpcour=this.perso.getStats().getPdvcour();//niveau courantde point de vie si 0 perdue
		//int mpcour=this.perso.getPointdemana();//niveau courant de mp
		//on choisie un monstre au hasard dans la base de monstre en fonction du niveau du hero
		int nbmonstre= (int) (Math.random() * this.perso.getNiveauHeros() );
		this.ennemi= new Monstre(this.tabMonstres[nbmonstre].getNomMonstre(),this.tabMonstres[nbmonstre].getStats().getPointdevie(),this.tabMonstres[nbmonstre].getStats().getAttaque(),this.tabMonstres[nbmonstre].getStats().getDefense(),this.tabMonstres[nbmonstre].getStats().getNbxp(),this.tabMonstres[nbmonstre].getStats().getOr());
		int hpmob=this.ennemi.getStats().getPdvcour();
		int chance=0;
		int action= Action.rien;
		while((hpcour>0)||(hpmob>0)||(chance==0)){
			while(action==Action.rien){
				//tant que le perso ne fais rien on attend
				//gerer la modification de action en autre chose que rien
			}
				if(action==Action.Attaquer){
					//Puissance = puissance d'attaque de A - (la défense de B ÷ 2)
					if(this.IAmob(hpmob, this.ennemi)==Action.Attaquer){
					hpmob=(hpmob-(this.perso.getStats().getAttaque()-(this.ennemi.getStats().getDefense()/2)));//attaque du hero
					hpcour=(hpcour-(this.ennemi.getStats().getAttaque()-(this.perso.getStats().getDefense()/2)));//attaque de l ennemi
					
					}
					else{//l ennemie se defend la puissance dattaque diminue de moitie donc la perte de hp diminue aussi de moitie
						hpmob=(hpmob-((this.perso.getStats().getAttaque()-(this.ennemi.getStats().getDefense()/2)/2)));
					}
				}
				if(action==Action.Defendre){
					if(this.IAmob(hpmob, this.ennemi)==Action.Attaquer){
						hpcour=(hpcour-((this.ennemi.getStats().getAttaque()-(this.perso.getStats().getDefense()/2)))/2);
					}
				}
				if(action==Action.fuite){
					//on definit une methode fuite
					chance=fuite();
					if(chance==0){
						if(this.IAmob(hpmob, this.ennemi)==Action.Attaquer){
							hpcour=(hpcour-(this.ennemi.getStats().getAttaque()-(this.perso.getStats().getDefense()/2)));
						}
					}
				}
				if(action==Action.Inventaire){
					//gestion des de linventaire a faire faire une methode de gestion d une action dans l inventaire
				}
				action=Action.rien;
		}
		if(hpmob==0){
			this.perso.getStats().setNbXp(this.ennemi.getStats().getNbxp());
			this.perso.getStats().setOr(this.ennemi.getStats().getOr());
			levelup();
		}
		if(hpcour==0){
			//gerer la mort du hero soit par un game over soit par un repop a la ville avec de largent en moins
			this.perso.setPosHeros(Hero.ABSCISSE_DEFAUT,Hero.ORDONNE_DEFAUT);
			this.perso.getStats().setOr(this.perso.getStats().getOr()/2);
		}
		if(chance!=0){
			//gerer l abandont dun combat
		}
		this.perso.getStats().setPdvcour(hpcour);
		this.modeCombat=false;
		return null;
	
	}

	
	/**
	 * Methode determinant la chance de fuir un combat
	 * @return int 
	 */
	public int fuite(){
		int chancefuite = (int) (Math.random() * 6 );
		if (chancefuite==0){
			return 1;
		}
		return 0;
	}
	
	/**
	 * Methode definisant le comportement de l ennemie en fonction de ces point de vie
	 * 
	 * @param hpmob  point de vie du moment au moment present
	 * @param mob  type de monstre qui combat
	 * @return une action produite
	 */
	public int IAmob(int hpmob, Monstre mob){
		int tauxattdef = (int) (Math.random() * 10 );
		if(hpmob>(mob.getStats().getPointdevie()/2)){
			if (tauxattdef>8){
				return Action.Defendre;
			}
			return Action.Attaquer;
		}
		else{
			if (tauxattdef>8){
				return Action.Attaquer;
			}
			return Action.Defendre;
		}
	}
	
	
	/**
	 * 
	 * 
	 * @param indexItemInventaire l item selectionner dans l'inventaire
	 * @throws ModeCombatInvalidException Si le Hero n est pas dans le bon mode 
	 */
	public void ItemSelect(int indexItemInventaire) throws ModeCombatInvalidException{
		ItemUse(this.perso.getInventaire(indexItemInventaire));
	}

	/**
	 * @param objet l item utilise 
	 * @throws ModeCombatInvalidException  si le mode de combat ne correspond pas 
	 */
	//adapter maintenant a une autre fonction qui determine l item utilise enfin l item que lon souhaite utiliser et incruster cette fonction dans la fonction combat 
	public void ItemUse(Item objet) throws ModeCombatInvalidException{
		if(objet.getTypeItem()==TypeItem.Objet_de_Soin){
			this.perso.getStats().setPdvcour(objet.getBonusItem());
		}
		if(objet.getTypeItem()==TypeItem.Objet_de_Recup){
			this.perso.getStats().setPdmcour(objet.getBonusItem());
		}
		if(objet.getTypeItem()==TypeItem.Arme){
			if(this.modeCombat){
				throw new ModeCombatInvalidException();
			}
			else{
				this.perso.setArme(objet);
				this.perso.getStats().setAttaque(objet.getBonusItem());
			}
		}
		if(objet.getTypeItem()==TypeItem.Bouclier){
			if(this.modeCombat){
				throw new ModeCombatInvalidException();
			}
			else{
				this.perso.setBouclier(objet);
				this.perso.getStats().setDefense(objet.getBonusItem());
			}	
		}
		if(objet.getTypeItem()==TypeItem.Equipement_Bras){
			if(this.modeCombat){
				throw new ModeCombatInvalidException();
			}
			else{
				this.perso.setArmurebras(objet);
				this.perso.getStats().setDefense(objet.getBonusItem());
			}
		}
		if(objet.getTypeItem()==TypeItem.Equipement_Corps){
			if(this.modeCombat){
				throw new ModeCombatInvalidException();
			}
			else{
				this.perso.setArmurebuste(objet);
				this.perso.getStats().setDefense(objet.getBonusItem());
			}
		}
		if(objet.getTypeItem()==TypeItem.Equipement_Pied){
			if(this.modeCombat){
				throw new ModeCombatInvalidException();
			}
			else{
				this.perso.setArmurepied(objet);
				this.perso.getStats().setDefense(objet.getBonusItem());
			}
		}
		if(objet.getTypeItem()==TypeItem.Equipement_Tete){
			if(this.modeCombat){
				throw new ModeCombatInvalidException();
			}
			else{
				this.perso.setArmurecasque(objet);
				this.perso.getStats().setDefense(objet.getBonusItem());
			}
		}
		if(objet.getTypeItem()==TypeItem.Objet_de_Soutien){

		}
	}		
	


}
