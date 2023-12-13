package Colecciones;
/*
En Java las colecciones son un conjunto de clases e interfaces
que proporcionan implementaciones de estructuras de datos
para almacenar y organizar grupos de objetos. Estas
estructuras de datos son utilizadas para mianpular y gestionar 
conjuntos de elementos de manera eficiente. 
Listas
Set
Maps

*/

import java.util.ArrayList;
import java.util.List;

public class Colecciones 
{
	public static void main(String[] args)
	{
	/* Listas: Es una estructura de datos que puede contener una serie de elementos.
	 * Simbolicamente la lista se identifica en Java con []
	   Las listas admiten valores duplicados.
	 */
		List<String> nombres = new ArrayList<String>();
		nombres.add("Gustavo");
		nombres.add("Pablo");
		nombres.add("Maria");
		nombres.add("Nicolas");
		nombres.add("Gustavo");
		System.out.println(nombres);
		//Obtener el tamaño de la lista.
		int tamanio = nombres.size();
		System.out.println("La lista contiene:" +tamanio+ " elementos");
		//Obtener el elemento de la posición 2:
		String nombre_pos_2 = nombres.get(2);
		System.out.println("El nombre de la posición 2 es: " + nombre_pos_2);
		//Borrar un elemento de la lista. 
		nombres.remove(4);
		System.out.println("Lista actualizada:" +nombres);
		//Actualizar un elemento de la lista.
		nombres.set(0, "Ariel");
		System.out.println("Cambie algunos nombres: " + nombres);
		//Comprobar si la lista tiene un elemento especifico
		boolean contiene = nombres.contains("Emilio");
		System.out.println("la lista contiene el nombre?" + contiene);
		//Eliminar todos los elementos de la vista.
		//nombres.clear();
		System.out.println("Lista vacia: " +nombres);	
		nombres.add(2, "Joan");
		System.out.println(nombres);
		
		
		//Lista con vario tipos de datos.
		List<Integer> listaEnteros = new ArrayList<>();
		listaEnteros.add(1);
		listaEnteros.add(2);
		listaEnteros.add(3);
		listaEnteros.add(4);
		listaEnteros.add(5);
		List<String> colores = new ArrayList<>();
		colores.add("Azul");
		colores.add("Rojo");
		colores.add("Naranja");

		//Declaro que es un OBJECT para poder añadir listas.
		//Es el unico que admite esta posibilidad.
		
		List<Integer> listanombre = new ArrayList<>();
		
		
		
		List<Object> lista = new ArrayList<>();
		lista.add(listaEnteros);
		lista.add(colores);
		System.out.println("Mi lista final:" + lista);
		System.out.println("Elemento 0 de la lista:" + lista.get(0));
	}
}
