package Archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Split 
{
	public static void main(String[] args)
	{
		try
		{
			String rutaArchivo = "C:\\Users\\Gusta\\OneDrive\\Documentos\\salida_proceso.txt";
			BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
			String linea="";
			
			while((linea = br.readLine()) != null)
			{
				String[] partes = linea.split(",");
				String suma = partes[0].trim();
				String resta = partes[1].trim();
				String multiplicacion = partes[2].trim();
				String division = partes[3].trim();
				System.out.println("suma: "+ suma);
				System.out.println("resta: "+ resta);
				System.out.println("multiplicacion:"+ multiplicacion);
				System.out.println("division:"+ division);
			}
			br.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
}
