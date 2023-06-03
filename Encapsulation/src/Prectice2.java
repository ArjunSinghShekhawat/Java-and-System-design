
class Student{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name != null && !name.isEmpty()) {
			this.name = name;
		}
		else {
			
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>0 && age<=150) {
			this.age = age;
		}
		else {
			
		}
	}
	
	
	
	
}
public class Prectice2 {

	public static void main(String[] args) {
		
		
		Student obj1 = new Student();
		obj1.setName("Arjun");
		obj1.setAge(128);
		
		System.out.println("The name is :"+ obj1.getName());
		System.out.println("The age is  :"+ obj1.getAge());
	

	}

}
