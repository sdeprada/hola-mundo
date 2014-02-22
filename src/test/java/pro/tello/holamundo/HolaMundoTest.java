package pro.tello.holamundo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import pro.tello.holamundo.HolaMundo;

@RunWith(JUnit4.class)
public class HolaMundoTest  {
	
	private HolaMundo holaMundo;

	@Before
	public void setUp() {
		holaMundo = new HolaMundo();
	}
	
	@Test
	public void saludosParaTodos() {
		assertEquals(HolaMundo.SALUDO, holaMundo.saludar());
	}
}
