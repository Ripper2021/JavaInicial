package Resolucion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
EJERCICIO 3:
Desarrollar una calculadora
donde el usuario pueda ingresar dos numeros enteros para hacer las operaciones aritmeticas basicas
(Suma, Resta, Division, Multiplicacion)
Y luego almacenar la información en un fichero de salida.

ENTREGABLE:
- Codigo del proyecto.
*/
public class Ejercicio3 
{
	public static void main (String [] args)
	{
	try
	{
	Scanner scan = new Scanner (System.in);
	System.out.println("Ingrese el primero numero:");
	int a = scan.nextInt();
	System.out.println("Ingrese el segundo numero:");
	int b = scan.nextInt();
	int suma = a+b;
	int resta = a-b;
	int mult = a*b;
	int division = a/b;
	//Resolucion tipo 1 para escribir la salida
	String suma_string ="La suma es:" + suma;
	String resta_string ="La resta es: " + resta;
	String mult_string = "La multiplicacion es: " +mult;
	String division_string = "La division es: " + division;
	String final_string = suma_string + resta_string + mult_string + division_string;
	//Resolucion tipo 2 para escribir la saida. 
	String contenido = "La suma es: "+ suma+","
						+"La resta es: " +resta+","
						+"La multiplicacion es: " + mult+","
						+"La division es: "+division+"\n";
	System.out.println(contenido);
	File archivo = new File("C:\\Users\\Gusta\\OneDrive\\Documentos\\salida_proceso.txt");
	archivo.createNewFile();
	System.out.println("Se ha creado el fichero.");
	FileWriter fw = new FileWriter(archivo);
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write(contenido);
	bw.close();
	System.out.println("Se escribio el archivo.");
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	}
}