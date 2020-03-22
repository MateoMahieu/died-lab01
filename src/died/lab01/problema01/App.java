package died.lab01.problema01;

public class App {

	public static void main(String[] args) {
		
		Punto p1,p2,p3;
		float m;
		
		//creacion puntos 1 y 2
		p1 = new Punto(1,1);
		p2 = new Punto(2,2);
		
		//creacion de la recta
		Recta r1 = new Recta(p1, p2);
		
		System.out.println("La pendiente de la recta es: "+ r1.pendiente());
		
		//creacion pto 3
		p3 = new Punto(3,3);
		
		//creacion de la recta 2
		Recta r2 = new Recta(p2,p3);
		
	System.out.println("R1 y R2 representan la misma recta? "+ r1.equals(r2));
		
		
		
		
		
		
		
	}
}
