package Clases;

public class Lavadora extends Electrodomestico{

	private static final int CARGA_DEFECTO=5;
	int carga;
	public Lavadora() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lavadora(int precio, int peso) {
		super(precio, peso);
		// TODO Auto-generated constructor stub
	}
	public Lavadora(int precio, String color, char consumo, int peso, int carga) {
		super(precio, color, consumo, peso);
		this.carga=carga;
	}
	public int getCarga() {
		return carga;
		
	}
	private int precioFinal()
	{
		if(carga>30)
		{
		precio=50;
		}
		return precio;
	}
	
	
	
	
}
