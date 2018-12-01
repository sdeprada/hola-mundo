package pro.tello.holamundo;

public class HolaMundo {
	
	public static final String SALUDO1 = "Hola a todos!";
	public static final String SALUDO2 = "Hola a USAL!";
	
	
	public String saludar(int s) {
		if ( s == 1 ) {
			return HolaMundo.SALUDO1;
		} else {
			return HolaMundo.SALUDO2;
		}
		
	}
}
