package metodos;

public class Ejercicio4 {

	public String echo (String m) {
		return "Hola " + m; 
	}
	public static void main(String[] args) {
		Ejercicio4 m = new Ejercicio4();
		String resultado = m.echo("Ada"); 
		System.out.println(resultado);
		String resultado2 = m.echo("Grace"); 
		System.out.println(resultado2);
		
	}

}
