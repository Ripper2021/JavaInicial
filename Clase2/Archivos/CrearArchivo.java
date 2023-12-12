package Archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
/*
try-catch
Try: Se intenta realizar una acción
Catch: En el caso que esa acción no se pueda realizar
Manejar el error que se presente para que el programa
se siga ejecutando con un error.
try
{

}
catch(Exception Especifica e)
{

}
*/
import java.io.IOException;


public class CrearArchivo {

	public static void main (String [] args)
	{
		String contenido = "Este es mi contenido a almacenar";
		String rutaArchivo = "C:\\Users\\Gusta\\Sabadell\\Clase2\\archivo.txt";
		File archivo = new File(rutaArchivo);
		try
		{
		archivo.createNewFile();
		System.out.println("Se genero el fichero.");
		FileWriter fw = new FileWriter(archivo);
		//FileWriter -> La clase que se encarga de PERMITIRME
		//Escribir un archivo.
		/*
		Buffered: Bufer de datos: Es un espacio de memoría en el que se almacenan
		datos de manera temporal, normalmente para un unico uso. 
		Su principal función es evitar que el programa o recurso se quede
		sin datos durante una transferencia.
		*/
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(contenido);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}	
}