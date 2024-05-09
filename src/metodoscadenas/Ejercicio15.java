package metodoscadenas;

public class Ejercicio15 {

	String addGuiones (String txt1) {
		String palabraConGuiones = "-";
		
		for(int i=0; i<txt1.length(); i++) {
			palabraConGuiones += txt1.substring(i, i+1)+"-";
		} return palabraConGuiones;
	}
	public static void main(String[] args) {
		Ejercicio15 i = new Ejercicio15();
		String resultado = i.addGuiones("Andrea");
		System.out.println(resultado);
	}

}
