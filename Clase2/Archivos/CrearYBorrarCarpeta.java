package Archivos;

import java.io.File;

/*
Caracteres de Escape
\b: Retroceso  
\t: Tabulacion
\n: Salto de linea  
\f: Avance de Pagina  
\r: Retorno de carro  
\": Comilla doble  
\': Comilla simple  
\\: Barra invertida.
*/
public class CrearYBorrarCarpeta 
{
	public static void main (String [] args)
	{
		//Ruta donde va a ir la carpeta nueva.
		String carpeta = "C:\\Users\\Gusta\\Sabadell\\Clase2\\CarpetaNueva";
		//El objeto de tipo File que almacena la ruta de la carpeta.
		File directorio = new File(carpeta);
		//creo una carpeta nueva usando mkdir();
		directorio.mkdir(); 
		//Preguntamos si existe el directorio a borrar.
		if(directorio.exists())
		{
			//LLamamos a la función directorio.
			BorrarDirectorio(directorio);
		}
	}
	//Declaramos la funcion que borra el directorio. LE paso por parametro directory.
	public static void BorrarDirectorio (File directory)
	{
		//Declaro una variable llamada files y le asigno la lista
		//de archivos que contiene el directorio
		File[] files = directory.listFiles();
		//Si contiene archivos entonces los recorro.
		if(files != null)
		{
			//Recorro los archivos con un foreach. 
			for(File file: files)
			{
				//Manda un mensaje si encuentra archivos en la carpeta y los borra.
				System.out.println("Se borraron los archivos");
				BorrarDirectorio(file);
			}
		}
		//Pregunto si el directorio existe
		if (directory.exists())
		{
			//Si el directorio va a ser borrado. 
			if(directory.delete())
			{
				//Avisa por consola que el directorio fue borrado.
				System.out.println("El directorio fue borrado.");
			}
			else
			{
				//NO se pudo borrar. 
				System.out.println("No se pudo borrar el directorio");
			}
		}
	}
	
}
