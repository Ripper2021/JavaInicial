/*
 Modelo de examen:
Desarrollar un programa que lea un fichero que contiene información
de productos de supermercado, y calcule la siguiente informacion:
Precio final: Precio bruto / 2
Aplica Descuento: Si y solo si son mariscos o salmon el producto.
(SI/NO)
Cantidad de días para que venza el producto: 
F Elaboracion - Fecha Actual.
Luego, una vez desarrollado, generar un fichero de salida con la información final. Informacion final = Todos los campos del txt
de entrada + todos los campos nuevos. 
Estructura del programa:
- Debe implementar el uso de Interfaces para crear los siguientes
campos: 
-Precio final
-Aplica Descuento
-Cantidad de días para que venza el producto
Entregable:
- Codigo del proyecto.
El fichero de salida se debe llamar "productos_fechaHoy" 
 */
package Resolucion;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


interface funciones
{
	public void precioFinal();
	public void aplicaDescuento();
	public void cantidadDias();
}

public class Principal implements funciones

{
	String nombre;
	String peso;
	double precioBruto;
	Date Felaboracion;
	double precioFinal;
	boolean aplicaDescuento;
	long cantidadDias;

	public Principal(String nombre, String peso, double precioBruto, String Felaboracion) throws ParseException
	{
		this.nombre = nombre;
		this.peso = peso;
		this.precioBruto = precioBruto;
		this.Felaboracion = new SimpleDateFormat("yyyy-MM-dd").parse(Felaboracion);
	}

	public double getPrecioBruto()
	{
		return precioBruto;
	}
	
	public void precioFinal()
	{
		this.precioFinal = getPrecioBruto() / 2;
	}
	
	public void aplicaDescuento()
	{
		this.aplicaDescuento = getNombre().equalsIgnoreCase("mariscos") || getNombre().equalsIgnoreCase("salmon");
	}
	public void cantidadDias()
	{
		Date fechaActual = new Date();
		long diferenciaEnMiliSegundos = Felaboracion.getTime() - fechaActual.getTime();
		this.cantidadDias = diferenciaEnMiliSegundos / (24 * 60 * 60 * 1000); //EL calculo entre parentesis devuelve el TOTAL de milesimas de segundos que hay en un día
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public String toString()
	{
		return "Producto: "+ nombre +
				", Peso: " + peso + 
				", PrecioBruto: " + precioBruto + 
				", FELaboracion: " + Felaboracion +
				", Precio Final: " + precioFinal + 
				", AplicaDescuento: " + aplicaDescuento + 
				", CantidadDias: " + cantidadDias;				
	}
	
	public static void main (String[] args) throws ParseException, IOException
	{
		try
		{
		String rutaArchivo = "C:\\Users\\Gusta\\OneDrive\\Documentos\\productos_entrada.txt";
		FileReader fileReader = new FileReader(rutaArchivo);
		BufferedReader bf = new BufferedReader(fileReader);
		List<Principal> productos = new ArrayList<>();
		String linea = "";
		while((linea = bf.readLine())!= null)
		{
			
			String [] partes = linea.split(", ");
			String nombre = partes[0].split(": ")[1];
			String peso = partes[1].split(": ")[1];
			double precioBruto = Double.parseDouble(partes[2].split(": ")[1]);
			String fechaElaboracion = partes[3].split(": ")[1];
			Principal producto = new Principal(nombre, peso, precioBruto, fechaElaboracion);
			producto.precioFinal();
			producto.aplicaDescuento();
			producto.cantidadDias();
			productos.add(producto);
			}
		bf.close();
		
		LocalDate fechaHoy = LocalDate.now();
		String formatoFecha = DateTimeFormatter.ofPattern("yyyyMMdd").format(fechaHoy);
		String archivoSalida = "C:\\Users\\Gusta\\OneDrive\\Documentos\\productos_" +fechaHoy+".txt";
		FileWriter fileWriter = new FileWriter(archivoSalida);
		BufferedWriter bw  = new BufferedWriter(fileWriter);
		
		for(Principal producto: productos)
		{
			bw.write(producto.toString());
			bw.newLine(); //Para que no se junte todo. 
		
		}
		bw.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}
}