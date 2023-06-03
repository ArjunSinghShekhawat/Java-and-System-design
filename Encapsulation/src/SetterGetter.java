
class Test{
	private String name;
	private int age;
	private boolean isMarried;
	
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public boolean getMarried()
	{
		return isMarried;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void show() {
		System.out.println("The name of student is :"+ name);
		System.out.println("The age  of student is :"+ age);
	}
}
public class SetterGetter {

	public static void main(String[] args) {
		
		Test obj = new Test();
		obj.setAge(18);
		obj.setName("Arjun");
		obj.setMarried(true);
		
		int _1stuAge = obj.getAge();
		String _1stuName = obj.getName();
		boolean isMarried = obj.getMarried();
		
		System.out.println("The first student name is :"+ _1stuName);
		System.out.println("The frst  stuent   age is :"+ _1stuAge);
		System.out.print("You are married              :"+ isMarried);
		System.out.println();
		
		
		Test obj1 = new Test();
		obj1.setAge(20);
		obj1.setName("Rahul");
		obj1.setMarried(false);
		
		int _2stuAge = obj1.getAge();
		String _2stuName = obj1.getName();
		boolean isMarried1 = obj1.getMarried();
		
		System.out.println("The first student name is :"+ _2stuName);
		System.out.println("The frst  stuent   age is :"+ _2stuAge);
		System.out.print("You are married              :"+ isMarried1);
		System.out.println();
		
		//show method
		obj.show();
		obj1.show();
		
	}

}
