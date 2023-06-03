
class Test1{
	private String name;
	private int age;
	
	public Test1(String name,int age) {
		this.name = name;
		this.age = age;
	}
	void show() {
		System.out.println("Name  :"+name);
		System.out.println("Age   :"+age);
	}
}
public class PerameterizeConstructor {

	public static void main(String[] args) {
		Test1 obj = new Test1("Arjn",20);
		
		obj.show();

		
	}

}
