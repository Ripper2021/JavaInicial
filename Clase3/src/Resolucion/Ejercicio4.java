/*
 Ejercicio 4 (TIENE NOTA):
Desarollar un programa que almacene la siguiente información dentro de una lista de productos
de supermercado (por consola):
- Nombre
- Peso
- Precio
- Sabor
- Fecha de vencimiento

Luego, esta información almacenarla en un fichero de salida
Hacer para al menos 5 productos.
Entregable:
- Codigo del proyecto. 
 */

package Resolucion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 
{

	public static void main (String [] args)
	{
		//Declare una Lista de productos
		List<String> productos = new ArrayList<>();
		//Declare el escaner.
		Scanner scan = new Scanner (System.in);
		//Hice dentro de un for la solicitud de productos.
		for(int i = 0; i< 5; i++)
		{
			//Declare que se ingrese los productos 1 por 1
			System.out.println("Ingrese la información del producto:" + (i+1)+ ":");
			System.out.println("Nombre: ");
			String nombre = scan.nextLine();
			System.out.println("Peso: ");
			//Converti de String a Double.
			double peso = Double.parseDouble(scan.nextLine());
			System.out.println("Precio: ");
			//Converti de String a Double el precio
			double precio = Double.parseDouble(scan.nextLine());
			System.out.println("Sabor:");
			//Pido que ingrese el sabor.
			String sabor = scan.nextLine();
			System.out.println("Fecha de vencimiento (YYY-MM):");
			//Pido que ingrese la fecha de vencimiento.
			String fVto = scan.nextLine();
			//Genero un String que se llama productoInfo con un formato especifico.
			//Genere la variable de tipo String llamada productoInfo
			String productoInfo = String.format("%s, %.2f kg, $%.2f, Sabor: %s, Vence el: %s", nombre, peso, precio, sabor, fVto);
											     //%s: Es un marcado de posición para un String.
												 //%.2f: Es un marcador de posición para un numero de punto flotante o un double. 
												 // que significa el .2 en .2f? Significa que el valor double o valor flotante va a tener 2 decimales. 
			
			productos.add(productoInfo);
		}
		
		String nombreFichero = "productos.txt";
		guardarProductosEnArchivo(productos, nombreFichero);
	}
	
	private static void guardarProductosEnArchivo(List<String> productos, String nombreFichero)
	{
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreFichero)))
{
			for (String producto: productos)
			{
				writer.write(producto);
				writer.newLine();
			}

		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}	
}
