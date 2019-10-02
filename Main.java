public class Main{
	
	public static void main(String[] tab){
	Point o1=new Point();
	o1.setX(5);
	o1.setY(2);
	o1.setL('o');
	o1.print();
	o1.move(-6,4);
	o1.print();

	Point o2=new Point(1,-10,'t');
	o2.check();
	o2.print();
	o2.move(7,-19);
	o2.print();

	Point pt1 = new Point();
	Point pt2 = pt1;
	System.out.println(pt1==pt2);
	System.out.println(pt1!=pt2);
	System.out.println(pt1==pt1);

	CPoint ptColor=new CPoint(5,2,'b',"red");
	ptColor.printC();
	ptColor.move(-6,4);
	ptColor.printC();

	Point pt =new Point();
	System.out.println(pt.toString());
	}
	
}
