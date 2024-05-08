package metodoscadenas;

public class Ejercicio2Substring {
	String devuelveEnesimaLetra (String txt) {
		return txt.substring(3, 7);
	}
	public static void main(String[] args) {
		Ejercicio2Substring i = new Ejercicio2Substring(); 
		String resultado = i.devuelveEnesimaLetra("Wonderful day"); 
		System.out.println(resultado);
	}

}
