package Archivos;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFichero2 
{
	public static void main(String[] args)
	{
		try
		{
		FileReader reader = new FileReader("C:\\Users\\Gusta\\OneDrive\\Documentos\\salida_proceso.txt");
		int caracter;
		while((caracter = reader.read()) != -1)
		{
			System.out.println((char)caracter);
		}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		}
}
