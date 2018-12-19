package pro.tello.holamundo;

public class HolaMundo {
	
	public String saludar(int s) {
		String saludo;	
		switch ( s ) {
			case 1:
				saludo = "Hola uno";
			default:
				saludo = "Hola dos";
		}
		return saludo;
	}
}
