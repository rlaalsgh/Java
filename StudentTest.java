import java.util.Scanner;
class student{
	private static int snum;
	private static String name;
	private static double point;
	public int gettersnum(){
		return snum;
	}
	public String gettername(){
		return name;
	}
	public double getterpoint(){
		return point;
	}
	public static void settersnum(int a) {
		snum = a;
	}
	public static void settername(String a) {
		name = a;
	}
	public static void setterpoint(double a) {
		point = a;
	}
	public static boolean testpt(double a, double point)
	{
		if (a>point)
			return false;
		else 
			return true;
	}
}
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//1,2 �л� s1 �����Է�
		String s1[]=new String[3];
		System.out.println("s1 �л� ���� �Է�");
		while(true) {
			System.out.print("�й��Է� : ");
			s1[0] = scan.next();
			student.settersnum(Integer.valueOf(s1[0]));
			System.out.print("�̸��Է� : ");
			s1[1] = scan.next();
			student.settername(s1[1]);
			System.out.print("�����Է� : ");
			s1[2] = scan.next();
			student.setterpoint(Double.valueOf(s1[2]));
			break;
		}
		//3,4 �л� s2 �����Է�
		String s2[]=new String[3];
		System.out.println("s2 �л� ���� �Է�");
		while(true) {
			System.out.print("�й��Է� : ");
			s2[0] = scan.next();
			student.settersnum(Integer.valueOf(s2[0]));
			System.out.print("�̸��Է� : ");
			s2[1] = scan.next();
			student.settername(s2[1]);
			System.out.print("�����Է� : ");
			s2[2] = scan.next();
			student.setterpoint(Double.valueOf(s2[2]));
			break;
		}
		
		//5,6,7 �й�, �̸� , ������ ���� ������ ���
		System.out.println("�й������� ����ϱ�");
		if(Integer.valueOf(s1[0])<Integer.valueOf(s2[0]))
		{
			System.out.println("1. �л����� ");
			for(int i = 0 ; i<s1.length;i++)
				System.out.print(s1[i]+"\n");
			System.out.println("\n2. �л�����");
			for(int i = 0 ; i<s2.length;i++)
				System.out.print(s2[i]+"\n");
		}
		else
		{
			System.out.println("1. �л����� ");
			for(int i = 0 ; i<s1.length;i++)
				System.out.print(s2[i]+"\n");
			System.out.println("\n2. �л����� ");
			for(int i = 0 ; i<s2.length;i++)
				System.out.print(s1[i]+"\n");
		}
		System.out.println("�̸������� ����ϱ�");
		int t = s2[2].compareTo(s1[2]);
		if(t>0)
		{
			System.out.print("�л����� -> ");
			for(int i = 0 ; i<s1.length;i++)
				System.out.print(s1[i]+"\n");
			System.out.print("\n�л����� -> ");
			for(int i = 0 ; i<s2.length;i++)
				System.out.print(s2[i]+"\n");
		}
		else
		{
			System.out.print("�л����� -> ");
			for(int i = 0 ; i<s1.length;i++)
				System.out.print(s2[i]+"\n");
			System.out.print("\n�л����� -> ");
			for(int i = 0 ; i<s2.length;i++)
				System.out.print(s1[i]+"\n");
		}
		System.out.println("���������� ����ϱ�");
		if(Double.valueOf(s1[2])>Double.valueOf(s2[2]))
		{
			System.out.println("1. �л����� ");
			for(int i = 0 ; i<s1.length;i++)
				System.out.println(s1[i]);
			System.out.print("2. �л�����");
			for(int i = 0 ; i<s2.length;i++)
				System.out.println(s2[i]);
		}
		else
		{
			System.out.println("1. �л�����");
			for(int i = 0 ; i<s1.length;i++)
				System.out.print(s2[i]+"\n");
			System.out.println("2. �л����� ");
			for(int i = 0 ; i<s2.length;i++)
				System.out.print(s1[i]+"\n");
		}
		//8,9 �հݿ��� ��ȸ ���ؼ��� 1.5
		double a = 1.5;
		System.out.println("�հݿ��� ��ȸ ���� ����"+a);
		if(student.testpt(a,Double.valueOf(s1[2])) == true)
			System.out.println(s1[0]+","+s1[1]+" �հ�");
		else if(student.testpt(a,Double.valueOf(s1[2])) == false)
			System.out.println(s1[0]+","+s1[1]+" ���հ�");
		if(student.testpt(a,Double.valueOf(s2[2])) == true)
			System.out.println(s2[0]+","+s2[1]+" �հ�");
		else if(student.testpt(a,Double.valueOf(s2[2])) == false)
			System.out.println(s2[0]+","+s2[1]+" ���հ�");
				
				
				
				
			
		
	}
}