package homework_2019_05_07;
class point{
	private int x,y;
	public point(int x, int y) {
		this.x =x;
		this.y=y;
	}
	public int getx(){
		return x;
	}
	public int gety() {
		return y;
	}
	protected void move(int x, int y){
		this.x = x;
		this.y=y;
		}
}
class ColorPoint extends point{
	String c;
	public ColorPoint() {
		super(0,0);
		this.c="BLACK";
	}
	public ColorPoint(int x, int y) {
		super(x,y);
		this.c="BLACK";
	}
	public ColorPoint(int x, int y, String c) {
		super(x,y);
		this.c=c;
	}
	public void setXY(int x, int y) {
		move(x,y);
	}
	public void setColor(String c) {
		this.c=c;
	}
	public String tostring() {
		return c +"���� ("+getx()+","+gety()+")�� ��";
	}
	
}
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.tostring()+"�Դϴ�.");
		ColorPoint cp = new ColorPoint(10,10);
		cp.setXY(5,5);
		cp.setColor("RED");
		System.out.println(cp.tostring()+"�Դϴ�.");
		
	}

}
