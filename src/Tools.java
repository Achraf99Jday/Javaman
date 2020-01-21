
public class Tools {
	
	public double frac(double x) {
		return (double)(x - (int)(x));
	}
	
	public double milieu(double x) {
		return (double)((int)(x) + 0.5);
	}
	
	public boolean procheMilieu(double x, double y){
		return (Math.sqrt(Math.pow((milieu(x)-x),2)+Math.pow((milieu(y) - y), 2)) < 0.001);
	}
	
	public double distance(double x,double y, double a, double b) {
		return (Math.sqrt(Math.pow((a-x),2)+Math.pow((b - y), 2)));
	}
	
}
