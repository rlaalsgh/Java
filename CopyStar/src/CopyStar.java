import java.io.*;

public class CopyStar {
   public static void main(String[] args) {
	   File s = new File("C:\\Ex\\a.png");
	   File r = new File("C:\\Ex\\b.png");
	   int Ssize = (int)s.length();//파일의 크기를 "int" 로 받아서 사용한다.
	   int c;
	   int i = 0;// 파일이 얼마나 복사가 됐는지 확인할 변수
	   try {
		   FileInputStream fi = new FileInputStream(s);
		   FileOutputStream fo = new FileOutputStream(r);
		   System.out.println("10%가 되면 자동으로 *을 생성합니다.");
		   while((c= fi.read())!=-1)
		   {
			   
			   fo.write((byte)c);
			   if(Ssize/10 <= i)//10%때마다
			   {
				   System.out.print("*");//*을 출력하고
				   i=0;//다시 i를 0으로 만들어줌
			   }
			   i++;//i 증가
			   
		   }
		   fi.close();
		   fo.close();
		   System.out.println("");
		   System.out.println("파일복사완료");//완료후 출력문
		   
	   }catch(IOException e) {//예외처리
		   System.out.println("파일복사 오류");
	   }
   }
}