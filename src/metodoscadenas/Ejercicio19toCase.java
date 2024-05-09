package metodoscadenas;

public class Ejercicio19toCase {

	String toCase (String txt1) {
		String txt = txt1.toLowerCase();
		String txt2 = txt1.toUpperCase();
		String guion = "-";
		return txt + guion + txt2;
	} 
	public static void main(String[] args) {
		Ejercicio19toCase m = new Ejercicio19toCase(); 
		String resultado = m.toCase("Andrea");
		System.out.println(resultado);
	}

}
