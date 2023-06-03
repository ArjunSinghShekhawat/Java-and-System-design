
class Basic {
	static int age;
	static String name;
	int rollNum;

//	static initialization block
	static {
		age = 20;
		name = "Arjun";
	}

	// initialization block
	{
		rollNum = 90;
	}

	static void dis() {
		System.out.println("Name :" + name);
		System.out.println("Age  :" + age);
//		System.out.println("Rollno:"+rollNum);

	}
//	void show() {
//		System.out.println("Name :"+name);
//		System.out.println("Age  :"+age);
//	}
}

public class Basic1 {

	public static void main(String[] args) {

		Basic.dis();

	}

}
