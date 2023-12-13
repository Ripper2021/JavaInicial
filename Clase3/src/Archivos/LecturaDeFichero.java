/*
Scanner: Lectura de datos separados por delimitadores. 
Se puede utilizar para analizar y extraer datos de archivos PEQUEÑOS.
BufferedReader:
Lectura EFICIENTE de archivos GRANDES. Es eficiente ya que realiza la lectura en el Buffer de memoria.
Lo que minimiza la llamada al sistema operativo y reduce los tiempos de carga.
Tambien realiza lectura de linea por linea lo cual indica que se encarga de 
leer toda la información de forma eficiente. 
FileReader:
Lectura de caracteres de forma INDIVIDUAL. Lo realiza byte por byte.
BufferedReader > Scanner > FileReader 
*/
package Archivos;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LecturaDeFichero {
	public static void main (String [] args)
	{
		try
		{
		Scanner scan = new Scanner(new File("C:\\Users\\Gusta\\OneDrive\\Documentos\\salida_proceso.txt"));
		while(scan.hasNextLine())
		{
			System.out.println(scan.nextLine());
		}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}