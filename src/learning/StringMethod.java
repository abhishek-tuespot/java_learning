package learning;

public class StringMethod {
	public static void main(String[] args) {
		String a = "abhi";
		String b = "     aBHi  " ;
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		System.out.println(a.length());
		
		String name = a.toUpperCase();
		System.out.println(name);
	
		String name2 = b.trim();
		System.out.println(name2);
		
		System.out.println(name2.replace('a', 'A'));
		System.out.println(name2.replace('a', 'b'));
		
	
	}
	
}
