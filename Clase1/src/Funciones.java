/*
	Funcion: Se refiere a un conjunto de instrucciones
	o reglas que toma uno o mas valores de entrada, conocidos como argumentos o parametros.
	y produce un resultado o una salida. 
*/
public class Funciones 
{
	public static void saludar()
	{
		System.out.println("Hola mundo!");
	}
	public static void sumar(int a, int b)
	{
		int resultado = a+b;
		System.out.println("La suma es: " + resultado);
	}
	public static int multiplicar(int a, int b)
	{
		return a*b;
	}
	public static void main (String[] args)
	{
		saludar();
		sumar(10, 10);
		System.out.println("La multiplicacion es: "+ multiplicar(10, 10));
	}
}