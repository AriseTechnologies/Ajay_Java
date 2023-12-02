package a;

public class X {
 private static int balance=1000;
 private boolean checkbalance() {
	 if (balance>=500) {
		 return true;
	 }else {
		 return false;
	 }
}
void withdraw(int amt) {
	X x=new X();
	boolean check=x.checkbalance();
	if (check) {
		balance=balance-amt;
		System.out.println("Rem balance= "+balance);
	}else {
		System.out.println("insufficient balance");
	}
}
}
