
public class Monde {
	private Case[][] cases;
	private int nbC,nbL,round,status;
	private boolean invincible;
	private Ghost[] fantomes;
	private Javaman perso;
	private Javette pr;
	public Monde(Case[][] cases, int nbC, int nbL) {
		this.cases = cases;
		this.nbC = nbC;
		this.nbL = nbL;
		cases = new Case[nbC][nbL];
		round = 0;
		invincible = false;
	}
	public Case getCase(double x, double y) {
		return cases[(int)(Math.round(x))][(int)Math.round(y)];
	}
	public int getNbC() {
		return nbC;
	}
	public int getNbL() {
		return nbL;
	}
	public int getRound() {
		return round;
	}
	public int getStatus() {
		return status;
	}
	public boolean isInvincible() {
		return invincible;
	}
	
	
	
	
	

}
