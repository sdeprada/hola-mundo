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
		int p = 1;
		holaMundo.saludar(p);
		//assertTrue(true);
		assertEquals(HolaMundo.SALUDO1, holaMundo.saludar());
	}
	
	@Test
	public void saludosParaUsal() {
		int p = 0;
		holaMundo.saludar(p);
		assertTrue(true);
	}
}
