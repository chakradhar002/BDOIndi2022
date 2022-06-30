package corejava.com.demo.io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/*
 * 
 * *
 */

public class SelectorDemo {

	public static void main(String[] args) throws IOException {
		
	Selector s= Selector.open();
	System.out.println("open connection");
	//
	ServerSocketChannel sc = ServerSocketChannel.open();
	InetSocketAddress hostaddress = new InetSocketAddress("localhost",8080);
	sc.bind(hostaddress);
	sc.configureBlocking(false);
	
	
	int ops= sc.validOps();
	SelectionKey sel = sc.register(s, ops);
	
	for(;;) {
		System.out.println("watiing for select operation");
		
		int noOfKeys =s.select();
		System.out.println("number o f selected keys "+noOfKeys);
		Set selectedKeys =s.selectedKeys();
		Iterator itr = selectedKeys.iterator();
		while(itr.hasNext()) {
			
			SelectionKey k = (SelectionKey)itr.next();
		
			
			if(k.isAcceptable()) {
				
				SocketChannel client = sc.accept();
				client.configureBlocking(false);
				System.out.println(" the  new connection is accepted from the client "+client);
				
			}else {
				
				if(k.isReadable()){
					SocketChannel client = (SocketChannel)k.channel();
					ByteBuffer buffer = ByteBuffer.allocate(256);
					client.read(buffer);
					
					String output =  new String(buffer.array()).trim();
				
					if(output.equals("Bye Bye")) {
						client.close();
						System.out.println(" completed the session");
					}
					
					
				}
				
				itr.remove();
			}//end of while loop
		}//end of for loop
		
		
		
	}
		
		


	}

}
