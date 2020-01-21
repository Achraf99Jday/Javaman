
public class Ghost extends Perso {
	
	public Ghost(double dx, double dy, double vitesse, Direction d) {
		super(dx, dy, vitesse, d);
	}

	public void changeDirection() {
		d = new Direction((int)Math.random()*(4));
	}
}
