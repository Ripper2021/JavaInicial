package THIS;

/*	THIS es una palabra clave que se refiere
 * a una instancia ACTUAL de la clase. Se utiliza
 * principalmente para evitar la ambiguedad entre los
 * campos de la clase y los parametros o variables locales
 * que se comparten con el mismo nombre. 
  
 Sirve para evitar la ambiguedad entre variables locales
 y parametros.
 
 Referencia a metodos o constructores de la misma clase.

 */
public class Explicacion {
	private int x;
	private int y;
	public void establezcoX(int x)
	{
		this.x = x;
	}

	public Explicacion(int y)
	{
		this.y=y;
	}

}
