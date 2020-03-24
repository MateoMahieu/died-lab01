/**
 * 
 */
package died.lab01.problema02;

/**
 * @author Mateo
 *
 */
public class Temperatura {
	
	private double grados;
	private Escala escala;
	
	public Temperatura() {
		super();
		this.grados = (double)0;
		this.escala = Escala.CELCIUS;
	}

	public Temperatura(double grados, Escala escala) {
		super();
		this.grados = grados;
		this.escala = escala;
	}

	public String toString() {
		return " " + grados + " " + escala;
	}
	
	public Double asCelcius() {
		double temperaturaActualEnCelcius;
		if(this.escala == Escala.CELCIUS) {
			temperaturaActualEnCelcius = this.grados;
		}
		else {
			temperaturaActualEnCelcius = ((this.grados) - 32) * 5/9;
		}
		
		return temperaturaActualEnCelcius;
	}
	
	public Double asFahrenheit() {
		double temperaturaActualEnFahrenheit;
		if(this.escala == Escala.FAHRENHEIT) {
			temperaturaActualEnFahrenheit = this.grados;
		}
		else {
			temperaturaActualEnFahrenheit = (this.grados) * 9/5 + 32;
		}
		
		return temperaturaActualEnFahrenheit;
	}
	
	public void aumentar(Temperatura temperatura) {
		double temperaturaAumentada; //va a ser la temperatura final
		if(temperatura.grados > 0.0) {
			if(temperatura.escala == this.escala) { //si son de la misma escala 
				temperaturaAumentada = (this.grados + temperatura.grados); //sumo los grados y los meto en la variable 
				this.grados = temperaturaAumentada; //actualizo el valor de los grado
			}
			if((temperatura.escala == Escala.CELCIUS) & (this.escala == Escala.FAHRENHEIT)){
				double conversionDeTempAFar; //como vamos a necesitar convertirlos, creo una variable q lo almacene
				conversionDeTempAFar = temperatura.asFahrenheit(); //convierto de grados c a f
				temperaturaAumentada = (this.grados + conversionDeTempAFar); //le sumo los grados a los q converti recien
				this.grados = temperaturaAumentada; //actualizo los datos
			}
			if((temperatura.escala == Escala.FAHRENHEIT) & (this.escala == Escala.CELCIUS)){
				
				//lo mismo q arriba solo que paso de grados f a c
				double conversionDeTempACelcius;
				conversionDeTempACelcius = temperatura.asCelcius();
				temperaturaAumentada = (this.grados + conversionDeTempACelcius);
				this.grados = temperaturaAumentada;
			}
			
		}
	}
	
	//lo mismo q aumentar solo que cambiando el signo
	
	public void disminuir(Temperatura temperatura) {
		double temperaturaDisminuida;
		if(temperatura.grados > 0.0) {
			if(temperatura.escala == this.escala) {
				this.grados = this.grados - temperatura.grados;
			}
			if((temperatura.escala == Escala.CELCIUS) & (this.escala == Escala.FAHRENHEIT)){
				double conversionDeTempAFar;
				conversionDeTempAFar = temperatura.asFahrenheit();
				temperaturaDisminuida = (this.grados - conversionDeTempAFar);
				this.grados = temperaturaDisminuida;
			}
			if((temperatura.escala == Escala.FAHRENHEIT) & (this.escala == Escala.CELCIUS)) {
				double conversionDeTempACelcius;
				conversionDeTempACelcius = temperatura.asCelcius();
				temperaturaDisminuida = (this.grados - conversionDeTempACelcius);
				this.grados = temperaturaDisminuida;
			}
			
		}
	}
	
	
	
}
