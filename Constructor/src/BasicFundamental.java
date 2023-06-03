
class Student{
	private String name;
	private int age;
	private int rollNum;
	
	public Student(String name,int age,int rollNum) {
		this.name = name;
		this.age = age;
		this.rollNum = rollNum;
	}
	void show() {
		System.out.println("Name :"+name);
		System.out.println("Age  :"+age);
		System.out.println("Roll :"+rollNum);
	}
}
public class BasicFundamental {

	public static void main(String[] args) {
		
		Student s1 = new Student("Arjun",20,501);
		s1.show();
		
	}

}
