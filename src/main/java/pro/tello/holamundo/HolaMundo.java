package pro.tello.holamundo;

public class HolaMundo {
	
	public String saludar(int s) {
		switch ( s ) {
			case 1:
				return "Hola gente";
			default:
				return "Hola";
		}
	}
}
