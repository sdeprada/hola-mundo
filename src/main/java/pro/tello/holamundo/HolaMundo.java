package pro.tello.holamundo;

public class HolaMundo {
	
	public static final String SALUDO1 = "Hola a todos!";
	public static final String SALUDO2 = "Hola USAL!";
	
	public String saludar(int s) {
		String saludo;
		if ( s == 1 ) {
			saludo = HolaMundo.SALUDO1;
		} else {
			saludo = HolaMundo.SALUDO2;
		}
		return saludo;
	}
}
