package inputoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class X {
public static void main(String[] args) throws IOException  {
	FileOutputStream fs=new FileOutputStream("C:\\Users\\SSK\\Desktop\\Durge.txt");
	String p="Ajay Kailash Manikdurge";
	byte [] b=p.getBytes();
	fs.write(b);
	System.out.println("Data Inserted In File");
}
}
