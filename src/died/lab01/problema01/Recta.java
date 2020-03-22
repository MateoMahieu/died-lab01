/**
 * 
 */
package died.lab01.problema01;

/**
 * @author Mateo
 *
 */
public class Recta {
	
	private Punto pto1;
	private Punto pto2;
	
	public Recta(Punto p1, Punto p2) {
		super();
		this.pto1 = p1;
		this.pto2 = p2;
	}
	
	public Recta() {
		super();
	}
	
	public float pendiente() {
		
		float m;
		float y1,y0,x1,x0;
		
		//obtencion de componentes.
		
		y0 = this.pto1.getY();
		y1 = this.pto2.getY();
		x0 = this.pto1.getX();
		x1 = this.pto2.getX();
		
		//formula
		m =  ((y1 - y0) / (x1 - x0));
		
		return m;
	}
	
	public boolean paralelas(Recta otraRecta) {
		
		if(this.pendiente() == otraRecta.pendiente()) {
			
			return true;
			
		}else {
			return false;
		}
				
	}
	

	public boolean equals(Object otraRecta)
	{
		Punto pto1 = this.pto1;
		Punto pto2 = ((Recta) otraRecta).pto1;
		Recta r3 = new Recta(pto1, pto2);
		if(this.getClass() == null || this.getClass() != otraRecta.getClass())
		{
			return false;
		}
		else
		{
			if(this.pendiente() == r3.pendiente() && ((Recta) otraRecta).pendiente() == r3.pendiente())
			{
				return true;
			}
		}
		return false;
		
	}
	
	
}
