package pro.tello.holamundo;

public class HolaMundo {
	
	public static final String SALUDO1 = "Hola uno";
	public static final String SALUDO2 = "Hola dos";

	public String saludar(int s) {
		if ( 1 == s ) {
			return HolaMundo.SALUDO1;
		} else {
			return HolaMundo.SALUDO2;
		}
	}
}
