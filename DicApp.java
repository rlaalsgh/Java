package 한영사전;
import java.util.Scanner;
class Dictionary{
	private static String [] kor = {"사랑","아기","돈","미래","희망"};
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
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true)
		{	String y;
			System.out.print("한글단어?");
			String a = scan.next();
			if (a.equals("그만"))
				break;
			else if(Dictionary.kor2Eng(a)!=null)
				System.out.println(a+"은 "+Dictionary.kor2Eng(a));
			else
				System.out.println(a+"는 저의 사전에 없습니다.");
		}

	}
}
