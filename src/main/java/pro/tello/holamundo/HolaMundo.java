package pro.tello.holamundo;

public class HolaMundo {
	
	public String saludar(int s) {
		String saludo;
		switch ( s ) {
			case 1:
				saludo = "Hola gente";
			default:
				saludo = "Hola";
		}
		return saludo;
	}
}
