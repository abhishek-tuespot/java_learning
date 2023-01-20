package learning;

public class AssociativityofOperators {

	public static void main(String[] args) {
		// precedence
//		int a =6*5-34/2;
		/*
		 =30-34/2
		 =30-17
		 = 13
		 */
//		System.out.println(a);
		// associativity
//		int b = 30/5-2*2;
		/*
		 =6-2*2
		 =6-4
		 = 3
		 */
//		System.out.println(b);
		
		//quick quiz
		
		int a =10;
		System.out.println(a++);
		int b =10;
		System.out.println(++b);
		int x=7;
		int y = ++x *7;
		System.out.println(y);
	}
}
