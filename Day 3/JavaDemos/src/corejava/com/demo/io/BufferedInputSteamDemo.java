package corejava.com.demo.io;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedInputSteamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		InputStream s = null;
		FileOutputStream result = null;
		BufferedInputStream in =null;
		int data = 0;
		try {
			// s = new FileInputStream("file.txt");
			s = new FileInputStream("C://Users//ADMIN//Documents//file.txt");

			 in = new BufferedInputStream(s);

			while ((data = in.read()) != -1) {

				System.out.println((char) data);

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		finally {
			try {
				s.close();
				in.close();
				
			} catch (IOException e) {

				e.printStackTrace();
			}

		}
	}
	
	void sendms() {
		//
	}

}
