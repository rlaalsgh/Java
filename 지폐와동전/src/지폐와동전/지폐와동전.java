package ����͵���;
import java.util.Scanner;
public class ����͵��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pu[]= {50000,10000,5000,1000,500,100,50,10,1};
		int su[]= new int[9];
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ��Է��ϱ�>>");
		int money = scan.nextInt();
			for(int i = 0;i<pu.length;i++)
			{
				if(money>=pu[i])
				{
					money=money-pu[i];
					su[i]++;
					if(money>=pu[i])
						i=i-1;
				}
				
			}
			for(int i = 0; i<pu.length;i++)
			{
				System.out.println(pu[i]+"���� "+su[i]+"��");
			}
	}

}
