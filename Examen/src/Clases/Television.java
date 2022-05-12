package Clases;

public class Television extends Electrodomestico {

	int resolucion;
	boolean sintonizador_TDT;
	private static final int RESOLUCION_DEF  = 20;
	private static final boolean SINTONIZADOR_DEF = false;
	public Television() {
		super();
	}
	public Television(int precio, int peso) {
		super(precio, peso);
	}
	public Television(int precio, String color, char consumo, int peso, int resolucion, boolean sintonizador_TDT ) {
		super(precio, color, consumo, peso);
		this.resolucion = resolucion;
		this.sintonizador_TDT = sintonizador_TDT;
	}
	public int getResolucion() {
		return resolucion;
	}
	public boolean isSintonizador_TDT() {
		return sintonizador_TDT;
	}
	private int precioFinal()
	{
		if(resolucion>40)
		precio = (precio*30)/100;
		if(sintonizador_TDT)
		precio=precio+50;
		return precio;
	}
	
}
