package practice;

public class A {
	public static void main(String[] args) {
		 String name = "Ajay Kailash Manikdurge";
         int value= name.length();
         System.out.println(value); 
         
       
         System.out.println(name.charAt(5));
         
         System.out.println(name.equals("Ajay Kailash Manikdurge"));
         
         String text="To My Lower Case";
         text=text.replace(" ", "*");
         System.out.println(text);
         
         String letter="Dear name, Thanks a lot!";
         letter=letter.replace("name", "Ajay");
         System.out.println(letter);
         
         String Myletter="Dear Ajay \n\tYou are the best.\n\tThanks! ";
         System.out.println(Myletter);
     
	}
}
