package Clases;

public class Persona {


	String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	String apellidos;
	int edad;
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	// SI NO TIENE EXTENDS Y NO HEREDA DE NADIE ENTONCES NO TIENE QUE USAR EL SUPER CONSTRUCTOR POR DEFECTO
	// SUPER();
}
