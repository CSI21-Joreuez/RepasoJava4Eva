package BBDD;

public class Alumno extends Persona {

	int edad;

	public Alumno(int id, String nombre, String apellidos, String direccion, int edad) {
		super(id, nombre, apellidos, direccion);
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [edad=" + edad + ", id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", direccion=" + direccion + "]";
	}
	
	
	

}
