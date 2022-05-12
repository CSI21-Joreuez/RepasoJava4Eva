package interfaces;

public class Television {
private int programa;
private int volumen;
public int getPrograma() {
	return programa;
}
public void setPrograma(int programa) {
	this.programa = programa;
}
public int getVolumen() {
	return volumen;
}
public int incrementarPrograma(int prog) {
	 int programa = prog;
	programa = prog +1;
	return programa;
}
public int decrementarPrograma (int prog)
{
int programa = prog;
programa = prog-1;
return programa;
}
public int incrementarVolumen(int vol) {
	 int volumen = vol;
	 volumen = vol +1;
	return volumen;
}
public int decrementarVolumen (int vol)
{
int volumen = vol;
volumen = vol-1;
return volumen;
}
}
