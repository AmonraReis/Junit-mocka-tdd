package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

public class AssertTest {
	
	@Test
	
	public void test() {
		
		Assert.assertTrue(true); //testar se expressão é verdade
		Assert.assertFalse(false); //testar se expressão é falsa
		
		Assert.assertEquals(1, 1);
		Assert.assertEquals(0.51, 0.51, 0.01); //precisa de um delta para comparação 
		//0.01 é a margem de erro
		
	};

}
