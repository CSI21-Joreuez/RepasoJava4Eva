package Paquete;

public abstract class ClaseAbstrcta  {
	private double cantidad;

	public  abstract void ingresar(double cantidad);
	{
	}
	public  void retirar (double cantidad)
	{
		if(this.cantidad - cantidad <0)
			this.cantidad =0;
		else
			this.cantidad-=cantidad;
	}
}
