package corejava.com.demo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException,IOException, InterruptedException  {
		InputStream s=null;
		FileOutputStream result =null;
		int data=0;
		 try {
		//	s = new FileInputStream("file.txt");
			s = new FileInputStream("C://Users//ADMIN//Documents//file.txt");
			result = new FileOutputStream("C://Users//ADMIN//Documents//result.txt");

			Reader r = new InputStreamReader(s);
			
			data =r.read();
			
			Thread.sleep(5000);
			
			while(data!=-1) {
				
				System.out.println((char)data);
				data=r.read();
				result.write((char)data);
			}
			
			
			
		} 
		 catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
       finally{
    	   try {
			s.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    	   
       }
	}

}
