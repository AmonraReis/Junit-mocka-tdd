package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

public class AssertTest {
	
	@Test
	
	public void test() {
		
		Assert.assertTrue(true); //testar se express�o � verdade
		Assert.assertFalse(false); //testar se express�o � falsa
		
		Assert.assertEquals(1, 1);
		Assert.assertEquals(0.51, 0.51, 0.01); //precisa de um delta para compara��o 
		//0.01 � a margem de erro
		
	};

}
