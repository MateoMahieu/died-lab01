/**
 * 
 */
package died.lab01.problema01;

/**
 * @author Mateo
 *
 */
public class Punto {
	
	private float x;
	private float y;
	

	public float getX() {
		return x;
	}


	public void setX(float x) {
		this.x = x;
	}


	public float getY() {
		return y;
	}


	public void setY(float y) {
		this.y = y;
	}


	public Punto(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object otroPunto) 
	{
		if(otroPunto == null || this.getClass() != otroPunto.getClass())
		{
			return false;
		}
		else
		{
			if(this.getX() == ((Punto) otroPunto).getX() && this.getY() == ((Punto) otroPunto).getY())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}

}
