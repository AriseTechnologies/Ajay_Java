package firstProject;

public class Result {

	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(23, 17);
		Subtraction s = new Subtraction();
		s.sub(23, 13);
		Multiplication m = new Multiplication();
		m.mult(12, 12);
		Division d = new Division();
		d.div(30, 5);
		Circle c = new Circle();
		c.area(4);
		Simpleinterest h = new Simpleinterest();
		h.interest(4, 5);

	}

}
