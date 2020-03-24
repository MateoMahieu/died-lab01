package died.lab01.problema03;

import died.lab01.problema02.*;

public class Registro {

	private String ciudad;
	private Temperatura[] historico;
	int cantidadElementosInsertados;
	int capacidadDisponible;
	static final int CAPACIDAD_MAXIMA_ARREGLO = 30;
	
	public Registro() {
		super();
		this.ciudad = "-";
		this.historico = new Temperatura[CAPACIDAD_MAXIMA_ARREGLO];
	}
	
	public Registro(String ciudad) {
		super();
		this.ciudad = ciudad;
		this.historico = new Temperatura[CAPACIDAD_MAXIMA_ARREGLO];
	}
	
	public String getCiudad() {
		return this.ciudad;
	}
	
	public void imprimir() {
			System.out.println("TEMPERATURAS REGISTRADAS EN: "+ (this.ciudad).toUpperCase());
			for(int i=0; i<this.historico.length;i++) {
				if(this.historico[i] !=null) {
					
					System.out.println(""+ (i+1) + " " + this.historico[i].toString());
				}
			}
		}

	public void agregar(Temperatura temp) {
		for(int i=0;i<this.historico.length;i++) {
				if(this.historico[i] == null) {
					this.historico[i] = temp;
					return;
				}
			}	
	}
	
	public double mediaAsCelcius() {
		
		double suma = 0;
		int cantElementos=0;
		
		for(Temperatura temp: this.historico) {
			if(temp != null) {
				cantElementos++;
			suma += temp.asCelcius();
		}}
		
		return (suma/cantElementos);
	}
	
	
	public double mediaAsFahrenheit() {
		
		double suma = 0;
		int cantElementos=0;
		
		for(Temperatura temp: this.historico) {
			if(temp != null) {
				cantElementos++;
			suma += temp.asFahrenheit();
		}}
		
		return (suma/cantElementos);
	}	
	
	//Hacer forma recursiva del metodo maximo()
	
	private Temperatura maximo(Temperatura[] temp) {
		Temperatura maxima = new Temperatura();
		for(int i=0;i<temp.length;i++) {
			if(temp[i] != null) {
			if(temp[i].asCelcius() > maxima.asCelcius()) {
				maxima = temp[i];
			}}
		}
		return maxima;
	}
	
	public Temperatura temperaturaMaxima() {
		return maximo(this.historico);
		}
	
	
	}
	
	
