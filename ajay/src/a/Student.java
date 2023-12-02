package a;

public class Student {
private int age;
public void setage(int ageStu) {
	if(ageStu>0) {
		System.out.println("age show");
	}else {
		setAge(0);
	}
}
public static void main(String[] args) {
	Student s=new Student();
	s.setage(11);
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
