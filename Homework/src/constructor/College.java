package constructor;

public class College {
	College() {
		System.out.println("1 month free ");
	}

	College(String collegename) {
		System.out.println("welcome to" + collegename + "college");
	}

	void doaddmission() {
		System.out.println("Admission success");
	}

	public static void main(String[] args) {
		College c = new College("jspm");
		c.doaddmission();
		College c1 = new College("Raisoni");
		c1.doaddmission();
	}
}
