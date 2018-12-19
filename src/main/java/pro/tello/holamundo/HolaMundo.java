package pro.tello.holamundo;

public class HolaMundo {
	

	public String saludar(int s) {
		String saludo;
		switch ( s ) {
			case 1:
				saludo = "hola uno";
			default:
				saludo = "hola dos";
		}
		return saludo;
	}
}
