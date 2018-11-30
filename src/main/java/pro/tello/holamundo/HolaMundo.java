package pro.tello.holamundo;

public class HolaMundo {
	
	public String saludar(int s) {
		String saludo;
		switch ( s ) {
			case 1:
				saludo = "Hola a todos!";
			default:
				saludo = "Hola USAL";
		}
		return saludo;
		
	}
}
