package �ѿ�����;
import java.util.Scanner;
class Dictionary{
	private static String [] kor = {"���","�Ʊ�","��","�̷�","���"};
	private static String [] eng = {"love","baby","money","future","hope"};
	public static String kor2Eng(String word) {
		int i;
		for(i=0;i<kor.length;i++) {
			if (kor[i].equals(word)) {
				word=eng[i]; 
				break;
			}	
		}
		if(i>=kor.length)
			return null;
		else
			return word;
	}
}


public class DicApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true)
		{	String y;
			System.out.print("�ѱ۴ܾ�?");
			String a = scan.next();
			if (a.equals("�׸�"))
				break;
			else if(Dictionary.kor2Eng(a)!=null)
				System.out.println(a+"�� "+Dictionary.kor2Eng(a));
			else
				System.out.println(a+"�� ���� ������ �����ϴ�.");
		}

	}
}
