package a;

public class Bank {
 int balance=1000;
void saving(int amt) {
	balance=balance-amt;
	if (amt>=100) {
		System.out.println("remainingbalance="+balance);		
	}else {
		System.out.println("zero");
	}
}
public static void main(String[] args) {
	Bank b=new Bank();
	b.saving(300);
}
}
