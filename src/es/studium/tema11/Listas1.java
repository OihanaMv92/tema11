package es.studium.tema11;

import java.util.ArrayList;
import java.util.Iterator;
public class Listas1
{
	ArrayList<String> lista = new ArrayList<String>();
	public static void main(String[] args)
	{
		new Listas1();
	}
	public Listas1()
	{
		lista.add(0,"Andrea");
		lista.add(1,"Amaya");
		lista.add(1,"Julio");
		Iterator<String> iter = lista.iterator();
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}