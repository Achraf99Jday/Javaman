public class Case {
	private boolean[] tab = new boolean[4];
	private int mur;
	public Case(byte mur) {
		this.mur = mur;
	}
	
	public boolean getMur(Direction d) {
		if(d.getNum() == 0) 
			if((mur & 1) == 1) {
				tab[d.getNum()]=false;
				return true;
			}
		if(d.getNum() == 1)
			if((mur & 2) == 1) {
				tab[d.getNum()]=false;
				return true;
			}
		if(d.getNum() == 2) 
			if((mur & 4) == 1) {
				tab[d.getNum()]=false;
				return true;
			}
		if(d.getNum() == 3) 
			if((mur & 8) == 1) {
				tab[d.getNum()]=false;
				return true;
			}
		tab[d.getNum()]=true;
		return false;
	}
	
	
}
