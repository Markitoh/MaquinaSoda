
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;
public class Menu implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String [] args) {
		
		
		try {
			
			menu();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	static void menu() throws FileNotFoundException {
		
		Scanner teclado = new Scanner(System.in);
		Precio coca = new cocacola();
		Precio pepsi = new pepsi();
		Precio colar = new colaReal();
		Precio country = new countryclub();
		Recargar reload = new Recargar();
		int montoAPagar=0;
		int Devuelta;
				
		while(true) {
		
		System.out.println("- Seleccione la Opcion deseada \n");
		System.out.println("1. Cocaola");
		System.out.println("2. Pepsi");
		System.out.println("3. Cola Real");
		System.out.println("4. Country Club \n");
		System.out.println("5. Recargar Inventario  \n");
		System.out.println("6. Salir");	
		
		int entrada = teclado.nextInt();	
			
			switch(entrada) {
			
			case 1: System.out.println("Soda seleccionada: Precio a pagar $"+ coca.getRefresco() +"\n");
			System.out.println("Introduzca su dinero ahora: ");
			montoAPagar = teclado.nextInt();
			break;
			
			case 2: System.out.println("Soda seleccionada: Precio a pagar $"+ pepsi.getRefresco()+"\n");
			System.out.println("Introduzca su dinero ahora: ");
			montoAPagar = teclado.nextInt();
			break;
			
			case 3: System.out.println("Soda seleccionada: Precio a pagar $"+ colar.getRefresco()+"\n");
			System.out.println("Introduzca su dinero ahora: ");
			montoAPagar = teclado.nextInt();
			break;
			
			case 4: System.out.println("Soda seleccionada: Precio a pagar $"+ country.getRefresco()+ "\n");
			System.out.println("Introduzca su dinero ahora: ");
			montoAPagar = teclado.nextInt();
			break;

			case 5 : reload.recargar();
			coca.setCantidad(coca.getCantidad()-1);
			pepsi.setCantidad(pepsi.getCantidad()-1);
			colar.setCantidad(colar.getCantidad()-1);
			country.setCantidad(country.getCantidad()-1);
			
			break;
			case 6 : 
				
				break;
			default: System.out.println("Opcion no encontrada");
			}
			
				switch(entrada) {
			
				case 1: 
				
				Devuelta = montoAPagar - coca.getRefresco();
				if(montoAPagar < coca.getRefresco()) {
					System.out.println("Monto Insuficiente para este producto");
				}
				else {
					System.out.println("Su devuelta es: $"+Devuelta);
					try {	
						String cadena;
						String cocaruta = new File("baseD/cocacola.txt").getAbsolutePath();
						File archivo = new File(cocaruta);;
						BufferedWriter bw;
						
						if(archivo.exists()) {
							
						FileReader entradas = new FileReader(cocaruta);
						BufferedReader b = new BufferedReader(entradas);
					
						while((cadena = b.readLine())!=null) {
					       						
							
							coca.setCantidad(Integer.valueOf(cadena));
							coca.setCantidad(coca.getCantidad()-1);
							System.out.println("\n Su inventario es: " + coca.getCantidad());	
							
						}
						b.close();
						} else {
							
							bw = new BufferedWriter(new FileWriter(archivo));
							coca.setCantidad(coca.getCantidad()-1);
							bw.write(coca.getCantidad());
							System.out.println("\n Su inventario es: " + coca.getCantidad());
							
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					 
					
				}				
				break;
				

				case 2: Devuelta = montoAPagar - pepsi.getRefresco();
				if(montoAPagar < pepsi.getRefresco()) {
					System.out.println("Monto Insuficiente para este producto");
				}
				else {
				System.out.println("Su devuelta es: $"+Devuelta);
				try {
					String cadena;
					String pepsiruta = new File("baseD/pepsi.txt").getAbsolutePath();	
					File archivo = new File(pepsiruta);;
					BufferedWriter bw;
					
					if(archivo.exists()) {
					FileReader entradas = new FileReader(pepsiruta);
					BufferedReader b = new BufferedReader(entradas);
					while((cadena = b.readLine())!=null) {
						
				       	pepsi.setCantidad(Integer.valueOf(cadena));	
				       	pepsi.setCantidad(pepsi.getCantidad()-1);				
						System.out.println("\n Su inventario es: " + pepsi.getCantidad());	
						
					}
					b.close();
				} else {
					
					bw = new BufferedWriter(new FileWriter(archivo));
					pepsi.setCantidad(pepsi.getCantidad()-1);
					bw.write(pepsi.getCantidad());
					System.out.println("\n Su inventario es: " + pepsi.getCantidad());
					}
				}
					catch (IOException e) {
					e.printStackTrace();
				}
				}
				break;
				case 3: Devuelta = montoAPagar - colar.getRefresco();
				if(montoAPagar < colar.getRefresco()) {
					System.out.println("Monto Insuficiente para este producto");
				}
				else {
				System.out.println("Su devuelta es: $"+Devuelta);
				try {
					
					String cadena;
					String colarruta = new File("baseD/colareal.txt").getAbsolutePath();	
					
					File archivo = new File(colarruta);;
					BufferedWriter bw;
					
					if(archivo.exists()) {
					FileReader entradas = new FileReader(colarruta);
					BufferedReader b = new BufferedReader(entradas);
					while((cadena = b.readLine())!=null) {
						
						
				       	colar.setCantidad(Integer.valueOf(cadena));	
				       	colar.setCantidad(colar.getCantidad()-1);				
						System.out.println("\n Su inventario es: " + cadena);	
						
					}
					b.close();
					}else {
						
						bw = new BufferedWriter(new FileWriter(archivo));
						colar.setCantidad(colar.getCantidad()-1);
						bw.write(colar.getCantidad());
						System.out.println("\n Su inventario es: " + colar.getCantidad());
						
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
				}
				break;
				
				case 4: Devuelta = montoAPagar - country.getRefresco();
				if(montoAPagar < country.getRefresco()) {
					System.out.println("Monto Insuficiente para este producto");
				}
				else {
				System.out.println("Su devuelta es: $"+Devuelta);
					try {
					
					String cadena;
					String countryruta = new File("baseD/countryc.txt").getAbsolutePath();	
					File archivo = new File(countryruta);;
					BufferedWriter bw;
					if(archivo.exists()) {
					
					FileReader entradas = new FileReader(countryruta);
					BufferedReader b = new BufferedReader(entradas);
					while((cadena = b.readLine())!=null) {
						
						
				       	colar.setCantidad(Integer.valueOf(cadena));		
				       	country.setCantidad(coca.getCantidad()-1);			
						System.out.println("\n Su inventario es: " + cadena);	
						
					}
					b.close();
					}
					else {
						bw = new BufferedWriter(new FileWriter(archivo));
						country.setCantidad(country.getCantidad()-1);
						bw.write(country.getCantidad());
						System.out.println("\n Su inventario es: " + country.getCantidad());
						
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

				
			
				}
				break;
				case 6:
					break;
				}

				try {
					String cocaruta = new File("baseD/cocacola.txt").getAbsolutePath();
					String pepsiruta = new File("baseD/pepsi.txt").getAbsolutePath();	
					String colarruta = new File("baseD/colareal.txt").getAbsolutePath();
					String countryruta = new File("baseD/countryc.txt").getAbsolutePath();	
					
					FileWriter cocac = new FileWriter(cocaruta);
					FileWriter peps = new FileWriter(pepsiruta);
					FileWriter colarr = new FileWriter(colarruta);
					FileWriter countr = new FileWriter(countryruta);
					
						cocac.write(Integer.toString(coca.getCantidad()));
						peps.write(Integer.toString(pepsi.getCantidad()));
						colarr.write(Integer.toString(colar.getCantidad()));
						countr.write(Integer.toString(country.getCantidad()));
					
					cocac.close();
					peps.close();
					colarr.close();
					countr.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
			if(entrada==6) {
				break;
			}
			else;
			}
		}
}		
	

	
	

