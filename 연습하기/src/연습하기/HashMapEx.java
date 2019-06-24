package 연습하기;

import java.util.*;

public class HashMapEx {
	public static void main(String [] args) {
		Random q = new Random();
		HashMap<Integer,String> a = new HashMap<Integer,String>();
		a.put(1,"가위");
		a.put(2,"바위");
		a.put(3,"보");
		Scanner scan = new Scanner(System.in);
		while(true) {
			int c = q.nextInt(3)+1;
			System.out.println("----컴퓨터와 가위 바위 보 게임을 합니다 종료는(4)----");
			System.out.println("가위(1) 바위(2) 보(3)!");
			int y = scan.nextInt();
			if(y == 4)
			{
				System.out.println("종료합니다..");
				break;
			}
			else if(y == 1) {
				System.out.println("사용자 : "+a.get(y));
				System.out.println("컴퓨터 : "+a.get(c));
				if(c==1)
					System.out.println("비겼습니다!");
				else if(c==2)
					System.out.println("졌습니다!");
				else if(c==3)
					System.out.println("이겼습니다!");
			}
			else if(y == 2) {
				System.out.println("사용자 : "+a.get(y));
				System.out.println("컴퓨터 : "+a.get(c));
				if(c==1)
					System.out.println("이겼습니다!");
				else if(c==2)
					System.out.println("비겼습니다!");
				else if(c==3)
					System.out.println("졌습니다!");
			}
			else if(y == 3) {
				System.out.println("사용자 : "+a.get(y));
				System.out.println("컴퓨터 : "+a.get(c));
				if(c==1)
					System.out.println("졌습니다!");
				else if(c==2)
					System.out.println("이겼습니다!");
				else if(c==3)
					System.out.println("비겼습니다!");
			}
			else {
				System.out.println("다른수를 입력하셨습니다.");
			}
			
		}
		
		
	}
}
