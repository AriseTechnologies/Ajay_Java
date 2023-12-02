
public class CbscBoardPercentage {
int numberofsub=5;
int totalmarks=550;
 public void main() {
	 
	float sub1=80;
	float sub2=65;
	float sub3=76;
	float sub4=66;
    float sub5=110;
	float markobtained=sub1+sub2+sub3+sub4+sub5;
	float percentageofstudent= markobtained / numberofsub;
	System.out.println("percentage=" + percentageofstudent);
	 
 }
 public static void main(String[] args) {
	CbscBoardPercentage p=new CbscBoardPercentage();
	p.main();
}


}
