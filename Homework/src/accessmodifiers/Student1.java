package accessmodifiers;

public class Student1 {
	public void insertStudent() {
		insertQual();
		insertPD();
		insertSkill();
		insertFees();
	}
// All below method are private 

	private void insertQual() {
		System.out.println("Qualification");
	}

	private void insertPD() {
		System.out.println("Personal Details");
	}

	private void insertSkill() {
		System.out.println("Skill Details");
	}

	private void insertFees() {
		System.out.println("Fees Details");
	} //This is the most correct approach as all other methods are private and 
}  // only one method is public which can be accessed from outside.
