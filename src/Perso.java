
public abstract class Perso {
	
	protected double dx,dy,vitesse;
	protected Direction d;
	
	public Perso(double dx, double dy, double vitesse, Direction d) {
		this.dx = dx;
		this.dy = dy;
		this.vitesse = vitesse;
		this.d = new Direction(d.getNum());
	}
	public double getDx() {
		return dx;
	}
	public double getDy() {
		return dy;
	}
	public double getVitesse() {
		return vitesse;
	}
	public Direction getD() {
		return d;
	}
	
	public void update() {
		/*if(getMur(d)) {
			
			si il y a un mur on soustrait jusqu'au milieu (on peut utiliser les methodes de Tools)
			
			
		}
			*/
		//else {	
		dx+=vitesse*dx;
		dy+=vitesse*dy;
		//}
	}
	
	public abstract void changeDirection();
	
	public boolean equals(Perso o) {
		return !(((Math.sqrt(Math.pow((o.dx-this.dx),2)+Math.pow((o.dy - this.dy), 2)))) < 0.25); //sinon on utilise la méthode de Tools distance que j'ai codé après
	}
	
}
