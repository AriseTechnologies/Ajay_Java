package inputoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Input {
	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\SSK\\Desktop\\ajay.txt");
		int i = 0;
		while ((i = fs.read()) != -1) {
			System.out.print((char) i);
		}
	}

}
