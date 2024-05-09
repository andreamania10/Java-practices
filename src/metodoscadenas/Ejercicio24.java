package metodoscadenas;

public class Ejercicio24 {

	String firstWord (String txt1) {
		int posicionPrimerEspacio = txt1.indexOf(" "); 
		
		String primeraPalabra = txt1.substring(0, posicionPrimerEspacio);
		return primeraPalabra;
	}
	public static void main(String[] args) {
		Ejercicio24 i = new Ejercicio24();
		String resultado = i.firstWord("see and stop");
		System.out.println(resultado);
	}

}
