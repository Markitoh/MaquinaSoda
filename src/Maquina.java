import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Maquina implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String [] args) throws IOException {
		
			lectura pri = new lectura();
			pri.escribir();

		
	}
	


	
	
}
class lectura{
	
	public void escribir() throws IOException {
	
	
	
	
		String ruta = "C:\\Users\\Marco\\eclipse-workspace\\MaquinaSoda2\\baseD\\cocacola.txt";
		File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("El fichero de texto ya estaba creado.");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();

	

	
	
}
	}