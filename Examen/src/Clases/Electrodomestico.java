package Clases;

public class Electrodomestico {

	private final static char LETRA_DEFECTO = 'F';
	private final static String COLOR_DEFECTO = "Blanco";
	private final static int PRECIO_DEFECTO =100;
	private final static int PESO_DEFECTO = 5;
	int precio;
	String color;
	char consumo;
	int peso;
	public Electrodomestico() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Electrodomestico(int precio, int peso) {
		super();
		this.precio = precio;
		this.peso = peso;
	}
	public Electrodomestico(int precio, String color, char consumo, int peso) {
		super();
		this.precio = precio;
		precioFinal();
		this.color = color;
		ComprobarColor(color);
		this.consumo = consumo;
		comprobarConsumoEnergetico(consumo);
		this.peso = peso;
	}
	public int getPrecio() {
		return precio;
	}
	public String getColor() {
		return color;
	}
	public char getConsumo() {
		return consumo;
	}
	public int getPeso() {
		return peso;
	}
	private char comprobarConsumoEnergetico(char letra)
	{
		if(letra!='A' || letra!='B' || letra!='C' || letra!='D' || letra!='E' || letra!='F')
			letra = LETRA_DEFECTO;
		return letra;
		
	}
	private String ComprobarColor(String color)
	{
		this.color.toUpperCase();
		if(color !="BLANCO" || color !="NEGRO" ||color !="ROJO" ||color !="AZUL" || color !="GRIS");
		this.color = COLOR_DEFECTO;
		return this.color;
	}
	private int precioFinal()
	{
	if(consumo=='A')
		this.precio=this.precio+100;
	else if(consumo=='B')
		this.precio=this.precio+80;
	else if(consumo=='C')
		this.precio=this.precio+60;
	else if(consumo=='D')
		this.precio=this.precio+50;
	else if(consumo=='E')
		this.precio=this.precio+30;
	else if(consumo=='F')
		this.precio=this.precio+10;
	
	if(peso<20)
		this.precio=this.precio+10;
	else if(precio>19 && precio <49)
		this.precio=this.precio+50;
	else if(precio>49 && precio <79)
		this.precio=this.precio+80;
	else if(precio>80)
		this.precio=this.precio+100;
	
	return precio;
	}
	
	
}
