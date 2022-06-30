package corejava.com.demo.io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class SelectorClientDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		InetSocketAddress hostaddress = new InetSocketAddress("localhost", 8080);
		SocketChannel client = SocketChannel.open(hostaddress);
		System.out.println(" the client is sending message to server...");
		

		String[] msg = new String[] { "time go faster", "what next", "Bye Bye" };
		for (int i = 0; i < msg.length; i++) {

			byte[] mssge = new String(msg[i]).getBytes();
			ByteBuffer buffer = ByteBuffer.wrap(mssge);
			client.write(buffer);
			System.out.println(msg[i]);
			buffer.clear();
			Thread.sleep(3000);

		}
		client.close();

	}

}
