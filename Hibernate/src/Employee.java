import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  // To create a table automatically	
public class Employee {
@Id
int id;
String name;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

// to string is use to get data from object

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}



}
