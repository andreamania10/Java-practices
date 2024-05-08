package metodoscadenas;

public class Ejercicio6 {

	String devuelveMasLarga (String txt1, String txt2, String txt3) {
		if (txt1.length() > txt2.length() && txt1.length() > txt3.length()) {
			return txt1; 
		} else if (txt2.length() > txt3.length()) {
			return txt2; 
		} else if (txt1.length() == txt2.length() || txt1.length() == txt3.length()) {
			return "Hay al menos dos cadenas iguales"; 
		} else {
			return txt3;
		}
	}
	public static void main(String[] args) {
		Ejercicio6 i = new Ejercicio6(); 
		String resultado = i.devuelveMasLarga("Holas", "Adeu", "Bienvenido");
		System.out.println(resultado);
	}

}
