package learning;

public class MethodWithReturnType {

//	static long disk() {
//		return 1201;
//	}
//	public static void main(String[] args) {
//		long num =disk();
//		System.out.println(num);
//	}
	
	static int account() {
	int salary = 10000;
	int month = 12;
	int result = salary * month;
	
	return result;
	}
	
	public static void main(String[] args) {
		int get = account();
		int bonous = 5000;
	   System.out.println(get +bonous);
	}
}
