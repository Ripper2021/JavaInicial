package Composicion;

/*
La composicion es un principio de diseño en POO
en el que un objeto contiene instancias de otros objetos,
ayudando a construir estructuras mas complejas. 
La composición es una ALTERNATIVA a la herencia y permite
la creación de realciones mas flexibles y reutilizables.
*/
public class Motor 
{
	public void encender()
	{
		System.out.println("Motor encendido");
	}
	
	public void apagar()
	{
		System.out.println("Motor apagado");
	}
}
