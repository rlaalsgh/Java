//201814087 ���ȣ


import java.util.Scanner;

public class Calculator{
	 public static void main(String[] args) {
		 Scanner Scan = new Scanner(System.in);
	        
	     String[] Oper = {"+","-","*","/","%"}; // ������
	        
	     String input = null; // ���� 
	     int oper = 5, ALC = 0; // ������ �ε���
	     
	     long num1 = 0l, num2 = 0l; // ���׽� �� (���ڿ��� ���׽��� �ޱ⶧���� �ϴ� long�������� ����) 
	     
	     double result = 0; // �����
	        
	     Loop : while(true) // �ݺ���
	     {
	            
	    	 switch(ALC)
	    	 {
	    	 	case 0:
	    	 		System.out.println("	[ ����(����)�� �Է��Ͻÿ�. ex ) 15+5 ]");
	    	 		break;
	    	 	case 1:
	    	 		System.out.println("	[ ���� ������ ���� �Է��ϼ���. ex ) +9 ]");
	    	 		break;
	    	 }
	    	 
	    	 input = Scan.nextLine(); // �� �Է�
	    	 String[] save = new String[input.length()];//������ ������ �迭 ����
	    	 
	         for(int q = 0; q<input.length() ; q++) // ���� ���� for��
	         {
	                
	                save[q]=input.substring(q, q+1);
	                
	                if(input.substring(q, q+1).equals("."))
	                {
	                    System.out.println("	[����] ���Ŀ� �Ǽ��� ���Ե˴ϴ�. ");
	                    continue Loop;
	                }
	                else if(input.substring(q, q+1).equals(" "))
	                {
	                    System.out.println("	[����] ���Ŀ� ������ ���Ե˴ϴ�. ");
	                    continue Loop;
	                }
	         }//for �� ���� / ���� , �����ڸ� �ϳ��� �迭�� ���� �� ��������
	        
	         for(int q = 0; q<Oper.length ; q++) 
	         {
	                for(int w = 0; w<input.length() ; w++) 
	                {
	                    if(Oper[q].equals(save[w]))
	                    {
	                        oper=q;
	                        if(ALC==0)num1 = Integer.parseInt(input.substring(0, w));
	                        num2 = Integer.parseInt(input.substring(w+1, input.length()));
	                    }
	                }
	         }// �������� ��ġ�� ã�� ���ڸ� ������ ������ ����
	        
	            if(oper == 5){
	                System.out.println("	[����] �����ڰ� �����ϴ�.");
	                continue;
	            }
	            else if(num2 == 0 && oper == 3){
	                System.out.println("	[����] ���� �Ϸ��� ���ڿ� 0�� ���Ե˴ϴ�.");
	                continue;
	            }//���� ����
	            
	            switch(Oper[oper])
	            {
	            	case "+":
	            		result = num1 + num2;
	            		break;
	            	case "-":                     
	            		result = num1 - num2;
	            		break;
	            	case "*":
	            		result = num1 * num2;break;
	            	case "/":
	            		result = (float)num1 / (float)num2;break;
	            	case "%":
	            		result = num1 % num2;break;
	            } // �������
	            
	            switch(oper)
	            {
	            	case 3:
	            		System.out.printf("	-���->	%,d %s %,d = %,.1f\n",num1,Oper[oper],num2,result);
	            		break;
	            	default :
	            		System.out.printf("	-���->	%,d %s %,d = %,.0f\n",num1,Oper[oper],num2,result);
	                break;
	            }//��� ���
	            
	            oper = 5; // ���� �ε��� �ٽ� 5�� �ʱ�ȭ
	            select : while(true) 
	            {
	                System.out.println("	���� ���(1) ���ο� ���(0) ������(x)\n	<���� ���ÿ��� �Ҽ��� ���� �ڸ��� ���� �˴ϴ�.>");
	                input = Scan.nextLine(); // �޴��� �Է�
	 
	                switch(input) 
	                {
	                //�޴��� ����
	                	case "1":
	                		ALC=1;
	                		num1 = (int)result;
	                		break select;
	                	case "0":
	                		ALC=0;
	                		break select;
	                	case "x":
	                		System.out.printf("����� : %.1f <���� ����>",result);
	                		break Loop;
	                	default :
	                		System.out.println("	�Է� ����!");
	                		break;
	                }
	            }
	            
	        }//while    
	        Scan.close();
	        
	    }//main
}