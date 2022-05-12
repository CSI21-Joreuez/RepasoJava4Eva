package Clases;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Prueba   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Lavadora> allv = new ArrayList<Lavadora>();
		ArrayList<Television> altv = new ArrayList<Television>(); 
		for (int i = 0; i<=10; i++)
		{
			
			Lavadora lv = new Lavadora(200+i, "xzc", 'D', 10+i, 10+i);
			Television tv = new Television(100+i, "azuls", 'A', 10+i, 10+i, false);
			allv.add(lv);
			altv.add(tv);
		}
		for (Television television : altv) {
			System.out.println(television.precio+","+television.color+","+television.consumo+","+television.peso+","+television.resolucion+","+television.sintonizador_TDT);
		}
		for (Lavadora lava : allv) {
			System.out.println(lava.precio+","+lava.color+","+lava.consumo+","+lava.peso+","+lava.carga);
		}
		
		
	}

}
