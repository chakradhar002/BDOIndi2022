package corejava.com.demo.collectionsdemo;

/*
 * 
 Key points of ConcurrentHashMap:  

The underlined data structure for ConcurrentHashMap is Hashtable.
ConcurrentHashMap class is thread-safe i.e. multiple threads can operate on a single object without any complications.
At a time any number of threads are applicable for a read operation without locking the ConcurrentHashMap object
 which is not there in HashMap.
In ConcurrentHashMap, the Object is divided into a number of segments according to the concurrency level.
The default concurrency-level of ConcurrentHashMap is 16.
In ConcurrentHashMap, at a time any number of threads can perform retrieval
 operation but for updated in the object,
  the thread must lock the particular segment in which the thread wants to operate.
   This type of locking mechanism is known as Segment locking or bucket locking.
    Hence at a time, 16 update operations can be performed by threads.
Inserting null objects is not possible in ConcurrentHashMap as a key or value.
 * 
 */

public class ConncurrentHashMapDemo {

	public static void main(String[] args) {
		

	}

}
