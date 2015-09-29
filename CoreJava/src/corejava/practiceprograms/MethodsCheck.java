package corejava.practiceprograms;

public class MethodsCheck {
	
	public static void test(Object obj){
		System.out.println("object");
	}
	public static void test(String str){
		System.out.println("string");
	}

	public static void main(String[] args) {
		test(null);
	}

}
