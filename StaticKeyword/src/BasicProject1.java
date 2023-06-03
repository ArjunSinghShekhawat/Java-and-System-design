import java.util.Scanner;

class Farmer{
	
	double amount;
//	double rate;/
	static double rate;
	double time;
	double si;
	
	static {
		rate = 2.5;
	}
	void input() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the principal amount :");
		amount = scan.nextDouble();
		
		System.out.println("Enter the time required :");
		time = scan.nextDouble();
		
	}
	void compute() {
		
		si = (amount*rate*time)/100;
		
	}
	void output() {
		System.out.println("The simple interest will be :"+si);
		
	}
}
public class BasicProject1 {

	public static void main(String[] args) {

		Farmer f1 = new Farmer();
		f1.input();
		f1.compute();
		f1.output();
		
		Farmer f2 = new Farmer();
		f2.input();
		f2.compute();
		f2.output();
		
	}

}
