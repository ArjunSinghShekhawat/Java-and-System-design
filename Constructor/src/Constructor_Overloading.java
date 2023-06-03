
class Test2{
	private String name;
	private int age;
	
	public Test2() {
		System.out.println("Default Constructor !");
	}
	public Test2(String name) {
		this.name = name;
		System.out.println("String name constructor !");
	}
	public Test2(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("String name and Integer age constructor !");
	}
	void display() {
		System.out.println("Name :"+ name);
		System.out.println("Age  :"+ age);
	}
}
public class Constructor_Overloading {

	public static void main(String[] args) {
		
		Test2 obj = new Test2();
		obj.display();
		
		Test2 obj1 = new Test2("Arjun");
		obj1.display();
		
		Test2 obj2 = new Test2("Rahul",22);
		obj2.display();
		
	}

}
