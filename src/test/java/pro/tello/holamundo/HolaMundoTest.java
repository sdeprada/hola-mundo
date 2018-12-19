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
		
		String saludo = holaMundo.saludar(1);
		assertTrue( null != saludo && !("".equals(saludo)));

	}

	@Test
	public void saludosParaDos() {
		
		String saludo = holaMundo.saludar(2);
		assertTrue( null != saludo && !("".equals(saludo)));
		
	}
	
}
