package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {


	
	@Test
	public void crearUnCirculoConRadio2() {
		
	   Circulo miCirculo = new Circulo(2.0);
	   
	   Double esperado = 2.0;
	   
	   assertEquals(esperado, miCirculo.obtenerRadio(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		
		 Circulo miCirculo = new Circulo(3.7);
		   
		   Double esperado = 3.7;
		   
		   assertEquals(esperado, miCirculo.obtenerRadio(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		
		 Circulo miCirculo = new Circulo(5.0);
		   
		   Double esperado = 5.0;
		   
		   assertEquals(esperado, miCirculo.obtenerRadio(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		
		 Circulo miCirculo = new Circulo(10.9);
		   
		   Double esperado = 10.9;
		   
		   assertEquals(esperado, miCirculo.obtenerRadio(), 0.01);
	}
	

	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es615Punto73() {
		
		Circulo miCirculo = new Circulo(9.8);
		Double esperado = 61.57;
		
		assertEquals(esperado,miCirculo.Perimetro(), 0.01);
		
	}
	
	// Enunciado cambiado por errores: Circulo con radio 16.6 y que obtiene perimetro 104.30 //
	@Test
	public void crearUnCirculoConRadio16Punto6Es104Punto30() {
		
		Circulo miCirculo = new Circulo(16.6);
		Double esperado = 104.30;
		
		assertEquals(esperado,miCirculo.Perimetro(), 0.01);
		
	}
	
}
