package Colecciones;
/*
En Java las colecciones son un conjunto de clases e interfaces
que proporcionan implementaciones de estructuras de datos
para almacenar y organizar grupos de objetos. Estas
estructuras de datos son utilizadas para mianpular y gestionar 
conjuntos de elementos de manera eficiente. 
Listas
Set
Maps (Diccionarios)

*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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
		List<Object> lista = new ArrayList<>();
		lista.add(listaEnteros);
		lista.add(colores);
		System.out.println("Mi lista final:" + lista);
		System.out.println("Elemento 0 de la lista:" + lista.get(0));
		////////////////////////////////
		//		COLECCIÓN SET
		////////////////////////////////
		//Set: Es una interfaz que extiende de la colección de Collection
		//que representa Valores Unicos
		// No vienen ordenados los elementos. 
		Set<String> lProgra = new HashSet<String>();
		lProgra.add("Python");
		lProgra.add("C#");
		lProgra.add("C++");
		lProgra.add("SQL");
		lProgra.add("Java");
		lProgra.add("JavaScript");
		lProgra.add("Cobol");
		lProgra.add("Dart");
		lProgra.add("Visual Basic");
		System.out.println("La lista de lenguajes de programación es:" + lProgra);
		//Eliminar un elemento.
		lProgra.remove("SQL");
		System.out.println("Set actualizado: " + lProgra);
		int tamanio_set = lProgra.size();
		System.out.println("El set contiene: " + tamanio_set + " elementos");
		//Limpiamos el conjunto.
		//lProgra.clear();
		Set<Integer> numeros = new HashSet<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		Set<Object> objeto = new HashSet<>();
		objeto.add(lProgra);
		objeto.add(numeros);
		System.out.println("Set añidado: " +objeto);
		
		//Cuando usar SET:
		/*
		- Cuando necesitamos almacenar elementos unicos
		- Cuando no nos interesa el orden que tengan
		- Cuando no nos importe el rendimiento del programa.
		Cuando Usar Lista:
		- Necesitamos almacenar elementos duplicados
		- Necesitamos almacenar elementos en un orden especifico
		  que se pueden acceder a traves del indice.
		*/
		////////////////////////////////
		//		COLECCIÓN MAP
		////////////////////////////////
		/*
		Map: En Java es una estructura de datos que se utilizza para
		almacenar una colección de pares clave-valor. Cada elemento
		contiene dos partes: Una clave unica que se utiliza para identificar
		el valor asociado.
		Tipos de Maps:
		HashMap: Es una implementación de Map que utiliza una tabla HASH.
		Para almacenar sus elementos. Es una de las implementaciones mas rapidas
		y eficientes, PERO, no garantiza el orden de los elementos.
		TreeMap
		LinkedHashMap
		*/
		HashMap<String, Integer> usuarios = new HashMap<>();
		usuarios.put("Gustavo", 30);
		usuarios.put("Norma", 25);
		usuarios.put("Patricia", 22);
		usuarios.put("Camila", 30);
		System.out.println(usuarios);
		//Accedo a un valor especifico.
		int edadGustavo = usuarios.get("Gustavo");
		System.out.println("La edad de Gustavo es: " + edadGustavo);
		//Remover un valor.
		usuarios.remove("Gustavo");
		try
		{
			Set<String> claves= usuarios.keySet();
			System.out.println("Las claves son: "+claves);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		/*TreeMap: Es otra implementación del Map, pero a diferencia
		del HashMap mantiene las claves ordenadas en orden natural
		o mediante un comparador personalizado. Esto significa
		Que las claves se almacenan ordenadas en el arbol, lo que facilita
		realizar operaciones como la obtención de un subconjunto de claves.
		*/
		TreeMap<String, Integer> miTreeMap = new TreeMap<>();
		miTreeMap.put("Tres", 3);
		miTreeMap.put("Uno", 1);
		miTreeMap.put("Cuatro", 4);
		miTreeMap.put("Dos", 2);
		
		System.out.println("Contenido del TreeMap: " + miTreeMap);
		
		int valorUno = miTreeMap.get("Uno");
		System.out.println("El valor asociado a 'Uno' es: " + valorUno);
		
		for(Map.Entry<String, Integer> entry: miTreeMap.entrySet())
		{
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		//LinkedHashMap:
		/*
		 	Mantiene el orden de inserción de las claves.
		 	Esto significa que al iterar sobre las claves, se muestran
		 	en el orden en el que fueron insertadas en el Mapa.
		 * */
		 LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		 linkedHashMap.put("Cinco", 5);
		 linkedHashMap.put("Cuatro", 4);
		 linkedHashMap.put("Tres", 3);
		 linkedHashMap.put("Dos", 2);
		 linkedHashMap.put("Uno", 1);
		 System.out.println("Se muetra el linkedHashMap con el orden ingresado: " + linkedHashMap);
		 int valorUno_Linked = linkedHashMap.get("Uno");
		 int valorDos_Linked = linkedHashMap.get("Dos");
		 if(linkedHashMap.containsKey("Cinco"))
				 {
			 		System.out.println("Existe en el LinkedHashMap");
				 }
	}
}