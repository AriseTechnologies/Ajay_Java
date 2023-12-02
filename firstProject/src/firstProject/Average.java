package firstProject;

public class Average {
	void avg(int a, int b) {
		int c = a + b;
		int avg = c / 2;
		System.out.println("average of no=" + avg);

	}

	public static void main(String[] args) {
		Average a = new Average();
		a.avg(12, 12);
	}
}
