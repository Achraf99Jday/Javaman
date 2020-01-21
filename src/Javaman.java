
public class Javaman extends Perso {
	Direction voulue;
	public Javaman(double dx, double dy, double vitesse, Direction d) {
		super(dx, dy, vitesse, d);
	}
	
	public void setVoulu(Direction voulue){
		this.voulue = new Direction(voulue.getNum());
	}
	
	public void changeDirection() {
		d = new Direction(voulue.getNum());
	}
	
}
