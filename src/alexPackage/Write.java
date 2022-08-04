package alexPackage;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.InputStreamReader;

public class Write extends Read{
	
	//CLASA WRITE CARE EXTINDE READ
	public void fileWrite()throws IOException{
	//ACEEASI IMPLEMENTARE CA LA TEHNICA DE READ, DOAR CA ACUM SCRIEM
	String aux = null;
	System.out.println("Introduceti NUMELE fisierului rezultat. (format automat .bmp)");
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	//Aici se citeste de la tastatura numele imaginii rezultate
    aux = "src/"+reader.readLine();
    aux=aux+".bmp";
    
    // Iar aici salvam imaginea rezultata.
    //Dupa cum se poate vedea, folosim pictureResult.
    try {
        f = new File(
            aux);
        ImageIO.write(pictureResult, "bmp", f);
    }
    catch (IOException e) {
        System.out.println("Error: " + e);
    }
}
}
