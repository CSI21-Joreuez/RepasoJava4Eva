package Clases;

public class Comercial  extends Persona {

	String departamento;
	String categoria;
	double sueldo;
	public Comercial(String nombre, String apellidos, int edad, String departamento, String categoria, double sueldo) {
		super(nombre, apellidos, edad);
		this.departamento = departamento;
		this.categoria = categoria;
		this.sueldo = sueldo;
	}
	
	
	
	
	
}
