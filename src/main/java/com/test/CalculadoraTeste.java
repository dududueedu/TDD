package com.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.model.Calculadora;

public class CalculadoraTeste {

	@Test
	public void deveSomarDoisValores() throws Exception{
		int valueA = 2;
		int valueB = 4;
		
		Calculadora calc = new Calculadora();
		
		int soma = calc.soma(valueA, valueB);
	
		assertEquals(6, soma);
	}
}