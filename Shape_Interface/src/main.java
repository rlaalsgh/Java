interface shape{
	final double PI= 3.14;
	void draw();
	public double getArea();
	default public void redraw() {
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();
	}

	
}
class circle implements shape{
	private int x;
	public circle(int x) {
		this.x=x;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double re = x*x*PI;
		return re;
		
	}
	@Override
	public void draw(){
		System.out.println("�������� "+x + "�� ���Դϴ�.");
	}

}

class oval implements shape{
	private int x, y;
	public oval(int x, int y) {
		this.x = x;
		this.y=y;
	}
	@Override
	public double getArea() {
		double re = x*y*PI;
		return re;
	}
	@Override
	public void draw() {
		System.out.println(x +"x"+y+ "�� ���� �ϴ� Ÿ���Դϴ�.");
	}
}

class rect implements shape{
	private int x,y;
	public rect(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public double getArea() {
	
		double re = x*y;
		return re;
		
	}
	@Override
	public void draw() {
		System.out.println(x +"x"+y+ "ũ����  �簢�� �Դϴ�.");
	}
	
}

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape [] list = new shape[3];
		list[0] = new circle(10);
		list[1] = new oval(20,30);
		list[2] = new rect(10,40);
		
		for (int i = 0 ; i<list.length; i++)
		{
			list[i].redraw();
		}
		for (int i = 0 ; i<list.length; i++)
		{
			System.out.println("������ "+list[i].getArea());
		}
		
	}

}
