import java.time.LocalDate;
import java.util.Scanner;
/*
Ejercicio 2:
Nos contrataron para desarrollar un nuevo sistema de empleados. El cual debe contar con la 
siguiente información por consola:
- Nombre
- Apellido
- Ciudad
- Email
- Fecha de nacimiento
En base a esta información se debe calcular tambien la edad para los empleados. Una vez realizado
imprimir todos los campos por pantalla, para cada empleado:
- Nombre
- Apellido
- Ciudad
- Email
- Fecha de nacimiento
- Edad
CONSIDERACION: HACER PARA AL MENOS 3 EMPLEADOS. 
Entregable:
- Codigo del proyecto. 
 */
public class Resolucion 
{
	public static void main (String [] args)
	{
		Scanner scanner = new Scanner(System.in); //Declaro el Escaner.
		String[][] empleados = new String[3][6]; //Declare un arreglo MULTI DIMENSIONAL (Matriz)										//Donde declaro 3 empleados con hasta 6 caracteristicas.
		for(int i = 0; i< 3; i++)
			//Declaro un bucle para que se repita la solicitud de información
			//para 3 empleados
		{
		//Pido que ingrese el nombre
		System.out.println("Ingrese los datos para el empleado");
		System.out.println("Nombre: ");
		//Pido que ingrese el apellido
		//Le asigno al empleado i la información del nombre que se ingreso por consola.
		empleados[i][0] = scanner.nextLine();
		//Le asigno al empleado i la información de Apellido.
		System.out.println("Apellido: ");
		empleados[i][1] = scanner.nextLine();
		//Pido que ingrese la ciudad
		System.out.println("Ciudad: ");
		empleados[i][2] = scanner.nextLine();
		//Pido que ingrese el email.
		System.out.println("Email: ");
		empleados[i][3] = scanner.nextLine();
		//Pido que ingrese la fecha de nacimiento.
		System.out.println("Fecha de nacimiento: (YYYY-MM-DD)");
		//Declaro fechaNacimiento como localDate y hago un parseo.
		//Parseo: Convertir un tipo de dato en otro. Scanner.nextLine() toma Strings
		// LocalDate.parse() convierto el String a tipo de dato LocalDate.
		LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
		//Convierto fechaNacimiento a un string con toString() para poder almacenarla.
		empleados[i][4] = fechaNacimiento.toString();
		//declaro la fecha actual para usarla en el calculo de edad.
		LocalDate fechaActual = LocalDate.now();
		//Hago el calculo de la edad. 
		int edad = fechaActual.getYear() - fechaNacimiento.getYear();
		//Obtiene el valor de la edad con valueOf y lo pasa a String.
		empleados[i][5] = String.valueOf(edad);
		}
		System.out.println("Información de empleados:");
		//Recorro la información almacenada para cada uno de los empleados y
		// la muestro por consola.
		for(int i=0; i < 3; i++)
		{
			System.out.println("Nombre: " + empleados[i][0]);
			System.out.println("Apellido: " + empleados[i][1]);
			System.out.println("Ciudad: " + empleados[i][2]);
			System.out.println("Email: " + empleados[i][3]);
			System.out.println("Fecha de Nacimiento: " + empleados[i][4]);
			System.out.println("Edad: " + empleados[i][5]);
		}
	}
}