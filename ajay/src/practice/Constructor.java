package practice;

public class Constructor {
private int stuid;
private String stuname;
private int stuage;
Constructor(){
	//Default constructor
    stuid=100;
	stuname="New Student";
	stuage=18;
}
Constructor(int num1,String str,int num2){
	//Parameterized constructor
	stuid=num1;
	stuname="str";
	 stuage=num2;
}
//getter and setter method
public int getstuid() {
	return stuid;
}
public void setstuid(int stuid) {
	this.stuid=stuid;
}
public String getstuname() {
	return stuname;
}
	public void setstuname(String stuname) {
		this.stuname=stuname;
	}
	public int getstuage() {
		return stuage;
	}
	public void setstuage(int stuage) {
		this.stuage=stuage;
	}
	public static void main(String[] args) {
		Constructor c=new Constructor();
	}
}

