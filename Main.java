package ractangle;

class Ractangle{ //사각형 클래스 정의
	int x,y,width,height;

	public Ractangle(int x,int y, int width, int height){//this 함수 사용하여 좌표와 가로 세로를 정의
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	void show(){//출력문 클래스
		System.out.println(("("+x+","+y+")"+"에서 크기가 "+width+"x"+height+"인 사각형"));
	}
	boolean contains(Ractangle val) {//정의한 사각형 안에 포함되는지 알수 있는 클래스 contains 정의
		if(val.x+val.width<this.x+this.width &&
				val.y+val.height<this.y+this.height)//정의한 사각형과 비교하여 포함되면 
			return true;//참 반환
		else//그외
			return false;//거짓 반환
	}
	int square(){//면적을 확인하기 위한 클래스 square 클래스 정의
		int a = width * height;//공식
		return a;//공식 값 반환
		
	}
}
public class Main {//main클래스

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ractangle r = new Ractangle(2,2,8,7);
		Ractangle s = new Ractangle(5,5,6,6);
		Ractangle t = new Ractangle(1,1,10,10);
		r.show();
		System.out.println("r의 면적은 "+ r.square());
		System.out.println("s의 면적은 "+ s.square());
		System.out.println("t의 면적은 "+ t.square());
		if(t.contains(r))
			System.out.println("t는 r을 포함합니다");
		if(t.contains(s))
			System.out.println("t는 s를 포함합니다");
	}
}