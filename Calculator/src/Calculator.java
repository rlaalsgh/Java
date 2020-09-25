//201814087 김민호


import java.util.Scanner;

public class Calculator{
	 public static void main(String[] args) {
		 Scanner Scan = new Scanner(System.in);
	        
	     String[] Oper = {"+","-","*","/","%"}; // 연산자
	        
	     String input = null; // 식을 
	     int oper = 5, ALC = 0; // 연산자 인덱스
	     
	     long num1 = 0l, num2 = 0l; // 단항식 수 (문자열로 단항식을 받기때문에 일단 long형식으로 받음) 
	     
	     double result = 0; // 결과값
	        
	     Loop : while(true) // 반복문
	     {
	            
	    	 switch(ALC)
	    	 {
	    	 	case 0:
	    	 		System.out.println("	[ 연산(정수)을 입력하시요. ex ) 15+5 ]");
	    	 		break;
	    	 	case 1:
	    	 		System.out.println("	[ 누적 연산할 식을 입력하세요. ex ) +9 ]");
	    	 		break;
	    	 }
	    	 
	    	 input = Scan.nextLine(); // 식 입력
	    	 String[] save = new String[input.length()];//계산식을 저장할 배열 생성
	    	 
	         for(int q = 0; q<input.length() ; q++) // 오류 검출 for문
	         {
	                
	                save[q]=input.substring(q, q+1);
	                
	                if(input.substring(q, q+1).equals("."))
	                {
	                    System.out.println("	[오류] 계산식에 실수가 포함됩니다. ");
	                    continue Loop;
	                }
	                else if(input.substring(q, q+1).equals(" "))
	                {
	                    System.out.println("	[오류] 계산식에 공백이 포함됩니다. ");
	                    continue Loop;
	                }
	         }//for 문 종료 / 숫자 , 연산자를 하나씩 배열에 저장 및 오류검출
	        
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
	         }// 연산자의 위치를 찾고 숫자를 나눠서 변수에 저장
	        
	            if(oper == 5){
	                System.out.println("	[오류] 연산자가 없습니다.");
	                continue;
	            }
	            else if(num2 == 0 && oper == 3){
	                System.out.println("	[주의] 연산 하려는 숫자에 0이 포함됩니다.");
	                continue;
	            }//오류 검출
	            
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
	            } // 연산실행
	            
	            switch(oper)
	            {
	            	case 3:
	            		System.out.printf("	-결과->	%,d %s %,d = %,.1f\n",num1,Oper[oper],num2,result);
	            		break;
	            	default :
	            		System.out.printf("	-결과->	%,d %s %,d = %,.0f\n",num1,Oper[oper],num2,result);
	                break;
	            }//결과 출력
	            
	            oper = 5; // 연산 인덱스 다시 5로 초기화
	            select : while(true) 
	            {
	                System.out.println("	누적 계산(1) 새로운 계산(0) 끝내기(x)\n	<누적 계산시에는 소수점 이하 자리는 생략 됩니다.>");
	                input = Scan.nextLine(); // 메뉴얼 입력
	 
	                switch(input) 
	                {
	                //메뉴얼 실행
	                	case "1":
	                		ALC=1;
	                		num1 = (int)result;
	                		break select;
	                	case "0":
	                		ALC=0;
	                		break select;
	                	case "x":
	                		System.out.printf("계산결과 : %.1f <계산기 종료>",result);
	                		break Loop;
	                	default :
	                		System.out.println("	입력 오류!");
	                		break;
	                }
	            }
	            
	        }//while    
	        Scan.close();
	        
	    }//main
}