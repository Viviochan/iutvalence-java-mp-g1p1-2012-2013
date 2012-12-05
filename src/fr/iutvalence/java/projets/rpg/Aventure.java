package fr.iutvalence.java.projets.rpg;
import java.io.IOException;
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
	public Monstre[] tabMonstres;
	
	/**
	 * Indique le nombre de monstre different que le jeu contient 
	 */
	public int nbMonstreInBase;
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
	 * Tableau gardant la position des PNJ sur le Plateau de Jeu
	 */
	public PNJ[] positionPNJ;
	
	
	
	/**
	 * La boucle qui gere la partie
	 * @param args des arguments non pris en compte ici
	 * @throws CoordonneesInvalideException si les coordonnees generer sorte des limite du plateau
	 * @throws DirectionInvalideException si la deirection fait sortir le Hero des limite du plateau
	 * @throws ModeCombatInvalidException si le Hero use un item au mauvais moment
	 * @throws IOException si la saisie ne correspond pas
	 */
	public static void main(String[] args) throws CoordonneesInvalideException, DirectionInvalideException, ModeCombatInvalidException, IOException{
		Aventure aven= new Aventure();
		//ecrire les touches qui serve poru le jeu
		System.out.print("");
		System.out.print("Bienvenue dans le monde d'Aven:");
		while(aven.demon.getStats().getPdvcour()!=0){
			Direction dir=null;
			Action act=null;
				while(dir==null){
					//il faut maintenant gerer la manipulation du clavier pour modifier la direction
					System.out.print("\nsaissisez une direction \n");
					char c=(char)System.in.read();
					if ((c=='z') | (c=='Z')){
						dir=Direction.HAUT;
					}
					if ((c=='s') | (c=='S')){
						dir=Direction.BAS;
					}
					if ((c=='q') | (c=='Q')){
						dir=Direction.GAUCHE;
					}
					if ((c=='d') | (c=='D')){
						dir=Direction.DROITE;
					}
					if ((c=='i')|(c=='I')){
						//touche qui ouvre l'inventaire
						act=Action.INVENTAIRE;
					}
					if ((c=='o')|(c=='O')){
						//toucher qui permettra de communiquer avec les pnjs
						act=Action.INTERAGIR;
						//aven.interractionAvecPNJ();
					}
				}
				aven.deplacementHeros(dir);
				System.out.print(" \n");
				System.out.print(aven.perso);
				dir=null;
				act=null;
		}
		//generique puis un new game+ ou recommencer
		System.out.print("\n C'était un jeu développer par la Vivio Production \n Merci à vous d'avoir jouer \n"); 
				
	}
	
	
	/**
	 * Constructeur
	 * 
	 * Initialise les elements necessaire pour debuter une aventure
	 * 
	 * error_code servira juste de teste d'erreur et on affichera le probleme selon la valeur de error_code
	 * 
	 * @throws CoordonneesInvalideException la position generer n est pas valide
	 */
	// FIXME (FIXED)ici, il faudrait faire en sorte que si la position du heros et du boss n'est pas bonne, on doit la générer de nouveau
	public Aventure() throws CoordonneesInvalideException
	{
		int x=100;
		int y=100;
		this.carte = new PlateaudeJeu(x,y);
		try{

			this.perso = new Hero();
			this.demon = new Boss();
			
		}
		catch(CoordonneesInvalideException e1){
			this.perso = new Hero("Vivio",(int)x/10,(int)y/10);
			this.demon = new Boss((int)x/2,y);
		}
		level();
		TabMonstres();
		placementPnj();
		this.modeCombat=false;
		
	}
	
	/**
	 * Demarreur
	 * 
	 * Initialise les elements necessaire pour debuter une aventure
	 * 
	 * error_code servira juste de teste d'erreur et on affichera le probleme selon la valeur de error_code
	 * 
	 * @throws CoordonneesInvalideException la position generer n est pas valide
	 */
	public void demarrer() throws CoordonneesInvalideException{
		this.carte = new PlateaudeJeu();
		this.perso = new Hero();
		this.demon = new Boss();
		level();
		TabMonstres();
		initInventaire();
		this.modeCombat=false;
	}

	// FIXME (FIXED)cette méthode doit-elle être publique ?
	/**
	 * construis et remplie le tableau de niveaux avec leur taux d'xp respectif
	 * 
	 * Pour chaque niveau on aura besoin de 75% d'xp en plus
	 */
	private void level()
	{
		int i = 1;
		int xp = 20;
		this.levels = new Niveau[NIVEAU_MAX + 1];
		this.levels[0] = new Niveau(0, 0);//Niveau 0
		this.levels[1] = new Niveau();//Niveau 1
		for (i = 2; i < NIVEAU_MAX; i++)
		{
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
	private int levelup()
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
			this.perso.getStats().setPointsDeVie(Hero.BONUS_HP);
			this.perso.getStats().setPointsDeMana(Hero.BONUS_MP);
			this.perso.getStats().setAttaque(Hero.BONUS_ATT);
			this.perso.getStats().setDefense(Hero.BONUS_DEF);
		}
		return (this.perso.getStats().getNbxp());

	}
	
	/**
	 * Methode permettent le remplissage du tableau de monstre en lisant la base de donnees a la table monstre
	 * 
	 * @return 0 si la table de monstre a ete bien lus et recopier
	 */
	private int TabMonstres(){
		Monstre[] dataMonstre= new Monstre[NB_MAX_MONSTRE];
		dataMonstre[0]= new Monstre();
		dataMonstre[1]=new Monstre("SanguinisVache",13,12,6,4,7);
		dataMonstre[2]=new Monstre("Vampivol",15,17,12,10,10);
		dataMonstre[3]=new Monstre("GreenArrow",17,16,12,9,16);
		dataMonstre[4]=new Monstre("SlimeRouge",19,23,18,20,22);
		//dataMonstre[]=new Monstre();
	this.tabMonstres=dataMonstre;
	this.nbMonstreInBase=4;
	this.nbMonstreInBase++;
	
	return this.nbMonstreInBase;
	}
	
	/**
	 * Initialise l'inventaire du hero
	 */
	private void initInventaire(){
		Item[] sac= new Item[CAPACITE_INVENTAIRE];
		sac[0]= new Item("herbes medicinal",TypeItem.Objet_de_Soin,30,10,5);
		sac[0]= new Item("herbes medicinal",TypeItem.Objet_de_Soin,30,10,5);
		sac[0]= new Item("herbes medicinal",TypeItem.Objet_de_Soin,30,10,5);
		sac[0]= new Item("herbes medicinal",TypeItem.Objet_de_Soin,30,10,5);
		sac[0]= new Item("herbes medicinal",TypeItem.Objet_de_Soin,30,10,5);
		this.inventaire=sac;
		return;
	}
	

	
	/**
	 * Methodes PNJ Placement du ou des pnj par defaut
	 * 
	 * @return 0
	 * @throws CoordonneesInvalideException 
	 */
	private void placementPnj() throws CoordonneesInvalideException
	{
		PNJ[] pos= new PNJ[4];
		pos[0]=new PNJ();
		pos[1]=new PNJ(0,2,"Bonjour voyageur!");
		pos[2]=new PNJ(0,3,"Bienvenue chez nous");
		pos[3]=null;
		this.positionPNJ=pos;
		return;
	}
	
	
	
	/**
	 * @throws CoordonneesInvalideException 
	 * 
	 */
	private void interractionAvecPNJ() throws CoordonneesInvalideException{
		for(int i=0;i<4;i++){
			Position posHero=this.perso.getPosHeros();
			Position posXp1= new Position(posHero.getX()+1,posHero.getY());
			Position posXm1= new Position(posHero.getX()-1,posHero.getY());
			Position posYp1= new Position(posHero.getX(),posHero.getY()+1);
			Position posYm1= new Position(posHero.getX(),posHero.getY()-1);
			if((posXp1==this.positionPNJ[i].getPosPNJ())|(posXm1==this.positionPNJ[i].getPosPNJ())|(posYp1==this.positionPNJ[i].getPosPNJ())|(posYm1==this.positionPNJ[i].getPosPNJ())){
				System.out.print(this.positionPNJ[i].getPhrase());
			}
		}
	}
	
	
	/**
	 * Permet le deplacement du Hero a partir de coordonnees
	 * 
	 * @param xarr abscisse de la position souhaite
	 * @param yarr ordonneer de la position souhaite
	 * 
	 * @return Posheros la nouvelle position du hero
	 * @throws CoordonneesInvalideException les coordonnees depassent les bornes de la cartes
	 * @throws ModeCombatInvalidException si on utilise un item inutilise en combat
	 * @throws IOException si la saisie ne correspond pas
	 */
	//La methode n'est pas utiliser car il est plus aiser de generer des deplacement avec des directions
	//elle a permis de me faire l'idee du deplacement avec direction
	private Position deplacementHeros(int xarr, int yarr) throws CoordonneesInvalideException, ModeCombatInvalidException, IOException
	{
		if ((xarr > PlateaudeJeu.LONGUEUR) || (yarr > PlateaudeJeu.LONGUEUR))
		{
			throw new CoordonneesInvalideException();
		}
		if ((this.perso.getPosHeros().getX() == xarr) || ((this.perso.getPosHeros().getX()) + 1 == xarr)
				|| ((this.perso.getPosHeros().getX()) - 1 == xarr))
		{
			if ((this.perso.getPosHeros().getY() == yarr) || ((this.perso.getPosHeros().getY()) + 1 == yarr)
					|| ((this.perso.getPosHeros().getY()) - 1 == yarr))
			{
				if (this.carte.getCase(xarr, yarr) == PlateaudeJeu.PRATICABLE)
				{
					this.perso.getPosHeros().setX(xarr);
					this.perso.getPosHeros().setY(yarr);

				}
				else{
					throw new CoordonneesInvalideException();// case non praticable
				}
			}
			else{
			throw new CoordonneesInvalideException();
			}
		}
		else{
		throw new CoordonneesInvalideException();
		}
		this.declencheCombat();
		return this.perso.getPosHeros();
	}

	/**
	 * Gere le deplacement du hero a partir d'une direction donnee
	 * 
	 * @param dir Une direction (GAUCHE,DROITE,HAUT,BAS)
	 *            
	 * @return poshero la nouvelle position du hero
	 * 
	 * @throws DirectionInvalideException la direction choisie n est pas valable
	 * @throws CoordonneesInvalideException les coordonnees depassent les bornes de la cartes
	 * @throws ModeCombatInvalidException si on utilise un item inutilise en combat
	 * @throws IOException si la saisie ne correspond pas
	 */

	private Position deplacementHeros(Direction dir) throws DirectionInvalideException, CoordonneesInvalideException, ModeCombatInvalidException, IOException{
		Position poshero = this.perso.getPosHeros();
		switch(dir){
			case HAUT:
				poshero.setY(poshero.getY() + 1);
				break;
			case BAS:
				poshero.setY(poshero.getY() - 1);
				break;
			case DROITE:
				poshero.setX(poshero.getX() + 1);
				break;
			case GAUCHE:
				poshero.setX(poshero.getX() - 1);
				break;
		}
		Position mew= new Position(poshero.getX(),poshero.getY());
		if(this.carte.getCase(poshero.getX(),poshero.getY())){
			this.perso.setPosHero(mew);
			this.declencheCombat();
		}
		return this.perso.getPosHeros();
	}
	
	
	
	/**
	 * Methode qui a permettra de definir si un deplacement provoque un combat avec un ennemi ou non
	 * 
	 * @return 0 si la methode c est bien execute
	 * @throws CoordonneesInvalideException si la position de repop du hero n est pas valide
	 * @throws ModeCombatInvalidException si on utilise un item non autoriser en combat
	 * @throws IOException si la saisie ne correspond pas
	 */
	private int declencheCombat() throws CoordonneesInvalideException, ModeCombatInvalidException, IOException{
		if(this.perso.getPosHeros()==this.demon.getPosBoss()){
			combatFinal();
		}
		int nb = (int) (Math.random() * TAUX_MAX_RENCONTRE );
		if (nb<=TAUX_RENCONTRE){
			//on genere un combat
			this.modeCombat=true;
			combat();
		}
		return 0;
	}
	
	/**
	 * Methode gerant un combat avec un ennemi
	 * @throws CoordonneesInvalideException  si le hero perd il est teleporter a une la position par defaut
	 * @throws ModeCombatInvalidException si on utilise un item inutilise en combat
	 * @throws IOException si la saisie ne correspond pas
	 * 
	 * 
	 */
	//il manque a gere si le perso utilise un item
	
	//on gere une collection de monstre egal a nbmonstre et on gere ensuite les differents
	//monstre choisie pour que les stats soit adapter aux heros
	//on met en place le reste des elements du combat
	//on gere les differentes possibilites d action du perso et on adapte le calcul de dommage
	
	private void combat() throws CoordonneesInvalideException, ModeCombatInvalidException, IOException{
		
		System.out.print(" Mode combat:\n");
		int hpcour=this.perso.getStats().getPdvcour();//niveau courantde point de vie si 0 perdue
		//int mpcour=this.perso.getPointdemana();//niveau courant de mp
		//on choisie un monstre au hasard dans la base de monstre en fonction du niveau du hero
		int nbmonstre= (int) (Math.random()*this.nbMonstreInBase );
		this.ennemi= new Monstre(this.tabMonstres[nbmonstre].getNomMonstre(),this.tabMonstres[nbmonstre].getStats().getPointsDeVie(),this.tabMonstres[nbmonstre].getStats().getAttaque(),this.tabMonstres[nbmonstre].getStats().getDefense(),this.tabMonstres[nbmonstre].getStats().getNbxp(),this.tabMonstres[nbmonstre].getStats().getOr());
		int hpmob=this.ennemi.getStats().getPdvcour();
		int chance=0;
		Action action= Action.RIEN;
		Action actMob=Action.RIEN;
		while((hpcour>0)&&(hpmob>0)&&(chance==0)){
			while(action==Action.RIEN){
				//tant que le perso ne fais rien on attend
				//gerer la modification de action en autre chose que rien
				action=this.saisieAction();
			}
			switch(action){
				case ATTAQUER:
					actMob=this.iAmob(hpmob, this.ennemi);
					//Puissance = puissance d'attaque de A - (la défense de B ÷ 2)
					switch (actMob){
						case ATTAQUER:
							hpmob=(hpmob-(this.perso.getStats().getAttaque()-(this.ennemi.getStats().getDefense()/2)));//attaque du hero
							hpcour=(hpcour-(this.ennemi.getStats().getAttaque()-(this.perso.getStats().getDefense()%this.ennemi.getStats().getAttaque())));//attaque de l ennemi
							this.perso.getStats().setPdvcour(hpcour);
							this.ennemi.getStats().setPdvcour(hpmob);
							System.out.print(" \n");
							System.out.print(this.perso);
							System.out.print(" \n");
							System.out.print(this.ennemi);
						break;
					
						case DEFENDRE://l ennemie se defend la puissance dattaque diminue de moitie donc la perte de hp diminue aussi de moitie
							hpmob=(hpmob-((this.perso.getStats().getAttaque()-(this.ennemi.getStats().getDefense()/2)/2)));
							this.perso.getStats().setPdvcour(hpcour);
							System.out.print(" \n");
							System.out.print(this.perso);
							System.out.print(" \n");
							System.out.print(this.ennemi);
						break;
					}
					break;
				case DEFENDRE:
					actMob=this.iAmob(hpmob, this.ennemi);
					switch (actMob){
						case ATTAQUER:
							hpcour=(hpcour-((this.ennemi.getStats().getAttaque()-(this.perso.getStats().getDefense()%2))));
							this.perso.getStats().setPdvcour(hpcour);
							System.out.print(" \n");
							System.out.print(this.perso);
							System.out.print(" \n");
							System.out.print(this.ennemi);
						break;
						case DEFENDRE://l ennemie se defend la puissance dattaque diminue de moitie donc la perte de hp diminue aussi de moitie
							System.out.print(" \n");
							System.out.print(this.perso);
							System.out.print(" \n");
							System.out.print(this.ennemi);
						break;
					}
				break;
				case FUITE:
					//on definit une methode fuite
					chance=fuite();
					if(chance==0){
						switch (this.iAmob(hpmob, this.ennemi)){
							case ATTAQUER:
							hpcour=(hpcour-(this.ennemi.getStats().getAttaque()-(this.perso.getStats().getDefense()/2)));
						break;
						}
					}
				break;
				case INVENTAIRE:
					//gestion des de linventaire a faire faire une methode de gestion d une action dans l inventaire
					int usage=0;
					while(usage==0){
						// FIXME vérifier par le test la génération du nombre aléatoire 
						int index=(int) Math.random()*CAPACITE_INVENTAIRE+1;
						//Pour le moment usage aleatoire definir une selection d item
						if(this.inventaire[index]!=null){
							this.itemSelect(index);
							usage++;
						}
					break;
					
				}
			}
			// FIXME(FIXED) inutile
			//au fait par peur qu'il bug je l'ai placer a ces deux endroit
			action=Action.RIEN;
		}
		if(hpmob<=0){
			this.perso.getStats().setNbXp(this.ennemi.getStats().getNbxp());
			this.perso.getStats().setOr(this.ennemi.getStats().getOr());
			levelup();
		}
		if(hpcour<=0){
			//gerer la mort du hero soit par un game over soit par un repop a la ville avec de largent en moins
			this.perso.getStats().setPdvcour(this.perso.getStats().getPointsDeVie());
			this.perso.setPosHeros(Hero.ABSCISSE_DEFAUT,Hero.ORDONNE_DEFAUT);
			this.perso.getStats().setOr(this.perso.getStats().getOr()/2);
			System.out.print("\n vous avez été tuée \n");
		}
		if(chance!=0){
			//si on abandonne le combat on a rien a faire de plus
			System.out.print("\n vous avez pris la fuite \n");
		}
		this.perso.getStats().setPdvcour(hpcour);
		this.modeCombat=false;
		System.out.print("\n sortie mode combat \n");
		return;
		}

	
	/**
	 * Methode gerant le combat entre le Hero et le boss Final
	 * @throws CoordonneesInvalideException si les coordonnes du Hero lors de sa mort sorte des limites du plateau
	 * @throws ModeCombatInvalidException	si le Hero utilise un item non autoriser en combat
	 * @throws IOException si la saisie ne correspond pas
	 */
	private void combatFinal() throws CoordonneesInvalideException, ModeCombatInvalidException, IOException{
		int chance=0;
		Action action= Action.RIEN;
		Action actBoss=Action.RIEN;
		while((this.perso.getStats().getPdvcour()>0)&&(this.demon.getStats().getPdvcour()>0)&&(chance==0)){
			while(action==Action.RIEN){
				//tant que le perso ne fais rien on attend
				//gerer la modification de action en autre chose que rien
				action=this.saisieAction();
			}
			switch(action){
				case ATTAQUER:
					actBoss=this.iABoss();
					//Puissance = puissance d'attaque de A - (la défense de B ÷ 2)
					switch (actBoss){
						case ATTAQUER:
							if(this.demon.getStats().getPdvcour()<=this.demon.getStats().getPointsDeVie()){
								this.demon.getStats().setPdvcour((this.demon.getStats().getPdvcour()-(this.perso.getStats().getAttaque()-(this.ennemi.getStats().getDefense()/2))));//attaque du hero
								this.perso.getStats().setPdvcour((this.perso.getStats().getPdvcour()-(this.ennemi.getStats().getAttaque()-(this.perso.getStats().getDefense()%this.ennemi.getStats().getAttaque()))));//attaque de l ennemi
								this.perso.getStats().setPdvcour((this.perso.getStats().getPdvcour()-(this.ennemi.getStats().getAttaque()-(this.perso.getStats().getDefense()%this.ennemi.getStats().getAttaque()))));//attaque de l ennemi
							}
							else{
								this.demon.getStats().setPdvcour((this.demon.getStats().getPdvcour()-(this.perso.getStats().getAttaque()-(this.ennemi.getStats().getDefense()/2))));//attaque du hero
								this.perso.getStats().setPdvcour((this.perso.getStats().getPdvcour()-(this.ennemi.getStats().getAttaque()-(this.perso.getStats().getDefense()%this.ennemi.getStats().getAttaque()))));//attaque de l ennemi
								
								
								
							}
							System.out.print(" \n");
							System.out.print(this.perso);
							System.out.print(" \n");
							System.out.print(this.demon);
						break;
					
						case DEFENDRE://l ennemie se defend la puissance dattaque diminue de moitie donc la perte de hp diminue aussi de moitie
							this.demon.getStats().setPdvcour((this.demon.getStats().getPdvcour()-((this.perso.getStats().getAttaque()-(this.ennemi.getStats().getDefense()/2)/2))));
							this.perso.getStats().setPdvcour(this.perso.getStats().getPdvcour());
							System.out.print(" \n");
							System.out.print(this.perso);
							System.out.print(" \n");
							System.out.print(this.demon);
						break;
					}
					break;
				case DEFENDRE:
					actBoss=this.iABoss();
					switch (actBoss){
						case ATTAQUER:
							this.perso.getStats().setPdvcour((this.perso.getStats().getPdvcour()-((this.ennemi.getStats().getAttaque()-(this.perso.getStats().getDefense()%2)))));
							if(this.demon.getStats().getPdvcour()<=this.demon.getStats().getPointsDeVie()){
								this.perso.getStats().setPdvcour((this.perso.getStats().getPdvcour()-((this.ennemi.getStats().getAttaque()-(this.perso.getStats().getDefense()%2)))));
								this.perso.getStats().setPdvcour((this.perso.getStats().getPdvcour()-((this.ennemi.getStats().getAttaque()-(this.perso.getStats().getDefense()%2)))));//attaque de l ennemi
								this.perso.getStats().setPdvcour((this.perso.getStats().getPdvcour()-((this.ennemi.getStats().getAttaque()-(this.perso.getStats().getDefense()%2)))));//attaque de l ennemi
								
							}
							else{
								this.perso.getStats().setPdvcour((this.perso.getStats().getPdvcour()-((this.ennemi.getStats().getAttaque()-(this.perso.getStats().getDefense()%2)))));//attaque de l ennemi	
							}
							System.out.print(" \n");
							System.out.print(this.perso);
							System.out.print(" \n");
							System.out.print(this.demon);
						break;
						case DEFENDRE://l ennemie se defend la puissance dattaque diminue de moitie donc la perte de hp diminue aussi de moitie
							System.out.print(" \n");
							System.out.print(this.perso);
							System.out.print(" \n");
							System.out.print(this.ennemi);
						break;
					}
				break;
				case FUITE:
					//on definit une methode fuite
					chance=fuite();
					if(chance==0){
						switch (this.iAmob(this.demon.getStats().getPdvcour(), this.ennemi)){
							case ATTAQUER:
								this.perso.getStats().setPdvcour((this.perso.getStats().getPdvcour()-(this.ennemi.getStats().getAttaque()-(this.perso.getStats().getDefense()/2))));
						break;
						}
					}
				break;
				case INVENTAIRE:
					//gestion des de linventaire a faire faire une methode de gestion d une action dans l inventaire
					int usage=0;
					while(usage==0){
						// FIXME vérifier par le test la génération du nombre aléatoire 
						int index=(int) Math.random()%CAPACITE_INVENTAIRE+1;
						//Pour le moment usage aleatoire definir une selection d item
						if(this.inventaire[index]!=null){
							this.itemSelect(index);
							usage++;
						}
					break;
					
				}
			}
			action=Action.RIEN;
		}
		if(this.demon.getStats().getPdvcour()<=0){
			this.perso.getStats().setNbXp(this.demon.getStats().getNbxp());
			this.perso.getStats().setOr(this.demon.getStats().getOr());
			levelup();
		}
		if(this.perso.getStats().getPdvcour()<=0){
			//gerer la mort du hero soit par un game over soit par un repop a la ville avec de largent en moins
			this.perso.getStats().setPdvcour(this.perso.getStats().getPointsDeVie());
			this.demon.getStats().setPdvcour(this.demon.getStats().getPointsDeVie());
			this.perso.setPosHeros(Hero.ABSCISSE_DEFAUT,Hero.ORDONNE_DEFAUT);
			this.perso.getStats().setOr(this.perso.getStats().getOr()/2);
			System.out.print("\n vous avez été tuée \n");
		}
		if(chance!=0){
			//si on abandonne le combat on a rien a faire de plus
			System.out.print("\n vous avez pris la fuite \n");
		}
		this.perso.getStats().setPdvcour(this.perso.getStats().getPdvcour());
		this.modeCombat=false;
		System.out.print("\n sortie mode combat \n");
		return;
		}
		
	
	
	/**
	 * Methode determinant la chance de fuir un combat
	 * @return int 0 si on a pas reussit a fuir et 1 si on a reussit
	 */
	private int fuite(){
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
	private Action iAmob(int hpmob, Monstre mob){
		int tauxattdef = (int) (Math.random() * 10 );
		if(hpmob<=(mob.getStats().getPointsDeVie()/2)){
			if (tauxattdef>8){
				return Action.DEFENDRE;
			}
			return Action.ATTAQUER;
		}
		else{
			if (tauxattdef<8){
				return Action.ATTAQUER;
			}
			return Action.DEFENDRE;
		}
	}
	
	/**
	 * Methode definissant le comportement du Boss
	 * @return une action
	 */
	private Action iABoss(){
		int tauxattdef = (int) (Math.random() * 10 );
		if(this.demon.getStats().getPdvcour()<=this.demon.getStats().getPointsDeVie()/2){
			if(tauxattdef>8){
				return Action.DEFENDRE;
			}
			return Action.ATTAQUER;
		}
		else{
			if (tauxattdef<8){
				return Action.ATTAQUER;
			}
			return Action.DEFENDRE;	
		}
	}
	/**
	 * Selectionne l'item saisie dans l'inventaire du Hero
	 * 
	 * @param indexItemInventaire l item selectionner dans l'inventaire
	 * @throws ModeCombatInvalidException Si le Hero n est pas dans le bon mode 
	 */
	private void itemSelect(int indexItemInventaire) throws ModeCombatInvalidException{
		itemUse(this.perso.getInventaire(indexItemInventaire));
	}

	
	
	/**
	 * Gere l'usage d'un item
	 * @param objet item utiliser
	 * @throws ModeCombatInvalidException si le personnage se trouve en mode combat
	 */
	//Trouver la methode pour definir l objet que l on utilise
	private void itemUse(Item objet) throws ModeCombatInvalidException{
		TypeItem type=objet.getTypeItem();
		switch(type){
			case Objet_de_Soin:
				this.perso.getStats().setPdvcour(objet.getBonusItem());
				break;
			case Objet_de_Recup:
				this.perso.getStats().setPdmcour(objet.getBonusItem());
				break;
			case Arme:
				if(this.modeCombat){
					throw new ModeCombatInvalidException();
				}
				else{
					int arme= this.perso.getArme().getBonusItem();
					this.perso.setArme(objet);
					this.perso.getStats().setAttaque(arme*(-1));
					this.perso.getStats().setAttaque(objet.getBonusItem());
				}
				break;
			case Bouclier:
				if(this.modeCombat){
					throw new ModeCombatInvalidException();
				}
				else{
					Item boubou= this.perso.getBouclier();
					this.perso.setBouclier(objet);
					this.perso.getStats().setAttaque(-boubou.getBonusItem());
					this.perso.getStats().setDefense(objet.getBonusItem());
				}
				break;
			case Equipement_Bras:
				if(this.modeCombat){
					throw new ModeCombatInvalidException();
				}
				else{
					this.perso.setArmurebras(objet);
					this.perso.getStats().setDefense(objet.getBonusItem());
				}
				break;
			case Equipement_Corps:
				if(this.modeCombat){
					throw new ModeCombatInvalidException();
				}
				else{
					this.perso.setArmurebuste(objet);
					this.perso.getStats().setDefense(objet.getBonusItem());
				}
				break;
			case Equipement_Pied:
				if(this.modeCombat){
					throw new ModeCombatInvalidException();
				}
				else{
					this.perso.setArmurepied(objet);
					this.perso.getStats().setDefense(objet.getBonusItem());
				}
				break;
			case Equipement_Tete:
				if(this.modeCombat){
					throw new ModeCombatInvalidException();
				}
				else{
					this.perso.setArmurecasque(objet);
					this.perso.getStats().setDefense(objet.getBonusItem());
				}
				break;
			case Objet_de_Soutien:
				break;
		}
	}
	
	
	
	
	/**
	 * Gere la saisie au clavier lors d'un combat
	 * @return une action 
	 * @throws IOException si la saisie ne correspond pas
	 */
	private Action saisieAction() throws IOException{
		Action action=Action.RIEN;
		char c=(char)System.in.read();
		if ((c=='l') | (c=='L')){
			action=Action.ATTAQUER;
		}
		if ((c=='m') | (c=='M')){
			action=Action.DEFENDRE;
		}
		if ((c=='o') | (c=='O')){
			action=Action.INVENTAIRE;
		}
		if ((c=='p') | (c=='P')){
			action=Action.FUITE;
		}
		return action;
		
	}
	
	
	
	
	



}
