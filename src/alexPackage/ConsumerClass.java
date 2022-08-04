
package alexPackage;
import java.io.IOException;

public class ConsumerClass implements Runnable {
	private BufferClass buffer;
	private Thread t;
	Write aux;
	
	public ConsumerClass(BufferClass b, Write x) {
		buffer = b;
		aux=x;
	}
	
 public void start() 
	 
	 {

			new  Thread(this).start();
			
			}
	
	@Override
	public void run() {
		try {
			aux.fileRead();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}



