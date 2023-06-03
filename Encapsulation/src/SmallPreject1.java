import java.util.Scanner;

class BankAccount {

	private String accountNumber;
	private String accountHolderName;
	private double balance;

	public BankAccount(String accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	// deposit money in your account

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit of " + amount + " successful. New Balance " + balance);
		} else {
			System.out.println("Invalid amount for deposit :");
		}

	}

	// withdraw money in your account

	public void withdraw(double amount) {
		if (amount > 0) {
			if (amount <= balance) {
				balance -= amount;
				System.out.println("Withdraw of " + amount + " successful . New balance " + balance);
			} else {
				System.out.println("Insufficient funds for withdrawal :");
			}

		} else {
			System.out.println("Invaild amount for withdraw :");
		}

	}

	// check money in your account

	public void checkBalance() {
		System.out.println("Total Balance:" + balance);
	}

}

public class SmallPreject1 {

	public static void main(String[] args) {

		BankAccount account = new BankAccount("8005792198", "Arjun", 20500.75);

		System.out.println("Account Number :" + account.getAccountNumber());
		System.out.println("Account Name   :" + account.getAccountHolderName());
		System.out.println("Balance        :" + account.getBalance());

		Scanner scan = new Scanner(System.in);

		double money;

		while (true) {

			System.out.println("Enter Your Choice :");
			System.out.println(
					"Enter 1 for deposit money in your account :\nEnter 2 for withdrawal money in your account :\nEnter 3 for check Balance :\nEnter 4 for move back :\n ");
			int choice = scan.nextInt();

			if (choice == 4) {
				break;
			} else {
				switch (choice) {
				case 1:
					System.out.println("Enter deposit money in your account :");
					money = scan.nextDouble();
					account.deposit(money);
                    System.out.println();
					break;

				case 2:
					System.out.println("Enter withdrawal money in your account :");
					money = scan.nextDouble();
					account.withdraw(money);
					System.out.println();
					break;

				case 3:
					account.checkBalance();
					System.out.println();
					break;

				default:
					System.out.println("Enter vaild number for perform valid performance :\nThank You");

				}
			}
		}
		scan.close();

	}

}
