package metodoscadenas;

public class Ejercicio20shortcut {

	String shortcut (String txt1, String txt2) {
		String txt = txt1.substring(0, 1);
		String texto = txt2.substring(0, 1);
		
		return txt+texto;	
		
	}
	public static void main(String[] args) {
		Ejercicio20shortcut i = new Ejercicio20shortcut();
		String resultado = i.shortcut("Andrea", "Marta");
		System.out.println(resultado);
		
	}

}
