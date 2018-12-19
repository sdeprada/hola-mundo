package pro.tello.holamundo;

public class HolaMundo {
	
	//public static final String SALUDO1 = "Hola a todos!";
	//public static final String SALUDO2 = "Hola VIEWNEXT!";
	
	
	public String saludar(int s) {
		String saludo;
		switch ( s ) {
			case 1:
				saludo =  "hola 1";
			case 2: 
				saludo =  "hola 2";
			default:
				saludo =  "hola 2";
		}
		return saludo;
		
	}
}
