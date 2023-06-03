
class Basic_{
	static int a;
	static int b;
	
	int m;
	int n;
	
	//static block
	static {
		a = 12;
		b = 30;
	}
	//normal block
	{
		m = 80;
		n = 89;
	}
	
	static void dis1() {
		System.out.println("The value of a is :"+a);
		System.out.println("The value of a is :"+b);
		
	}
     void dis2() {
		System.out.println("The value of m is :"+m);
		System.out.println("The value of n is :"+n);
		
	}
}
public class Basic2 {

	public static void main(String[] args) {
		
		Basic_ obj = new Basic_();
		obj.dis2();
		Basic_.dis1();
		

	}

}
