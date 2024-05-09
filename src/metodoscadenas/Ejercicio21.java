package metodoscadenas;

public class Ejercicio21 {
	char firstChar (String palabra) {
		char palabra2 = palabra.trim().charAt(0); 
		return palabra2;
	}
	public static void main(String[] args) {
		Ejercicio21 i = new Ejercicio21(); 
		char resultado = i.firstChar(" Andrea ");
		System.out.println(resultado);

	}

}
