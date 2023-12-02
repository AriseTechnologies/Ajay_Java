package practice;

public class Library {
String[] books;
int noofbooks;
Library(){
	this.books=new String [100];
	this.noofbooks=0;
}
void addbook(String book) {
	System.out.println("Book has been added...");
	this.books[noofbooks]=book;
	noofbooks++; 
	System.out.println("* "+ book);

	
}
void showavailablebook() {
	System.out.println("Available books are:");
	for(String book:this.books) {
		if(book==null) {
			continue;
		}
		System.out.println("* "+ book);
	}
}
void issuebook(String book) {
	for(int i=0; i<this.books.length;i++) {
		if(this.books[i].equals(book)) {
			System.out.println("This book has been issued");
			this.books[i]=null;
			return;
		}		
	}
	System.out.println("This book does not exist");
}
void returnboook(String book) {
	addbook(book);
}
public static void main(String[] args) {
	Library l=new Library();
 	l.addbook("Simplified");
	l.addbook("Think and grow rich");
	l.addbook("Tatyacha thokla");
	l.addbook("Wings of fire");
	l.showavailablebook();
	l.issuebook("Wings of fire");
	l.showavailablebook();
	l.returnboook("Wings of fire");
	l.showavailablebook();

}
}
