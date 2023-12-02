package constructor;

public class Antivirus {
//Antivirus(){
	// System.out.println("1 month free");
	// System.out.println("malware found");
//}
	Antivirus(String name) {
		System.out.println("hello" + name + " This offer is only for you");
	}

	void software() {
		System.out.println("scanning");
	}

	public static void main(String[] args) {
		Antivirus a = new Antivirus("Ajay");
		a.software();
	}
}
