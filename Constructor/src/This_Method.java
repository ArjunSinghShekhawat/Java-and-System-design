class Test3 {
	private String name;
	private int age;
	private int rollNum;

	public Test3() {
		this("narpat");
		this.age = 22;
		this.name = "Arjun";
		this.rollNum = 809;
		System.out.println("Default Constructor !");
	}

	public Test3(String name) {
		this("manjeet",17);
		this.age = 12;
		this.name = name;
		this.rollNum = 810;
		System.out.println("Perameterize Constructor name argument :");
	}

	public Test3(String name, int age) {
		this.age = age;
		this.name = name;
		this.rollNum = 847;
		System.out.println("Perameterize Constructor name argument and age  :");
	}
	public Test3(Test3 other) {
		this.age = other.age;
	}

	void dis() {
		System.out.println("Name :" + name);
		System.out.println("Age  :" + age);
		System.out.println("Roll :" + rollNum);
	}
	
}
class A{
	int age = 18;
}

public class This_Method {

	public static void main(String[] args) {

		Test3 obj1 = new Test3();
		obj1.dis();

		Test3 obj2 = new Test3("kalu");
		obj2.dis();

		Test3 obj3 = new Test3("bittu",10);
		obj3.dis();
		
		
		System.out.println();
		Test3 obj4 = new Test3(obj1);
		obj4.dis();
		
	}

}
