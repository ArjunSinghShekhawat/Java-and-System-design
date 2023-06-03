
class Demo{
	private int age;
    private String name;
    
//    void setdata() {
//    	name = "Rahul";
//    	age = 18;
//    }
    
    void setdata1() {
    	age = 18;
    }
    void setdata2() {
    	name = "arjun";
    }
    void show() {
    	System.out.println("The value of name   :"+name+"  \nThe value of age is :"+age);
    }
}
public class Prectice1 {

	public static void main(String[] args) {
		
		Demo obj = new Demo();

//		obj.setdata();
		obj.setdata1();
		obj.setdata2();
		obj.show();
		

	}

}
