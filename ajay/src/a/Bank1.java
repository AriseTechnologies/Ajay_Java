package a;

public class Bank1 {
int balance=10000;
void saving(int amt) {
	balance=balance-amt;
	if(amt>=100) {
		System.out.println("Remaining Balance="+balance);
	}else {
		System.out.println("Insufficient Bal ");
	}
}
public static void main(String[] args) {
	Bank1 b1=new Bank1();
	b1.saving(366);
}
}
