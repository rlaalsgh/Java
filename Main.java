package ractangle;

class Ractangle{ //�簢�� Ŭ���� ����
	int x,y,width,height;

	public Ractangle(int x,int y, int width, int height){//this �Լ� ����Ͽ� ��ǥ�� ���� ���θ� ����
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	void show(){//��¹� Ŭ����
		System.out.println(("("+x+","+y+")"+"���� ũ�Ⱑ "+width+"x"+height+"�� �簢��"));
	}
	boolean contains(Ractangle val) {//������ �簢�� �ȿ� ���ԵǴ��� �˼� �ִ� Ŭ���� contains ����
		if(val.x+val.width<this.x+this.width &&
				val.y+val.height<this.y+this.height)//������ �簢���� ���Ͽ� ���ԵǸ� 
			return true;//�� ��ȯ
		else//�׿�
			return false;//���� ��ȯ
	}
	int square(){//������ Ȯ���ϱ� ���� Ŭ���� square Ŭ���� ����
		int a = width * height;//����
		return a;//���� �� ��ȯ
		
	}
}
public class Main {//mainŬ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ractangle r = new Ractangle(2,2,8,7);
		Ractangle s = new Ractangle(5,5,6,6);
		Ractangle t = new Ractangle(1,1,10,10);
		r.show();
		System.out.println("r�� ������ "+ r.square());
		System.out.println("s�� ������ "+ s.square());
		System.out.println("t�� ������ "+ t.square());
		if(t.contains(r))
			System.out.println("t�� r�� �����մϴ�");
		if(t.contains(s))
			System.out.println("t�� s�� �����մϴ�");
	}
}