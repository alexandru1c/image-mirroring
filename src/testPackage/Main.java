package testPackage;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import alexPackage.Photo;
import alexPackage.Write;
import alexPackage.Interface;
import alexPackage.Read;
import alexPackage.ConsumerClass;
import alexPackage.ProducerClass;
import alexPackage.BufferClass;

import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		//Aici vom instantia un element de test, cu fiecare pas necesar.
		//Citire din fisier, creare dimensiuni imagine NOUA, prelucrare imagine si crearea unei fisier .bmp pentru rezultat
		
		Write dog = new Write();
		dog.fileRead();
		dog.createPicture();
		dog.ImageMirroring();
		dog.fileWrite();
		
		System.out.println("test");

		
	
		
		/*BufferClass b = new BufferClass();
		ProducerClass p2 = new ProducerClass(b, dog);
		ConsumerClass c2 = new ConsumerClass(b, dog);
		p2.start();
		c2.start();*/
        
        
       

	}
}