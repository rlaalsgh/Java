package 연습하기;

public class StringEqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("abcdefg");
		String b = new String("abcdefg");
		String c = a;
		if(a==b)
			System.out.println("a==b");
		if(a==c)
			System.out.println("a==c");
		if(a.equals(b))
			System.out.println("a is eequal to b");
	}

}
