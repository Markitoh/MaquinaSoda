import java.util.Scanner;

public class Recargar{

	public void recargar() {
		Precio coca = new cocacola();
		Precio pepsi = new pepsi();
		Precio coral = new colaReal();
		Precio country = new countryclub();
		
		Scanner teclado = new Scanner(System.in);
		
	System.out.println("Introduzca Contraseña: \n");
	int password = teclado.nextInt();
	int pass = 1234;
	
	if (password != pass) {
		System.out.println("Contraseña incorrecta \n");
		System.out.println("No se recargo la maquina \n Introduzca un numero para continuar");
		teclado.nextInt();
		Maquina.maquina();
	}
	else {
		System.out.println("Introduzca la cantidad a recargar \n");
		int nuevaCantidad = teclado.nextInt();
		if(nuevaCantidad > 40) {
			System.out.println("La cantidad Introducida excede el limite, favor verificar");
			teclado.nextInt();
			Maquina.maquina();
		}
		else {
		coca.setCantidad(coca.getCantidad()+nuevaCantidad);
		pepsi.setCantidad(pepsi.getCantidad()+nuevaCantidad);
		coral.setCantidad(coral.getCantidad()+nuevaCantidad);
		country.setCantidad(country.getCantidad()+nuevaCantidad);
		
		System.out.println("Maquina Recargada \n");
		Maquina.maquina();
		}
	}
}
}
