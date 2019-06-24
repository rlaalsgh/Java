package 연습하기;

public class CharAtEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("My name is kim");
		int countChar = 0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i) == 'i') {
				countChar++;
			}
		}
		System.out.println(countChar);
		System.out.println("자바"+3.14+false+'a');
	}

}
