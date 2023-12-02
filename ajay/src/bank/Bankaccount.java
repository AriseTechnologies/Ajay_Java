package bank;

public class Bankaccount {
private static int Balance=1000;
private int Accountnumber;
private String Ownername;

private void withdraw(int amt) {
	if (amt>=100) {
		Balance=Balance-amt;
		System.out.println("Remaining amt="+Balance);
	}
}
private void deposit(int amt) {
	Balance= Balance+amt;
	System.out.println("Remaining amt="+Balance);
}
public static void main(String[] args) {
	Bankaccount b=new Bankaccount();
	b.withdraw(500);
	b.deposit(400);
}
}
