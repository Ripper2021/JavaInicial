import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Clase2Fechas 
{

	public static void main (String [] args)
	{
	//////////////////////////////////
	//		Libreria Date
	//////////////////////////////////
	Date fechaActual = new Date();
	System.out.println("La fecha actual es: " + fechaActual);
	//Declaro una variable llamada Formato usando el SimpleDateFormat
	//Para cambiar el formato.
	SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
	//Declaro una variable de tipo String para pasarle la fecha y formatearla.
	String fechaFormateada = formato.format(fechaActual);
	System.out.println("Mi fecha actual con formato es: " + fechaFormateada);
	//////////////////////////////////
	//	LocalDate / LocalDateTime
	//////////////////////////////////
	//Declaro la fecha y hora actual
	LocalDateTime fecha_actual_hora = LocalDateTime.now();
	//Declaro la fecha actual
	LocalDate	fecha_actual = LocalDate.now();
	//Imprimo
	System.out.println("La fecha y hora actual es: " + fecha_actual_hora);
	System.out.println("La fecha actual es: " + fecha_actual);
	//Declaro una fecha especifica con el metodo of
	LocalDate fecha_nacimiento_profe = LocalDate.of(1992, 10, 20);
	System.out.println("La fecha de nacimiento del profesor es: " + fecha_nacimiento_profe);
	//Calculo la edad de un cliente en base a la fecha actual (año) - su fecha de nacimiento (año) 
	int edad = fecha_actual.getYear() - fecha_nacimiento_profe.getYear();
	System.out.println("La edad del profe es: " + edad);
	//Le resto N dias a una fecha
	LocalDate fecha_ayer = fecha_actual.minusDays(1);
	//Le sumo N dias a una fecha. 
	LocalDate fecha_maniana = fecha_actual.plusDays(1);
	System.out.println("Ayer fue: " + fecha_ayer);
	System.out.println("Mañana sera: " + fecha_maniana);
	//Cambiar el formato de las fechas con LocalDate
	DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/YYYY"); //yyyy-MM-dd, dd/MM/YYYY, dd-MMM/YYYY, yyyy-MMM-dd HH:mm:SS
	String fechaFormateada_LocalDate = fecha_actual.format(formatoFecha);
	System.out.println("La fecha formateada es: " + fechaFormateada_LocalDate);
	//Declaro un Array de fechas.
	LocalDate[] fechas = new LocalDate[5];
	fechas[0] = LocalDate.of(2020, 10, 20);
	fechas[1] = LocalDate.of(2010, 05, 25);
	fechas[2] = LocalDate.of(2021, 06, 28);
	fechas[3] = LocalDate.of(2023, 07, 28);
	fechas[4] = LocalDate.of(2022, 06, 29);
	for(int i = 0; i<fechas.length;i++)
	{
		System.out.println(fechas[i]);
	}
	}
}
