package ar.edu.unlam.tp1;

public class Circulo {
	
	private double radio;
	
	
	public Circulo(Double radio)
	{
		this.radio = radio;
	}
	
	public Double obtenerRadio() 
	{
		return radio;
	}
	
	
	public Double Perimetro() 
	{
		Double perimetro = 2*(this.radio * Math.PI);
		return perimetro;
	}
	
	public Double Area()       
	{
		Double area = Math.PI * Math.pow(this.radio, 2);
		return area;
	}

}
