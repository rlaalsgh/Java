import java.io.*;

public class CopyStar {
   public static void main(String[] args) {
	   File s = new File("C:\\Ex\\a.png");
	   File r = new File("C:\\Ex\\b.png");
	   int Ssize = (int)s.length();//������ ũ�⸦ "int" �� �޾Ƽ� ����Ѵ�.
	   int c;
	   int i = 0;// ������ �󸶳� ���簡 �ƴ��� Ȯ���� ����
	   try {
		   FileInputStream fi = new FileInputStream(s);
		   FileOutputStream fo = new FileOutputStream(r);
		   System.out.println("10%�� �Ǹ� �ڵ����� *�� �����մϴ�.");
		   while((c= fi.read())!=-1)
		   {
			   
			   fo.write((byte)c);
			   if(Ssize/10 <= i)//10%������
			   {
				   System.out.print("*");//*�� ����ϰ�
				   i=0;//�ٽ� i�� 0���� �������
			   }
			   i++;//i ����
			   
		   }
		   fi.close();
		   fo.close();
		   System.out.println("");
		   System.out.println("���Ϻ���Ϸ�");//�Ϸ��� ��¹�
		   
	   }catch(IOException e) {//����ó��
		   System.out.println("���Ϻ��� ����");
	   }
   }
}