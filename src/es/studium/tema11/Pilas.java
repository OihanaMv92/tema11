package es.studium.tema11;

import java.util.Stack;

public class Pilas
{
	static String diasSemana[]={"Lunes", "Martes", "Miércoles", "Jueves",
			"Viernes", "Sábado", "Domingo"};
	public static void main(String args[])
	{
		int i;
		Stack<String> pila=new Stack<String>(); // como un arraylisto y el tipo.
		for(i=0;i<diasSemana.length;i++)
		{
			pila.push(diasSemana[i]); // push para meterlo dentro de la pila.
		}
		System.out.println("Contenido de pila = "+pila);
		pila.addElement("Esta será, de momento, la última línea");
		// Tratando la pila como un Vector
		System.out.println("Elemento 5 vale '" +pila.elementAt(5)+"'");
		// Mostrando el elemento de la cima sin eliminarlo
		System.out.println("La cima vale '" +pila.peek()+"'");
		// Buscando un par de elementos
		System.out.println(pila.search("Lunes"));
		System.out.println(pila.search("Monday"));
		System.out.println("Elementos introducidos:");
		while(!pila.empty()) // recorremos la pila hasta que quede vacia
		{
			System.out.println(pila.pop()); 
		}
	}
}