package corejava.com.demo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
//nio
public class ChannelDemo {
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream input = new FileInputStream ("testin.txt"); // Path of Input text file  
		FileOutputStream output = new FileOutputStream ("testout.txt"); // Path of Output text file  
		ReadableByteChannel src = input.getChannel();//pick up info from file
		WritableByteChannel destination = output.getChannel();
		copyDat(src,destination);
	
		try {
			src.close();
			destination.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private  static void copyDat(ReadableByteChannel src, WritableByteChannel destination) {
		ByteBuffer buffer = ByteBuffer.allocateDirect(20 * 1024);
		try {
			while (src.read(buffer) != -1) {
				// The buffer is used to drained
				buffer.flip();
				// keep sure that buffer was fully drained
				while (buffer.hasRemaining()) {
					destination.write(buffer);
				}
				buffer.clear();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
