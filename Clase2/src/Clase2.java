import java.util.Arrays;

//Arrays: Son arreglos en programación que tienen la capacidad
//de almacenar varios elementos
public class Clase2 
{
	public static void main (String [] args)
	{					 
		//Declaro un array de numeros
		int[] numeros = {1,2,3,4,5,6,7,8,9,10};
		//Accedo a la primer posición del array
		int primerNumero = numeros[0];
		//Accedo a la segunda posición del Array
		int segundoNumero = numeros[1];
		//Accedo a la ultima posición del Array.
		int ultimoNumero = numeros[9];
		//Muestro por consola. 
		System.out.println("El primer numero es: " + primerNumero);
		System.out.println("El segundo numero es: " + segundoNumero);
		System.out.println("El ultimo numero es: " + ultimoNumero);
		//Modificar el contenido de un elemento.
		numeros[2] = 100;
		System.out.println("Posición 2 modificada: " + numeros[2]);
		//Recorrer el array con un FOR. 
		System.out.println("Los numeros son:");
		for(int i = 0;i < numeros.length; i++) //El primer parametro es para indicar
												//donde comienza a contar las vueltas, el segundo es cuando corta y el tercero es el incremental del contador.
		{	
			System.out.println(numeros[i]);
		}
		
	//Array de Nombres
	String[] nombres = {"Juan", "Maria", "Pedro", "Gustavo"};
	int longitudNombres = nombres.length;
	System.out.println("El nombre de la posicion 2 es: " + nombres[2]);
	//Ordeno un array de menor a mayor. 
	Arrays.sort(nombres);
	//Recorro un array
	for(int i=0; i<nombres.length; i++)
		{
			System.out.println(nombres[i]);
		}
	//Declaro un Array Mixto 
	String[] mixto = new String[5];
	mixto[0] = "Gustavo";
	mixto[1] = "1";
	mixto[2] = "3.1415926285";
	mixto[3] = "A";
	mixto[4] = "123456789";
	System.out.println("Imprimo mi array mixto");
	//Sort ordena primero por numeros y luego por letras. En el caso
	//De que haya numeros y letras en un Array mixto. 
	Arrays.sort(mixto);
	for(int i=0; i<mixto.length; i++)
	{
		System.out.println(mixto[i]);
	}
	}
}
