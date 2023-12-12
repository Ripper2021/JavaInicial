public class ConstructorEjemplo1 {
	String nombre;

	public ConstructorEjemplo1()
	{
		nombre = "Gustavo";
	}
	public static void main (String [] args)
	{
		ConstructorEjemplo1 persona = new ConstructorEjemplo1();
		System.out.println("El nombre es: " + persona.nombre);
	}
}