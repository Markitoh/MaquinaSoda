class Precio {
private int costo;
private int cantidad;

public int getRefresco() {
	return costo;
}

public int getCantidad() {
	return cantidad;
}
public void setCantidad(int num) {
	cantidad = num;
}
}
class cocacola extends Precio{
	private int costo = 30;
	private int cantidad = 40;
	public int getRefresco() {
	return costo;
	}
	public int getCantidad() {
		return this.cantidad;
	}
	public void setCantidad(int num) {
		cantidad = num;
	}
}

class pepsi extends Precio{
	private int costo = 25;
	private int cantidad = 40;
	public int getRefresco() {
		return costo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int num) {
		cantidad = num;
	}
}

class colaReal extends Precio{
	private int costo = 20;
	private int cantidad = 40;
	public int getRefresco() {
		return costo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int num) {
		cantidad = num;
	}
}
class countryclub extends Precio{
	private int costo = 15;
	private int cantidad = 40;
	public int getRefresco() {
		return costo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int num) {
		cantidad = num;
	}
}