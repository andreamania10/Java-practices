package metodoscadenas;

public class Ejercicio11 {
	
	boolean tieneLetra (String txt1, String letra) {
		return txt1.toLowerCase().indexOf(letra.toLowerCase())>=0;
	}
	
	public static void main(String[] args) {
		Ejercicio11 i = new Ejercicio11(); 
		boolean resultado = i.tieneLetra("AndreA", "a");
		System.out.println(resultado);
	}

}
