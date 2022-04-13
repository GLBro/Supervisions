
public class MainClass {
	public static void main(String[] args) {
		Class1 test1 = new Class1();
		Class2 test2 = new Class2();
		Class3 test3 = new Class3();
		test1.method1();
		//test1.method2();
		System.out.println("Running line above results in an error");
		test2.method1();
		test2.method2();
		test3.method1();
		test3.method2();
		test3.method3();
		//test1.value = 2;
		System.out.println("Running line above results in an error");
		System.out.println(test3.value);
		test3.value = 20;
		System.out.println(test3.value);
		System.out.println(Class2.value);
		
	}
}
