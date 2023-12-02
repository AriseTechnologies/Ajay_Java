package practice;

public class Library1 {
String []books;
int noofbook;
Library1(){
	this.books=new String[100];
	this.noofbook=0;
}
void addbook(String book) {
	System.out.println(book+" has been added");
	this.books[noofbook]=book;
	noofbook++;
}
void showavailablebook(){
	System.out.println("Available books are..");
	for(String book:this.books) {
		if(book==null) {
			continue;
		}
		System.out.println("* "+ book );
	}
}
void issuebook(String book) {
	for(int i=0; i<this.books.length; i++) {
		if(this.books[i].equals(book)) {
			System.out.println("The book has been issued");
			this.books[i]=null;
			return;
		}
		
	}
	System.out.println("This book does not exist");
}
void returnbook(String book) {
	addbook(book);
}
public static void main(String[] args) {
	Library1 l=new Library1();
	l.addbook("Wings of fire");
	l.addbook("Tatyacha thokla");
	l.showavailablebook();


}
}
