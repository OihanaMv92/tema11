package es.studium.tema11;

import java.util.ArrayList;
import java.util.Iterator;

public class Colas
{
	public static void main(String[] args)
	{
		ArrayList<Integer> cola = new ArrayList<>();

		Iterator<Integer> it;
		// Añadir por el final de la cola, posición 0 de la lista
		cola.add(0, 3); // cola = 3
		cola.add(0, 4); // cola = 4 3
		cola.add(0, 5); // cola = 5 4 3
		// Sacar, procesar, realizar
		while(!cola.isEmpty())
		{
			System.out.println("Procesado:"+cola.get(cola.size()-1));
			cola.remove(cola.get(cola.size()-1));
			// Recorrer
			it = cola.iterator();
			// Recorremos la lista con el iterador
			System.out.println("La cola queda:");
			while (it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		System.out.println("Cola vacía");
	}
}