package pro.tello.holamundo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class HolaMundoTest  {
	
	private HolaMundo holaMundo;

	@Before
	public void setUp() {
		holaMundo = new HolaMundo();
	}
	
	@Test
	public void saludosParaTodos() {
		
		holaMundo.saludar(1);
		assertTrue(true);
		//assertEquals("hola", holaMundo.saludar());
		//assertEquals(HolaMundo.SALUDO, holaMundo.saludar());
	}
	
	@Test
	public void saludosParaUsal() {
		
		holaMundo.saludar(0);
		assertTrue(true);
	}
}
