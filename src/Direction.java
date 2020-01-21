
public class Direction {
	private int num;
	private int dx,dy;
	public final int HAUT = 0,BAS = 1,GAUCHE =  2 ,DROITE = 3, AUCUNE = -1;
	public Direction(int num) {
		this.num = num;
		if(num == HAUT)
		{
			dx = 0;
			dy = 1;
		}
		if(num == BAS)
		{
			dx = 0;
			dy = -1;
		}
		if(num == GAUCHE)
		{
			dx = -1;
			dy = 0;
		}
		if(num == DROITE)
		{
			dx = 1;
			dy = 0;
		}
		
	}
	
	public int getDx() {
		return dx;
	}


	public int getNum() {
		return num;
	}

	public int getDy() {
		return dy;
	}
	

	
	
}
