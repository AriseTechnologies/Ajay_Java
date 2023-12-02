package inputoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Output {
	public static void main(String[] args) throws IOException {
		FileOutputStream fs = new FileOutputStream("C:\\Users\\SSK\\Desktop\\Durge.txt");
		String p = "Har Har Mahadev";
		byte[] b = p.getBytes();
		fs.write(b);
		System.out.println("Data inserted in file");
	}

}
