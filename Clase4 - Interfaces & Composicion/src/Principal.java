/*
Interfaces: Es un conjunto de metodos abstractos, sin implementación,
y constantes (variables) que pueden ser IMPLEMENTADAS por clases.
Una interfaz define un contrato que las clases que la implementan
deben seguir. Se utilizan para lograr la abstracción
y permiten la creación de codigo mas modular y flexible. 

*/

interface iUsuario
{
	public void registroUsuario(String userName);

}

public class Principal implements iPerro, iGato, iUsuario
{
	public void registroUsuario(String userName)
	{
		
	}
	public void maullar()
	{
		System.out.println(" /\\_/\\ \n"+
						   "( o.o )\n"+ 
						   " > ^ <)");
	}
	
	public void rasguñar()
	{
		System.out.println("Te rasguño!");
	}
	
	public void darLaPata(int a, int b)
	{
		System.out.println("Te estoy dando la patita");
	}
	public void rodar()
	{
		System.out.println("/ \\__\r\n"
				+ " 	   (    @\\___\r\n"
				+ " 	   /         O\r\n"
				+ "		  /  (_____/\r\n"
				+ "		/_____/   U");
	}
	public void ladrar()
	{
		System.out.println("WRAF WRAF WRAF!");
	}
	
	public void nombreUsuario(String nombre)
	{
		System.out.println("Nombre: " + nombre);
	}

	public static void main (String [] args)
	{
		Principal objeto = new Principal();
		objeto.darLaPata(0,0);
		objeto.rodar();
		objeto.ladrar();
		objeto.maullar();
		objeto.rasguñar();
		objeto.nombreUsuario("Gustavo");
	}	
}