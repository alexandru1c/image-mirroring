package alexPackage;

import java.io.IOException;

public class ProducerClass extends Thread {
	private BufferClass buffer;
	Write aux;
	
	public ProducerClass(BufferClass b, Write x) {
		buffer = b;
		aux=x;
	}
	
	public void run () {
		
		aux.createPicture();
		aux.ImageMirroring();
		try {
			aux.fileWrite();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
}
}


