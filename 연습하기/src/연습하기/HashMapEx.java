package �����ϱ�;

import java.util.*;

public class HashMapEx {
	public static void main(String [] args) {
		Random q = new Random();
		HashMap<Integer,String> a = new HashMap<Integer,String>();
		a.put(1,"����");
		a.put(2,"����");
		a.put(3,"��");
		Scanner scan = new Scanner(System.in);
		while(true) {
			int c = q.nextInt(3)+1;
			System.out.println("----��ǻ�Ϳ� ���� ���� �� ������ �մϴ� �����(4)----");
			System.out.println("����(1) ����(2) ��(3)!");
			int y = scan.nextInt();
			if(y == 4)
			{
				System.out.println("�����մϴ�..");
				break;
			}
			else if(y == 1) {
				System.out.println("����� : "+a.get(y));
				System.out.println("��ǻ�� : "+a.get(c));
				if(c==1)
					System.out.println("�����ϴ�!");
				else if(c==2)
					System.out.println("�����ϴ�!");
				else if(c==3)
					System.out.println("�̰���ϴ�!");
			}
			else if(y == 2) {
				System.out.println("����� : "+a.get(y));
				System.out.println("��ǻ�� : "+a.get(c));
				if(c==1)
					System.out.println("�̰���ϴ�!");
				else if(c==2)
					System.out.println("�����ϴ�!");
				else if(c==3)
					System.out.println("�����ϴ�!");
			}
			else if(y == 3) {
				System.out.println("����� : "+a.get(y));
				System.out.println("��ǻ�� : "+a.get(c));
				if(c==1)
					System.out.println("�����ϴ�!");
				else if(c==2)
					System.out.println("�̰���ϴ�!");
				else if(c==3)
					System.out.println("�����ϴ�!");
			}
			else {
				System.out.println("�ٸ����� �Է��ϼ̽��ϴ�.");
			}
			
		}
		
		
	}
}
