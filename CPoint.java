public class CPoint extends Point {
	
	private String color;
	
	
	//Constructeurs

	public CPoint() {
	}
	
	public CPoint(int x, int y, String c){
		super(x,y);
		this.color=c;
	}
	
	public CPoint (int x, int y, char l, String c) {
		super(x,y,l);
		this.color=c;		
	}

	//getter & setter
	
	void setColor(String c){
		this.color=c;
	}
	String getColor(){
		return this.color;
	}
	
	//methode 
	void printC(){
		super.print();
		System.out.println(" ; " + this.color);
	}
}
