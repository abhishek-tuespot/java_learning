package learning;

public class MethosWithParameter {

//	 public static void add(int num1 ,int  num2){
//		int sum =num1 + num2 ;
//		System.out.println(sum);
//	}
//	 public static void main(String[] args) {
//		add(10 , 20);
//		System.out.println("sum of two number");
//	}
	
	static void multi(int a, int b , int c) {  // parameter 
		int ans = (a*b*c);
		System.out.println(ans);
	}
	public static void add(int num1 ,int  num2){
		int sum =num1 + num2 ;
		System.out.println(sum);
	}
	
	public static void main(String[] args) { // arrgument
		multi(10,10,10);
		add(45,45);
		System.out.println("answer of multiply of number");
	}
	
}
