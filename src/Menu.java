import java.util.Scanner;

public class Menu {
	public static void main(String [] args) {
		
		menu();
		
	}
	
	static void menu() {

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
			break;
			case 6 : 
				break;
			default: System.out.println("Opcion no encontrada");
			}
				switch(entrada) {
				
				case 1: Devuelta = montoAPagar - coca.getRefresco();
				if(montoAPagar < coca.getRefresco()) {
					System.out.println("Monto Insuficiente para este producto");
				}
				else {
				System.out.println("Su devuelta es: $"+Devuelta);
				coca.setCantidad(coca.getCantidad()-1);
				System.out.println("\n Su inventario es: "+coca.getCantidad());	 
				}
				break;
				
				case 2: Devuelta = montoAPagar - pepsi.getRefresco();
				if(montoAPagar < pepsi.getRefresco()) {
					System.out.println("Monto Insuficiente para este producto");
				}
				else {
				System.out.println("Su devuelta es: $"+Devuelta);
				pepsi.setCantidad(pepsi.getCantidad()-1);
				int num = pepsi.getCantidad();
				
				System.out.println("\n Su inventario es: "+num);
				}
				break;
				
				case 3: Devuelta = montoAPagar - colar.getRefresco();
				if(montoAPagar < colar.getRefresco()) {
					System.out.println("Monto Insuficiente para este producto");
				}
				else {
				System.out.println("Su devuelta es: $"+Devuelta);
				colar.setCantidad(colar.getCantidad()-1);
				System.out.println("\n Su inventario es: "+colar.getCantidad());
				}
				break;
				
				case 4: Devuelta = montoAPagar - country.getRefresco();
				if(montoAPagar < country.getRefresco()) {
					System.out.println("Monto Insuficiente para este producto");
				}
				else {
				System.out.println("Su devuelta es: $"+Devuelta);
				country.setCantidad(coca.getCantidad()-1);
				System.out.println("\n Su inventario es: "+country.getCantidad());
				}
				break;
				case 6:
					break;
				}
			
			if(entrada==6) {
				break;
			}
			else;
			}
			
		}		
	}

	
	

