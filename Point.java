public class Point {

	//attributs
	private int x;
	private int y;
	private char l;
	
	//getters
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public char getL(){
		return this.l;
	}
	

	//setters
	public void setX(int x){
		this.x=x;
	}

	public void setY(int y){
		this.y=y;
	}

	public void setL(char l){
		this.l=l;
	}
		

	//constructeurs
	public Point() {
	}

	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public Point(int x, int y, char l) {
		this.x=x;
		this.y=y;
		this.l=l;
	}
	
	
	//methodes
	public void check() {
		if (this.x<0) {
			this.x=0;
		}
		if (this.y<0) {
			this.y=0;
		}
	}

	public void print(){
		System.out.print( this.x+" ; "+this.y+" ; "+this.l);
	}
	
		
	public void move(int dx , int dy){
		this.x=this.x+dx;
		this.y=this.y+dy;
		this.check(); //
	}

	public void Ex(Point pt){
		pt.setX(1);
		pt.setY(1);		
	}


}
