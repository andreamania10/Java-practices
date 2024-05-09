package metodoscadenas;

public class Ejercicio8 {
	String generarNombre (String txt1, String txt2, String txt3){
		if (txt1.length() < 5 && txt2.length() < 5 && txt3.length() < 5) {
			return txt1.substring(txt1.length()-1) + txt2.substring(txt2.length()-1) + txt3.substring(txt3.length()-1);
			
		} else {
			return "Error"; 
		}
	
}
	public static void main(String[] args) {
		Ejercicio8 i = new Ejercicio8(); 
		String resultado = i.generarNombre("Andr", "Mara", "Alba");
		System.out.println(resultado);
	}

}
