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
		//1,2 학생 s1 정보입력
		String s1[]=new String[3];
		System.out.println("s1 학생 정보 입력");
		while(true) {
			System.out.print("학번입력 : ");
			s1[0] = scan.next();
			student.settersnum(Integer.valueOf(s1[0]));
			System.out.print("이름입력 : ");
			s1[1] = scan.next();
			student.settername(s1[1]);
			System.out.print("점수입력 : ");
			s1[2] = scan.next();
			student.setterpoint(Double.valueOf(s1[2]));
			break;
		}
		//3,4 학생 s2 정보입력
		String s2[]=new String[3];
		System.out.println("s2 학생 정보 입력");
		while(true) {
			System.out.print("학번입력 : ");
			s2[0] = scan.next();
			student.settersnum(Integer.valueOf(s2[0]));
			System.out.print("이름입력 : ");
			s2[1] = scan.next();
			student.settername(s2[1]);
			System.out.print("점수입력 : ");
			s2[2] = scan.next();
			student.setterpoint(Double.valueOf(s2[2]));
			break;
		}
		
		//5,6,7 학번, 이름 , 성적이 높은 순으로 출력
		System.out.println("학번순으로 출력하기");
		if(Integer.valueOf(s1[0])<Integer.valueOf(s2[0]))
		{
			System.out.println("1. 학생정보 ");
			for(int i = 0 ; i<s1.length;i++)
				System.out.print(s1[i]+"\n");
			System.out.println("\n2. 학생정보");
			for(int i = 0 ; i<s2.length;i++)
				System.out.print(s2[i]+"\n");
		}
		else
		{
			System.out.println("1. 학생정보 ");
			for(int i = 0 ; i<s1.length;i++)
				System.out.print(s2[i]+"\n");
			System.out.println("\n2. 학생정보 ");
			for(int i = 0 ; i<s2.length;i++)
				System.out.print(s1[i]+"\n");
		}
		System.out.println("이름순으로 출력하기");
		int t = s2[2].compareTo(s1[2]);
		if(t>0)
		{
			System.out.print("학생정보 -> ");
			for(int i = 0 ; i<s1.length;i++)
				System.out.print(s1[i]+"\n");
			System.out.print("\n학생정보 -> ");
			for(int i = 0 ; i<s2.length;i++)
				System.out.print(s2[i]+"\n");
		}
		else
		{
			System.out.print("학생정보 -> ");
			for(int i = 0 ; i<s1.length;i++)
				System.out.print(s2[i]+"\n");
			System.out.print("\n학생정보 -> ");
			for(int i = 0 ; i<s2.length;i++)
				System.out.print(s1[i]+"\n");
		}
		System.out.println("성적순으로 출력하기");
		if(Double.valueOf(s1[2])>Double.valueOf(s2[2]))
		{
			System.out.println("1. 학생정보 ");
			for(int i = 0 ; i<s1.length;i++)
				System.out.println(s1[i]);
			System.out.print("2. 학생정보");
			for(int i = 0 ; i<s2.length;i++)
				System.out.println(s2[i]);
		}
		else
		{
			System.out.println("1. 학생정보");
			for(int i = 0 ; i<s1.length;i++)
				System.out.print(s2[i]+"\n");
			System.out.println("2. 학생정보 ");
			for(int i = 0 ; i<s2.length;i++)
				System.out.print(s1[i]+"\n");
		}
		//8,9 합격여부 조회 기준성적 1.5
		double a = 1.5;
		System.out.println("합격여부 조회 기준 점수"+a);
		if(student.testpt(a,Double.valueOf(s1[2])) == true)
			System.out.println(s1[0]+","+s1[1]+" 합격");
		else if(student.testpt(a,Double.valueOf(s1[2])) == false)
			System.out.println(s1[0]+","+s1[1]+" 불합격");
		if(student.testpt(a,Double.valueOf(s2[2])) == true)
			System.out.println(s2[0]+","+s2[1]+" 합격");
		else if(student.testpt(a,Double.valueOf(s2[2])) == false)
			System.out.println(s2[0]+","+s2[1]+" 불합격");
				
				
				
				
			
		
	}
}