package metodoscadenas;

public class Ejercicio1Longitud {

		int longitud (String nombre) {
			return nombre.length();
		}
		public static void main(String[] args) {
			Ejercicio1Longitud i = new Ejercicio1Longitud(); 
			int resultado = i.longitud("Ana");
			System.out.println(resultado);
	}
	}

