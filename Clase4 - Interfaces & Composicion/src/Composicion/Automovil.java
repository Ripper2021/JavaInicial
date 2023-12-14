package Composicion;

public class Automovil
{
	private Motor motor;
	private Frenos frenos;
	
	public Automovil()
	{
		this.motor = new Motor();
		this.frenos= new Frenos();
	}
	
	public void frenado()
	{
		frenos.frenar();
	}
	
	public void conducir()
	{
		motor.encender();
		System.out.println("Automovil en movimiento");
	}
	
	public void detener()
	{
		System.out.println("Automovil detenido");
		motor.apagar();
	}
	
	public static void main(String[] args)
	{
		Automovil auto = new Automovil();
		auto.conducir();
		auto.frenado();
		auto.detener();
	}
}
