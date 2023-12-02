package Static;

public class Bank {
	static int balance = 1000;

	void withdraw(int amt) {
		balance = balance - amt;
		System.out.println("remaining balance=" + balance);
	}

	static void deposit(int amt) {
		balance = balance + amt;
		System.out.println("current bal=" + balance);
	}

	public static void main(String[] args) {
		// dmart
		Bank b = new Bank();
		b.withdraw(500);

		// Zudio
		Bank b1 = new Bank();
		b1.withdraw(300);

		// deposit
		Bank.deposit(500);
	}

}
