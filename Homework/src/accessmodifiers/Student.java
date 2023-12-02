package accessmodifiers;

public class Student {
	public void insertstudent() {
		insertQual();
		insertPD();
		insertSkill();
		insertFees();
	}

	public void insertQual() {
		System.out.println("Qualification");
	}

	public void insertPD() {
		System.out.println("Personal Details");
	}

	public void insertSkill() {
		System.out.println("Skill Details");
	}

	public void insertFees() {
		System.out.println("Fees Details");
	}

}
