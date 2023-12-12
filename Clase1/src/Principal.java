/*
  Herencia: Es un mecanismo mediante el cual una clase
  puede HEREDAR atributos y metodos de otra clase. 
  La clase que HEREDA se conoce como "subclase"
  y la clase qué "presta" se conoce como "super clase" o "clase padre"
 
 Con la palabra EXTENDS al lado del nombre de la clase
 puedo indicar de qué clase voy a implementar
 la HERENCIA. 
 
 */
public class Principal extends Empleado 
{
	/* CONSTRUCTOR: 
	 	Es un metodo ESPECIAL dentro de una clase que se llama
	 	AUTOMATICAMENTE cuando se crea una instancia de esa clase.
	 	Su proposito principal es INICIALIZAR los atributos y realizar
	 	cualquier CONFIGURACIÓN necesaria para que el objeto pueda ser utilizado
	 	correctamente. En Java el constructor SIEMPRE tiene el mismo nombre que la clase. 
	 */
	public Principal()
	{
	nombre = "Gustavo";
	apellido = "Vargas";
	edad = 31;
	altura= 178;
	ciudad = "Barcelona";
	nomina= 1500;
	cargo = "Ingeniero";
	}
	public static void main (String [] args)
	{
		Principal informacion_empleado = new Principal();
		System.out.println("El nombre es: " + informacion_empleado.nombre);
		System.out.println("El apellido es: " + informacion_empleado.apellido);
		System.out.println("La edad es: " + informacion_empleado.edad);
		System.out.println("La altura es: " + informacion_empleado.altura);
		System.out.println("La ciudad es: " + informacion_empleado.ciudad);
		System.out.println("La nomina es: " + informacion_empleado.nomina);
		System.out.println("El cargo es: " + informacion_empleado.cargo);	
	}	
}