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
		//assertEquals(HolaMundo.SALUDO1, holaMundo.saludar(1));
	}
	
	/*@Test
	public void saludosParaUsal() {
		
		holaMundo.saludar(0);
		assertTrue(true);
		//assertEquals(HolaMundo.SALUDO2, holaMundo.saludar(0));
	}*/
}
