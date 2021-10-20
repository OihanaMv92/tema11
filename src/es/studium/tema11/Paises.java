package es.studium.tema11;

import java.util.ArrayList;
import java.util.Iterator;


public class Paises
{
	public static void main(String[] args)
	{
		ArrayList<String> paises = new ArrayList<String>();
		paises.add("Mónaco");
		paises.add("Suecia");
		paises.add("Mozambique");
		paises.add("Maldivas");
		// Mostrar la información ArrayList de 3 formas
		// Con Iterador
		Iterator<String> iterador = paises.iterator();
		System.out.println("Recorriendo con Iterator");
		while(iterador.hasNext())
		{
			System.out.println(iterador.next());
		}
		System.out.println("Recorriendo con For");
		// Con for
		for(int i = 0; i < paises.size(); i++)
		{
			System.out.println(paises.get(i));
		}
		// Con for extendido
		System.out.println("Recorriendo con For Extendido");
		for(String pais: paises)
		{
			System.out.println(pais);
		}
	}
}