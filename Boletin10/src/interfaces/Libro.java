package interfaces;

public class Libro {
private String isbn;
private String titulo;
private Persona autor;
private int num_Pag;
private double precio;
private boolean bestSeller;
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public Persona getAutor() {
	return autor;
}
public void setAutor(Persona autor) {
	this.autor = autor;
}
public int getNum_Pag() {
	return num_Pag;
}
public void setNum_Pag(int num_Pag) {
	this.num_Pag = num_Pag;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public boolean isBestSeller() {
	return bestSeller;
}
public void setBestSeller(boolean bestSeller) {
	this.bestSeller = bestSeller;
}
public String getIsbn() {
	return isbn;
}

}
